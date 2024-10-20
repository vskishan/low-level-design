
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        BlogPost systemDesignBlog = new BlogPost();
        systemDesignBlog.title = "Load Balancer";
        systemDesignBlog.author = "Kishan";
        systemDesignBlog.content = "Building a load balancer from scratch";
        systemDesignBlog.publishedDate = "2024-10-20";
        systemDesignBlog.tags = List.of("System-Desisgn");
        
        Attachment image1 = new Attachment();
        image1.name = "Architecture of a load balancer";
        image1.blobId = "<sample_id>";

        systemDesignBlog.attachments = List.of(image1);


        BlogPost systemDesignBlogPostConinuation = (BlogPost) systemDesignBlog.clone();
        systemDesignBlogPostConinuation.title = "Load Balancer - Part 2";
    }
}
