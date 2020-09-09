public class Book {
    private String name;
    private String genre;
    private int page;
    public Book(String n, String g, int p)
    {
        name = n;
        genre = g;
        page = p;
    }

    public Book(String n)
    {
        name = n;
        page = 0;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getName(String name)
    {
        return name;
    }

    public String getGenre(String genre)
    {
        return genre;
    }

    public int getPage()
    {
        return page;
    }

    public String toString()
    {
        return "Book:"+this.name+" pages:"+this.page+" genre:"+this.genre;
    }
}
