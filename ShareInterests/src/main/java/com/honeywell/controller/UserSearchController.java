package com.honeywell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.model.UserResponse;
import com.honeywell.service.UserSearchService;

@RestController
@RequestMapping("/shareInterest")
public class UserSearchController {
	
	@Autowired
    private UserSearchService userService;

	@RequestMapping(value="findByLocation", method = RequestMethod.POST,produces={"application/json","application/xml"})
	public List<UserResponse> findByLocation(@RequestParam(value="longitude") int longitude, @RequestParam(value="latitude") int latitude) {
		return userService.findByLocation(longitude, latitude);
	}

}
