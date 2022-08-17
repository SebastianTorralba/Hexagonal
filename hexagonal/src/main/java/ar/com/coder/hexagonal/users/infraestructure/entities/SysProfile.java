// Generated with g9.

package ar.com.coder.hexagonal.users.infraestructure.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="sys_profile")
public class SysProfile implements Serializable {
    protected static final String PK = "id";
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(length=100)
    private String name;
    @Column(length=100)
    private String description;
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
