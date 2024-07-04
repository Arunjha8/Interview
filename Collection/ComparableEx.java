package Collection;

public class ComparableEx implements Comparable<ComparableEx> {
    public int id;
    public String name;
    public int marks;

    public ComparableEx(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(ComparableEx e) {
        //  return name.compareTo(e.name);  //Sorting by name
        //  return e.name.compareTo(name);  //Desc order name
        
//        if (id == e.id) {
//            return name.compareTo(e.name);
//        } else {
//            return id - e.id;
//        }

//        if (name.equals(e.name)) {
//            return id - e.id;
//        } else {
//            return e.name.compareTo(name);
//        }

//        if (marks == (e.marks)) {
//            return id - e.id;
//        } else {
//            return marks - e.marks;
//        }

        return e.id - id;
    }

    @Override
    public String toString() {
        return "[ id = " + id + " name = " + name + " marks = " + marks + " ]";
    }
}
