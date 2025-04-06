class Router {

    int maxsize;
    Queue<int[]> q; 
    Set<String> set;
    Map<Integer, ArrayList<Integer>> dmap;
    public Router(int memoryLimit) {
        this.maxsize = memoryLimit;
        this.q = new LinkedList<>();
        this.set = new HashSet<>();
        this.dmap = new HashMap<>();

    }
    
    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + ":" + destination + ":" + timestamp;
        // System.out.println(key + " -> " +set);
        if(set.contains(key)){return false;}
        

        if(q.size() >= maxsize){
            int[]node = q.poll();
            String rkey = node[0] + ":" + node[1] + ":" + node[2];

            set.remove(rkey);

            ArrayList<Integer> tstamps = dmap.get(node[1]);

            tstamps.remove(tstamps.indexOf(node[2]));

            

            
        }

        q.add(new int[]{source , destination , timestamp});
        set.add(key);
        dmap.putIfAbsent(destination , new ArrayList<>());
        dmap.get(destination).add(timestamp);

        return true;
        
    
    }
    
    public int[] forwardPacket() {

        if(q.size() == 0){return new int[]{};}

        int[]node = q.poll();

        String key = node[0] + ":" + node[1] + ":" + node[2];
        set.remove(key);
        ArrayList<Integer> tstamps = dmap.get(node[1]);

        tstamps.remove(tstamps.indexOf(node[2]));

        return node;
    }
    
    public int getCount(int destination, int startTime, int endTime) {
        if (!dmap.containsKey(destination)) return 0;
        ArrayList<Integer> tstamps = dmap.get(destination);
        
        // System.out.println(startTime + " " + endTime + " "+ tstamps);
        int start = -1 , end = -1, i = 0 , j = tstamps.size() - 1;
        while((start == - 1 || end == -1)  && i < tstamps.size() && j >= 0){
            
            if(start == -1 && tstamps.get(i) >= startTime){
                start = i;
                // System.out.println("Start = " + start);

            }else{
                i++;
            }
            if(end == -1 && tstamps.get(j) <= endTime){
                end = j;
                // System.out.println("end = " + end);
            }else{
                j--;
            }
            // i++;j--;
            
        }
        
        // System.out.println("final " + start  + " " + end);  
        if (start == -1 || end == -1 || start > end) return 0;

        return end - start + 1;

    }

    


}

/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */