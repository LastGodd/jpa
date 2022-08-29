package com.springboot.jpa.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.data.entity.Product;
// Entity가 생성한 DB에 접근할 때 사용 <대상엔티티, @Id>
public interface ProductRepository extends JpaRepository<Product, Long> {

}
