package ar.com.coder.hexagonal.users.domain.data;

import java.time.LocalDateTime;


import ar.com.coder.hexagonal.commons.domain.data.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProfileDTO implements BaseDTO {
	private int id;
	private String name;
	private String description;
	private boolean status;
	private String userCreate;
	private String userUpdate;
	private LocalDateTime dateCreate;
	private LocalDateTime dateUpdate;
}
