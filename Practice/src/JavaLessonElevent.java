import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonElevent {
	public static void main(String args[]) {
		ArrayList arrayListOne;
		arrayListOne=new ArrayList();
		ArrayList arrayListTwo=new ArrayList();
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Jhon Smith");
		names.add("Mohaamed Alami");
		names.add("Oliver Miller");
		
		names.add(2,"Jack Ryan");
		names.set(0,"Jhon Adams");
		
		names.remove(3);
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println(names);
		for(String i:names) 
		{
			System.out.println(i);
		}
		
		Iterator indivItems=names.iterator();
		while(indivItems.hasNext())
		{
			System.out.println(indivItems.next());
		}
		ArrayList nameCopy=new ArrayList();
		ArrayList nameBackup=new ArrayList();
		
		nameCopy.add(names);
		
		String paulYang="Paul yang";
		names.add(paulYang);
		if(names.contains(paulYang)) {
			System.out.println("Paul is here");
		}
		
		if(names.containsAll(nameCopy)) 
		{
			System.out.println("Everything in nameCopy is in names");
		}
		
		
	}

}
