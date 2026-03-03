package Session16TH;

import java.util.List;

public interface IRepositoryry<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}
