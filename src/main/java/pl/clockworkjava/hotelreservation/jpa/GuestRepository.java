package pl.clockworkjava.hotelreservation.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GuestRepository {
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("thePersistenceUnit");
    private static final EntityManager em = factory.createEntityManager();

    public void createNewGuest(String name, int age) {
        System.out.println("--------------- CREATE -----------------");
        Guest newOne = new Guest(name, age);

        em.persist(newOne);
        System.out.println("NewGuest id " + newOne.getId());
    }
}
