package ar.com.coder.hexagonal.users.infraestructure.adapters;

import ar.com.coder.hexagonal.users.domain.data.OperationDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysOperations;
import ar.com.coder.hexagonal.users.infraestructure.mappers.OperationMapper;
import ar.com.coder.hexagonal.users.infraestructure.repositories.OperationRepository;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Qualifier("OperationJpaAdapter")
public class OperationJpaAdapter implements ICrudPersistancePort<OperationDTO, String> {

	@Autowired
	OperationRepository operationRepository;

	OperationMapper operationMapper=Mappers.getMapper(OperationMapper.class);
	@Override
	public OperationDTO create(OperationDTO entity) {
		return null;
	}

	@Override
	public List<OperationDTO> createAll(Iterable<OperationDTO> entityList) {
		return null;
	}

	@Override
	public OperationDTO read(String id) {
		SysOperations Operation=operationRepository.findById(id).get();
		return operationMapper.toDto(Operation);
	}

	@Override
	public OperationDTO update(OperationDTO entity) {
		return null;
	}

	@Override
	public List<OperationDTO> search() {
		List<SysOperations> list =(List<SysOperations>) operationRepository.findAll();
		List<OperationDTO> listReturn=operationMapper.toDto(list);
		return listReturn;
	}

	@Override
	public int delete(String id) {
		return 0;
	}
}
