public class Attachment {

    public String name;

    //Id of the blob stored in s3
    public String blobId;

    public Attachment(){
        
    }

    public Attachment(Attachment attachment) {
        this.name = attachment.name;
        this.blobId = attachment.blobId;
    }
    
}
