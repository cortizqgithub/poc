package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository  extends JpaRepository<Beer, Long> {
}
