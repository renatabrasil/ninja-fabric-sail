package br.com.ninja.services;

import br.com.ninja.domain.requests.UserRequest;
import br.com.ninja.entities.User;
import br.com.ninja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserRequest userRequest) {
        userRepository.save(User.builder()
                .name(userRequest.getName())
                .username(userRequest.getUsername())
                .email(userRequest.getEmail())
                .token(userRequest.getToken())
                .build()
        );

    }
}
