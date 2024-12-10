import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i<=n ; i++){
            graph.add(new ArrayList<>());
        }

        for(int [] fare : fares){
            graph.get(fare[0]).add(new Node(fare[1],fare[2]));
            graph.get(fare[1]).add(new Node(fare[0],fare[2]));
        }

        int [] distancesA = dijkstra(a,n,graph);
        int [] distancesB = dijkstra(b,n,graph);
        int [] distancesS = dijkstra(s,n,graph);

        int answer = Integer.MAX_VALUE ;
        for(int i = 1; i<= n ; i++){
            answer = Math.min(answer , distancesA[i] + distancesB[i]+distancesS[i]);
        }
        System.out.println("answer = " + answer);
        return answer; 
    }
    public static int [] dijkstra(int start, int V , List<List<Node>> graph){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.distance - b.distance);
        int [] distances = new int[V+1];
        Arrays.fill(distances,Integer.MAX_VALUE);
        distances[start] = 0;

        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            int currentNode = current.node;
            int currentDist = current.distance;

            if(currentDist > distances[currentNode]) continue;

            for(Node neighbor : graph.get(currentNode)){
                int newDist = distances[currentNode] + neighbor.distance;

                if(newDist < distances[neighbor.node]){
                    distances[neighbor.node] = newDist;
                    pq.add(new Node(neighbor.node,newDist));
                }

            }
        }
        return distances;
    }

    static class Node{
        int node;
        int distance;

        Node(int node,int distance){
            this.node = node;
            this.distance = distance;
        }
    }
    
}