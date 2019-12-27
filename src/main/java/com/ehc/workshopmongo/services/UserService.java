package com.ehc.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehc.workshopmongo.doman.User;
import com.ehc.workshopmongo.dto.UserDTO;
import com.ehc.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
//	public User findById(String id) {
//		User user = userRepository.findOne(id);
//		if (user == null) {
//			throw new ObjectNotFoundException("Objeto não encontrado!");
//		}
//		return user;
//	}
	
	public User insert(User obj) {
		return userRepository.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
