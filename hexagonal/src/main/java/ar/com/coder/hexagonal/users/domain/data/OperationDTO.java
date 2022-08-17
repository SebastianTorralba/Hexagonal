package ar.com.coder.hexagonal.users.domain.data;

import ar.com.coder.hexagonal.commons.domain.data.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class OperationDTO implements BaseDTO {
    private String id;
    private String name;
    private String endpoints;
    private boolean status;
    private String userCreate;
    private String userUpdate;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;
}
