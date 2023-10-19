package com.servicespring.course.repositories;

import com.servicespring.course.entities.Order;
import com.servicespring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
