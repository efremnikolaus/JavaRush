public class SolutionFour {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}