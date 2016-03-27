package ua.danni.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Artem on 26.03.2016.
 */
@Entity
@Table(name = "groups", schema = "", catalog = "epamex")
public class GroupsEntity {
    private int idGroup;
    private CoursesEntity coursesByIdCourses;
    private UserEntity userByIdStudent;

    @Id
    @Column(name = "id_group", nullable = false, insertable = true, updatable = true)
    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupsEntity that = (GroupsEntity) o;

        if (idGroup != that.idGroup) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idGroup;
    }

    @ManyToOne
    @JoinColumn(name = "id_courses", referencedColumnName = "id_courses")
    public CoursesEntity getCoursesByIdCourses() {
        return coursesByIdCourses;
    }

    public void setCoursesByIdCourses(CoursesEntity coursesByIdCourses) {
        this.coursesByIdCourses = coursesByIdCourses;
    }

    @ManyToOne
    @JoinColumn(name = "id_student", referencedColumnName = "idUser")
    public UserEntity getUserByIdStudent() {
        return userByIdStudent;
    }

    public void setUserByIdStudent(UserEntity userByIdStudent) {
        this.userByIdStudent = userByIdStudent;
    }
}
