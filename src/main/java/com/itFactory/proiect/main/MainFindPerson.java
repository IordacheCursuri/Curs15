package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.PersonDao;

public class MainFindPerson {
    public static void main(String[] args) {

        PersonDao personDao = new PersonDao();

        System.out.println(personDao.findPerson(1));
    }
}
