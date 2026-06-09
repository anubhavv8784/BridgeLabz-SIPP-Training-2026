// Creating Class with name SpringSeasonChecker to check if date is in spring season
class SpringSeasonChecker {
    
    public static void main(String[] args) {
        
        // Check if sufficient arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments");
            return;
        }
        
        // Get month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        // Check if date falls in spring season (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20) || 
                          (month == 4) || 
                          (month == 5) || 
                          (month == 6 && day <= 20);
        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
