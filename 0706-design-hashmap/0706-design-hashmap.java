class MyHashMap {

    class Node{
        int key;
        int value;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    ArrayList<Node>[] hashtable;
    public MyHashMap() {
        hashtable = new ArrayList[1000];
        for(int i=0; i<1000; i++){
            hashtable[i]=new ArrayList<>();
        }
    }

    int hashvalue(int key){
        return key%1000;
    }
    
    public void put(int key, int value) {
        int idx = hashvalue(key);
        for(Node node:hashtable[idx]){
            if(node.key==key){
                node.value=value;
                return;
            }
        }
        hashtable[idx].add(new Node(key,value));
    }
    
    public int get(int key) {
        int idx = hashvalue(key);
        for(Node node : hashtable[idx]){
            if(node.key==key){
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx =hashvalue(key);

        for(int i=0; i<hashtable[idx].size(); i++){
            if(hashtable[idx].get(i).key==key){
                hashtable[idx].remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */