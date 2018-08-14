package com.project.repositories;
//Spring Data will use the information supplied to route requests to the appropriate repository implementation on our behalf.   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer>{
	User findByEmail(String email);
    User findByConfirmationToken(String confirmationToken);
}
