package org.example;

import org.example.model.Passport;
import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class);


        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person = session.get(Person.class, 3);
//            System.out.println(person);//
//            List<Item> items = person.getItems();
//            System.out.println(items);

//            Item item = session.get(Item.class, 5);
//            System.out.println(item);
//            Person person = item.getOwner();
//            System.out.println(person);

//            Person person = session.get(Person.class, 2);
//            Item newItem = new Item("Test for Hibernate", person);
//            person.getItems().add(newItem);

//            Person person = new Person("Test person", 38);
//            Item newItem = new Item("Test item", person);
//            person.setItems(new ArrayList<>(Collections.singletonList(newItem)));

//            Person person = new Person("Test cascading", 34);
//            person.addItem(new Item("Item 1"));
//            person.addItem(new Item("Item 2"));
//            person.addItem(new Item("Item 3"));
//
//            session.save(person);
            //Add to DB (OneToOne)
//            Person person = new Person("Test Person 2", 24);
//            Passport passport = new Passport(98765);
//            person.setPassport(passport);
//            session.save(person);
            //Read from DB (OneToOne)
            Passport passport = session.get(Passport.class, 1);
            System.out.println(passport.getPerson().getName());
            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }
    }
}
