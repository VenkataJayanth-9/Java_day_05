public class Main {
    public static void main(String[] args)
    {
        for(int i = 1; i<= 5; i++)
        {
            Student s = new Student(
                    switch (i) {
                case 1 -> "Cool";
                case 2 -> "Tim";
                case 3 -> "Brad";
                case 4 -> "Jhon";
                case 5 -> "Willy";
                default -> "Unknown";
            }, "12234" + i, "Java");
            System.out.println(s);
        }
    }
}
