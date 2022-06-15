public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        manager.add(new Book("Властелин колец", 505, 250, "Дж.Р.Р.Толкин"));
        manager.add(new Book("Хоббит", 510, 400, "Дж.Р.Р.Толкин"));
        manager.add(new Smartphone("Груша", 20, 500, "Яблочный Стив"));
        manager.add(new Smartphone("Игровая подстанция 5", 60, 300, "Кони"));

        Product[] result = manager.findByQuery("ин");// Метод Поиска.

        ProductRepository repo = new ProductRepository();
        repo.save(new Book("Властелин колец", 505, 250, "Дж.Р.Р.Толкин"));
        repo.save(new Book("Хоббит", 510, 400, "Дж.Р.Р.Толкин"));
        repo.save(new Smartphone("Груша", 20, 500, "Яблочный Стив"));
        repo.save(new Smartphone("Игровая подстанция 5", 60, 300, "Кони"));

        repo.removeById (505); //Удаление по id.
        Product[] all = repo.findAll();
    }
}
