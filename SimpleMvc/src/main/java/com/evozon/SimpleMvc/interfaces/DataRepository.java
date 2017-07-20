package com.evozon.SimpleMvc.interfaces;

import java.util.List;

/**
 * Created by leeroy on 10.07.2017.
 */
public interface DataRepository<T,E> {
    public void addData(T data);
    public List<T> getDataById(E id);
    public void removeDataById(E id);
    public void addListOfData(List<T> listOfData);
    public List<Long> getIds();
}
