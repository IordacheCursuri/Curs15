package com.itFactory.proiect.dao;

import com.itFactory.proiect.model.Job;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JobDao {

    private Connection connection;


    public JobDao() {
        try {
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/curs14",
                    "root",
                    "1234"

            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void createJob(Job job) {

        try(PreparedStatement createStatement = connection.prepareStatement("INSERT INTO job VALUES(?, ?, ?, ?)")) {

            createStatement.setInt(1, job.getId());
            createStatement.setString(2, job.getName());
            createStatement.setString(3,job.getDomaine());
            createStatement.setDouble(4, job.getBaseSalary());

            createStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Job findById(int id) {

        try (PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM job WHERE id = ?")){

            findStatement.setInt(1, id);

            ResultSet rs = findStatement.executeQuery();


            while (rs.next()){
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setName(rs.getString("name"));
                job.setDomaine(rs.getString("domaine"));
                job.setBaseSalary(rs.getDouble("baseSalary"));

                return job;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

    public Job findByName(String name, int id) {

        try (PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM job WHERE name = ? AND id = ?")){

            // "SELECT * FROM job WHERE name = MANAGER AND id = 1"

            findStatement.setString(1, name);
            findStatement.setInt(2, id);

            ResultSet rs = findStatement.executeQuery();


            while (rs.next()){
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setName(rs.getString("name"));
                job.setDomaine(rs.getString("domaine"));
                job.setBaseSalary(rs.getDouble("baseSalary"));

                return job;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }


    public List<Job> getAllJobs() {

        List<Job> jobs = new ArrayList<>();

        try (PreparedStatement findAllStatement = connection.prepareStatement("SELECT * FROM job")){

            ResultSet rs = findAllStatement.executeQuery();

            while (rs.next()) {
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setName(rs.getString("name"));
                job.setDomaine(rs.getString("domaine"));
                job.setBaseSalary(rs.getDouble("baseSalary"));

                jobs.add(job);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return jobs;
    }


    public void deleteJob(int id){
        try(PreparedStatement deleteStatement = connection.prepareStatement("DELETE FROM job WHERE id = ?")) {


            deleteStatement.setInt(1, id);

            deleteStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void updateDomain(String domaine, int id) {

        String sql = "UPDATE job SET domaine = ? WHERE id = ?";

        try(PreparedStatement updateStatement = connection.prepareStatement(sql)) {


            updateStatement.setString(1, domaine);
            updateStatement.setInt(2, id);

            updateStatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}
