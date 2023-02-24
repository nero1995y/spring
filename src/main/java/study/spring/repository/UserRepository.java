package study.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.spring.entity.User;

import javax.persistence.EntityManager;

public interface UserRepository extends JpaRepository<User, Long> {
}
