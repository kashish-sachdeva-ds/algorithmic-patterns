class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];

        // Count how many students want each type of sandwich
        for (int student : students) {
            count[student]++;
        }

        // sandwiches[0] is the current top sandwich
        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break; // Nobody wants this sandwich, so nobody can proceed
            }

            count[sandwich]--;
        }

        return count[0] + count[1];
    }
}



// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
//         Queue<Integer> q = new LinkedList<>();

//         for(int student : students) {
//             q.add(student);
//         }

//         int s = 0;
//         int rot = 0;

//         while(!q.isEmpty() && rot < q.size()) {
//             if(q.peek() == sandwiches[s]) {
//                 q.poll();
//                 s++;
//                 rot = 0;
//             } else {
//                 q.add(q.poll());
//                 rot++;
//             }
//         }

//         return q.size();
//     }
// }