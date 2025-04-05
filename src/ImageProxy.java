public class ImageProxy implements Image {
    private String filename;
    private HighResolutionImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Показ миниатюры (низкое разрешение): " + filename);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResolutionImage(filename); // отложенная загрузка
        }
        realImage.displayFullImage();
    }
}
