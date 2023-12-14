package com.itFactory.proiect.service;

import com.itFactory.proiect.dao.JobDao;
import com.itFactory.proiect.dao.PersonDao;
import com.itFactory.proiect.model.Job;
import com.itFactory.proiect.model.Person;

public class PersonService {

    private final JobDao jobDao = new JobDao();
    private final PersonDao personDao = new PersonDao();



    public double calculateSalary(int personId) {
        Person person = personDao.findPerson(personId);

        Job job = jobDao.findById(person.getJobId());

        return calculateSalary2(person, job);

    }



    private double calculateSalary2 (Person person, Job job){
        double salary = person.getSalaryIndex() * job.getBaseSalary();
        return salary;
    }




}
