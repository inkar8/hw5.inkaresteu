public class HighResolutionImage implements Image {
    private String filename;

    public HighResolutionImage(String filename) {
        this.filename = filename;
        loadImageFromDisk(); // Симуляция медленной загрузки
    }

    private void loadImageFromDisk() {
        System.out.println("Загрузка полного изображения: " + filename);
        try {
            Thread.sleep(2000); // симулируем задержку (2 секунды)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Показ миниатюры (из HighResolutionImage): " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Показ полного изображения: " + filename);
    }
}
