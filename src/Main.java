public class Main {
    public static void main(String[] args) {
        int balance = 250; //Начальный баланс клиента
        int replenishmentAmount = 1100; //Сумма пополнения
        int bonus = 0; // Сумма бонусов


        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100; //за каждые полные 100 рублей пополнения
        }
        int finalScore = balance + replenishmentAmount + bonus; //Итоговый баланс
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый баланс: " + finalScore);
    }
}