package ar.com.coder.hexagonal.users.infraestructure.mappers;

import org.mapstruct.Mapper;

import ar.com.coder.hexagonal.users.domain.data.ProfileDTO;
import ar.com.coder.hexagonal.users.infraestructure.entities.SysProfile;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
	ProfileDTO toDto(SysProfile dto);
	SysProfile toEntity(ProfileDTO entity);
	List<ProfileDTO> toDto(List<SysProfile> list);
	List<SysProfile> toEntity(List<ProfileDTO> list);
}
