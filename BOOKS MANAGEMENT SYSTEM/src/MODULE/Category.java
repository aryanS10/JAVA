package MODULE;

public class Category extends MainCategory{
    String genre;
    int genre_id;

    public Category (String Category, String genre) {
        super(Category);
        this.genre = genre;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public void info (){
        System.out.println("Genre: "+this.genre);
        System.out.println("Genre id;"+genre_id);
        super.info();
    }
}
