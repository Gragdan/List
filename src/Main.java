import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> items = new ArrayList<>();


        while (true) {
            System.out.println("Выберите операцию:");
            String input = scanner.nextLine();
            int inputInt;
            try {
                inputInt = Integer.parseInt(input);
                if (inputInt == 1) {
                    System.out.println("Какую покупку хотите добавить? ");
                    String prodToAdd = scanner.nextLine();
                    items.add(prodToAdd);
                    System.out.println("Итого список покупок: " + items.size());
                }
                if (inputInt == 2) {
                    System.out.println("Список покупок: ");
                    for (int s = 0; s < items.size(); s++) {
                        System.out.println(s + 1 + ". " + items.get(s));
                    }

                }
                if (inputInt == 3) {
                    System.out.println("Список покупок: ");
                    for (int s = 0; s < items.size(); s++) {
                        System.out.println(s + 1 + ". " + items.get(s));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название. ");
                    String prodToDelete = scanner.nextLine();
                    int prodToDeleteInt;
                    try {
                        prodToDeleteInt = Integer.parseInt(prodToDelete);
                        if (prodToDeleteInt > 0 && prodToDeleteInt < items.size() + 1) {
                            System.out.println("Покупка " + '"' + (char) 27 + "[31m" + items.get(prodToDeleteInt - 1) + (char) 27 + "[0m" + '"' + " удалена, список покупок:  ");
                            items.remove(prodToDeleteInt - 1);
                            for (int s = 0; s < items.size(); s++) {
                                System.out.println(s + 1 + ". " + items.get(s));
                            }
                        }
                    } catch (NumberFormatException e) {
                        if (items.contains(prodToDelete)) {
                            System.out.println("Покупка " + '"' + (char) 27 + "[31m" + prodToDelete + (char) 27 + "[0m" + '"' + " удалена, список покупок:  ");
                            items.remove(prodToDelete);
                            for (int s = 0; s < items.size(); s++) {
                                System.out.println(s + 1 + ". " + items.get(s));
                            }
                        }
                    }
                }
            } catch (NumberFormatException e) {

            }


        }
    }
}

