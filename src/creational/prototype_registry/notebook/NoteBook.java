package creational.prototype_registry.notebook;

import java.util.List;

public class NoteBook {

    private int numPages;
    private String type; //{ruled, blank}
    private int mrp;
    private int height;
    private int width;
    private String frontPageDesign;
    private List<String> funFacts;

    public NoteBook() {

    }

    public NoteBook clone() {
        NoteBook copy = new NoteBook();
        copy.frontPageDesign = this.frontPageDesign;
        copy.funFacts = this.funFacts;
        copy.height = this.height;
        copy.width = this.width;
        copy.mrp = this.mrp;
        copy.numPages = this.numPages;
        copy.type = this.type;
        return copy;
    }
}
