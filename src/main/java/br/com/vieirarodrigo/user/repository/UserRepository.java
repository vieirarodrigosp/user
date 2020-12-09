package br.com.vieirarodrigo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.user.repository.vo.UserVO;

@Repository
public interface UserRepository extends JpaRepository<UserVO, Integer>{ }