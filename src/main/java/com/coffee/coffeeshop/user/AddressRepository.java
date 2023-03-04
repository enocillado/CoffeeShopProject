package com.coffee.coffeeshop.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Integer>{

    Optional<Address> findByPostalCode(String postal);

}

