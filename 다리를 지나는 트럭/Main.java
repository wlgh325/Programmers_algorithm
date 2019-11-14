import java.util.Queue;
import java.util.LinkedList;

class Truck{
    int truck_num;
    int sec;

    Truck(int truck_num, int sec){
        this.truck_num = truck_num;
        this.sec = sec;
    }

    public void increase(){
        this.sec ++;
    }
}
class Main{
    public static void main(String[] args){
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        int answer = solution(bridge_length3, weight3, truck_weights3);
        System.out.println(answer);
    }

    // 모든 트럭이 다리를 건너는데 걸리는 최소시간 구하기
    // 트럭은 1초에 1만큼 움직임
    // bridge_length : 다리 길이
    // weight : 다리가 견디는 최대 무게
    // * 트럭이 다리에 완전히 올랐을 경우 무게 측정
    static Queue<Truck> queue;
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total = 0;
        queue = new LinkedList<>();
        Queue<Integer> weights = new LinkedList<>();
        
        for (int i = 0; i < truck_weights.length; i++) {
            weights.offer(truck_weights[i]);
        }
        
        while(true){
            int truck_weight = weights.peek();
            
            // 건너고 있는 트럭의 무게가 weight보다 작을 경우만
            if(total + truck_weight <= weight){
                weights.poll();
                Truck truck = new Truck(truck_weight, 0);
                queue.offer(truck);
                total += truck_weight;
            }
            
            increase();
            answer++;

            if(queue.peek().sec == bridge_length){
                Truck out = queue.poll();
                total -= out.truck_num;
            }

            if(weights.size() == 0){
            	answer += bridge_length;
                break;
            }
        }
        return answer;
    }

    public static void increase(){
        Queue<Truck> temp = new LinkedList<>();

        while(true){
            Truck truck = queue.poll();
            truck.increase();
            temp.offer(truck);

            if(queue.size() ==0)
                break;
        }

        queue = temp;
    }
}