class Solution {
    public int findCenter(int[][] edges) {
        int N = edges.length + 1;
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        
        for(int i = 1; i <= N; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);
            for(int v : graph[i]) {
                set.add(v);
            }
            if(set.size() == N) 
                return i;
        }
        return -1;
    }
}