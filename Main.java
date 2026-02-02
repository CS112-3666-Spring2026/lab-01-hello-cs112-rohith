public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
    }

    static void PrintHello() {
        System.out.println("Hello!");
    }

    static double ReturnSum(double x, double y) {
        return x + y;
    }
}

class Book {
    String title;

    Book()
    {
        title = "";
    }

    Book(String userTitle)
    {
        title = userTitle;
    }
    
    public String toString()
    {
        return ("Book Title: " + title);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }

    public boolean equals(Object o)
    {
        if(o == this)
        {
            return true;
        }
        if(o == null)
        {
            return false;
        }
        if (!(o instanceof Book))
        {
            return false;
        }

        Book other = (Book) o;
        if(this.title != other.title)
        {
            return false;
        }

        return true;
    }
}