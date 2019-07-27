package com.honeywell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.honeywell.entity.User;

@Repository
public interface UserSearchRepository extends JpaRepository<User, String>{
	
    List<User> fetchByLocation(@Param("longitude") int longitude,@Param("latitude") int latitude);


}
