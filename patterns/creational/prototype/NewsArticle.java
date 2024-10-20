public class NewsArticle extends Article {

    public int readTime;

    public NewsArticle(NewsArticle newsArticle) {
        super(newsArticle);
        this.readTime = newsArticle.readTime;
    }

    @Override
    public Article clone() {
        return new NewsArticle(this);
    }
    
}
