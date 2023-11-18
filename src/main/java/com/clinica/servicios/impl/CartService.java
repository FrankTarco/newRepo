package com.clinica.servicios.impl;

import com.clinica.configuraciones.JwtRequestFilter;
import com.clinica.modelo.Cart;
import com.clinica.modelo.Product;
import com.clinica.modelo.Usuario;
import com.clinica.repositorios.CartDao;
import com.clinica.repositorios.ProductDao;
import com.clinica.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private UsuarioRepository userDao;

    public void deleteCartItem(Integer cartId) {
        cartDao.deleteById(cartId);
    }

    public Cart addToCart(Integer productId) {
        Product product = productDao.findById(productId).get();

        String username = JwtRequestFilter.CURRENT_USER;
        //Long username = Long.parseLong(JwtRequestFilter.CURRENT_USER);

        Usuario user = null;
        if(username != null) {
            user = userDao.findById(username).get();
        }

        List<Cart> cartList = cartDao.findByUser(user);
        List<Cart> filteredList = cartList.stream().filter(x -> x.getProduct().getProductId() == productId).collect(Collectors.toList());

        if(filteredList.size() > 0) {
            return null;
        }

        if(product != null && user != null) {
            Cart cart = new Cart(product, user);
            return cartDao.save(cart);
        }

        return null;
    }

    public List<Cart> getCartDetails() {
        String username = JwtRequestFilter.CURRENT_USER;
    	//Long username = Long.parseLong(JwtRequestFilter.CURRENT_USER);
        Usuario user = userDao.findById(username).get();
        return cartDao.findByUser(user);
    }
}
