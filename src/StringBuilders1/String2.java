package StringBuilders1;

public class String2 {

	public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float) age);

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
        
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',
                3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',
                8));

        String helloWorldLower = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

	}

}
