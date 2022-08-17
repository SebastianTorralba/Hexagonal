// Generated with g9.

package ar.com.coder.hexagonal.users.infraestructure.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name="sys_operations")
public class SysOperations implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @Column(unique=true, nullable=false, length=20)
    private String id;
    @Column(length=100)
    private String name;
    private String endpoints;
    @Column(length=1)
    private boolean status;
    @Column(name="user_create", length=20)
    private String userCreate;
    @Column(name="user_update", length=20)
    private String userUpdate;
    @Column(name="date_create")
    private LocalDateTime dateCreate;
    @Column(name="date_update")
    private LocalDateTime dateUpdate;
    
}
