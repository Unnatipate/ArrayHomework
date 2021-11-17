public class Test
{
    public static void main (String[] args)
    {
//defining arrays to be compare
        int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//comparing references using == operator
//works the same as a1.equals(a2)
        if (a1 == a2)
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}

