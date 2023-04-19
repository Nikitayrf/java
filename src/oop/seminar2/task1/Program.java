package oop.seminar2.task1;

public class Program {
    public static void main(String[] args) {
        Father f1 = new Father( "Vasia", 55 );
        Children c1 = new Children( "Ilya", 18 );
        GeoTreeParentChildren geo = new GeoTreeParentChildren();
        geo.append( f1, c1 );
        System.out.println( geo );

        Husbant h1 = new Husbant( "Husb_1", 44 );
        Wife w1 = new Wife( "Wife_1", 45 );
        GeoTreeSpouses geoSp = new GeoTreeSpouses();
        geoSp.append( h1, w1 );
        System.out.println( geoSp );
    }
}