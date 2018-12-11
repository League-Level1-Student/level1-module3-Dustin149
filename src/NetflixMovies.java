
public class NetflixMovies {

	public static void main(String[] args) {
		// Movies
		Movie CaptainUnderpants = new Movie("Captain Underpants",4);
		Movie AvengersCivilWar = new Movie("Avengers - Civil War",5);
		Movie BlackPanther = new Movie("Black Panther",5);
		Movie Coco = new Movie("Coco",5);
		Movie someBadMovie = new Movie ("Anonymous",2); // Not a real movie, I think.
		
		Coco.getTicketPrice();
		
		// Instantiate NetflixQueue
		NetflixQueue netflixQueue = new NetflixQueue();
		
		netflixQueue.addMovie(CaptainUnderpants);
		netflixQueue.addMovie(AvengersCivilWar);
		netflixQueue.addMovie(BlackPanther);
		netflixQueue.addMovie(Coco);
		netflixQueue.addMovie(someBadMovie);
		
		netflixQueue.printMovies();
		System.out.println("The best movie is "+netflixQueue.getBestMovie());
		System.out.println("The second best movie is "+netflixQueue.getMovie(1));
	}

}
