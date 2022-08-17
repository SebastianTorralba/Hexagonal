package ar.com.coder.hexagonal.users.infraestructure.adapters;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ar.com.coder.hexagonal.users.domain.data.UserDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysUsers;
import ar.com.coder.hexagonal.users.infraestructure.mappers.UserMapper;
import ar.com.coder.hexagonal.users.infraestructure.repositories.UserRepository;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
@Component
@Qualifier("UserJpaAdapter")
public class UserJpaAdapter implements ICrudPersistancePort<UserDTO, String> {
	@Autowired
	UserRepository userRepository;

	UserMapper userMapper=Mappers.getMapper(UserMapper.class);

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
		SysUsers user=userRepository.findById(id).orElse(null);
		return userMapper.toDto(user);
	}

	@Override
	public UserDTO update(UserDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDTO> search() {
		List<SysUsers> list =(List<SysUsers>) userRepository.findAll();
		List<UserDTO> listReturn=userMapper.toDto(list);
		return listReturn;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
