import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void test00001() {
        System.out.println("This will be printed");

    }

    @Test
    public void test00002() {
        int myNumber = 5;
        System.out.println(myNumber);

    }
    

    @Test
    public void test00003() {

        String messageOne = "Who let the dogs out?";

        String messageTwo = "Who who who who!";

        String s3 = messageOne + messageTwo;

        System.out.println(s3);

        
    }

    @Test
    public void test00004() {
        int num = 5;
        String message  = "I have " + num + " cookies";

        System.out.println(message);

    }

    @Test
    public void test00005() {

        boolean toBe = false;

        boolean b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }
        int children = 0;

        int a = 0;
        b = true;
        boolean c = false;

        System.out.println(a);
    }



    @Test
    public void test00006() {
        int a = 5;

        if (a == 6) {
            System.out.println("Ohhh! So a is 5!");


        } else {
            System.out.println("A IS NOT EQUAL TO 6");
        }


    }

    @Test
    public void test00007() {

        int[] arrayofInegers = {1, 9, 9, 5};

        for (int i = 0; i < arrayofInegers.length; i++) {
            int currentElement = arrayofInegers[i];
            System.out.println(currentElement);
        }


    }
}
