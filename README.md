# Problem No. 1
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.


## Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

## Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]

## Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


<br/>
<br/>

# Problem  No. 9
     Given an integer x, return true if x is a palindrome, and false otherwise.


## Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

## Example 2:

    Input: x = 122
    Output: false
    Explanation: 122 reads as 122 from left to right and 221 from right to left.

<br />
<br />

# Problem No. 53
     Given an integer array nums, find the subarray with the largest sum, and return its sum


## Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.

## Example 2:

    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.

## Example 3:

    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

<br/>
<br/>

# Problem No. 191
    Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

_Note:_
-   Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.


-   In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.


## Example 1:

    Input: n = 00000000000000000000000000001011
    Output: 3
    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

## Example 2:

    Input: n = 00000000000000000000000010000000
    Output: 1
    Explaination: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

## Example 3:

    Input: n = 11111111111111111111111111111101
    Output: 31
    Explaination: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.

<br/>
<br/>

# Problem No. 217
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



## Example 1:

    Input: nums = [1,2,3,1]
    Output: true

## Example 2:

    Input: nums = [1,2,3,4]
    Output: false

## Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true


<br/>
<br/>

# Problem No. 258
     Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.


## Example 1:

    Input: num = 38
    Output: 2
    Explanation: The process is
                        38 --> 3 + 8 --> 11
                        11 --> 1 + 1 --> 2
                 Since 2 has only one digit, return it.

## Example 2:

    Input: num = 0
    Output: 0

<br/>
<br/>

# Problem No. 771
    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

    Letters are case sensitive, so "a" is considered a different type of stone from "A".


## Example 1:

    Input: jewels = "aA", stones = "aAAbbbb"
    Output: 3

## Example 2:

    Input: jewels = "z", stones = "ZZ"
    Output: 0


<br/>
<br/>

# Problem No. 832
    Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
<br />

    To flip an image horizontally means that each row of the image is reversed.
-   For example, flipping [1,1,0] horizontally results in [0,1,1].

<br/>

    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

-   For example, inverting [0,1,1] results in [1,0,0].

## Example 1:

    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
                 Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


## Example 2:

    Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
                 Then, invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

<br/>
<br/>

# Problem No. 1281
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.

## Example 1:

    Input: n = 234
    Output: 15
    Explanation: Product of digits = 2 * 3 * 4 = 24 
                 Sum of digits = 2 + 3 + 4 = 9
                 Result = 24 - 9 = 15

## Example 2:

    Input: n = 4421
    Output: 21
    Explanation: Product of digits = 4 * 4 * 2 * 1 = 32
                 Sum of digits = 4 + 4 + 2 + 1 = 11
                 Result = 32 - 11 = 21

<br/>
<br/>



# Problem No. 1470
     Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

_Return the array in the form [x1,y1,x2,y2,...,xn,yn]._


## Example 1:

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

## Example 2:

    Input: nums = [1,2,3,4,4,3,2,1], n = 4
    Output: [1,4,2,3,3,2,4,1]

## Example 3:

    Input: nums = [1,1,2,2], n = 2
    Output: [1,2,1,2]


<br/>
<br/>

# Problem No. 1480
     Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]). Return the running sum of nums.


## Example 1:

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

## Example 2:

    Input: nums = [1,1,1,1,1]
    Output: [1,2,3,4,5]
    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

<br />
<br />

# Problem No. 1491
    You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

    Return the average salary of employees excluding the minimum and maximum salary.

## Example 1:

    Input: salary = [4000,3000,1000,2000]
    Output: 2500.00000
    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
                 Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

## Example 2:

    Input: salary = [1000,2000,3000]
    Output: 2000.00000
    Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
                 Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


<br/>
<br/>



# Problem No. 1512
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

## Example 1:

    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

## Example 2:

    Input: nums = [1,1,1,1]
    Output: 6
    Explanation: Each pair in the array are good.

## Example 3:

    Input: nums = [1,2,3]
    Output: 0


<br/>
<br/>

# Problem No. 1523
    Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).


## Example 1:

    Input: low = 3, high = 7
    Output: 3
    Explanation: The odd numbers between 3 and 7 are [3,5,7]


## Example 2:

    Input: low = 8, high = 10
    Output: 1
    Explanation: The odd numbers between 8 and 10 are [9]


<br/>
<br/>

# Problem No. 1741

# Table
    +-------------+------+
    | Column Name | Type |
    +-------------+------+
    | emp_id      | int  |
    | event_day   | date |
    | in_time     | int  |
    | out_time    | int  |
    +-------------+------+

    (emp_id, event_day, in_time) is the primary key of this table.
    The table shows the employees' entries and exits in an office.
    event_day is the day at which this event happened, in_time is the minute at which the employee entered the office, and out_time is the minute at which they left the office.
    in_time and out_time are between 1 and 1440.
    It is guaranteed that no two events on the same day intersect in time, and in_time < out_time.

<br/>

    Write an SQL query to calculate the total time in minutes spent by each employee on each day at the office. Note that within one day, an employee can enter and leave more than once. The time spent in the office for a single entry is out_time - in_time.

    Return the result table in any order.



## Example 1:

    Input: 

        Employees table:
            +--------+------------+---------+----------+
            | emp_id | event_day  | in_time | out_time |
            +--------+------------+---------+----------+
            | 1      | 2020-11-28 | 4       | 32       |
            | 1      | 2020-11-28 | 55      | 200      |
            | 1      | 2020-12-03 | 1       | 42       |
            | 2      | 2020-11-28 | 3       | 33       |
            | 2      | 2020-12-09 | 47      | 74       |
            +--------+------------+---------+----------+

    Output:
            +------------+--------+------------+
            | day        | emp_id | total_time |
            +------------+--------+------------+
            | 2020-11-28 | 1      | 173        |
            | 2020-11-28 | 2      | 30         |
            | 2020-12-03 | 1      | 41         |
            | 2020-12-09 | 2      | 27         |
            +------------+--------+------------+

    Explanation: Employee 1 has three events: two on day 2020-11-28 with a total of (32 - 4) + (200 - 55) = 173, and one on day 2020-12-03 with a total of (42 - 1) = 41.
                 Employee 2 has two events: one on day 2020-11-28 with a total of (33 - 3) = 30, and one on day 2020-12-09 with a total of (74 - 47) = 27.

<br/>
<br/>

# Problem No. 1757

# Table
    +-------------+---------+
    | Column Name | Type    |
    +-------------+---------+
    | product_id  | int     |
    | low_fats    | enum    |
    | recyclable  | enum    |
    +-------------+---------+

    product_id is the primary key for this table.
    low_fats is an ENUM of type ('Y', 'N') where 'Y' means this product is low fat and 'N' means it is not.
    recyclable is an ENUM of types ('Y', 'N') where 'Y' means this product is recyclable and 'N' means it is not.

<br/>

    Write an SQL query to find the ids of products that are both low fat and recyclable.
    Return the result table in any order.



## Example 1:

    Input: 

        Products table:
            +-------------+----------+------------+
            | product_id  | low_fats | recyclable |
            +-------------+----------+------------+
            | 0           | Y        | N          |
            | 1           | Y        | Y          |
            | 2           | N        | Y          |
            | 3           | Y        | Y          |
            | 4           | N        | N          |
            +-------------+----------+------------+

    Output:
            +-------------+
            | product_id  |
            +-------------+
            | 1           |
            | 3           |
            +-------------+

    Explanation: Only products 1 and 3 are both low fat and recyclable.

<br/>
<br/>

# Problem No. 1929
     Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

     Specifically, ans is the concatenation of two nums arrays.

     Return the array ans.


## Example 1:

    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
                                                        ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
                                                        ans = [1,2,1,1,2,1]

## Example 2:

    Input: nums = [1,3,2,1]
    Output: [1,3,2,1,1,3,2,1]
    Explanation: The array ans is formed as follows:
                                                        ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
                                                        ans = [1,3,2,1,1,3,2,1]

<br/>
<br/>


# Problem No. 2011
     There is a programming language with only four operations and one variable X:

-    ++X and X++ increments the value of the variable X by 1.
-    --X and X-- decrements the value of the variable X by 1. Initially, the value of X is 0.

    Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.


## Example 1:

    Input: operations = ["--X","X++","X++"]
    Output: 1
    Explanation: The operations are performed as follows:
        Initially, X = 0
                 --X: X is decremented by 1, X =  0 - 1 = -1
                 X++: X is incremented by 1, X = -1 + 1 =  0
                 X++: X is incremented by 1, X =  0 + 1 =  1

## Example 2:

    Input: operations = ["++X","++X","X++"]
    Output: 3
    Explanation: The operations are performed as follows:
        Initially, X = 0
                 ++X: X is incremented by 1, X = 0 + 1 = 1
                 ++X: X is incremented by 1, X = 1 + 1 = 2
                 X++: X is incremented by 1, X = 2 + 1 = 3

## Example 3:

    Input: operations = ["X++","++X","--X","X--"]
    Output: 3
    Explanation: The operations are performed as follows:
        Initially, X = 0
                 X++: X is incremented by 1, X = 0 + 1 = 1
                 ++X: X is incremented by 1, X = 1 + 1 = 2
                 --X: X is decremented by 1, X = 2 - 1 = 1
                 X--: X is decremented by 1, X = 1 - 1 = 0


<br/>
<br/>


# Problem No. 2235
     Given two integers num1 and num2, return the sum of the two integers.


## Example 1:

    Input: num1 = 12, num2 = 5
    Output: 17
    Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.

## Example 2:

    Input: num1 = -10, num2 = 4
    Output: -6
    Explanation: num1 + num2 = -6, so -6 is returned.

<br/>
<br/>

# Problem No. 2413
     Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.


## Example 1:

    Input: n = 5
    Output: 10
    Explanation: The smallest multiple of both 5 and 2 is 10.

## Example 2:

    Input: n = 6
    Output: 6
    Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.

<br/>
<br/>

# Problem No. 2469
    You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.

    
    You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].

    Return the array ans. Answers within 10-5 of the actual answer will be accepted.

<br/>

_Note that:_

*   Kelvin = Celsius + 273.15
*   Fahrenheit = Celsius * 1.80 + 32.00

## Example 1:

    Input: celsius = 36.50
    Output: [309.65000,97.70000]
    Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70   

## Example 2:

    Input: celsius = 122.11
    Output: [395.26000,251.79800]
    Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798

<br/>
<br/>

# Problem No. 2535
    You are given a positive integer array nums.

    * The element sum is the sum of all the elements in nums.
    * The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
    * Return the absolute difference between the element sum and digit sum of nums.

_Note_ : The absolute difference between two integers x and y is defined as |x - y|.


## Example 1:

    Input: nums = [1,15,6,3]
    Output: 9
    Explanation: The element sum of nums is 1 + 15 + 6 + 3 = 25.
                 The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
                 The absolute difference between the element sum and digit sum is |25 - 16| = 9.

## Example 2:

    Input: nums = [1,2,3,4]
    Output: 0
    Explanation: The element sum of nums is 1 + 2 + 3 + 4 = 10.
                 The digit sum of nums is 1 + 2 + 3 + 4 = 10.
                 The absolute difference between the element sum and digit sum is |10 - 10| = 0.