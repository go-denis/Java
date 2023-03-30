package main;
/*1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
2. Создать множество ноутбуков (ArrayList).
3. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию.*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<NoteBook> notebooks = new ArrayList<>();
        notebooks.add(new NoteBook("Lenovo", "ThinkPad X1 Carbon", "14 дюймов", "1920x1080", 8, 512, "Windows 10", "Черный", 100000));
        notebooks.add(new NoteBook("Asus", "ZenBook Flip S", "13 дюймов", "1920x1080", 16, 512, "Windows 10", "Золотой", 200000));
        notebooks.add(new NoteBook("Apple", "MacBook Pro 15", "15 дюймов", "2880x1800", 16, 256, "macOS", "Серый космос", 300000));

        Map<String, java.io.Serializable> filters = new HashMap<>();
        System.out.println("Выберите критерий фильтрации:");
        System.out.println("1 - Производитель");
        System.out.println("2 - Модель");
        System.out.println("3 - Размер дисплея");
        System.out.println("4 - Разрешение дисплея");
        System.out.println("5 - Объем оперативной памяти");
        System.out.println("6 - Объем жесткого диска");
        System.out.println("7 - Операционная система");
        System.out.println("8 - Цвет");
        System.out.println("9 - Цена");

        Scanner scanner = new Scanner(System.in);
        int filterNumber = scanner.nextInt();
        String filterKey = "";
        switch (filterNumber) {
            case 1 -> {
                filterKey = "manufacturer";
                System.out.println("Введите производителя: ");
                String manufacturer = scanner.next();
                filters.put(filterKey, manufacturer);
            }
            case 2 -> {
                filterKey = "model";
                System.out.println("Введите модель: ");
                String model = scanner.next();
                filters.put(filterKey, model);
            }
            case 3 -> {
                filterKey = "displaySize";
                System.out.println("Введите размер дисплея: ");
                String displaySize = scanner.next();
                filters.put(filterKey, displaySize);
            }
            case 4 -> {
                filterKey = "displayResolution";
                System.out.println("Введите разрешение дисплея: ");
                String displayResolution = scanner.next();
                filters.put(filterKey, displayResolution);
            }
            case 5 -> {
                filterKey = "ramSize";
                System.out.println("Введите объем оперативной памяти: ");
                int ramSize = scanner.nextInt();
                filters.put(filterKey, ramSize);
            }
            case 6 -> {
                filterKey = "hddSize";
                System.out.println("Введите объем жесткого диска: ");
                int hddSize = scanner.nextInt();
                filters.put(filterKey, hddSize);
            }
            case 7 -> {
                filterKey = "os";
                System.out.println("Введите операционную систему: ");
                String os = scanner.next();
                filters.put(filterKey, os);
            }
            case 8 -> {
                filterKey = "color";
                System.out.println("Введите цвет: ");
                String color = scanner.next();
                filters.put(filterKey, color);
            }
            case 9 -> {
                filterKey = "price";
                System.out.println("Введите цену: ");
                double price = scanner.nextDouble();
                filters.put(filterKey, price);
            }
        }

        List filteredNotebooks = NotebookFilter.filter(notebooks, filters);
        if (filteredNotebooks.size() == 0) {
            System.out.println("Нет ноутбуков, удовлетворяющих критерию фильтрации");
        } else {
            for (NoteBook notebook : filteredNotebooks) {
                System.out.println(notebook.getManufacturer() + " " + notebook.getModel() + " " + notebook.getDisplaySize() + " " + notebook.getDisplayResolution() + " " +
                        notebook.getRamSize() + " " + notebook.getHddSize() + " " + notebook.getOs() + " " + notebook.getColor() + " " +
                        notebook.getPrice());
            }
        }
    }
}
