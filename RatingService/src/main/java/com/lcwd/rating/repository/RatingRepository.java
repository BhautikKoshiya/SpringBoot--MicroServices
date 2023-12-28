package com.lcwd.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lcwd.rating.entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{

//	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
	@Query("{ 'userId': ?0 }")
	List<Rating> getRatingsByUserId(@Param("userId") String userId);
	
}
