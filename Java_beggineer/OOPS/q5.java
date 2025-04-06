import java.util.ArrayList;

class Image {
    private double imageWidth;
    private double imageHeight;
    private double colorCode;

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = 0;
    }

    public Image(double imageWidth, double imageHeight, double colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public double getWid() {
        return imageWidth;
    }

    public void setWid(double imageWidth) {
        this.imageWidth = imageWidth;
    }

    public double getHei() {
        return imageHeight;
    }

    public void setHei(double imageHeight) {
        this.imageHeight = imageHeight;
    }

    public double getColorCode() {
        return colorCode;
    }

    public void setColorCode(double colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Image [Width=" + imageWidth + ", Height=" + imageHeight + ", ColorCode=" + colorCode + "]";
    }
}

class ImageLibrary {
    private ArrayList<Image> images;

    public ImageLibrary() {
        images = new ArrayList<>();
    }

    public void insertImage(Image img) {
        images.add(img);
        System.out.println("Image inserted successfully.");
    }

   
    public Image searchImage(double width, double height) {
        for (Image img : images) {
            if (img.getWid() == width && img.getHei() == height) {
                return img;
            }
        }
        return null; 
    }

    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        } else {
            System.out.println("Index out of range.");
            return null;
        }
    }

    public void displayAllImages() {
        if (images.isEmpty()) {
            System.out.println("No images available.");
        } else {
            for (Image img : images) {
                System.out.println(img);
            }
        }
    }
}


public class q5 {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary();

        Image img1 = new Image(100, 200, 111);
        Image img2 = new Image(300, 400, 222);
        Image img3 = new Image(150, 250, 333);

        library.insertImage(img1);
        library.insertImage(img2);
        library.insertImage(img3);

        System.out.println("\nAll Images:");
        library.displayAllImages();

        System.out.println("\nSearching for image with width=300 and height=400:");
        Image found = library.searchImage(300, 400);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Image not found.");
        }

        System.out.println("\nGetting image at index 1:");
        Image indexImage = library.getImage(1);
        if (indexImage != null) {
            System.out.println("Image at index 1: " + indexImage);
        }
    }
}
