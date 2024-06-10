public class GraphMain {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1, 2);
        g.addEdge(0, 2, 7);
        g.addEdge(1, 2, 3); 
        g.addEdge(2, 3, 1);
        g.addEdge(6, 7, 4);

        g.print();

        // Cek edge antara dua vertex
        System.out.println("Edge diantara 2 dan 0: " + g.getEdge(2, 0));
        System.out.println("Edge diantara 2 dan 3: " + g.getEdge(2, 3));

        // Tampilkan degree setiap vertex
        g.getDegree();
    }
}
