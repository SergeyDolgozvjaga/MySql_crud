package com.segeydolzgozvjaga.mysqldatabase.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Dao {

    void insertPerson(int id, String name, int age);

    void update(int id, String name, int age);

    void deleteById(int id);

    void deleteByName(String name);

//  ArrayList<Persons> getAllPersons();

    void displayAll() throws SQLException;


}
