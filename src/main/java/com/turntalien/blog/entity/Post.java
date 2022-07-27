package com.turntalien.blog.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String title;

    @Lob
    @NotEmpty
    private String postContent;

    private Instant createdOn;

    private Instant updatedOn;

    @NotBlank
    private String userName;

}
