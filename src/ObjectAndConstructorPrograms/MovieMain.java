package ObjectAndConstructorPrograms;
class Movie {

    String title;
    String director;
    String[] actors = new String[5];
    String[] reviews = new String[5];

    int actorCount = 0;
    int reviewCount = 0;

    void setDetails(String t, String d) {
        title = t;
        director = d;
    }

    void addActor(String actorName) {
        if (actorCount < actors.length) {
            actors[actorCount] = actorName;
            actorCount++;
        } else {
            System.out.println("Actor list full");
        }
    }

    void addReview(String reviewText) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount] = reviewText;
            reviewCount++;
            System.out.println("Review Added");
        } else {
            System.out.println("Review list full");
        }
    }

    void displayReviews() {
        if (reviewCount == 0) {
            System.out.println("No Reviews Yet");
            return;
        }

        System.out.println("Reviews:");
        for (int i = 0; i < reviewCount; i++) {
            System.out.println((i + 1) + ". " + reviews[i]);
        }
    }

    void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);

        System.out.println("Actors:");
        for (int i = 0; i < actorCount; i++) {
            System.out.println(actors[i]);
        }
    }
}
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();

        m.setDetails("Inception", "Christopher Nolan");

        m.addActor("Leonardo DiCaprio");
        m.addActor("Joseph Gordon-Levitt");
        m.addActor("Elliot Page");

        m.addReview("Amazing movie!");
        m.addReview("Mind-blowing sci-fi thriller.");

        m.displayMovie();
        m.displayReviews();
	}

}
