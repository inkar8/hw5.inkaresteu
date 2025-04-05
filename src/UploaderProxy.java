public class UploaderProxy implements Uploader {
    private RealUploader realUploader;
    private boolean isLoggedIn;

    public UploaderProxy(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
        this.realUploader = new RealUploader();
    }

    @Override
    public void uploadImage(String filename) {
        if (isLoggedIn) {
            realUploader.uploadImage(filename);
        } else {
            System.out.println("Ошибка: доступ запрещён. Пожалуйста, войдите в систему.");
        }
    }
}
