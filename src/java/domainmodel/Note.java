package domainmodel;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable {

    private int noteId;
    private Date dateCreated;
    private String content;

     public Note(int noteId, Date dateCreated, String content) {
        
        this.noteId = noteId;
        this.dateCreated = dateCreated;
        this.content = content;
    }

    public Note(Date dateCreated, String content) {
        
        this.dateCreated = dateCreated;
        this.content = content;
    }
    
    public Note(int noteId, String content) {
        
        this.noteId = noteId;
        this.content = content;
    }
    

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String content) {
        this.content = content;
    }
    
    
}
