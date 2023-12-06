package com.servicespring.course.repositories;

import com.servicespring.course.entities.pk.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
