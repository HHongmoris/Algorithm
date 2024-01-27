import java.util.*;

public class Main {
    static class Student{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Student> score = new ArrayList<>();
        for(int i=0; i<N; i++){
            Student sd = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

            score.add(sd);
        }

        Collections.sort(score, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.korean == o2.korean){
                    if (o1.english == o2.english){
                        if (o1.math == o2.math){
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;
                    }
                    return o1.english - o2.english;
                }
                return o2.korean - o1.korean;
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(score.get(i).name);
        }


    }
}