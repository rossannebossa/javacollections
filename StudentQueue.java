package Collections;

public class StudentQueue implements Comparable<StudentQueue> {

    private int id;
    private String name;
    private String surname;
    private String course;

    public StudentQueue() {
    }

    public StudentQueue(int id, String name, String surname, String course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    

    @Override
    public String toString() {
        return "\t" + id + "\t" + name + "\t" + surname + "\t" + course;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean equals(StudentQueue obj) {
        return this.getId() == obj.getId();
    }
    
    @Override
    public int compareTo(StudentQueue obj) {
        if(this.equals(obj)){
            return 0;
        }else if(getId()>obj.getId()){
            return 1;
        }else{
            return -1;
        }
    }   
}
