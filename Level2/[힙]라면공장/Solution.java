import java.util.*;

class Flour implements Comparable<Flour>{
    int amount;

    Flour(int amount){
        this.amount = amount;
    }

    // 내림차순
    @Override
    public int compareTo(Flour a){
        if(this.amount > a.amount)
            return -1;
        else if(this.amount < a.amount)
            return 1;
        else
            return 0;
    }
}

class Solution {
    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};
        int k = 30;
        System.out.println(solution(stock, dates, supplies, k));
    }

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int ans = 0;
        PriorityQueue<Flour> pq = new PriorityQueue<>();
        
        int idx = 0;
        // stock: 수명
        // stock이 k이상이 되면 남은 공급으로 k일을 버틸 수 있음을 의미
        while(stock < k){
            for(int i=idx, len=dates.length; i<len; i++){
                // 수명이 끝나기 전에 받을 수 있는 공급 넣어놓기
                if(stock >= dates[i]){
                    pq.offer(new Flour(supplies[i]));
                    idx = i+1;  // 중복으로 queue에 넣는것 방지
                }
            }
            // 받을 수 있는 것 중에 공급 많이 주는것만 받기
            stock += pq.poll().amount;
            ans++;
        }
        return ans;
    }
}