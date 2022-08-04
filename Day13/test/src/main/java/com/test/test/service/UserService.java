package com.test.test.service;

import com.test.test.dto.CreateUserDto;
import com.test.test.dto.UpdateUserDto;
import com.test.test.model.User;
import com.test.test.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> update (UpdateUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        User user = new User();
        user.setUsername(dto.getUsername().trim());
        user.setPhone(user.getPhone().trim() );
        user.setAddress(user.getAddress().trim());

        userRepository.save(user);


        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
    }
}
