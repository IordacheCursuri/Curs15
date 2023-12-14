package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.JobDao;

public class MainDelete {

    public static void main(String[] args) {

        JobDao jobDao = new JobDao();

        jobDao.deleteJob(3);


    }

}
