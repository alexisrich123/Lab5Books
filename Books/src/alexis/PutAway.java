package alexis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class PutAway {

	public static void main(String[] args) throws SQLException {
		Scanner key= new Scanner(System.in);
		String I="I";
		String D="D";
		String X="X";
		System.out.println("press i to insert a book , d to delete a book, or x to exit t ");
		String uc=key.nextLine().toUpperCase();
		final String DB_URL = "jdbc:hsqldb:file:BooksDB/Books";
		Connection conn= DriverManager.getConnection(DB_URL);
		
		while(I.equals(uc)){
		System.out.println("Tell me the title of your book.");
		String title=key.nextLine();
		System.out.println("Tell me the book's Author.");
		String au=key.nextLine();
		System.out.println("Tell me the book's Main Genre.");
		String ge=key.nextLine();
		System.out.println("Tell me what year the book was published?");
		String ye=key.nextLine();
		System.out.println("Tell me how many pages does the book have?");
		String pa=key.nextLine();
		
	
			String sql="INSERT INTO BOOKS"
									+"(Title,Author,Genre, YearPublished, NumberOfPages)"
									+"VALUES"
									+"(?,?,?,?,?);";
			PreparedStatement stmt= conn.prepareStatement(sql);

			 stmt.setString(1, title);
			 stmt.setString(2, au);
			 stmt.setString(3, ge);
			 stmt.setString(4, ye);
			 stmt.setString(5, pa);
			stmt.executeUpdate();
			conn.close();
			System.out.println("You have Inserted a book");
			System.out.println("press i to inserted a book , d to delete a book, or x to exit t or anything ");
			uc=key.nextLine().toUpperCase();
		}
		while((D.equals(uc))){
			System.out.println("tell me what book you would like to delete");
			deleteByTitle(new Scanner(System.in).nextLine(),conn);
			
		}
		while(!D.equals(uc)||!I.equals(uc)){
			System.out.println("bye");
			System.exit(0);
			
		}
	
	
		
	}

	private static void deleteByTitle(String nextLine,Connection conn)throws SQLException {
		
		String sql= String.format("DELETE FROM BOOK"+"WHERE Title ='%s';",nextLine);
		Statement st = conn.createStatement();
		System.out.println("Book was thrown away");
		conn.close();
		
	}

}
