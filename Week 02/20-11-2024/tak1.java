public class tak1 {
    public static void main(String[] args) {
        System.out.println(tak(1, 2, 3));
    }


    static int tak (int x, int y, int z) {  
        if ( y < x) {
             return tak(tak (x-1,y,z), tak (y-1,z,x), tak (z-1,x,y) );
        }
        return z;
    }
}
