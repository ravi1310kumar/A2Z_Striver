public class SizeWrapper {
    public static void main(String []args){
        int a =5;
        Float b = 4.34f;
        long c=  12;
        double d =  12.34d;
        char e = '#';
        Boolean f = true;

        System.out.println(Integer.SIZE/8);  // we divide this by 8 as it is in bit now it is in byte
        System.out.println(Float.SIZE/8);
        System.out.println(Long.SIZE/8);
        System.out.println(Short.SIZE/8);
        System.out.println(Double.SIZE/8);
        System.out.println(Character.SIZE/8);
        System.out.println("There is nothing for boolean for size as it only constant");
    }
}
