package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.PersonDao;
import com.itFactory.proiect.model.Person;

public class MainInsertPerson {

    public static void main(String[] args) {

        Person person = new Person();

        person.setId(1);
        person.setName("Gigel");
        person.setEmail("gigel@yahoo.com");
        person.setSalaryIndex(5.2);
        person.setJobId(1);


        PersonDao personDao = new PersonDao();

        personDao.createPerson(person);





    }


}
