package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.JobDao;
import com.itFactory.proiect.model.Job;

public class MainFind {

    public static void main(String[] args) {

        JobDao jobDao = new JobDao();

        Job job1 = jobDao.findById(1);

        System.out.println(job1);

        System.out.println("****************************");
        System.out.println(jobDao.findByName("MANAGER", 2));


    }
}
