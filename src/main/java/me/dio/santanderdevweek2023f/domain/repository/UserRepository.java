package me.dio.santanderdevweek2023f.domain.repository;

import me.dio.santanderdevweek2023f.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
