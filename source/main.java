public class main {
    public int play = false;
    
    public void start(String[] args) {
        play = true;
        Sys.out.println("executing...");
        
        while (play == true) {
            Sys.out.println("play?");
        }
    }
}
