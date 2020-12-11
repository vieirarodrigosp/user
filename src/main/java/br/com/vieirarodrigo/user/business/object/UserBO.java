package br.com.vieirarodrigo.user.business.object;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.user.DTO.UserDTO;
import br.com.vieirarodrigo.user.repository.UserRepository;
import br.com.vieirarodrigo.user.repository.vo.UserVO;

@Component
public class UserBO {
	@Autowired
	private UserRepository repository;
	public UserVO save(UserDTO user) {
		return repository.save(UserVO.builder()
				.fullname(user.getFullName())
				.email(user.getEmail())
				.nickname(user.getNickName())
				.password(user.getPassword())
				.created(new Timestamp(System.currentTimeMillis()))
				.build());
	}
	public UserVO findById(int id) {
		return repository.findById(id).get();
	}
}