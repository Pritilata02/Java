public class BasicSwitchCase {
    public static void main(String[] args){
        char c = 'C';
        switch(c)
        {
            case 'A':
                System.out.println("1");
                break;
            case 'B':
                System.out.println("2");
                break;
            case 'C':
                System.out.println("3");
                break;
            case 'D':
                System.out.println("4");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}