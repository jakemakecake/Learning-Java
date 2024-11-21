public class PracticeProblems {
static int countOccurences(int[] arr, int n) {
int count = 0;    
for (int num : arr) 
if (num == n) {
    count++;
}  
return count; 
}  

}
