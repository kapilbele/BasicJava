package org.learnJDBC;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JDBCFirstDataRetrivalProgram
{
    public static void main(String[] args)
    {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
           /*Driver driver=new com.mysql.jdbc.Driver();
           DriverManager.registerDriver(driver);*/
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/virtusadetails","root","root");
           String query="select * from Emp_details";
           stmt=con.createStatement();
           rs=stmt.executeQuery(query);

           while(rs.next())
           {
               int emp_id=rs.getInt("emp_id");
               String emp_name=rs.getString("emp_name");
               String location=rs.getString("location");
               String serviceline=rs.getString("service_line");

               System.out.println(emp_id+" "+emp_name+" "+location+" "+serviceline);
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
                if (stmt!=null)
                {
                    stmt.close();
                }
                if (rs!=null)
                {
                    rs.close();
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
