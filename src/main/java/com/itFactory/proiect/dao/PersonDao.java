package com.itFactory.proiect.dao;

import com.itFactory.proiect.model.Person;

import java.sql.*;

public class PersonDao {

    private Connection connection;
    public PersonDao() {
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


    public void createPerson(Person person) {
        try(PreparedStatement createStatement = connection.prepareStatement("INSERT INTO person VALUES(?,?,?,?,?)")) {


            createStatement.setInt(1, person.getId());
            createStatement.setString(2, person.getName());
            createStatement.setString(3, person.getEmail());
            createStatement.setDouble(4, person.getSalaryIndex());
            createStatement.setInt(5, person.getJobId());

            createStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public Person findPerson(int id){

        try (PreparedStatement findStatement = connection.prepareStatement("SELECT * FROM person WHERE id = ?")){

            findStatement.setInt(1, id);

            ResultSet rs = findStatement.executeQuery();


            while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt("id"));
                person.setName(rs.getString("name"));
                person.setEmail(rs.getString("email"));
                person.setSalaryIndex(rs.getDouble("salaryIndex"));
                person.setJobId(rs.getInt("job_id"));

                return person;

            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }




}
