package br.com.compassuol.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.compassuol.workshopmongo.domain.Post;

@Repository
public interface Postrepository extends MongoRepository<Post,String>{

}
