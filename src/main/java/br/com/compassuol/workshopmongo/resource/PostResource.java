package br.com.compassuol.workshopmongo.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.compassuol.workshopmongo.domain.Post;
import br.com.compassuol.workshopmongo.domain.User;
import br.com.compassuol.workshopmongo.dto.UserDTO;
import br.com.compassuol.workshopmongo.services.PostService;
import br.com.compassuol.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
