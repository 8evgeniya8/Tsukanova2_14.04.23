package Dz4;

public class China {
    public static void main(String[]args){
//        За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
//                З кожного боку боролися 3 типи воїнів з такими
//                показниками атаки:
//        Лі:
//        воїн - 13
//        лучник - 24
//        вершник - 46
//
//        Мінь:
//        воїн - 9
//        лучник - 35
//        вершник - 12
//        Розрахувати: загальний показник атаки для обох династій,
//        якщо відомо, що воїнів династії Лі кожного типу було 860,
//        а кількість воїнів династії Мінь кожного типу
//        в півтора рази більша.
//        Вивести в консоль значення загальної атаки кожної армії;
        int powerLi=860;
        double powerMin=860*1.5;

        int liWarrior=13;
        int liArcher=24;
        int liRider=46;
        double sumLi=(liArcher+liRider+liWarrior)*powerLi;
        System.out.println("Лі загальна атака:"+sumLi);

        int minWarrior=13;
        int minArcher=13;
        int minRider=13;
        double sumMin=(minRider+minArcher+minWarrior)*powerMin;
        System.out.println("Miнь загальна атака: "+sumMin);
    }
}
