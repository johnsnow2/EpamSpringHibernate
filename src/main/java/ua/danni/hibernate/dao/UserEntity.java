package ua.danni.hibernate.dao;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Artem on 26.03.2016.
 */
@Entity
@Table(name = "user", schema = "", catalog = "epamex")
public class UserEntity {
    private int idUser;
    private int idRole;
    private String login;
    private String password;
    private String name;
    private Collection<CoursesEntity> coursesesByIdUser;
    private Collection<GroupsEntity> groupsesByIdUser;

    @Id
    @Column(name = "idUser", nullable = false, insertable = true, updatable = true)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "idRole", nullable = false, insertable = true, updatable = true)
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "login", nullable = false, insertable = true, updatable = true, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idRole != that.idRole) return false;
        if (idUser != that.idUser) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + idRole;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userByIdProfessor")
    public Collection<CoursesEntity> getCoursesesByIdUser() {
        return coursesesByIdUser;
    }

    public void setCoursesesByIdUser(Collection<CoursesEntity> coursesesByIdUser) {
        this.coursesesByIdUser = coursesesByIdUser;
    }

    @OneToMany(mappedBy = "userByIdStudent")
    public Collection<GroupsEntity> getGroupsesByIdUser() {
        return groupsesByIdUser;
    }

    public void setGroupsesByIdUser(Collection<GroupsEntity> groupsesByIdUser) {
        this.groupsesByIdUser = groupsesByIdUser;
    }
}
