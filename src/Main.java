public class Main {
    public static void main(String[] args) {

        int balance = 100; //Количество денег на текущем счёте клиента
        int deposit = 1000; //сумма пополнения
        int fin_bonus = 0; //количество бонусных рублей

        if (deposit > 1000) {
            fin_bonus = deposit / 100;
        }

        int fin_account = balance + deposit + fin_bonus;
        System.out.println("Итоговый баланс - " + fin_account);
        System.out.println("Бонусы - " + fin_bonus);
    }
}