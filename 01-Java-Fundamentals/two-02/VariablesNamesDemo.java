package Two;

public class VariablesNamesDemo {
              /*
=================================================
   VARIABLE NAMING RULES IN JAVA
=================================================
✅ Rules:
• Case-sensitive (age ≠ Age)
• Must begin with a letter, '_' or '$' (but prefer letters)
• Cannot start with a digit
• No spaces or special symbols (%, #, @, etc.)
• Cannot be a Java keyword (e.g., int, class, for)
• Can contain letters, digits, '_' or '$' after the first character
• Use meaningful names (avoid x1, a2)
• Use lowerCamelCase for normal variables (totalMarks)
• Use UPPER_CASE_WITH_UNDERSCORES for constants (MAX_SPEED)

-------------------------------------------------
*/


    public static void main(String[] args) {
        // ✅ VALID variable names

        int age=25;
        int studentCount=100;
        int _score=95;             // Legal but not recommended
        int $total=500;             // Legal but not recommended
        int gearRatio=5;
        final int MAX_SPEEd=120; // Constant naming convention

//        //Printing valid variable
//        System.out.println("age is:"+age);
//        System.out.println("Student count:"+studentCount);
//        System.out.println("Score"+-_score);
//        System.out.println("Gear Ratio:"+gearRatio);
//        System.out.println("Max_Speed:"+MAX_SPEEd);

        System.out.println('\u0021');
        System.out.println((char)65533);
    }
}
