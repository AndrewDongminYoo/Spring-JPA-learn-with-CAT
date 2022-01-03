package com.andrew.catfoodadviser.users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    void update(User user);
    Optional<User> findByEmail(Email email);
}