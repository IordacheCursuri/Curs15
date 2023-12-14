package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.JobDao;
import com.itFactory.proiect.model.Job;

public class MainInsert {

    public static void main(String[] args) {

      //  Job job = new Job(1, "MANAGER", "MANAGEMENT", 9000D);
     //   Job job = new Job(2, "FINANCIAL MANAGER", "MANAGEMENT", 10000);
        Job job = new Job(3, "PROGRAMMER", "IT", 12000);


        JobDao jobDao = new JobDao();

        jobDao.createJob(job);


    }




}
