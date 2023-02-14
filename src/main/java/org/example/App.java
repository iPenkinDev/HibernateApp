package org.example;

import org.example.model.Item;
import org.example.model.Person;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Item.class);


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
//            Passport passport = session.get(Passport.class, 1);
//            System.out.println(passport.getPerson().getName());

//            Movie movie = new Movie("Pulp fiction", 1994);
//            Actor actor1 = new Actor("Harvey Keytel", 81);
//            Actor actor2 = new Actor("Samuel L. Jackson", 72);
//
//            movie.setActors(new ArrayList<>(List.of(actor1, actor2)));
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            actor2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//
//            session.save(movie);
//            session.save(actor1);
//            session.save(actor2);

//            Movie movie = session.get(Movie.class, 1);
//            System.out.println(movie.getName());

//            Actor actor = session.get(Actor.class, 2);
//            System.out.println(actor.getMovies());

//
            Person person = session.get(Person.class, 2);
            Hibernate.initialize(person.getItems()); //Method for loading entity

            session.getTransaction().commit();

            System.out.println(person); //Out of session
        } finally {
            sessionFactory.close();
        }
    }
}
