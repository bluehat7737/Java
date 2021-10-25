package java_practice;

public class m_array {
    public static void main(String[] args) {
        int [][]a = new int[2][3];
        int [][]b = new int[2][3];
        int [][]c = new int[2][3];

        a[0][0] = 1;      
        a[0][1] = 2;      
        a[0][2] = 3;      
        a[1][0] = 4;      
        a[1][1] = 5;      
        a[1][2] = 6;
              
        b[0][0] = 1;      
        b[0][1] = 2;      
        b[0][2] = 3;      
        b[1][0] = 4;      
        b[1][1] = 5;      
        b[1][2] = 6;      

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // fot printing the array a
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println('\n');

        // fot printing the array b
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println('\n');

        // fot printing the array c
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println('\n');
    }
}
