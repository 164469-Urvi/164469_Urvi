import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie_DetailsList {

	ArrayList<Movie_Details> array1=new ArrayList<>();
	Movie_Details movie1=new Movie_Details("Saawariya","Ranbir","Sonam","Romantic");
    Movie_Details movie2=new Movie_Details("Devdas","Shahrukh","Madhuri","Romantic");
    Movie_Details movie3=new Movie_Details("Barfi","Ranbir","Priyanka","Tragedy");
	String movie;
	
	public  void add_movie() 
	{

	
    array1.add(movie1);
    array1.add(movie2);
    array1.add(movie3);
    for(Movie_Details m:array1)
    {
    	System.out.println(m);
    	
    
    }
	}
	public void remove_movie()
	{
		array1.remove(1);
		for(Movie_Details m1:array1)
		{
			System.out.println(m1);
		}
	}
	public void remove_AllMovies()
	{
		System.out.println("output");
		array1.removeAll(array1);
		for(Movie_Details m2:array1)
		{
			
			System.out.println(m2);
		}
	}
	public void find_movie_By_mov_Name(String Movie)
	{
		System.out.println("movie name");
		if(Movie=="Saawariya")
		{
			array1.get(0);
			System.out.println(array1.get(0));
		}
	}
	public void find_movie_By_Genre(String genre)
	{
		System.out.println("---------------");
		System.out.println("found movie by genre");
		if(genre=="Romantic")
		{
			for(Movie_Details m:array1)
			{
				
			if(m.getGenre()==genre)
			{
				System.out.println(m);
				System.out.println("///////////");
				
		
			}
			}
		}
	}
	public void argument(String argument)
	{
		
	}
	public static void main(String[] args) {
		
  Movie_DetailsList movie=new Movie_DetailsList();
  movie.add_movie();
  movie.find_movie_By_mov_Name("Saawariya");
  movie.find_movie_By_Genre("Romantic");
  //movie.argument(mov_Name);
  movie.remove_movie();
  movie.remove_AllMovies();
 
}
}