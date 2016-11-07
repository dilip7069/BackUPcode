package CS5513;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.servlet.http.HttpSession;

public class DataHandler {
	//specify the database connection string and log in information
	String jdbcUrl = null;
	String userid = null; //your Oracle username
	String password = null; // your Oracle password
	Connection conn;
	Statement stmt;
	ResultSet rset;
	String query;
	String sqlString, sqlString2;
	//create a new database connection
	
	public void getDBConnection() throws SQLException{
	OracleDataSource ds;
	ds = new OracleDataSource();
	ds.setURL(jdbcUrl);
	System.out.println(userid);
	conn=ds.getConnection(userid,password);
	}
	
	public boolean authenticateUser(String jdbcUrl, String userid, String password, HttpSession session) throws SQLException {
			this.jdbcUrl= jdbcUrl;
			this.userid = userid;
			this.password = password;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println(userid+" "+password);
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","userid", "password");
			}
			catch ( Exception ex ) {
			System.out.println("Invalid user credentials"+ex.getMessage());
			session.setAttribute("loginerrormsg", "Invalid Login. Try Again...");
			this.jdbcUrl = null;
			this.userid = null;
			this.password = null;
			return false;
			}
			return true;
			}
			
	
	public String addManufacturer(String custname, String street, String city, String state, int zip_code) throws SQLException,FileNotFoundException 
	{
			getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO Manfacturer VALUES ("+"'"+custname+"','"+street+"','"+city+"','"+state+"',"+zip_code+")";
			System.out.println("\nInserting: " + sqlString);
			stmt.execute(sqlString); //execute the query
			// got here, it is time to return the success status
			return "success";
			}
	public String addLaptop(String custname, String street, String city, String state, int zip_code) throws SQLException,FileNotFoundException 
	{
			getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO Manfacturer VALUES ("+"'"+custname+"','"+street+"','"+city+"','"+state+"',"+zip_code+")";
			System.out.println("\nInserting: " + sqlString);
			stmt.execute(sqlString); //execute the query
			// got here, it is time to return the success status
			return "success";
			}
	public String addLaptopdetails(int serialno, int  speed, int  price, int memory, String manf, int weight) throws SQLException,FileNotFoundException 
	{
			//boolean flag=false;
			int count=0;
		    getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO Computer VALUES ("+serialno+","+speed+","+price+","+memory+",'"+manf+"')";
			sqlString2= "INSERT INTO Laptop VALUES ("+serialno+","+weight+")";
			System.out.println("\nInserting: " + sqlString);	
			count= stmt.executeUpdate(sqlString);
			// got here, it is time to return the success status
			if(count!=0)
			{
				count=stmt.executeUpdate(sqlString2);
				if(count==1)
				{
					return "success";
				}
			}
			else
			{
				return "failure";
			}
			return "success";
			}	
	public String addorderdetails(int orderno, int  month, int  year, int serialno, String custname) throws SQLException,FileNotFoundException 
	{
		int count;
		    getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO ORDERNO VALUES ("+orderno+","+month+","+year+","+serialno+",'"+custname+"')";
			System.out.println("\nInserting: " + sqlString);	
			if(month<0||month>12)
			{
				System.out.println("Valid Month");
				return "Invalid Month";
				//System.out.println("Valid Month");
			}
			else if(year<0)
			{
				
				System.out.println("Valid year");
				return "Invalid Year";
			}
			count= stmt.executeUpdate(sqlString);
			// got here, it is time to return the success status
			if(count==1)
			{		
				    System.out.println("Hello");
					return "success";				
			}
			else
			{
				return "failure";
			}
			}	
	
	public String addtechsupportdetails(int serialno, String custname) throws SQLException,FileNotFoundException 
	{
		int count;
		    getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO TECHSUPPORT VALUES ('"+custname+"',"+serialno+")";
			System.out.println("\nInserting: " + sqlString);	
			count= stmt.executeUpdate(sqlString);
			// got here, it is time to return the success status
			if(count==1)
			{				
					return "success";				
			}
			else
			{
				return "failure";
			}
	}
	public String getLaptopDetails(int year, String custname) throws SQLException,FileNotFoundException 
	{
		    getDBConnection();
		    ResultSet rs;
		    String output="";
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("select serialno, custname from orderno where (year =? and serialno in (select serialno from laptop)) and custname=?");  
	        pstmt.setInt(1,year);
	        pstmt.setString(2, custname);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        output=rs.getInt(1)+"  "+rs.getString(2)+"  "+"\n";
	        }
	        
			return output;
	}
	public String getCustManfDetails(String manfname) throws SQLException,FileNotFoundException 
	{
		    getDBConnection();
		    ResultSet rs;
		    String output="";
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("Select * from Customer where custname in(select custname from techsupport where serialno in (select serialno from computer where manfname=?))");  
	        pstmt.setString(1,manfname);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        output=output+rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+"  "+rs.getInt(5)+"\n";
	        }
			return output;
	}
	
	public String getLaptopSoftwareDetails(String software) throws SQLException,FileNotFoundException 
	{
		    getDBConnection();
		    ResultSet rs;
		    String output="";
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("select custname from orderno where serialno in (select serialno from softwaredetails where (((software1=? or software2=?) or (software3=?)) and serialno in (select serialno from laptop)))");  
	        pstmt.setString(1,software);
	        pstmt.setString(2,software);
	        pstmt.setString(3,software);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        output=output+rs.getString(1)+"\n";
	        }
			return output;
	}
	public String getFindCustDetails(int price) throws SQLException,FileNotFoundException 
	{
		    getDBConnection();
		    ResultSet rs;
		    String output="";
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("select custname from orderno where serialno in (select serialno from computer where serialno in (select serialno from desktop) and price > ?)");  
	        pstmt.setInt(1,price);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        output=output+rs.getString(1)+"\n";
	        }
			return output;
	}
	public String getLaptopsoftware(int sno) throws SQLException,FileNotFoundException 
	{

		    getDBConnection();
		    ResultSet rs;
		    int flag=0;
		    String output="";
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("select serialno from laptop where serialno =  ?");  
	        pstmt.setInt(1,sno);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        	flag=1;
	        }
	        if (flag==1)
	        {
	        	 PreparedStatement pstmt1 = conn.prepareStatement ("select * from softwaredetails where serialno =  ?");  
	        	 pstmt1.setInt(1,sno);
	        	 System.out.println(sno);
	        	 rs=pstmt1.executeQuery();
	        	 while(rs.next())
	 	        {
	 	        output=rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"\n";
	 	        }
	        	 return output;
	        }
	        else 
	        {
	        	return "Not a valid Laoptop ID";
	        }
			
	}
	public String deleteCustomer(int year) throws SQLException,FileNotFoundException 
	{

		    getDBConnection();
		    int Count=0;
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        PreparedStatement pstmt = conn.prepareStatement ("delete customer where custname in (select custname from customer where custname not in (select custname from orderno where year>?))");  
	        pstmt.setInt(1,year);
	        Count=pstmt.executeUpdate();
	        return " "+Count+" rows Updated";
			
	}
	
}
			
