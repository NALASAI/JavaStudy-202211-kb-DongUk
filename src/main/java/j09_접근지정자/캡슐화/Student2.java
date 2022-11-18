package j09_접근지정자.캡슐화;

public class Student2 {
    private String School;
    private String name;
    private int year;
    private boolean gender;

    public Student2(){}

    public void setSchool(String school) { this.School = school; }
    public String getSchool() { return School; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setYear(int year) { this.year = year; }
    public int getYear() { return year; }
    
    public void setGender(boolean gender) { this.gender = gender; }
    public boolean getGender() { return gender; }

    public void showInfo(){
        System.out.println("학교명 : " + School);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + year);
        System.out.println("성별 : " + (gender ? "남" : "여"));
    }
}
