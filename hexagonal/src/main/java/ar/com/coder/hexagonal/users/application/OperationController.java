package ar.com.coder.hexagonal.users.application;

import ar.com.coder.hexagonal.users.domain.service.OperationService;
import ar.com.coder.hexagonal.commons.domain.data.BaseResponse;
import ar.com.coder.hexagonal.commons.domain.data.BuildResponse;
import ar.com.coder.hexagonal.commons.domain.port.api.IBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationController implements IBaseController<ResponseEntity,String> {
	@Autowired
	OperationService operationService;

	/*
	 * @GetMapping public ResponseEntity<BaseResponse> getAll(){ return
	 * ResponseEntity.ok(BuildResponse.Response(operationService.search(), "Securityr",
	 * getClass().getSimpleName()));
	 * 
	 * }
	 */
	@Override
	public ResponseEntity create(ResponseEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResponseEntity read(String id) {
		// TODO Auto-generated m
		return ResponseEntity.ok(BuildResponse.Response(operationService.read(id),"",getClass().getSimpleName()));

	}
	@Override
	public ResponseEntity update(ResponseEntity entity, String id) {
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
		return ResponseEntity.ok(BuildResponse.Response(operationService.search(),"",getClass().getSimpleName()));
	}
}
