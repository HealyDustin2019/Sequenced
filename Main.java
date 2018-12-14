public class Main
{
	public static void main(String[] args) {
	    sq();
	    System.out.println();
	    cu();
	    System.out.println();
	    fi();
	    System.out.println();
	    pr();
	    System.out.println();
	    tr();
	}
	public static void sq(){
	    int x = 1;
	    System.out.print("First 10 Square Numbers: ");
	    while(x < 11){
	        System.out.print(x*x+" ");
	        x++;
	    }
	}
	public static void cu(){
	    int x = 1;
	    System.out.print("First 10 Cube Numbers: ");
	    while(x < 11){
	        System.out.print(x*x*x+" ");
	        x++;
	    }
	}
	public static void fi(){
	    int x = 0;
	    int y = 1;
	    int z = 0;
	    int s = 0;
	    System.out.print("First 10 Fibonacci Numbers from 1: ");
	    while(z < 11){
	        z++;
	        if(z > 1)
	            System.out.print(x+y+" ");
	        s = y;
	        y = x;
	        x = x + s;
	    }
	}
	public static void pr(){
	    System.out.print("First 10 Prime Numbers: ");
	    for(int x = 0; x < 30; x++){
          int y = 0;
          int z = 1;
          while(z <= x){
            if(x % z == 0){
            y++;
            }
        z++;
    }
    if(y == 2){
        System.out.print(x+" ");
    }
}
	}
	public static void tr(){
	    int x = 0;
	    int y = 1;
	    int z = 0;
	    System.out.print("First 10 Triangle Numbers: ");
	    while(z < 10){
	        System.out.print(x+y+" ");
	        x = x + y;
	        y++;
	        z++;
	    }
	}
}
