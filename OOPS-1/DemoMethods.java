public class b1_MethodsBasic {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
    }
    
    // Non-public inner class Computer
    static class Computer {
        public void playMusic() {
            System.out.println("Music Playing..");
        }
        
        public String getMePen(int cost) {
            if (cost >= 10){
                return "pen";
            } else
            return "Nothing";
           
        }
    }
}
