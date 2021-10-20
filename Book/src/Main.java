public class Main {
    public static void main(String[] args)
    {
        Book lifeOfPi = new Book("Life of Pi", "Yann Martel", "Philosophical Fiction", 372); // creation of the four book classes
        Book lordOfTheFlies = new Book("Lord of the Flies", "William Golding", "Dystopian Fiction", 128);
        Book theGreatGatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Tradegy", 152, 30);
        Book ofMiceAndMen = new Book("Of Mice and Men", "John Steinbeck", "Tradegy", 107, 8);

        lifeOfPi.addRatings(); // random generation of the ratings for each book
        lordOfTheFlies.addRatings();
        theGreatGatsby.addRatings();
        ofMiceAndMen.addRatings();

        System.out.println(lifeOfPi.getTitle() + " is a book by " + lifeOfPi.getAuthor() + ", and the genre is " + lifeOfPi.getGenre() + "."); // printing out some information about each book via dot notation
        System.out.println(lordOfTheFlies.getTitle() + " is a book by " + lordOfTheFlies.getAuthor() + ", and the genre is " + lordOfTheFlies.getGenre() + ".");
        System.out.println(theGreatGatsby.getTitle() + " is a book by " + theGreatGatsby.getAuthor() + ", and the genre is " + theGreatGatsby.getGenre() + ". Also, it has " + theGreatGatsby.getNumPages() + " pages and sold " + theGreatGatsby.getMillionsSold() + " million copies.");
        System.out.println(ofMiceAndMen.getTitle() + " is a book by " + ofMiceAndMen.getAuthor() + ", and the genre is " + ofMiceAndMen.getGenre()+ ". Also, it has " + ofMiceAndMen.getNumPages() + " pages and sold " + ofMiceAndMen.getMillionsSold() + " million copies.");

        System.out.println("The total page count is " + (lifeOfPi.getNumPages() + lordOfTheFlies.getNumPages() + theGreatGatsby.getNumPages() + ofMiceAndMen.getNumPages()) + " pages."); // uses get function to add up page counts
        System.out.println("The total number of characters in all of the titles is " + (lifeOfPi.getTitle().length() + lordOfTheFlies.getTitle().length() + theGreatGatsby.getTitle().length() + ofMiceAndMen.getTitle().length()) + " characters."); // adds up the length of each title using the .length(); function
        System.out.println("The first letter of each author's name is " + lifeOfPi.getAuthor().substring(0,1) + lordOfTheFlies.getAuthor().substring(0,1) + theGreatGatsby.getAuthor().substring(0,1) + ofMiceAndMen.getAuthor().substring(0,1)); // gets the first letter of each author's name via the .substring(); function
        System.out.println("The last letter of each book's title is " + lifeOfPi.getTitle().substring(lifeOfPi.getTitle().length()-1) + lordOfTheFlies.getTitle().substring(lordOfTheFlies.getTitle().length()-1) + theGreatGatsby.getTitle().substring(theGreatGatsby.getTitle().length()-1) + ofMiceAndMen.getTitle().substring(ofMiceAndMen.getTitle().length()-1));
        // line 22 is very long, but simple to understand. it gets the title, and then finds the length of the title (using the .length(); function). Then, it uses the substring function to only include the last letter (which is indexed at the length - 1).
        System.out.println("The average rating of all books is " + (lifeOfPi.getAverageRating() + lordOfTheFlies.getAverageRating() + theGreatGatsby.getAverageRating() + ofMiceAndMen.getAverageRating()) / 4.0 + " star(s)."); // gets the average rating of each book and averages them
    }
}
