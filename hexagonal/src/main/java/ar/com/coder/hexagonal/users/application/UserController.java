package ar.com.coder.hexagonal.users.application;

import java.util.List;

import ar.com.coder.hexagonal.users.domain.data.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.coder.hexagonal.users.domain.service.UserService;
import ar.com.coder.hexagonal.commons.domain.data.BaseResponse;
import ar.com.coder.hexagonal.commons.domain.port.api.IBaseController;
import ar.com.coder.hexagonal.commons.domain.data.BuildResponse;
@RestController
@RequestMapping("/users")
public class UserController implements IBaseController<UserDTO,String> {
	@Autowired
	UserService userService;

	/*
	 * @GetMapping public ResponseEntity<BaseResponse> getAll(){ return
	 * ResponseEntity.ok(BuildResponse.Response(userService.search(), "Securityr",
	 * getClass().getSimpleName()));
	 * 
	 * }
	 */
	@Override
	public ResponseEntity create(UserDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseEntity read(String id) {
		// TODO Auto-generated m
		return ResponseEntity.ok(BuildResponse.Response(userService.read(id),"",getClass().getSimpleName()));

	}
	@Override
	public ResponseEntity update(UserDTO entity, String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseEntity search() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ResponseEntity<BaseResponse> getAll() {
		return ResponseEntity.ok(BuildResponse.Response(userService.search(),"",getClass().getSimpleName()));
	}
}
