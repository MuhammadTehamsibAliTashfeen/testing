class Hello {

    public static void main(String[] args){
        
        int nums[][] = new int[3][4];

        int random = 0;


        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
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