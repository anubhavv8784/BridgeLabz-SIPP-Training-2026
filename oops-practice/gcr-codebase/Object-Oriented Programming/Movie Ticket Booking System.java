class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(String seatNumber,
                    double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Movie : " + movieName);
        System.out.println("Seat : " + seatNumber);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        MovieTicket t =
                new MovieTicket("Avengers");

        t.bookTicket("A12", 300);
        t.displayDetails();
    }
}