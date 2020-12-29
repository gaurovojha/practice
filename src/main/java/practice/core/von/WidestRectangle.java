package practice.core.von;

import java.util.Arrays;

public class WidestRectangle {

    static int largestArea(int arr1[], int n,
                           int arr2[], int m)
    {

        // Initialize variables
        int end = 0, start = 0, i = 0, j = 0;

        // Sort array arr1[]
        Arrays.sort(arr1);

        // Sort array arr2[]
        Arrays.sort(arr2);

        // Traverse arr1[] and arr2[]
        while (i < n && j < m)
        {

            // If arr1[i] is same as arr2[j]
            if (arr1[i] == arr2[j])
            {

                // If no starting point
                // is found yet
                if (start == 0)
                    start = arr1[i];
                else

                    // Update maximum end
                    end = arr1[i];

                i++;
                j++;
            }

            // If arr[i] > arr2[j]
            else if (arr1[i] > arr2[j])
                j++;
            else
                i++;
        }

        // If no rectangle is found
        if (end == 0 || start == 0)
            return 0;
        else

            // Return the area
            return (end - start);
    }

    // Driver Code
    public static void main(String args[])
    {

        System.out.println(3 >> 1 == 0);

        // Given point
        int arr1[] = { 1, 2, 4 };

        // Given length
        int N = arr1.length;

        // Given points
        int arr2[] = { 1, 3, 4 };

        // Given length
        int M = arr2.length;

        // Function Call
        System.out.println(largestArea(arr1, N,
                arr2, M));
    }
}

