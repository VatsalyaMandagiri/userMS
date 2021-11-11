package com.FA.userMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.FA.userMS.entity.Wishlist;
import com.FA.userMS.utility.PrimaryKey;

public interface WishlistRepo extends CrudRepository<Wishlist, PrimaryKey> {

}
