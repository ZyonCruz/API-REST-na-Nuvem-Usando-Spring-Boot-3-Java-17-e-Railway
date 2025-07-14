package me.dio.domain.model.service.Impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.domain.model.service.UserService;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("User with this ID already exists.");
        }
        return userRepository.save(userToCreate);
    }
}