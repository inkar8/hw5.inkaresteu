public class Main {
    public static void main(String[] args) {
        // Пример использования паттерна Proxy
        Image image1 = new ImageProxy("house1.jpg");
        Image image2 = new ImageProxy("apartment2.jpg");

        // Показываем миниатюры (быстро, без полной загрузки)
        image1.displayThumbnail();
        image2.displayThumbnail();

        System.out.println("==== Пользователь нажал на house1.jpg ====");

        // Загружаем и показываем полное изображение
        image1.displayFullImage();

        System.out.println("==== Пользователь снова нажал на house1.jpg ====");

        // Повторный вызов — уже без повторной загрузки
        image1.displayFullImage();

        // Пример использования Protection Proxy для загрузки изображений
        System.out.println("\n==== Загрузка изображений с Protection Proxy ====");

        Uploader uploader1 = new UploaderProxy(true);  // агент залогинен
        uploader1.uploadImage("villa.jpg");

        Uploader uploader2 = new UploaderProxy(false);  // агент не залогинен
        uploader2.uploadImage("secret-house.jpg");
    }
}
