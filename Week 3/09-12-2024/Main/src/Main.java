
public class Main {
    public static void main(String[] args){
        
        
        Hr myHr = new Hr(5);
        myHr.hire( new Contractor("nasos", 100, 40) );
        myHr.hire( new Contractor("Stella", 100, 40) );
        myHr.hire( new Contractor("George", 100, 40) );
        myHr.hire( new Contractor("Nikos", 100, 40) );
        myHr.hire( new Contractor("Giannis", 100, 40) );
        System.out.println();
        myHr.print();
        myHr.sort();
        System.out.println();
        myHr.print();
    }
}
