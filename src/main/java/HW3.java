public class HW3 {
    public static void main(String[] args) {
        /*Задача №1

Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
●	a == b - если переменные равны
●	a < b - если переменная a меньше b
●	a > b - если переменная b меньше a*/
        int a = 5;
        int b = 8;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        }

/*Задача №2

Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
●	maybe a and b are even - если сумма переменных четная
●	some variable is odd - если сумма переменных нечетная*/
        int c = 10;
        int d = 20;
        int e = (c + d) % 2;

        if (e == 0) {//можно написать if(a % 2 == 0)-четная if(a % 2 == 1)
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

/*Задача №3

Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
●	больше 10 - если переменная больше 10
●	меньше 100 - если переменная меньше 100
●	результат деления на 2 больше 20 - если это соответствует истине
●	значение переменной между 5 и 40 включительно - если это правда
●	значение переменной меньше 5 или больше 40 - если предыдущие условие ложное */

        int f = 155;

        if (f > 10) {
            System.out.println("Больше 10");
        }
        if (f < 100) {
            System.out.println("Меньше 100");
        }
        if ((f / 2) > 20) {
            System.out.println("Результат деления на 2 больше 20");
        }
        if (f>=5 && f<=40){
            System.out.println("Значение переменной между 5 и 40 включительно");
        };
        if (f<5 || f>40) { // или
            System.out.println("Значение переменной меньше 5 или больше 40");
        }

    }
}
