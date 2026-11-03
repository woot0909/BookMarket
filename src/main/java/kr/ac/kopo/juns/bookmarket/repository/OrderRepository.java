package kr.ac.kopo.juns.bookmarket.repository;

import kr.ac.kopo.juns.bookmarket.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository {
    Long saveOrder(Order order);
}
