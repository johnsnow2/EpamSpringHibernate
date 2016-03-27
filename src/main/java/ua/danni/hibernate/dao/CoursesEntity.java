package ua.danni.hibernate.dao;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Artem on 26.03.2016.
 */
@Entity
@Table(name = "courses", schema = "", catalog = "epamex")
public class CoursesEntity {
    private int idCourses;
    private String courseName;
    private Integer duration;
    private String subject;
    private String start;
    private String end;
    private UserEntity userByIdProfessor;
    private Collection<GroupsEntity> groupsesByIdCourses;

    @Id
    @Column(name = "id_courses", nullable = false, insertable = true, updatable = true)
    public int getIdCourses() {
        return idCourses;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }

    @Basic
    @Column(name = "course_name", nullable = true, insertable = true, updatable = true, length = 45)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "duration", nullable = true, insertable = true, updatable = true)
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "subject", nullable = true, insertable = true, updatable = true, length = 45)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "start", nullable = true, insertable = true, updatable = true, length = 45)
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Basic
    @Column(name = "end", nullable = true, insertable = true, updatable = true, length = 45)
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursesEntity that = (CoursesEntity) o;

        if (idCourses != that.idCourses) return false;
        if (courseName != null ? !courseName.equals(that.courseName) : that.courseName != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (end != null ? !end.equals(that.end) : that.end != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourses;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_professor", referencedColumnName = "idUser")
    public UserEntity getUserByIdProfessor() {
        return userByIdProfessor;
    }

    public void setUserByIdProfessor(UserEntity userByIdProfessor) {
        this.userByIdProfessor = userByIdProfessor;
    }

    @OneToMany(mappedBy = "coursesByIdCourses")
    public Collection<GroupsEntity> getGroupsesByIdCourses() {
        return groupsesByIdCourses;
    }

    public void setGroupsesByIdCourses(Collection<GroupsEntity> groupsesByIdCourses) {
        this.groupsesByIdCourses = groupsesByIdCourses;
    }
}
