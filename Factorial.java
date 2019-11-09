public class Factorial {
    public static void main(String[] args) {
        if(args.length != 1 ){
            System.out.println("wrong number of inputs.");
            System.exit(1);
        }
        int x = Integer.parseInt(args[0]);
        int fact =1;
        for(int i = 1 ; i<=x; i++)
            fact*=i;

        System.out.println("Hello from Factorial");
        System.out.println("The Factorial of "+ args[0] + " is equal to " + fact );
    }
}
