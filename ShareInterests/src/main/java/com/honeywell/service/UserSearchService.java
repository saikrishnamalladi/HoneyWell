package com.honeywell.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.honeywell.entity.User;
import com.honeywell.model.UserResponse;
import com.honeywell.repository.UserSearchRepository;

@Component
public class UserSearchService {
	
	@Autowired
    private UserSearchRepository userRepository;
	
	public List<UserResponse> findByLocation(int longitude, int latitude) {
		List<UserResponse> users = new ArrayList<UserResponse>();
		List<User> resultList = userRepository.fetchByLocation(longitude, latitude);
		for (User user : resultList) {
			UserResponse resp = new UserResponse();
			resp.setUserName(user.getUserName());
			users.add(resp);
		}
		return users;
		
	}

}
