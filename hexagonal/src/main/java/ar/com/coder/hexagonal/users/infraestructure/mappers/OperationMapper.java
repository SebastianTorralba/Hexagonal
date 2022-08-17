package ar.com.coder.hexagonal.users.infraestructure.mappers;

import ar.com.coder.hexagonal.users.domain.data.OperationDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysOperations;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperationMapper {
	OperationDTO toDto(SysOperations dto);
	SysOperations toEntity(OperationDTO entity);
	List<OperationDTO> toDto(List<SysOperations> list);
	List<SysOperations> toEntity(List<OperationDTO> list);
}
