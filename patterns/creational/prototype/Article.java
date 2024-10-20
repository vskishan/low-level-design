public abstract class Article {
    
    public String title;
    
    public String author;

    public String content;

    public String publishedDate;

    public abstract Article clone();

    public Article(){

    }

    public Article(Article article){
        this.title = article.title;
        this.author = article.author;
        this.content = article.content;
        this.publishedDate = article.publishedDate;
    }
}
