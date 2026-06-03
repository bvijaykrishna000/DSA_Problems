class Solution {
    public int[] asteroidCollision(int[] arr) {
        Deque<Integer> d = new ArrayDeque<>();
        int ver = 0;

        for(int i = 0; i < arr.length; i++) {

            if(d.isEmpty()) {
                d.push(arr[i]);
            }
            else {

                if((d.peek() > 0 && arr[i] > 0) ||
                   (d.peek() < 0 && arr[i] < 0) ||
                   (d.peek() < 0 && arr[i] > 0)) {

                    d.push(arr[i]);
                }

                else if(d.peek() > 0 && arr[i] < 0) {

                    if(!d.isEmpty() && d.peek() > Math.abs(arr[i])) {
                        continue;
                    }

                    while(!d.isEmpty() &&
                          d.peek() > 0 &&
                          d.peek() < Math.abs(arr[i])) {

                        d.pop();
                        ver = 1;
                    }

                    if(!d.isEmpty() && d.peek() == Math.abs(arr[i])) {
                        d.pop();
                        ver = 0;
                        continue;
                    }

                    if(!d.isEmpty() &&
                       d.peek() > 0 &&
                       d.peek() > Math.abs(arr[i])) {
                        continue;
                    }

                    if(d.isEmpty() || ver == 1) {
                        d.push(arr[i]);
                    }
                }

                ver = 0;
            }
        }

        int[] res = new int[d.size()];

        for(int i = res.length - 1; i >= 0; i--) {
            res[i] = d.pop();
        }

        return res;
    }
}