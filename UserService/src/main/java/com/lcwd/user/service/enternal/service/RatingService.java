package com.lcwd.user.service.enternal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.lcwd.user.service.entities.Rating;

@FeignClient(name="RATING-SERVIC")
public interface RatingService {

	@PostMapping("/rating")
	public Rating createRating(Rating rating);
	
	@PutMapping("/rating/{ratingId}")
	public Rating updateRating(@PathVariable("ratingId") String ratingId, Rating rating);
	
	@DeleteMapping("/rating/{ratingId}")
	public void deleteRating(@PathVariable("ratingId") String ratingId);
}
