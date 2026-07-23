class Solution {
    public int dfs(int node, ArrayList<ArrayList<int[]>> graph, boolean[] visited){

        int changes = 0;

        visited[node] = true;

        for(int[] edge : graph.get(node))
        {
            int neighbour = edge[0];
            int cost = edge[1];

            if(!visited[neighbour])
            {
                changes += cost;
                changes += dfs(neighbour, graph, visited);
            }
        }

        return changes;
    }

    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int a[]: connections){
            int u=a[0];
            int v=a[1];

            graph.get(u).add(new int[]{v,1});
            graph.get(v).add(new int[]{u,0});
        }

        boolean b[] = new boolean[n];

        return dfs(0,graph,b);
    }
}