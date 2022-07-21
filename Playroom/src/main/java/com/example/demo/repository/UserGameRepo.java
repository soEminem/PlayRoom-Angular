package com.example.demo.repository;

import com.example.demo.model.UserGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGameRepo extends JpaRepository<UserGame, Long>, CrudRepository<UserGame, Long> {

//    void updateRent(Long user_id, Long game_id, UserGame userGame);
	@Query(value = "SELECT * FROM UserGame WHERE user_id = :user_id AND game_id = :game_id", nativeQuery = true)
	UserGame getRentByUserIdGameID(@Param("user_id") Long user_id, @Param("game_id") Long game_id);
}