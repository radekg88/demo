package com.example.repository;

import com.example.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rgofron on 2015-10-26.
 */


public interface DemoRepository extends JpaRepository<Demo, Integer>{
}
