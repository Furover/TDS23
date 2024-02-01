namespace Recap
{
    public class StudentData
    {
        string name;
        int age;
        string course;
        int grade; 


        public StudentData() {}
        

        public StudentData(string name, int age, string course, int grade) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.grade = grade;
        }

        public string ReturnStudentData() {
            return "Name: " + name + ", age: " + age + ", course: " + course + ", grade: " + grade;
        }
    }
}