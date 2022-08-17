package ar.com.coder.hexagonal.users.infraestructure.repositories;

import ar.com.coder.hexagonal.users.infraestructure.entities.SysOperations;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysUsers;
import org.springframework.data.repository.CrudRepository;

public interface OperationRepository extends CrudRepository<SysOperations, String> {

}
