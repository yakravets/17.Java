package app;

import models.Passport;
import models.User;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class Program {
    public static void main(String[] args) {

        String mysqlConfig = "hibernatemysql.cfg.xml";
        String postgresConfig = "hiberpg.cfg.xml";
        Session session = HibernateSessionFactoryUtil.getSessionFactory(postgresConfig).openSession();

        User user = new User();
        Passport passport = new Passport();

        user.setPassport(passport);
        passport.setUser(user);

        session.beginTransaction();
        session.save(user);
        session.save(passport);
        session.getTransaction().commit();

        session.close();

        System.out.println("Save successfull");
    }
}
