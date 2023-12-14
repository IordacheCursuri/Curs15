package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.JobDao;
import com.itFactory.proiect.model.Job;

import java.util.List;

public class MainFindAll {

    public static void main(String[] args) {

        JobDao jobDao = new JobDao();

       List<Job> jobs =  jobDao.getAllJobs();

        System.out.println(jobs);



    }


}
