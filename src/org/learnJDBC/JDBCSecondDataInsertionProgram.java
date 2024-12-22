package org.learnJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCSecondDataInsertionProgram
{
    public static void main(String[] args)
    {

        Connection con=null;
        PreparedStatement pstmt=null;

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusadetails","root","root");
            String query="insert into Emp_details values(?,?,?,?)";
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,103);
            pstmt.setString(2,"Darshan Patil");
            pstmt.setString(3,"chennai");
            pstmt.setString(4,"Data Engineering");
            int a1=pstmt.executeUpdate();

            if (a1==1)
            {
                System.out.println("Row inserted successfully...");
            }
            else
            {
                System.out.println("getting error while inserting data");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        finally {
            try {
                if (con!=null)
                {
                    con.close();
                }
                if (pstmt!=null)
                {
                    pstmt.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
