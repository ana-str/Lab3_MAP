package repository;

import exceptions.MyException;

import java.util.List;

/**
 * CRUD operations repository interface
 *
 * @param <T> generic class
 */

public interface ICrudRepository<T> {

    /**
     * * @param id -the id of the entity
     * * @return the obj with the specified id or null
     * */

    T find(Long id) throws  MyException;

    List<T> getAll();


    T save( T obj) throws MyException;

    /**
       updates the changes that have been made after an add or delete operation
     **/

    T update(T obj) throws MyException;


    /**
     * removes the entity with the specified id.
     * Returns the removed entity or null if there is no entity with the given id. id must be not null
     *
     * @param id -the id of the entity to be removed
     * @return the removed entity or null
     */

    T delete(Long id) throws MyException;


    int size();



    }
