package ar.com.juanlopez.holamundo.app.repository;

import ar.com.juanlopez.holamundo.app.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
