package by.it.telushko.jd01_15;

import by.it.telushko.jd01_02.InOut;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Выберите тип задач(а, b, c)\n(можно раскомментировать нужную букву)");
        //String taskNum= InOut.consoleLineInput(); //выбор типа задания
        //String taskNum="a";
        String taskNum="b";
        //String taskNum="c";
        switch (taskNum){
            case "a":{Task_A.taskA1(4,-15,15);break;}
            case "b": {Task_B.taskB1();break;}
            case "c": {
               // TaskC.taskC1(text);
                break;
            }
            default :{System.out.println("Ошибка!");break;}
        }
    }
}
