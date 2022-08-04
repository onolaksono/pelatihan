package com.test.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity (name = "user")
@Table  (name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private  static final long SerialVersionUIDAdder = -4492412758881190962L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, unique = true)
    private  long id;

    @NotBlank
    @Column(name = "username", nullable = false, length = 255)
    private  String username;

    @NotBlank
    @Column(name = "phone", nullable = false, length = 12)
    private  String phone;

    @NotBlank
    @Column(name = "address", nullable = false, columnDefinition = "TEXT")
    private  String address;
}
