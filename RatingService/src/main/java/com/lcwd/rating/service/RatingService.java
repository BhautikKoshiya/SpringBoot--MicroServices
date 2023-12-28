package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entity.Rating;

public interface RatingService {

	Rating create(Rating rating);
	List<Rating> getRatings();
	List<Rating> getRatingsByUserId(String userId);
	List<Rating> getRatingsByHotelId(String hotelId);
}
