public class JavaSwitchStatements {

    public static void main(String[] args) {
        int i = -1, j = 2;
        String city = "Los Angeles";

        if ( city.equals("New York") ) {
            System.out.println("We have 10 Million people live here");
        } else if (city.equals("Chicago")) {
            System.out.println("We have 8 Million people live here");
        } else if (city.equals("Los Angeles")) {
            System.out.println("This is the largest city in North America");
        } else {
            System.out.println("Invalid city");
        }

        switch(city) {
            case "New York": System.out.println("We have 10 Million people live here");
            break;
            case "Chicago": System.out.println("We have 8 Million people live here");
            break;
            case "Los Angeles": System.out.println("This is the largest city in North America");
            break;
            default:
                System.out.println("Invalid city");
        }

    }
}