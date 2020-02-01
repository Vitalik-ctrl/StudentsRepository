package com.hillel.students.domain.student;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Name is mandatory")
    String telegram;

    String email;

    String level;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelegram() {
        return telegram;
    }

    public String getEmail() {
        return email;
    }

    public String getLevel() {
        return level;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
