package repository;

import java.util.ArrayList;
import java.util.List;

public  abstract class InMemoryRepository <T> implements ICrudRepository<T> {

    protected List<T> repoList;

    public InMemoryRepository() {
        this.repoList = new ArrayList<>();

    }

    @Override
    public List<T> getAll() {
        return this.repoList;
    }

    @Override
    public int size() {
        return repoList.size();
    }



}
