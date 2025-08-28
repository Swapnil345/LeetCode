class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] paper_counts=new int[n+1];
        for(int i : citations){
            paper_counts[Math.min(n,i)]+=1;
        }
        int h = n;
        int papers = paper_counts[n];
        while(papers<h){
            h-=1;
            papers+=paper_counts[h];
        }
        return h;
    }
}