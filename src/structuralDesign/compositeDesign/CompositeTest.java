package structuralDesign.compositeDesign;

public class CompositeTest {
    public static void main(String[] args) {
        FileSystem image1 = new File("image1.jpg");
        FileSystem image2 = new File("image2.jpg");

        FileSystem resume = new File("cv.pdf");

        Folder images = new Folder("images");
        images.setFile(image1);
        images.setFile(image2);

        Folder docs = new Folder("documents");
        docs.setFile(resume);

        images.showDetails();
        docs.showDetails();
    }
}
