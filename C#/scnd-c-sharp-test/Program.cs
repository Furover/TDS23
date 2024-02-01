namespace Recap
{
    class Program
    {

        static void Main(string[] args)
        {
            StudentData student1, student2;

            student1 = new StudentData();
            student2 = new StudentData("Oswaldo", 30, "Programacao", 8);

            Print(student1.ReturnStudentData());
            Print(student2.ReturnStudentData());
        }

        static void Print(string text) 
        {
            Console.WriteLine(text);
        }
    }
}