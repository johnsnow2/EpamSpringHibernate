package ua.danni.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Artem on 26.03.2016.
 */
@Entity
@Table(name = "journal", schema = "", catalog = "epamex")
public class JournalEntity {
    private int idJournal;
    private int idStudent;
    private int idCourses;
    private int rating;

    @Id
    @Column(name = "id_journal", nullable = false, insertable = true, updatable = true)
    public int getIdJournal() {
        return idJournal;
    }

    public void setIdJournal(int idJournal) {
        this.idJournal = idJournal;
    }

    @Basic
    @Column(name = "id_student", nullable = false, insertable = true, updatable = true)
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Basic
    @Column(name = "id_courses", nullable = false, insertable = true, updatable = true)
    public int getIdCourses() {
        return idCourses;
    }

    public void setIdCourses(int idCourses) {
        this.idCourses = idCourses;
    }

    @Basic
    @Column(name = "rating", nullable = false, insertable = true, updatable = true)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JournalEntity that = (JournalEntity) o;

        if (idCourses != that.idCourses) return false;
        if (idJournal != that.idJournal) return false;
        if (idStudent != that.idStudent) return false;
        if (rating != that.rating) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idJournal;
        result = 31 * result + idStudent;
        result = 31 * result + idCourses;
        result = 31 * result + rating;
        return result;
    }
}
