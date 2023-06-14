package com.booking.airlinebookingsystem.dao;

import com.booking.airlinebookingsystem.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegisterRepository extends CrudRepository {
    @Query("Select u from User u where u.email =:e")
    public List<User> findByEmail(@Param("e") String email);
}
