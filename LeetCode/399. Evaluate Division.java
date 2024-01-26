class Solution {


    class Edge{
        Vertex x;
        Vertex y;
        double weight;

        Edge(Vertex x,Vertex y,double weight){
            this.x = x;
            this.y = y;
            this.weight = weight;
        }

    }

    class Vertex{
        String pt;
        List<Edge> neighbours;
        boolean visited=false;

        Vertex(String s){
            this.pt = s;
            this.neighbours = new ArrayList<>();
        }

        void addEdge(Edge e){
            this.neighbours.add(e);
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        

        HashMap<String,Vertex> graph = new HashMap();

        for(int i=0;i<equations.size();i++){
            Vertex v1 = graph.getOrDefault(equations.get(i).get(0),new Vertex(equations.get(i).get(0)));
            Vertex v2 = graph.getOrDefault(equations.get(i).get(1),new Vertex(equations.get(i).get(1)));

            Edge e1 = new Edge(v1,v2,values[i]);
            Edge e2 = new Edge(v2,v1,1/values[i]);

            v1.addEdge(e1);
            v2.addEdge(e2);
            graph.put(equations.get(i).get(0),v1);
            graph.put(equations.get(i).get(1),v2);

        }

        double[] ans = new double[queries.size()];
        for(int i=0;i<queries.size();i++){

            if(graph.get(queries.get(i).get(0))==null || graph.get(queries.get(i).get(1))==null){
                ans[i] = -1;
            }else{
                ans[i] = dfs(graph.get(queries.get(i).get(0)),graph.get(queries.get(i).get(1)),new HashSet<>());
            }

        }

        return ans;
    }

    public double dfs(Vertex root,Vertex end,HashSet<Vertex> visited){

        System.out.println(root.pt);
        if(!visited.add(root)){
            return -1;
        }
        
        if(root==end){
            return 1;
        }

        for(int i=0;i<root.neighbours.size();i++){
            double product = dfs(root.neighbours.get(i).y,end,visited);
            if(product>0){
                return product * root.neighbours.get(i).weight;
            }
            
        }

        return -1;

    }
}