package Ex22;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

import static java.lang.System.exit;

public class Example22 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter 3 numbers");
        for(int i=0;i<3;i++)
        {
            nums[i] = input.nextInt();
        }
        while(true)
        {
            int index = 0;
            if(nums[index] ==  nums[index + 1] || nums[index] == nums[index+2] || nums[index+1] == nums[index + 2])
            {
                System.out.print("Invalid Entries");
                exit(1);
            }
            else
            {
                int large_number = nums[0];
                if(nums[0] > nums[1])
                {
                    if(nums[0] > nums[2])
                        System.out.print(nums[0] + " is the largest number.");
                    else
                        System.out.print(nums[2] + " is the largest number.");
                    break;

                }
                else{
                    if(nums[1] > nums[2])
                    {
                        System.out.print(nums[1] + " is the largest number.");
                    }
                    else
                        System.out.print(nums[2] + " is the largest number.");
                    break;
                }
            }

        }
    }
}
