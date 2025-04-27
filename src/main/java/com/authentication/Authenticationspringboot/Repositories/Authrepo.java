package com.authentication.Authenticationspringboot.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.authentication.Authenticationspringboot.Modals.Authmodal;

public interface Authrepo extends MongoRepository<Authmodal,String> {

}
