
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    
    public static void main (String [] args)
    {
        MyArrayList<Consoles> list1 = new MyArrayList<>();
        MyArrayList<Consoles> list2 = new MyArrayList<>();
        Xbox x1 = new Xbox("Xbox360", "Microsoft Gaming", 2001,1000.00,12);
        Xbox x2 = new Xbox("Xbox1", "Microsoft Gaming", 2013, 11000.00, 1);
        Xbox x3 = new Xbox("Xbox series x","Microsoft Gaming",2020,15000.00, 7);
        Xbox x4 = new Xbox("Xbox series s","Microsoft Gaming",2020,13000.00,2);
        
        PlayStation ps1 = new PlayStation("PlayStation 3","Sony", 2006, 1500.00,"Essential", 12);
        PlayStation ps2 = new PlayStation("PlayStation 4","Sony", 2013, 6000.00,"Premium", 6);
        PlayStation ps3 = new PlayStation("PlayStation 5","Sony", 2020, 15000.00,"Deluxe", 3);
        PlayStation ps4 = new PlayStation("PlayStation Vita","Sony", 2011, 1000.00,"Essential", 12);
        
        list1.add(0,x1);
        list1.add(1,ps1);
        list1.add(2,x2);
        list1.add(3,ps2);
        list1.add(4,x3);
        list1.add(5,ps3);
        list1.add(6,x4);
        list1.add(7,ps4);
        if(list1.getUnique());
        System.out.println(list1);  
    }

}