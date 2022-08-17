package ar.com.coder.hexagonal.users.infraestructure.adapters;

import ar.com.coder.hexagonal.users.domain.data.ProfileDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysProfile;
import ar.com.coder.hexagonal.users.infraestructure.mappers.ProfileMapper;
import ar.com.coder.hexagonal.users.infraestructure.repositories.ProfilesRepository;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("ProfileJpaAdapter")
public class ProfileJpaAdapter implements ICrudPersistancePort<ProfileDTO, Integer> {

	@Autowired
	ProfilesRepository profileRepository;

	ProfileMapper profileMapper=Mappers.getMapper(ProfileMapper.class);
	@Override
	public ProfileDTO create(ProfileDTO entity) {
		return null;
	}

	@Override
	public List<ProfileDTO> createAll(Iterable<ProfileDTO> entityList) {
		return null;
	}

	@Override
	public ProfileDTO read(Integer id) {
		SysProfile Profile=profileRepository.findById(id).get();
		return profileMapper.toDto(Profile);
	}

	@Override
	public ProfileDTO update(ProfileDTO entity) {
		return null;
	}

	@Override
	public List<ProfileDTO> search() {
		List<SysProfile> list =(List<SysProfile>) profileRepository.findAll();
		List<ProfileDTO> listReturn=profileMapper.toDto(list);
		return listReturn;
	}

	@Override
	public int delete(Integer integer) {
		return 0;
	}
}
