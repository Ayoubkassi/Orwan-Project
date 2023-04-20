package com.kassi.orwan.repo;

import com.kassi.orwan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    //User findById(Long id);


}
