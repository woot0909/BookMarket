package kr.ac.kopo.juns.bookmarket.repository;

import kr.ac.kopo.juns.bookmarket.domain.Cart;

public interface CartRepository {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
}