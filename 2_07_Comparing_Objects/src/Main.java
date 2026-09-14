import java.util.*;

class Student{
	
	int sid;
	
	String name;
	
	int marks;
	
	public Student(int sid, String name, int marks) {
		
		super();
		
		this.sid = sid;
		
		this.name = name;
		
		this.marks = marks;
		
	}
	
	public int getSid() {
		
		return sid;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getMarks() {
		
		return marks;
		
	}
	
	public void setSid(int sid) {
		
		this.sid = sid;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setMarks(int marks) {
		
		this.marks = marks;
		
	}
	
}

class StudentComp implements Comparator<Student>{
	
	@Override public int compare(Student s1, Student s2) {
		
		if(s1.getSid() == s2.getSid()) {
			
			return 0;
			
		}
		
		else if(s1.getSid() > s2.getSid()) {
			
			return 1;
			
		}
		
		else if(s1.getSid() < s2.getSid()) {
			
			return -1;
			
		}
		
		return -1;
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> l = new ArrayList<Student>();
		
		l.add(new Student(100, "Jack",95));
		l.add(new Student(101, "Jane", 98)); 
        l.add(new Student(199, "Mary", 90)); 
        l.add(new Student(105, "Beck", 75)); 
        l.add(new Student(104, "Betty", 85)); 
        l.add(new Student(103, "Archie", 96)); 
        l.add(new Student(108, "Nate", 89)); 
        l.add(new Student(109, "Liam", 100));
        
        Collections.sort(l, new StudentComp());
        
        Student searchKey = new Student(109, "Liam", 100);
        
        int index1 = Collections.binarySearch(l, searchKey, new StudentComp());
        
        System.out.println("Index of the searched key: " + index1);
        
        searchKey = new Student(99, "Jennifer", 60);
        
        int index2 = Collections.binarySearch(l, searchKey, new StudentComp());
        
        System.out.println("Index of the searched key: " + index2);
		
		//System.out.println(search(a, searchValue));
		
		Guest harry = new Guest(178.1);
		
		Guest ron = new Guest(178.1);
		
		Guest hermione = new Guest(163.9);
		
		if(harry.equals(ron)) {
			
			System.out.println("Harry and Ron are the same height");
			
		}
		
		if(harry.equals(hermione)) {
			
			System.out.println("Harry and Hermione are the same height");
			
		}
		
		if(hermione.equals(ron)) {
			
			System.out.println("Hermione and Ron are the same height");
			
		}
		
		System.out.println("Ron drinks the polyjuice punch");
		
		ron = new Guest(163.9);
		
		if(harry.equals(ron)) {
			
			System.out.println("Harry and Ron are the same height");
			
		}
		
		if(harry.equals(hermione)) {
			
			System.out.println("Harry and Hermione are the same height");
			
		}
		
		if(hermione.equals(ron)) {
			
			System.out.println("Hermione and Ron are the same height");
			
		}
		
	}
}