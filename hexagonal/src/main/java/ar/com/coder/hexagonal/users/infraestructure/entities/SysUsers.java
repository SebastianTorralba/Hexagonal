// Generated with g9.

package ar.com.coder.hexagonal.users.infraestructure.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sys_users", indexes={@Index(name="sys_users_username_IX", columnList="username", unique=true)})
public class SysUsers implements Serializable {

    protected static final String PK = "id";
    @Id
    @Column(unique=true, nullable=false, length=20)
    private String id;
    @Column(unique=true, nullable=false, length=100)
    private String username;
    @Column(length=100)
    private String name;
    @Column(name="last_name", length=100)
    private String lastName;
    @Column(length=100)
    private String password;
    @Column(length=100)
    private String hash;
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
    @ManyToOne
    @JoinColumn(name="profile_id")
    private SysProfile sysProfile;
}
