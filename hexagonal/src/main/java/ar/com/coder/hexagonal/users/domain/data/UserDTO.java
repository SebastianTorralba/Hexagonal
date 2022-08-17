package ar.com.coder.hexagonal.users.domain.data;

import java.time.LocalDateTime;


import ar.com.coder.hexagonal.commons.domain.data.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements BaseDTO {
	private String id;
    private String username;
    private String name;
    private String lastName;
    private String password;
    private String hash;
    private boolean status;
    private String userCreate;
    private String userUpdate;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;
    private ProfileDTO profile;

}
