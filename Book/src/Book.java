public class Book {
    private String Title; // declaration of attributes
    private String Author; // each variable name is self-explanatory (Author lists the author, etc.)
    private int numPages;
    private String Genre;
    private int millionsSold;
    private int rating1;
    private int rating2;
    private int rating3;
    Book(String theTitle, String theAuthor, String theGenre, int thePages) // the first Book constructor
    {
        Title = theTitle;
        Author = theAuthor;
        Genre = theGenre;
        numPages = thePages;
        int rating1; // this constructs the rating attributes without having the user declare them
        int rating2; // this allows for the ratings to be part of the object while also being random
        int rating3;
    }
    Book(String theTitle, String theAuthor, String theGenre, int thePages, int theSold) // the second Book constructor, making this an oberloaded constructor
    {
        Title = theTitle;
        Author = theAuthor;
        Genre = theGenre;
        numPages = thePages;
        millionsSold = theSold;
        int rating1; // same as the previous three rating constructors
        int rating2;
        int rating3;
    }
    public void addRatings() // declaration of addRatings() function, that adds the ratings for each book
    {
        this.rating1 = (int) (Math.random()*5) + 1; // the "this" keyword refers to the object that was called via the method
        this.rating2 = (int) (Math.random()*5) + 1; // Basically, it generations a random value between 1-5 for each rating attribute of the object
        this.rating3 = (int) (Math.random()*5) + 1;
    }
    public int getAverageRating() // declaration of the getAverageRating() function
    {
        return (this.rating1 + this.rating2 + this.rating3) / 3; // finds the mean of the ratings for the book, once again using the this keyword
    }

    public int getRating1() { return rating1;         } // getter methods for each attribute of the object
    public int getRating2() { return rating2;         } // yes, I did make the curly brackets even for no reason
    public int getRating3() { return rating3;         } // I would not recommend this for regular code, but it was fun
    public String getAuthor(){ return Author;         }
    public String getGenre(){           return Genre; }
    public String getTitle(){         return Title;   }
    public int getNumPages(){         return numPages;}
    public int getMillionsSold(){ return millionsSold;}
}
