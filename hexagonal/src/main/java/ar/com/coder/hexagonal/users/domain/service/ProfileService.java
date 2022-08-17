package ar.com.coder.hexagonal.users.domain.service;

import ar.com.coder.hexagonal.users.domain.data.ProfileDTO;
import ar.com.coder.hexagonal.users.domain.data.UserDTO;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
import ar.com.coder.hexagonal.commons.domain.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements ICrudService<ProfileDTO,Integer> {
	@Autowired
	@Qualifier("ProfileJpaAdapter")
	ICrudPersistancePort<ProfileDTO, Integer> persistancePort;


	@Override
	public ProfileDTO create(ProfileDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProfileDTO> createAll(Iterable<ProfileDTO> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProfileDTO read(Integer id) {
		ProfileDTO dto=persistancePort.read(id);
		return dto;
	}

	@Override
	public ProfileDTO update(ProfileDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProfileDTO> search() {
		List<ProfileDTO> listReturn=persistancePort.search();
		return listReturn;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
