import java.util.ArrayList;

class solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int lenCal= 0;
        ArrayList<Integer> stu = new ArrayList<>();
        ArrayList<Integer> san = new ArrayList<>();
        for(int s : students)
        {
            stu.add(s);
        }
        for(int s : sandwiches)
        {
            san.add(s);
        }
        while(stu.size() > 0 && lenCal <=  stu.size())
        {
            if(stu.get(0) ==  san.get(0))
            {
                stu.remove(0);
                san.remove(0);
                lenCal = 0;
            }
            else
            {
                stu.add(stu.get(0));
                stu.remove(0);
                lenCal++;
            }
        }
        return stu.size();
    }
    public static void main(String[] args)
    {
        int[] stu = {1,1,1,0,0,1};
        int[] san = {1,0,0,0,1,1};
        solution ss = new solution();
        int result = ss.countStudents(stu, san);
        System.out.println(result);
    }
}