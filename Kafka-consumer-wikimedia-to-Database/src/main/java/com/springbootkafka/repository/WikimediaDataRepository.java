package com.springbootkafka.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootkafka.models.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}