package ar.com.coder.hexagonal.users.domain.service;

import ar.com.coder.hexagonal.users.domain.data.OperationDTO;
import ar.com.coder.hexagonal.commons.domain.port.spi.ICrudPersistancePort;
import ar.com.coder.hexagonal.commons.domain.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService implements ICrudService<OperationDTO,String> {
	@Autowired
	@Qualifier("OperationJpaAdapter")
	ICrudPersistancePort<OperationDTO, String> persistancePort;


	@Override
	public OperationDTO create(OperationDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperationDTO> createAll(Iterable<OperationDTO> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OperationDTO read(String id) {
		OperationDTO dto=persistancePort.read(id);
		return dto;
	}

	@Override
	public OperationDTO update(OperationDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OperationDTO> search() {
		List<OperationDTO> listReturn=persistancePort.search();
		return listReturn;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
