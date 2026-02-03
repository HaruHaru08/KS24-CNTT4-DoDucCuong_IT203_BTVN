package Session08.KTDG;

public class Student {
    private String id;
    private String name;
    private Double average;

    public  Student(String id,String name,Double average){
        this.id=id;
        this.name=name;
        this.average=average;
    }
    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public  String  getRank(){
        if(average>=8 && average<=10){
            return "Gioi";
        }else if(average<8 &&average>=6.5){
            return "Kha";
        }else {
            return "Trung binh";
        }
    }

    public String toString(){
        return "ID: " + id +
                " | Name: " + name +
                " | Average: " + average +
                " | Rank: " + getRank();
    }
}
