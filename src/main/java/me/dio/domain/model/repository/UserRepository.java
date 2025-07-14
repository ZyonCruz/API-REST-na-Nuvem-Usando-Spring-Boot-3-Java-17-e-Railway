package me.dio.domain.repository; // Este deve ser o pacote correto

import me.dio.domain.model.User; // Importe a classe User
import org.springframework.data.jpa.repository.JpaRepository; // Importe JpaRepository
import org.springframework.stereotype.Repository; // Importe Repository

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
