class Hello {

    public static void main(String[] args){
        
        int nums[][] = new int[3][];     //jagged array

        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[1];



        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for ( int a[]: nums){
            for(int b: a){
                System.out.print(" "+ b);
            }
            System.out.println();
        }
        




    }
}