package Section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class test1 {
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for(int i=0;i<names.size();i++)
        {
        	String actual = names.get(i);
        	if(actual.startsWith("A"))
        	{
        		count++;
        	}
        }
		System.out.println(count);
		
	}
	public void streamFilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
	{
		s.startsWith("A");
		return true;
	}).count();
	System.out.println(d);
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		}

	public void streamMap()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Alarm"));
		Assert.assertTrue(flag);
	}
	public void streamCollect()
	{
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

	}


