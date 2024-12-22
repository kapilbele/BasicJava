package org.learnJDBC;

import java.sql.*;

public class JDBCThirdUpdateProgram
{
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;


        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusadetails","root","root");
            String query= "update Emp_details set emp_name='Darshan Rahude'"+"where emp_id=103";

            stmt= con.createStatement();

            int a1=stmt.executeUpdate(query);

            if (a1==1)
            {
                System.out.println("record updated successfully");
            }
            else
            {
                System.out.println("Getting error... check query again");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        finally {
            try
            {
                if (con!=null)
                {
                    con.close();
                }

                if (stmt!=null)
                {
                    stmt.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
