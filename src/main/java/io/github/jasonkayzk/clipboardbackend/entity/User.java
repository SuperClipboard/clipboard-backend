package io.github.jasonkayzk.clipboardbackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "salt")
    private String salt;

    @Column(name = "creator")
    private String creator;

    @Column(name = "updater")
    private String updater;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "created_on")
    private Long createdOn;

    @Column(name = "updated_on")
    private Long updatedOn;

    @Column(name = "deleted_on")
    private Long deletedOn;

    public User(Long id, String email, String salt, String creator, Long createdOn) {
        this.id = id;
        this.email = email;
        this.salt = salt;
        this.creator = creator;
        this.createdOn = createdOn;
    }
}
