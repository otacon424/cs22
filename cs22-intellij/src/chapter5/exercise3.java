package chapter5;

public class exercise3 {

    public static int mystery4(int x, int y)
    {
        if(x < y)
        {
            return x;
        }else {
            return mystery4(x - y, y);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(mystery4(6,13));
        System.out.println(mystery4(14,10));
        System.out.println(mystery4(37,10));
        System.out.println(mystery4(8,2));
        System.out.println(mystery4(50,7));

    }
}
