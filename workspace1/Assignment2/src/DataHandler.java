
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpSession;

public class DataHandler {
	//specify the database connection string and log in information
	String jdbcUrl = "dbc:oracle:thin:@//oracle.cs.ou.edu:1521/pdborcl.cs.ou.edu";
	String userid = "<username>"; //your Oracle username
	String password = "<password>"; // your Oracle password
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
	conn=ds.getConnection(userid,password);
	}
	
	public boolean authenticateUser(String jdbcUrl, String userid, String password,
			HttpSession session) throws SQLException {
			this.jdbcUrl= jdbcUrl;
			this.userid = userid;
			this.password = password;
			try {
			OracleDataSource ds;
			ds = new OracleDataSource();
			ds.setURL(jdbcUrl);
			conn = ds.getConnection(userid, password); //connect to DB
			return true;
			}
			catch ( SQLException ex ) {
			System.out.println("Invalid user credentials");
			session.setAttribute("loginerrormsg", "Invalid Login. Try Again...");
			this.jdbcUrl = null;
			this.userid = null;
			this.password = null;
			return false;
			}
			}
			
	
	public String addStudent(int id, String street, int zip_code, String degree1,String degree2,
			String thesis, int no_of_hours) throws SQLException,FileNotFoundException {
			getDBConnection();
			//create a statement object, the first argument “TYPE_SCROLL_SENSITIVE” //indicates the type of a ResultSet object: scrollable and generally sensitive //to changes made by others; the second argument “CONCUR_READ_ONLY” indicates //the concurrency mode of the ResultSet object: the concurrency mode that may //not be updated. Both of the arguments are optional.
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sqlString = "INSERT INTO student VALUES (" + id + ",'" + street + "'," + zip_code + ")";
			System.out.println("\nInserting: " + sqlString);
			stmt.execute(sqlString); //execute the query
			// got here, it is time to return the success status
			return "success";
			}
			}
			