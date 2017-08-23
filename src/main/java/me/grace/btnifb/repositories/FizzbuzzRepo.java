package me.grace.btnifb.repositories;

import me.grace.btnifb.Fizzbuzz;
import org.springframework.data.repository.CrudRepository;


public interface FizzbuzzRepo extends CrudRepository<Fizzbuzz, Long> {
}