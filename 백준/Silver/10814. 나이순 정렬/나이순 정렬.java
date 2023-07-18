import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static class node{
		int age;
		String name;
		
		public node(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		

	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        node[] people = new node[N];
        
        for(int i=0; i<N; i++) {
        	people[i] = new node(sc.nextInt(), sc.next());
        }
        
        Arrays.sort(people, new Comparator<node>() {

			@Override
			public int compare(node o1, node o2) {
				return o1.getAge() - o2.getAge();
			}
        	
		});
        
        for(int i=0; i<N; i++) {
        	System.out.println(people[i].getAge()+" "+people[i].getName());
        }
    }
}