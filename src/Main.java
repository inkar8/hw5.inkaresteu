public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("house1.jpg");
        Image image2 = new ImageProxy("apartment2.jpg");

        // Показываем миниатюры (быстро, без полной загрузки)
        image1.displayThumbnail();
        image2.displayThumbnail();

        System.out.println("==== Пользователь нажал на house1.jpg ====");

        // Загружаем и показываем полное изображение
        image1.displayFullImage();

        System.out.println("==== Пользователь снова нажал на house1.jpg ====");

        // Повторный вызов – уже без повторной загрузки
        image1.displayFullImage();
    }
}
