package ua.danni.hibernate.dao;

import javax.persistence.*;

/**
 * Created by Artem on 26.03.2016.
 */
@Entity
@Table(name = "banlist", schema = "", catalog = "epamex")
public class BanlistEntity {
    private int idbanList;
    private int idStudent;

    @Id
    @Column(name = "idbanList", nullable = false, insertable = true, updatable = true)
    public int getIdbanList() {
        return idbanList;
    }

    public void setIdbanList(int idbanList) {
        this.idbanList = idbanList;
    }

    @Basic
    @Column(name = "id_student", nullable = false, insertable = true, updatable = true)
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BanlistEntity that = (BanlistEntity) o;

        if (idStudent != that.idStudent) return false;
        if (idbanList != that.idbanList) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idbanList;
        result = 31 * result + idStudent;
        return result;
    }
}
