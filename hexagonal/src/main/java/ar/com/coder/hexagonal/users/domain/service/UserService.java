package ar.com.coder.hexagonal.users.domain.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.com.coder.hexagonal.users.domain.data.UserDTO;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
import ar.com.coder.hexagonal.commons.domain.service.ICrudService;
@Service
public class UserService implements ICrudService<UserDTO,String> {
	@Autowired
	@Qualifier("UserJpaAdapter")
	ICrudPersistancePort<UserDTO, String> persistancePort;


	@Override
	public UserDTO create(UserDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> createAll(Iterable<UserDTO> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO read(String id) {
		UserDTO dto=persistancePort.read(id);
		return dto;
	}

	@Override
	public UserDTO update(UserDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> search() {
		List<UserDTO> listReturn=persistancePort.search();
		return listReturn;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
