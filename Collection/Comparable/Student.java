package Collection.Comparable;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        //    return this.name.compareTo(o.name); //Shorting by name
        //    return this.id-o.id; //Shorting by id asc order
        //    return o.id - this.id;//Shorting by desc order
//        if (this.id == o.id) {
//            return this.name.compareTo(o.name);
//        } else {
//            return this.id - o.id;
//        }
        if (name.equals(o.name)) {
            return id - o.id;
        } else {
            return o.name.compareTo(name);
        }
    }

    @Override
    public String toString() {
        return (name + " " + id);
    }
}
