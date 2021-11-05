package repository;
import exceptions.MyException;
import model.Person;
import model.Course;

/**
 * Repository Class that manages all CRUD operations for a Person
 *
 * @param <T> generic PersonRepo
 */


public class PersonRepo <T extends Person>  extends InMemoryRepository<T>{

    public PersonRepo() {
        super();
    }

    @Override
    public T find(Long id) throws MyException {
        if (id == null)
            throw new MyException("Invalid ID");
        for (Person person : repoList) {
            if (person.getId() == id)
                return (T) person;
        }
        return null;
    }

    @Override
    public T save(T obj) throws MyException {
        return null;
    }

    @Override
    public T update(T obj) throws MyException {
            if (obj == null)
                throw new MyException("Invalid object");
            for (Person person : repoList)
                if (person.getId() == obj.getId()) {
                    repoList.remove(person);
                    repoList.add(obj);
                    return null;
            }
        return obj;
    }

    @Override
    public T delete(Long id) throws MyException {
        if (id == null)
            throw new MyException("Invalid entity");
        for (Person person : repoList)
            if (person.getId() == id) {
                repoList.remove(person);
                return (T) person;
            }
        return null;
    }
}
