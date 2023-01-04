package io.github.jasonkayzk.clipboardbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_clipboard_content")
@Getter
@Setter
@NoArgsConstructor
public class ClipboardContent {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "creator")
    private String creator;

    @Column(name = "is_deleted")
    private Integer isDeleted;

    @Column(name = "created_on")
    private Long createdOn;

    @Column(name = "deleted_on")
    private Long deletedOn;
}
