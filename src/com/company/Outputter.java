package com.company;

public class Outputter
{
    private int amount_of_rooms;
    private int begin_floor_interval;
    private int end_floor_interval;
    private int check_square;

    public void setAmount_of_rooms(int amount_of_rooms) {
        this.amount_of_rooms = amount_of_rooms;
    }

    public void setBegin_floor_interval(int begin_floor_interval) {
        this.begin_floor_interval = begin_floor_interval;
    }

    public void setEnd_floor_interval(int end_floor_interval) {
        this.end_floor_interval = end_floor_interval;
    }

    public void setCheck_square(int check_square) {
        this.check_square = check_square;
    }

    private void data_output(int index,House array[])
    {
        System.out.println("Id квартири - " + array[index].getId());
        System.out.println("Номер квартири - " + array[index].getNumber_of_flat());
        System.out.println("Площа квартири - " + array[index].getSquare());
        System.out.println("Поверх квартири - " + array[index].getFloor());
        System.out.println("Кількість кімнат - " + array[index].getAmount_rooms());
        System.out.println("Вулиця " + array[index].getStreet());
    }

    public void func_amount_of_rooms(int amount_flats, House array[])
    {
        for(int i = 0; i <= amount_flats; i++) {
            if(array[i].getAmount_rooms() == amount_of_rooms)
            {
                data_output(i,array);
            }
        }
    }

    public void func_find_the_flat(int amount_flats, House[] array)
    {
        for(int i = 0; i <=amount_flats; i++) {
            if(array[i].getAmount_rooms() == amount_of_rooms & array[i].getFloor() >= begin_floor_interval & array[i].getFloor() <= end_floor_interval)
            {
                data_output(i,array);
            }
        }
    }

    public void func_square(int amount_flats, House[] array)
    {
        for(int i = 0; i <=amount_flats; i++) {
            if(array[i].getSquare() > check_square)
            {
                data_output(i,array);
            }
        }
    }
}