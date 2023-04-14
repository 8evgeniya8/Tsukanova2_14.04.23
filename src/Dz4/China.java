package Dz4;

public class China {
    public static void main(String[]args){
        int liVoin=13;
        int liLuch=24;
        int liVersh=46;
        int minVoin=9;
        int minLuch=35;
        int miVersh=12;
        double allli = (liVoin+liLuch+liVersh)*860;
        double allmi = ((minVoin+minLuch+miVersh)*860)*1.5;
        System.out.println("Загальна сила армій: "+ (allli+allmi));
    }
}
