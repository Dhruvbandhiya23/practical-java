class Dhruv {
   
    void behaviour() {
        System.out.println("na padya baad msti na krvi");
    }
}


class Anger extends Dhruv {
 
    void moves() {
        System.out.println("ignore kro guyssss");
    }
}

public class Main {
    public static void main(String[] args) {
      Dhruv myd = new Dhruv();
        myd.behaviour();  

        Anger mined = new Anger();
        mined.moves();  
    }
}