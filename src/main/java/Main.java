
import db.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Author.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Author author = new Author("Mike", "Vazovski");

            session.beginTransaction();

            session.save(author);

            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
