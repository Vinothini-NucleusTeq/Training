import java.io.*;
import java.util.*;
import java.sql.*;  
class OracleCon{  
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
System.out.println("Driver run successfully");
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
 
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select name from mydatabase.emp where id=1");  
System.out.println(rs.next());

System.out.println(rs.getString("name"));
while(rs.next())  
{
System.out.println(rs);    
}

//step5 close the connection object  
//con.close();  
  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  

