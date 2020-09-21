package Part13;

import java.util.Collection;

import Part11.Person;

public interface PersonWarehouse {
    void save(Person person);
    Person search(String socialSecurityNumber);

    void delete(Person person);
    void delete(String socialSecurityNumber);
    void deleteAll();

    Collection<Person> getAll();
}
