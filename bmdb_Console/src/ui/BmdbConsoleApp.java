package ui;

import java.util.List;

import business.Movie;
import db.DAO;
import db.MovieList;
import uit.Console;

public class BmdbConsoleApp {
	private static DAO<Movie> movieRepo = new MovieList();

	public static void main(String[] args) {
		// welcome and initialization
		System.out.println("Welcome to the BMDB Console App!!");
		System.out.println();
		String command = "";
		System.out.println();

		// start loop
		while (!command.equalsIgnoreCase("exit")) {

			displayMenu();
			System.out.println();
			// prompt user input
			command = Console.getString("Command?: ", true);

			// business logic
			switch (command) {
			case "get":
				getMovie();
				break;
			case "list":
				listMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				// exit - do nothing
				break;
			default:
				System.out.println("Invalid Entry. Try Again.");
				break;
			}

			// display results
			// -end loop
		}
		// bye
		System.out.println("\nBYE");
	}

	private static void addMovie() {
		// prompt user for movie data
		// int id = Console.getInt("Movie ID: ", 0, (int) Double.POSITIVE_INFINITY);
		String title = Console.getString("Movie Title: ", true);
		int year = Console.getInt("Release Year: ", 0, (int) Double.POSITIVE_INFINITY);
		String rating = Console.getString("Movie Rating: ", true);
		String director = Console.getString("Movie Director: ", true);
		// add movie
		Movie m = new Movie(0, title, year, rating, director);
		movieRepo.add(m);

		// display confirmation message
		System.out.println("Movie successfully added!");
	}

	private static void deleteMovie() {
		// Prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		// delete the movie
		movieRepo.delete(m);
		// display confirmation msg
		System.out.println("Movie successfully deleted!");
		System.out.println();
	}

	private static void listMovies() {
		// get list of all movies
		List<Movie> movies = movieRepo.list();
		// display to screen
		for (Movie m : movies) {
			System.out.println(m);
		}
	}

	private static void getMovie() {
		// Prompt user for movie
		Movie m = getIdAndReturnMovie();
		// display the movie
		System.out.println(m);
	}

	private static Movie getIdAndReturnMovie() {
		Movie m = null;
		while (m == null) {
			int id = Console.getInt("Movie ID: ", 0, (int) Double.POSITIVE_INFINITY);
			m = movieRepo.get(id);
			System.out.println();
		}

		return m;

	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all movies\n");
		menu.append("get    - Get a movie by id\n");
		menu.append("add    - Add a movie\n");
		menu.append("del    - Delete a movie\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}

}
