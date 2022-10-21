public class ConditionalActions {

//    public static void main(String[] args) {
//        System.out.println(conditionalActions(-21));
//    }

    public String conditionalActions (int m){

        if (m % 7 == 0 && m % 9 ==0) {
            return "Good Number";
        } else if (m % 9 == 0 && m % 7 != 0){
            return "Bad Number";
        } else if (m == 11) {
            return "Poor Number";
        }
        return "-1";
    }
}
