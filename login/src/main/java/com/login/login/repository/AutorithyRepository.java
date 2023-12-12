package com.login.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login.entity.Authority;
import com.login.login.entity.AuthorityName;

@Repository
public interface AutorithyRepository extends JpaRepository<Authority,Long>{

    Optional<Authority> findByName(AuthorityName name);

}
