public class BlockScope {
    public static void main(String[] args){
        int outerX = 5 ;


        System.out.println("Before block: outerX" + outerX);

        if(outerX > 0){
            int innerY = 15 ;

            System.out.println("Inside block : outerX = " + outerX);
            System.out.println("Inside block : innerY = " + innerY);




        }
        System.out.println("After block : outerX = "+ outerX);
    }
}
