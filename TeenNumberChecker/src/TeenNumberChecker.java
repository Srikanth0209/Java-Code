public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three){
        if ((one >= 13 && one <= 19 )||( two >= 13 && two <=19) || (three >=13 && three <=19) ){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isTeen (int one1){
        if (one1 >= 13 && one1 <= 19){
            return true;
        }else{
            return false;
        }
    }
}

