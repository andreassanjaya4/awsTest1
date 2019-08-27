package com.amazonaws.serverless.sample.springboot2.dao;

import com.amazonaws.serverless.sample.springboot2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Phincon on 22/08/2019.
 */
public interface UserRepository extends CrudRepository<User, String> {

}

