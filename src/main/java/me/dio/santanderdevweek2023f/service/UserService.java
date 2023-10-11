package me.dio.santanderdevweek2023f.service;

import me.dio.santanderdevweek2023f.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}