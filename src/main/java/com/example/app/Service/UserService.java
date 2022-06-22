package com.example.app.Service;

import com.example.app.Domain.User;
import com.example.app.Database.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User saveUser(User user) {
       return userRepository.save(user);
    }

    public List<User> getAllActiveUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getBrandByName(String brand) {
        return userRepository.findByBrand(brand);
    }

    public User updateUser(Long  id, User user){
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long  id) {
        userRepository.deleteById(id);
    }
}
