package ar.com.coder.hexagonal.users.infraestructure.repositories;

import ar.com.coder.hexagonal.users.infraestructure.entities.SysProfile;
import org.springframework.data.repository.CrudRepository;


import ar.com.coder.hexagonal.users.infraestructure.entities.SysUsers;

public interface ProfilesRepository extends CrudRepository<SysProfile, Integer> {

}
