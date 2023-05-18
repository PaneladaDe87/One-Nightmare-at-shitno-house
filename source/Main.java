public class Main {
    public int play = false;
    
    public static void start(String[] args) {
        play = true;
        System.out.println("executing...");
        
        while (play == true) {
            System.out.println("play?");
        }
    }
}
