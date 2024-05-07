package br.com.compassuol.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.compassuol.workshopmongo.domain.Post;

@Repository
public interface Postrepository extends MongoRepository<Post,String>{
	
	@Query("{'title': {$regex: ?0, $options: 'i'}}")
	List<Post> searchTitle(String text);
	List<Post> findByTitleContainingIgnoreCase(String text);
}
