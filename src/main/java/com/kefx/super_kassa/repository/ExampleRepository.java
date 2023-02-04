package com.kefx.super_kassa.repository;

import com.kefx.super_kassa.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example,Integer> {
}
