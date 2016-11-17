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
public class CreatDB {

	public static void main(String[] args) {
		final String DB_URL = "jdbc:hsqldb:file:BooksDB/Books";
		try{
			// make an connection
			Connection conn= DriverManager.getConnection(DB_URL);
			//  get rid of the table is exists
			dropTable(conn);
	
		}
		catch(SQLException ex ){
			
		}
	}
	
	public static void dropTable(Connection conn){
		try{
		Statement stamt= conn.createStatement();
		}
		catch(SQLException ex){
			
		}
	}
}
