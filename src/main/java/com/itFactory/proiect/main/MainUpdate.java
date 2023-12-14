package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.JobDao;

public class MainUpdate {

    public static void main(String[] args) {

        JobDao jobDao = new JobDao();

        jobDao.updateDomain("CEO", 1);


    }


}
