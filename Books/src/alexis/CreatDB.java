package alexis;

import java.util.Scanner;
import java.sql.*;
/*Up to 10 bonus points by using a JavaFX GUI.
Books

Must contain at least: Title, Author, Genre, Year Published, Number of pages

Pre-populate with at least 5 books during create.

Write a program that allows a user to insert new books and/or delete existing books.

Write a program that allows a user to list all books filtered by the user inputted author, genre, and/or year published.
 Display the sum of the pages of the books filtered by the user.
*/
// USE H BOX WITH ARCHER PANES FX
public class CreatDB {

	public static void main(String[] args) {
		final String DB_URL = "jdbc:hsqldb:file:BooksDB/Books";
		try{
			// make an connection
			Connection conn= DriverManager.getConnection(DB_URL);
			//  get rid of the table is exists
			dropTable(conn);
			//making table
			buildBookTable(conn);
			// SUM OF BOOK PAGE
			//sumofpages(conn);
	
		
			
	conn.close();
		}
		catch(SQLException ex ){
			ex.printStackTrace();
		}
	}
	





	private static void sumofpages(Connection conn) {

	try {
			Statement stmt=conn.createStatement();
			stmt.executeQuery("FROM BOOKS SELECT NumberOfPages SUM");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






	private static void buildBookTable(Connection conn) {
		try{
			Statement stmt=conn.createStatement();
			stmt.execute("CREATE TABLE BOOKS("+"Title CHAR(35),"+"Author CHAR(40),"+
			"Genre CHAR(20),"+" YearPublished INTEGER,"+" NumberOfPages INTEGER"+")");
			stmt.executeQuery("INSERT INTO BOOKS VALUES('Hamlet', 'Shakespeare','tragedy',1599,120)");
			
			stmt.executeQuery("INSERT INTO BOOKS VALUES('I Win!', 'U.Lose','tragedy',2011,35)");
			stmt.executeQuery("INSERT INTO BOOKS VALUES('April Fool', 'Sue Prize','comedy',2095,0)");
			stmt.executeQuery("INSERT INTO BOOKS VALUES('Golly Gosh', 'G.Whiz','thriller',2001,9999)");
			stmt.executeQuery("INSERT INTO BOOKS VALUES('Come on in', 'Doris Open','tragedy',2016,1128)");
			System.out.println(" Your BOOK is in our inventory ");
		}
		catch(SQLException ex){
			System.out.println("ERROR:"+"Book was no put away");
			ex.printStackTrace();
		}
	}

	public static void dropTable(Connection conn){
		try{
		Statement stmt= conn.createStatement();
		// drop table comman,update ,delete
		stmt.executeQuery("DROP TABLE BOOKS");
		System.out.println("table drop");
		}
		catch(SQLException ex){
			System.out.println("ERROR");
			
		}
	}
}
