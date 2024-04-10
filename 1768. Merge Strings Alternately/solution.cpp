#include <iostream>
#include <vector>

class Solution {
public:
    int countStudents(std::vector<int>& students, std::vector<int>& sandwiches) {
        int lenCal = 0;
        std::vector<int> stu(students.begin(), students.end());
        std::vector<int> san(sandwiches.begin(), sandwiches.end());
        
        while (!stu.empty() && lenCal <= stu.size()) {
            if (stu[0] == san[0]) {
                stu.erase(stu.begin());
                san.erase(san.begin());
                lenCal = 0;
            } else {
                stu.push_back(stu[0]);
                stu.erase(stu.begin());
                lenCal++;
            }
        }
        return stu.size();
    }
};

int main() {
    std::vector<int> stu = {1, 1, 1, 0, 0, 1};
    std::vector<int> san = {1, 0, 0, 0, 1, 1};
    Solution ss;
    int result = ss.countStudents(stu, san);
    std::cout << result << std::endl;
    return 0;
}
