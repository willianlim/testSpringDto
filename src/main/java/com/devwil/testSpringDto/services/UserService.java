package com.devwil.testSpringDto.services;

import com.devwil.testSpringDto.dto.UserDTO;
import com.devwil.testSpringDto.entities.User;
import com.devwil.testSpringDto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO findById(Long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return (dto);
    }

}
