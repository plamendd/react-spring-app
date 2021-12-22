package com.softuni.ecommerce.backend.repository;

import com.softuni.ecommerce.backend.model.User;
import com.softuni.ecommerce. backend.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {

    List<WishList> findAllByUserOrderByCreatedDateDesc(User user);

}
