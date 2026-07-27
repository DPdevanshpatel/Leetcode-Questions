class Solution {
    public int[] findOrder(int V, int[][] edges) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<V; i++)
        {
            adj.add(new ArrayList<>());
        }
        
        int indegree[] = new int[V];
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        
        int[] res = new int[V];
        int index = 0;

        while(!q.isEmpty()) {

            int node = q.poll();

            res[index++] = node;

            for(int neighbour : adj.get(node)) {

                indegree[neighbour]--;

                if(indegree[neighbour] == 0)
                    q.offer(neighbour);
            }
        }
        if(index != V)
            return new int[]{};

        
        int left = 0;
        int right = res.length - 1;

        while (left < right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;

            left++;
            right--;
        }
        return res;
    }
}