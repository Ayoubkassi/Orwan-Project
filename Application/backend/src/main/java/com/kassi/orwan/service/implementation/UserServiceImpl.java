package com.kassi.orwan.service.implementation;

import com.kassi.orwan.model.User;
import com.kassi.orwan.repo.UserRepo;
import com.kassi.orwan.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;


@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;


    @Override
    public User create(User user) {
        log.info("Saving new User : {}", user.getUsername());
        return userRepo.save(user);
    }

    @Override
    public Collection<User> list(int limit) {
        log.info("Fetching all Users");
        return userRepo.findAll(PageRequest.of(0,limit)).toList();
    }

    @Override
    public User get(Long id) {
        log.info("get user by id , {}",id);
        return userRepo.findById(id).get();
    }

    @Override
    public User Update(User user) {

        log.info("update user");
        return userRepo.save(user);
    }

    @Override
    public Boolean delete(Long id) {

        log.info("delete user");
        userRepo.deleteById(id);
        return true;

    }
}
