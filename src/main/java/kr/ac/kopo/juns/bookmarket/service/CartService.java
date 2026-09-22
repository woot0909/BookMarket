package kr.ac.kopo.juns.bookmarket.service;

import kr.ac.kopo.juns.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
}