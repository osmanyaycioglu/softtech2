package com.training.softtech;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDAO extends CrudRepository<Customer, Long> {

    List<Customer> findByName(String name);

    List<Customer> findByNameAndSurname(String name,
                                        String surname);

    @Query("select c from Customer c where c.name = :isim")
    List<Customer> checkName(@Param("isim") String name);


    @Query(value = "select * from musteri c where c.abc = :isim", nativeQuery = true)
    List<Customer> checkNameNative(@Param("isim") String name);


}
