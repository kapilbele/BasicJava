package org.learnJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFouthDeleteProgram
{
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;

        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusadetails","root","root");
            String query="delete from Emp_details where emp_id=102";
            stmt=con.createStatement();
            int a1=stmt.executeUpdate(query);
            if(a1==1)
            {
                System.out.println("Record deleted successfylly...");
            }
            else
            {
                System.out.println("Getting error while deleting record.. check query properly..");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        finally {
            try {
                if(con!=null)
                {
                    con.close();
                }
                if(stmt!=null)
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
