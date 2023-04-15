package Dz4;

public class China {
    public static void main(String[]args){
        int liVoin=13;
        int liLuch=24;
        int liVersh=46;
        int minVoin=9;
        int minLuch=35;
        int miVersh=12;
        int sumPipleLi=860;
        double sumPipleMi=860*1.5;
        double allli = (liVoin+liLuch+liVersh)*sumPipleLi;
        double allmi = (minVoin+minLuch+miVersh)*sumPipleMi;
        System.out.println("Загальна сила армій: "+ (allli+allmi));
    }
}
