public class RealUploader implements Uploader {

    @Override
    public void uploadImage(String filename) {
        System.out.println("Изображение успешно загружено: " + filename);
    }
}
