public class GPSLocation {
    // Attributes
    private double latitude;
    private double longitude;

    // Constructor with 2 parameters
    public GPSLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Method to update latitude
    public void updateLatitude(double latitude) {
        this.latitude = latitude;
    }

    // Method to update longitude
    public void updateLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Method to print the current state of the GPS location
    public void printLocation() {
        System.out.println("GPSLocation [Latitude=" + latitude + ", Longitude=" + longitude + "]");
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("main method started");

        GPSLocation location = new GPSLocation(37.7749, -122.4194);
        location.printLocation();
        
        location.updateLatitude(34.0522);
        location.updateLongitude(-118.2437);
        location.printLocation();

        System.out.println("main method ended");
    }
}
