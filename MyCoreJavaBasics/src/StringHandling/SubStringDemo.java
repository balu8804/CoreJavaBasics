package StringHandling;
import java.lang.String;

public class SubStringDemo extends Object {
                String name="balu";
               
               public void doSubStringDemo(String str)
               {
            	   String name="balu";
            	   name.substring(1,2);
            	   System.out.println(name.substring(3,4));
            	   System.out.println(name);
               }
	public static void main(String[] args) {
		SubStringDemo ssd=new SubStringDemo();
		System.out.println(ssd.name);
		ssd.doSubStringDemo(ssd.name);
		//System.out.println(name);
		
		
              
	}

}
