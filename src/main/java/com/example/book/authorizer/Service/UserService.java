package com.example.book.authorizer.Service;

import com.example.book.authorizer.Model.CustomUserDetails;
import com.example.book.authorizer.Model.User;
import com.example.book.authorizer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }

    public UserDetails loadUserById(Long id){
        User user = userRepository.findById(id).get();
        if (user == null) {
            throw new UsernameNotFoundException("cannot find user with id: " + id.toString());
        }
        return new CustomUserDetails(user);
    }
}
