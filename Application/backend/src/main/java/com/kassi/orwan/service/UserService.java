package com.kassi.orwan.service;

import com.kassi.orwan.model.User;

import java.util.Collection;

public interface UserService {
    User create(User user);
    Collection<User> list(int limit);
    User get(Long id);
    User Update(User user);
    Boolean delete(Long id);
}
