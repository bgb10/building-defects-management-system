package com;

import java.sql.*;

public class InsertQueryExample {
    public static void main(String[] argv) {
        /* Retrieve DB authentication information */
        DatabaseAuthInformation db_info = new DatabaseAuthInformation();
        db_info.parse_auth_info("auth/mysql.auth");

        /* Prepare the URL for DB connection */
        String db_connection_url = String.format("jdbc:mysql://%s:%s/%s?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false", db_info.getHost(),
                db_info.getPort(),
                db_info.getDatabase_name());

        /* Prepare the query statement */
        String query_string = "insert into resident (id, name, registration_year, registration_month, registration_day) VALUES (?, ?, ?, ?, ?)";

        /* Preparation for db process */
        try (Connection db_connection = DriverManager.getConnection(db_connection_url, db_info.getUsername(), db_info.getPassword());
             PreparedStatement db_statement = db_connection.prepareStatement(query_string)){

            /* Set the query statement */
            db_statement.setString(1, "bgb10");
            db_statement.setString(2, "parkgwanbin");
            db_statement.setInt(3, 2020);
            db_statement.setInt(4, 2);
            db_statement.setInt(5, 21);

            /* Send query and get the result */
            int result = db_statement.executeUpdate();
            System.out.println("Updated query: " + result);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        /* Prepare the query statement */
        query_string = "insert into resident (id, name, registration_year, registration_month, registration_day) VALUES (?, ?, ?, ?, ?)";

        /* Preparation for db process */
        try (Connection db_connection = DriverManager.getConnection(db_connection_url, db_info.getUsername(), db_info.getPassword());
             PreparedStatement db_statement = db_connection.prepareStatement(query_string)){

            /* Set the query statement */
            db_statement.setString(1, "bgs20");
            db_statement.setString(2, "parkgwansoon");
            db_statement.setInt(3, 2019);
            db_statement.setInt(4, 10);
            db_statement.setInt(5, 28);

            /* Send query and get the result */
            int result = db_statement.executeUpdate();
            System.out.println("Updated query: " + result);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
