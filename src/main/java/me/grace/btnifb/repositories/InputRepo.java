package me.grace.btnifb.repositories;

import me.grace.btnifb.Input;
import org.springframework.data.repository.CrudRepository;

public class InputRepo {

    public interface InputRepo extends CrudRepository<Input,Long> {
    }

}
