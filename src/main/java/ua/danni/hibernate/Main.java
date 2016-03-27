package ua.danni.hibernate;

/**
 * Created by Artem on 26.03.2016.
 */
import org.hibernate.Session;
import ua.danni.hibernate.dao.UserEntity;
import ua.danni.hibernate.utils.HibernateSessionFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        UserEntity userEntity = new UserEntity();

        userEntity.setLogin("lalka777");
        userEntity.setName("Nick");
        userEntity.setPassword("lalka777");
        userEntity.setIdRole(1);

        session.save(userEntity);
        session.getTransaction().commit();

        session.close();


    }
}