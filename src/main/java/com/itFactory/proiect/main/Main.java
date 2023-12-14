package com.itFactory.proiect.main;

import com.itFactory.proiect.service.PersonService;

public class Main {
    public static void main(String[] args) {

        PersonService personService = new PersonService();

        System.out.println(personService.calculateSalary(1));




    }
}
