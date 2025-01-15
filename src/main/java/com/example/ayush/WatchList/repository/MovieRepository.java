package com.example.ayush.WatchList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ayush.WatchList.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
