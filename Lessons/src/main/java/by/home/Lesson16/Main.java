package by.home.Lesson16;

/*
 * Напишите программу, моделирующую кассы в магазине.
 * Существует несколько касс, работающих одновременно. Каждый покупатель
 * - однородный поток. Общее количество покупателей может быть
 * больше чем количество касс, но одновременно не может обрабатываться
 * больше покупателей чем имеется касс. У каждого покупателя есть
 * есть набор товаров, которые должны быть выведены в процессе обслуживания.
 */

public class Main {

    public static final int Buyers = 30;
    public static final String[] goods = {"Огурцы", "Газировка", "Сосиски", "Молоко", "Хлеб",
            "Сок", "Апельсины", "Мандарины", "Гречка", "Бумага"};

    public static void main(String[] args) {

        CashDesk[] cashDesk = {new CashDesk("Касса №1"), new CashDesk("Касса №2"),
                new CashDesk("Касса №3")};

        for (int i = 1; i <= Buyers; i++)
            new Buyer("№" + i, cashDesk, goods);
    }
}



