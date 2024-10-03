public class GradeCalculator {

    // Main method
    public static void main(String[] args) {
        // Step 1: Define an array of student grades
        int[] grades = {85, 78, 90, 66, 92, 88};

        // Step 2: Call methods to perform calculations
        double average = calculateAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);

        // Step 3: Print the results
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }

    // Method to calculate the average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to find the highest grade
    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
