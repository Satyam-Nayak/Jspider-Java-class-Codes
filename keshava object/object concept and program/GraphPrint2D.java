public class GraphPrint2D {
    // Attributes
    private int X_axis;
    private int Y_axis;

    // Constructor with 2 parameters
    public GraphPrint2D(int x, int y) {
        this.X_axis = x;
        this.Y_axis = y;
    }

    // Method to update X_axis
    public void updateXaxis(int x) {
        this.X_axis = x;
    }

    // Method to update Y_axis
    public void updateYaxis(int y) {
        this.Y_axis = y;
    }

    // Method to print the current state of the graph
    public void printGraph() {
        System.out.println("GraphPrint2D [X_axis=" + X_axis + ", Y_axis=" + Y_axis + "]");
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("main method started");

        GraphPrint2D graph = new GraphPrint2D(10, 20);
        graph.printGraph();
        
        graph.updateXaxis(30);
        graph.updateYaxis(40);
        graph.printGraph();

        System.out.println("main method ended");
    }
}
