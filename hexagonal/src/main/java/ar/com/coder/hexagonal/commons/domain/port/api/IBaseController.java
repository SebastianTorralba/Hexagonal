package ar.com.coder.hexagonal.commons.domain.port.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IBaseController<T,ID> {
	@PostMapping("/")
	ResponseEntity create(T entity);
	@GetMapping("/{id}")
	ResponseEntity read(@PathVariable ID id);
	@PostMapping("/{id}")
	ResponseEntity update(@RequestBody T entity,@PathVariable ID id);
	@PostMapping("/list")
	ResponseEntity search();
	@GetMapping("/")
	ResponseEntity getAll();
	
	@DeleteMapping("/{id}")
	int delete(@PathVariable ID id);
}
