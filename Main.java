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
	    while(x < 11){
	        System.out.println(x*x);
	        x++;
	    }
	}
	public static void cu(){
	    int x = 1;
	    while(x < 11){
	        System.out.println(x*x*x);
	        x++;
	    }
	}
	public static void fi(){
	    int x = 0;
	    int y = 1;
	    int z = 0;
	    int s = 0;
	    while(z < 11){
	        z++;
	        if(z > 1)
	            System.out.println(x+y);
	        s = y;
	        y = x;
	        x = x + s;
	    }
	}
	public static void pr(){
	    int x = 4;
	    int y = 0;
	    System.out.println("2\n3");
	    while(y < 10){
	        if(x % 2 != 0 && x % 3 != 0){
	            System.out.println(x);
	            y++;
	        }
	        x++;
	    }
	}
	public static void tr(){
	    int x = 0;
	    int y = 1;
	    int z = 0;
	    while(z < 10){
	        System.out.println(x+y);
	        x = x + y;
	        y++;
	        z++;
	    }
	}
}
