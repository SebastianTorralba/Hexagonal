// Generated with g9.

package ar.com.coder.hexagonal.users.infraestructure.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="sys_profile_operations")
@IdClass(SysProfileOperations.SysProfileOperationsId.class)
public class SysProfileOperations implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class SysProfileOperationsId implements Serializable {
        SysProfile sysProfile;
        SysOperations sysOperations;
    }

    /** Primary key. */
    protected static final String PK = "SysProfileOperationsSysProfileOperationsPk";

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
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="operation_id", nullable=false)
    private SysOperations sysOperations;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="profile_id", nullable=false)
    private SysProfile sysProfile;

}
