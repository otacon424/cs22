package chapter1;




public class exercise1 {

    public static int priceIsRight(int[] bids, int bid)
    {
        for(int i = 0; i < bids.length; i++)
        {
            if(bids[i] <= bid)
            {
                 return 1;
            }
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int[] array = {200, 300, 250, 999, 40};
        int bid = 50;

        System.out.println("Exercise 1: Price is Right");
        System.out.println(priceIsRight(array, bid));
    }
}
