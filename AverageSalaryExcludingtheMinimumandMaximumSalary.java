class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int totalSalary = 0;
    
    for (int s : salary) {
        if (s < minSalary) {
            minSalary = s;
        }
        if (s > maxSalary) {
            maxSalary = s;
        }
        totalSalary += s;
    }
    
    totalSalary -= (minSalary + maxSalary);
    
    return (double) totalSalary / (salary.length - 2);
}

    }
