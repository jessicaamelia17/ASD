public class Graph {
    public int numVertices;
    public int[][] adjMatrix;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j , int weight){
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] =weight;
            adjMatrix[j][i] = weight;
        } else {
            System.out.println("Error: Indeks tidak valid untuk sisi (" + i + ", " + j + ")");
        }
    }

    public void removeEdge(int i, int j){
        if (i >= 0 && i < numVertices && j >= 0 && j < numVertices) {
            adjMatrix[i][j] = 0;
            adjMatrix[j][i] = 0;
        } else {
            System.out.println("Error: Indeks tidak valid untuk sisi(" + i + ", " + j + ")");
        }
        
    }
    
    public void print(){
        for(int i=0; i< numVertices;i++){
            System.out.print(i + ": ");

            for (int j : adjMatrix[i]){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public boolean getEdge(int i, int j){
        return adjMatrix[i][j] !=0;
    }

    public void getDegree(){
        for(int i=0; i< numVertices; i++){
            int degree =0;
            for(int j=0; j< numVertices; j++){
                if(adjMatrix[i][j] != 0){
                    degree++;
                }
            }
            System.out.println("Vertex " + i + "memiliki degree " + degree);
        }
    }
   
}
