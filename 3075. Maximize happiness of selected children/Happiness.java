import java.util.Arrays;

public class Happiness {
        public long maximumHappinessSum(int[] happiness, int k) {
            Arrays.sort(happiness);
            int last = happiness.length -1;
            long max = 0;
            for(int i = last  ;  i >= ( last - k +1) ; i--)
            {
                max += (happiness[i] - (last - i)) < 0 ? 0 : (happiness[i] - (last - i)); 
            }
            return max;
            // Arrays.sort(happiness);
            // int last = happiness.length -1;
            // long max = 0;
            // int decrementor = 0;
            // while(k > 0)
            // {
            //     System.out.println(happiness[last]);
            //     max += (happiness[last] - decrementor) < 0 ? 0:(happiness[last] - decrementor);
            //     decrementor++;
            //     k--;
            //     last--;
            // }
    
            //return max;
        }
    public static void main(String[] args) {
        int[] ha = {12,1,42};
        Happiness h = new Happiness();
        long r = h.maximumHappinessSum(ha, 3);
        System.out.println(r);
    }
}
