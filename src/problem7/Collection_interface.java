package problem7;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("HI!");
        list.add("How are you?");
        list.add("What to do?");
        list.add("Cool!");
 
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

	}
}
