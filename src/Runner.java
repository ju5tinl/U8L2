public class Runner {
    public static void main(String[] args) {

        int[][] test1 = {{1,2,3,4,5},
                        {5,6,3,5,7}};

        int[][] test2 = {{1,2,3,4,5},
                        {5,6,2,5,7},
                        {4,5,4,9,10}};

        int[][] test3 = {{1,2,3,4,5},
                        {5,6,2,5,7},
                        {4,6,4,9,10}};

        int[][] test4 = {{1,2,3,4,5},
                        {5,6,2,5,7},
                        {4,5,4,5,10}};

        System.out.println(duplicates(test1)); // true
        System.out.println(duplicates(test2)); // false
        System.out.println(duplicates(test3)); // true
        System.out.println(duplicates(test4)); // true


    }
    public static boolean duplicates(int[][] array){
        for(int c = 0; c < array[0].length; c++)
        {
            for(int r = 0; r < array.length; r++)
            {
                int check = array[r][c];
                for(int r2 = r + 1; r2 < array.length; r2++)
                {
                    if(array[r2][c] == check)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
