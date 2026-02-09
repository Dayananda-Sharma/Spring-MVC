package com.xworkz.apollo.repository;

import com.xworkz.apollo.dto.ApolloDto;
import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ApolloDB {
    public void apolloDB(ApolloDto apolloDto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/apollo";
            String userName="root";
            String password="root";
            String query="insert into apollo_info values(?,?,?,?,?) ";
            Connection connection = DriverManager.getConnection(url,userName,password);
            PreparedStatement pr=connection.prepareStatement(query);
            pr.setString(1,apolloDto.getName());
            pr.setLong(2,apolloDto.getNumber());
            pr.setString(3,apolloDto.getAddress());
            pr.setString(4,apolloDto.getCity());
            pr.setString(5,apolloDto.getState());

            int rows=pr.executeUpdate();
            if (rows==1){
                System.out.println("its connected");
            }else {
                System.out.println("not connected");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    public String getDataDB(String name){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/apollo";
            String userName="root";
            String password="root";
            String getQuery="select password from apollo_info name=?";
            Connection connection=DriverManager.getConnection(url,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(getQuery);
            preparedStatement.setString(1,userName);

            ResultSet resultSet=preparedStatement.executeQuery();

            if (resultSet.next()){
                return resultSet.getString("password");
            }
        }catch (SQLException | ClassNotFoundException sql){
            sql.printStackTrace();

        }return "null";
    }


}
