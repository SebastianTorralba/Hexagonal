package ar.com.coder.hexagonal.users.infraestructure.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import ar.com.coder.hexagonal.users.domain.data.ProfileDTO;
import ar.com.coder.hexagonal.users.domain.data.UserDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysProfile;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysUsers;

@Mapper(componentModel = "spring")
public interface UserMapper {
	UserDTO toDto(SysUsers entity);
	SysUsers toEntity(UserDTO dto);
	List<UserDTO> toDto(List<SysUsers> list);
	List<SysUsers> toEntity(List<UserDTO> list);
	
}
