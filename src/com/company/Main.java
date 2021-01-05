package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        House [] array  = new House[50];
        int end = 1, amount = -1;
        while(end != 0)
        {
            amount++;
            array[amount] = new House();
            System.out.print("Введіть номер квартири - ");
            Scanner number_of_flat = new Scanner(System.in);
            array[amount].setNumber_of_flat(number_of_flat.nextInt());
            System.out.print("Введіть площу квартири (М.кв) - ");
            Scanner square = new Scanner(System.in);
            array[amount].setSquare(square.nextInt());
            System.out.print("Введіть поверх квартири - ");
            Scanner floor = new Scanner(System.in);
            array[amount].setFloor(floor.nextInt());
            System.out.print("Введіть кількість кімнат у квартирі - ");
            Scanner amount_rooms = new Scanner(System.in);
            array[amount].setAmount_rooms(amount_rooms.nextInt());
            System.out.print("Введіть назву вулиці - ");
            Scanner street = new Scanner(System.in);
            array[amount].setStreet(street.nextLine());
            System.out.print("Введіть id - ");
            Scanner id = new Scanner(System.in);
            array[amount].setId(id.nextLong());
            System.out.print("Якщо ви бажаєте продовжити ввід даних введіть 1, 0 - кінець вводу ");
            Scanner check = new Scanner(System.in);
            end = check.nextInt();
        }
        System.out.print("Для пошуку введіть кількість кімнат у квартирі - ");
        Scanner amount_of_rooms = new Scanner(System.in);
        Outputter funcs = new Outputter();
        funcs.setAmount_of_rooms(amount_of_rooms.nextInt());
        funcs.func_amount_of_rooms(amount, array);
        System.out.print("Для пошуку введіть кількість кімнат у квартирі - ");
        Scanner amount_of_rooms1 = new Scanner(System.in);
        funcs.setAmount_of_rooms(amount_of_rooms1.nextInt());
        System.out.print("\nВведіть інтервал поверхів для пошуку квартир: ");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        funcs.setBegin_floor_interval(num1.nextInt());
        funcs.setEnd_floor_interval(num2.nextInt());
        funcs.func_find_the_flat(amount, array);
        System.out.print("Для пошуку введіть площу квартири - ");
        Scanner check_square = new Scanner(System.in);
        funcs.setCheck_square(check_square.nextInt());
        funcs.func_square(amount, array);
    }
}

