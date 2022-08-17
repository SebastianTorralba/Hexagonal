package ar.com.coder.hexagonal.users.infraestructure.repositories;

import org.springframework.data.repository.CrudRepository;

import ar.com.coder.hexagonal.users.infraestructure.entities.SysUsers;

public interface UserRepository extends CrudRepository<SysUsers, String> {

}
