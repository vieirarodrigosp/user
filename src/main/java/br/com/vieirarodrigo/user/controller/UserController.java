package br.com.vieirarodrigo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.user.DTO.UserDTO;
import br.com.vieirarodrigo.user.business.object.UserBO;
import br.com.vieirarodrigo.user.repository.vo.UserVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class UserController {
	@Autowired
	private UserBO userBO;
	@ApiOperation(value="This service creates a new user in the database.")
	@PostMapping(path = "/v1/users")
	public @ResponseBody UserVO save(@RequestBody UserDTO user) {
		return userBO.save(user);
	}
	@ApiOperation(value="This Service fetches the user from the database by id.")
	@GetMapping(path = "/v1/users/{id}")
	public @ResponseBody UserVO findById(@PathVariable int id) {
		return userBO.findById(id);
	}
}