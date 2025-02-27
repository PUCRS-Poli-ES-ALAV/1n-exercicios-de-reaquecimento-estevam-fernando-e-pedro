public class App {
    static int mult(int a, int b){
        if(b == 0) return 0;
        return a + mult(a, b-1);
    }
    static int soma(int a, int b) {
        
        if(a == 0 && b != 0) {
            return 1 + soma(a, b-1);
        }
        if (b == 0 && a != 0){
            return 1 + soma(a-1, b);
        }
        if (b == 0 && a == 0){
            return 0;
        }
        return 1 + soma(a-1, b);
    }
    static float harmonica(float N){ 
        if(N == 0){
            return 0;
        }
        return 1 / N + harmonica(N-1);
    }

    static String inversaoString(String s){
        if(s.length() > 0){
            // Haskell pattern matching btw
            char c = s.charAt(0);
            String b = s.substring(1);
            return inversaoString(b) + c;
        }
        return "";

    }

    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 10;
        System.out.println(harmonica(5));
        System.out.println(inversaoString("Pedro"));
    }
}
