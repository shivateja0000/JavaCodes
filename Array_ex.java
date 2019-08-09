public class Array_ex {
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[3] = 4;
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        System.out.println();
        for (int y : num) {
            System.out.println(y);
        }
        int twoD[][] = new int[2][2];
        for(int[] z: twoD){
            for(int k: z){
            System.out.print(k+" ");}
            System.out.println();

        }
        int nums2[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums2[i].length;j++){
                System.out.print(nums2[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
