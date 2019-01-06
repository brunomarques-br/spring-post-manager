package br.com.brunomarques.springmongo.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public User() {}

    public User(String id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
