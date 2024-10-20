import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BlogPost extends Article {

    public List<String> tags;

    public List<Attachment> attachments;

    public BlogPost(){
        
    }

    public BlogPost(BlogPost blogPost){
        super(blogPost);
        this.tags = new ArrayList<>(blogPost.tags);
        this.attachments = blogPost.attachments.stream().map(Attachment::new).collect(Collectors.toList());
    }

    @Override
    public Article clone() {
        return new BlogPost(this);
    }
    
}
