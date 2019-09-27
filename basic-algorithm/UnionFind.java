public class UnionFind{
    private int[] id;
    private int count;
    public UnionFind(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }
    public int count(){
        return count;
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    // quick-find
    public void union_1(int p, int q){
        int pId = find_1(p);
        int qId = find_1(q);
        if (pId == qId) return;
        for (in i = 0; i < N; i++)
            if (id[i] == qId)
                id[i] = pId;
        conut--;
    }
    public int find_1(int p){
        return id[p];
    }
    //quick-union
    public void union_2(int p, int q){
        // 连接根节点，而不是只连接p和q，这样会减小树高
        int pRoot = find_2(p);
        int qRoot = find_2(q);
        if (pRoot == qRoot) return;
        id[qRoot] = pRoot;
        count--;
    }
    public int find_2(int p){
        while( p!= id[p]) 
            p = id[p];
        return p;
    }
    //weighted-quick-union（加入一个数组记录每个结点的子节点个数，并将小树连接到大树上）
    int[] sz; 
        /* 初始化中加入 
        sz = new int[N];
        for(int i = 0; i < N; i++)
            sz[i] =1;
        */
    public void union_3(int p, int q){
        int pRoot = find_3(p);
        int qRoot = find_3(q);
        if (pRoot == qRoot) return;
        if(sz[pRoot] > id[qRoot]){
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        else{
            id[pRoot] = qRoot;
            sz[qRoot] += pRoot;
        }
        count--;
    }
    public int find_3(int p){
        //同find_2
        while(p != id[p])
            p =id[p];
        return p;
    }
    //path-compression-weighted-union-find
    /* 法一：将路径上遇到的结点都直接与根节点相连 */
    public int find_4(int p){
        int temp = p;
        while (p != id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        while (temp != p){
            tempId = id[temp];
            id[temp] = p;
            temp = id[tempId];
        }
        return p;
    }
    /* 法二：将路径上遇到的结点都直接与祖父节点相连 */
    public int find_5(int p){
        while (p != id[p]){
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
}