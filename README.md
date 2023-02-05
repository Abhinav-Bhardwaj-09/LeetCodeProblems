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

#   Problem No. 183

# Table
    Customers:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | id          | int     |
                | name        | varchar |
                +-------------+---------+

    id is the primary key column for this table.
    Each row of this table indicates the ID and name of a customer.


    Orders:
                +-------------+------+
                | Column Name | Type |
                +-------------+------+
                | id          | int  |
                | customerId  | int  |
                +-------------+------+

    id is the primary key column for this table.
    customerId is a foreign key of the ID from the Customers table.
    Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

<br/>

    Write an SQL query to report all customers who never order anything.
    Return the result table in any order.



## Example 1:

    Input: 

        Customers table:
                        +----+-------+
                        | id | name  |
                        +----+-------+
                        | 1  | Joe   |
                        | 2  | Henry |
                        | 3  | Sam   |
                        | 4  | Max   |
                        +----+-------+
        Orders table:
                        +----+------------+
                        | id | customerId |
                        +----+------------+
                        | 1  | 3          |
                        | 2  | 1          |
                        +----+------------+

    Output:
            +-----------+
            | Customers |
            +-----------+
            | Henry     |
            | Max       |
            +-----------+

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

# Problem No. 196

# Table
    Person :
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | id          | int     |
            | email       | varchar |
            +-------------+---------+

    id is the primary key column for this table.
    Each row of this table contains an email. The emails will not contain uppercase letters.

<br/>

    Write an SQL query to delete all the duplicate emails, keeping only one unique email with the smallest id. Note that you are supposed to write a DELETE statement and not a SELECT one.

    After running your script, the answer shown is the Person table. The driver will first compile and run your piece of code and then show the Person table. The final order of the Person table does not matter.



## Example 1:

    Input: 

        Person table:
            +----+------------------+
            | id | email            |
            +----+------------------+
            | 1  | john@example.com |
            | 2  | bob@example.com  |
            | 3  | john@example.com |
            +----+------------------+

    Output:
            +----+------------------+
            | id | email            |
            +----+------------------+
            | 1  | john@example.com |
            | 2  | bob@example.com  |
            +----+------------------+

    Explanation: john@example.com is repeated two times. We keep the row with the smallest Id = 1.

<br/>
<br/>

# Problem No. 202
     Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

-   Starting with any positive integer, replace the number by the sum of the squares of its digits.
-   Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
-   Those numbers for which this process ends in 1 are happy.

_Return true if n is a happy number, and false if not._


## Example 1:

    Input: n = 19
    Output: true
    Explanation: 1^2 + 9^2 = 82
                 8^2 + 2^2 = 68
                 6^2 + 8^2 = 100
                 1^2 + 0^2 + 0^2 = 1

## Example 2:

    Input: n = 2
    Output: false

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

# Problem No. 584

# Table
    Customer:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | id          | int     |
                | name        | varchar |
                | referee_id  | int     |
                +-------------+---------+

    id is the primary key column for this table.
    Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

<br/>

    Write an SQL query to report the names of the customer that are not referred by the customer with id = 2.

    Return the result table in any order.



## Example 1:

    Input: 

        Customer table:
            +----+------+------------+
            | id | name | referee_id |
            +----+------+------------+
            | 1  | Will | null       |
            | 2  | Jane | null       |
            | 3  | Alex | 2          |
            | 4  | Bill | null       |
            | 5  | Zack | 1          |
            | 6  | Mark | 2          |
            +----+------+------------+

    Output:
            +------+
            | name |
            +------+
            | Will |
            | Jane |
            | Bill |
            | Zack |
            +------+

<br/>
<br/>

# Problem No. 595

# Table
    World:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | name        | varchar |
            | continent   | varchar |
            | area        | int     |
            | population  | int     |
            | gdp         | int     |
            +-------------+---------+

    name is the primary key column for this table.
    Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.

<br/>

_A country is big :_

-   If it has an area of at least three million (i.e., 3000000 km2), or
-   If it has a population of at least twenty-five million (i.e., 25000000).

Write an SQL query to report the name, population, and area of the big countries. Return the result table in any order.



## Example 1:

    Input: 

        World table:
            +-------------+-----------+---------+------------+--------------+
            | name        | continent | area    | population | gdp          |
            +-------------+-----------+---------+------------+--------------+
            | Afghanistan | Asia      | 652230  | 25500100   | 20343000000  |
            | Albania     | Europe    | 28748   | 2831741    | 12960000000  |
            | Algeria     | Africa    | 2381741 | 37100000   | 188681000000 |
            | Andorra     | Europe    | 468     | 78115      | 3712000000   |
            | Angola      | Africa    | 1246700 | 20609294   | 100990000000 |
            +-------------+-----------+---------+------------+--------------+

    Output:
            +-------------+------------+---------+
            | name        | population | area    |
            +-------------+------------+---------+
            | Afghanistan | 25500100   | 652230  |
            | Algeria     | 37100000   | 2381741 |
            +-------------+------------+---------+

<br/>
<br/>

# Problem No. 627

# Table
    Salary
            +-------------+----------+
            | Column Name | Type     |
            +-------------+----------+
            | id          | int      |
            | name        | varchar  |
            | sex         | ENUM     |
            | salary      | int      |
            +-------------+----------+

    id is the primary key for this table.
    The sex column is ENUM value of type ('m', 'f').
    The table contains information about an employee.

<br/>

    Write an SQL query to swap all 'f' and 'm' values (i.e., change all 'f' values to 'm' and vice versa) with a single update statement and no intermediate temporary tables.

_Note that you must write a single update statement, do not write any select statement for this problem._



## Example 1:

    Input: 

        Salary table:
            +----+------+-----+--------+
            | id | name | sex | salary |
            +----+------+-----+--------+
            | 1  | A    | m   | 2500   |
            | 2  | B    | f   | 1500   |
            | 3  | C    | m   | 5500   |
            | 4  | D    | f   | 500    |
            +----+------+-----+--------+

    Output:
            +----+------+-----+--------+
            | id | name | sex | salary |
            +----+------+-----+--------+
            | 1  | A    | f   | 2500   |
            | 2  | B    | m   | 1500   |
            | 3  | C    | f   | 5500   |
            | 4  | D    | m   | 500    |
            +----+------+-----+--------+

    Explanation: (1, A) and (3, C) were changed from 'm' to 'f'.
                 (2, B) and (4, D) were changed from 'f' to 'm'.

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

# Problem No. 976
     Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.


## Example 1:

    Input: nums = [2,1,2]
    Output: 5
    Explanation: You can form a triangle with three side lengths: 1, 2, and 2.

## Example 2:

    Input: nums = [1,2,1,10]
    Output: 0
    Explanation: You cannot use the side lengths 1, 1, and 2 to form a triangle.
                 You cannot use the side lengths 1, 1, and 10 to form a triangle.
                 You cannot use the side lengths 1, 2, and 10 to form a triangle.
                 As we cannot use any three side lengths to form a triangle of non-zero area, we return 0.

<br/>
<br/>

# Problem No. 1232
    You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
    Check if these points make a straight line in the XY plane.


## Example 1:

![input1](/src/CheckIfItIsStraightLine/img.png)

    Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    Output: true

## Example 2:

![input2](/src/CheckIfItIsStraightLine/img_1.png)

    Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
    Output: false

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

# Problem No. 1484

# Table
    Activities:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | sell_date   | date    |
                | product     | varchar |
                +-------------+---------+

    There is no primary key for this table, it may contain duplicates.
    Each row of this table contains the product name and the date it was sold in a market.

<br/>

    Write an SQL query to find for each date the number of different products sold and their names.
    The sold products names for each date should be sorted lexicographically.
    Return the result table ordered by sell_date.



## Example 1:

    Input: 

        Activities table:
            +------------+------------+
            | sell_date  | product     |
            +------------+------------+
            | 2020-05-30 | Headphone  |
            | 2020-06-01 | Pencil     |
            | 2020-06-02 | Mask       |
            | 2020-05-30 | Basketball |
            | 2020-06-01 | Bible      |
            | 2020-06-02 | Mask       |
            | 2020-05-30 | T-Shirt    |
            +------------+------------+

    Output:
            +------------+----------+------------------------------+
            | sell_date  | num_sold | products                     |
            +------------+----------+------------------------------+
            | 2020-05-30 | 3        | Basketball,Headphone,T-shirt |
            | 2020-06-01 | 2        | Bible,Pencil                 |
            | 2020-06-02 | 1        | Mask                         |
            +------------+----------+------------------------------+

    Explanation: For 2020-05-30, Sold items were (Headphone, Basketball, T-shirt), we sort them lexicographically and separate them by a comma.
                 For 2020-06-01, Sold items were (Pencil, Bible), we sort them lexicographically and separate them by a comma.
                 For 2020-06-02, the Sold item is (Mask), we just return it.

<br/>
<br/>

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

# Problem No. 1502
    A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

    Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

## Example 1:

    Input: arr = [3,5,1]
    Output: true
    Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.

## Example 2:

    Input: arr = [1,2,4]
    Output: false
    Explanation: There is no way to reorder the elements to obtain an arithmetic progression.

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

# Problem No. 1527

# Table
    Patients:
                +--------------+---------+
                | Column Name  | Type    |
                +--------------+---------+
                | patient_id   | int     |
                | patient_name | varchar |
                | conditions   | varchar |
                +--------------+---------+

    patient_id is the primary key for this table.
    'conditions' contains 0 or more code separated by spaces.
    This table contains information of the patients in the hospital.

<br/>

    Write an SQL query to report the patient_id, patient_name and conditions of the patients who have Type I Diabetes. Type I Diabetes always starts with DIAB1 prefix.
    Return the result table in any order.



## Example 1:

    Input: 

        Patients table:
            +------------+--------------+--------------+
            | patient_id | patient_name | conditions   |
            +------------+--------------+--------------+
            | 1          | Daniel       | YFEV COUGH   |
            | 2          | Alice        |              |
            | 3          | Bob          | DIAB100 MYOP |
            | 4          | George       | ACNE DIAB100 |
            | 5          | Alain        | DIAB201      |
            +------------+--------------+--------------+

    Output:
            +------------+--------------+--------------+
            | patient_id | patient_name | conditions   |
            +------------+--------------+--------------+
            | 3          | Bob          | DIAB100 MYOP |
            | 4          | George       | ACNE DIAB100 |
            +------------+--------------+--------------+

    Explanation: Bob and George both have a condition that starts with DIAB1.

<br/>
<br/>

# Problem No. 1588
    Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

    A subarray is a contiguous subsequence of the array.


## Example 1:

    Input: arr = [1,4,2,5,3]
    Output: 58
    Explanation: The odd-length subarrays of arr and their sums are:
                    
                    [1] = 1
                    [4] = 4
                    [2] = 2
                    [5] = 5
                    [3] = 3
                    [1,4,2] = 7
                    [4,2,5] = 11
                    [2,5,3] = 10
                    [1,4,2,5,3] = 15

                 If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

## Example 2:

    Input: arr = [1,2]
    Output: 3
    Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.

## Example 3:

    Input: arr = [10,11,12]
    Output: 66

<br/>
<br/>

# Problem No. 1667

# Table
    Users:
            +----------------+---------+
            | Column Name    | Type    |
            +----------------+---------+
            | user_id        | int     |
            | name           | varchar |
            +----------------+---------+

    user_id is the primary key for this table.
    This table contains the ID and the name of the user.
    The name consists of only lowercase and uppercase characters.

<br/>

    Write an SQL query to fix the names so that only the first character is uppercase and the rest are lowercase.
    Return the result table ordered by user_id.



## Example 1:

    Input: 

        Users table:
            +---------+-------+
            | user_id | name  |
            +---------+-------+
            | 1       | aLice |
            | 2       | bOB   |
            +---------+-------+

    Output:
            +---------+-------+
            | user_id | name  |
            +---------+-------+
            | 1       | Alice |
            | 2       | Bob   |
            +---------+-------+

<br/>
<br/>

# Problem No. 1741

# Table
    Employees:
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
    Products: 
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

# Problem No. 1795

# Table
    Products:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | product_id  | int     |
            | store1      | int     |
            | store2      | int     |
            | store3      | int     |
            +-------------+---------+

    product_id is the primary key for this table.
    Each row in this table indicates the product's price in 3 different stores: store1, store2, and store3.
    If the product is not available in a store, the price will be null in that store's column.

<br/>

    Write an SQL query to rearrange the Products table so that each row has (product_id, store, price). If a product is not available in a store, do not include a row with that product_id and store combination in the result table.
    Return the result table in any order.



## Example 1:

    Input: 

        Products table:
            +------------+--------+--------+--------+
            | product_id | store1 | store2 | store3 |
            +------------+--------+--------+--------+
            | 0          | 95     | 100    | 105    |
            | 1          | 70     | null   | 80     |
            +------------+--------+--------+--------+

    Output:
            +------------+--------+-------+
            | product_id | store  | price |
            +------------+--------+-------+
            | 0          | store1 | 95    |
            | 0          | store2 | 100   |
            | 0          | store3 | 105   |
            | 1          | store1 | 70    |
            | 1          | store3 | 80    |
            +------------+--------+-------+

    Explanation: Product 0 is available in all three stores with prices 95, 100, and 105 respectively.
                 Product 1 is available in store1 with price 70 and store3 with price 80. The product is not available in store2.

<br/>
<br/>

# Problem No. 1822
    There is a function signFunc(x) that returns:

-   1 if x is positive.
-   -1 if x is negative.
- 0 if x is equal to 0.


You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

## Example 1:

    Input: nums = [-1,-2,-3,-4,3,2,1]
    Output: 1
    Explanation: The product of all values in the array is 144, and signFunc(144) = 1

## Example 2:

    Input: nums = [1,5,0,2,-3]
    Output: 0
    Explanation: The product of all values in the array is 0, and signFunc(0) = 0

## Example 3:

    Input: nums = [-1,1,-1,1,-1]
    Output: -1
    Explanation: The product of all values in the array is -1, and signFunc(-1) = -1

<br/>
<br/>

# Problem No. 1873

# Table
    Employees: 
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | employee_id | int     |
                | name        | varchar |
                | salary      | int     |
                +-------------+---------+

    employee_id is the primary key for this table.
    Each row of this table indicates the employee ID, employee name, and salary.

<br/>

    Write an SQL query to calculate the bonus of each employee. The bonus of an employee is 100% of their salary if the ID of the employee is an odd number and the employee name does not start with the character 'M'. The bonus of an employee is 0 otherwise.

    Return the result table ordered by employee_id.



## Example 1:

    Input: 

        Employees table:
            +-------------+---------+--------+
            | employee_id | name    | salary |
            +-------------+---------+--------+
            | 2           | Meir    | 3000   |
            | 3           | Michael | 3800   |
            | 7           | Addilyn | 7400   |
            | 8           | Juan    | 6100   |
            | 9           | Kannon  | 7700   |
            +-------------+---------+--------+

    Output:
            +-------------+-------+
            | employee_id | bonus |
            +-------------+-------+
            | 2           | 0     |
            | 3           | 0     |
            | 7           | 7400  |
            | 8           | 0     |
            | 9           | 7700  |
            +-------------+-------+

    Explanation: The employees with IDs 2 and 8 get 0 bonus because they have an even employee_id.
                 The employee with ID 3 gets 0 bonus because their name starts with 'M'.
                 The rest of the employees get a 100% bonus.

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

# Problem No. 1965

# Table
    Employees:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | employee_id | int     |
                | name        | varchar |
                +-------------+---------+

    employee_id is the primary key for this table.
    Each row of this table indicates the name of the employee whose ID is employee_id.

    Salaries:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | employee_id | int     |
                | salary      | int     |
                +-------------+---------+

    employee_id is the primary key for this table.
    Each row of this table indicates the salary of the employee whose ID is employee_id.
<br/>

    Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:
-   The employee's name is missing, or
-   The employee's salary is missing.

Return the result table ordered by employee_id in ascending order.



## Example 1:

    Input: 

        Employees:
                +-------------+----------+
                | employee_id | name     |
                +-------------+----------+
                | 2           | Crew     |
                | 4           | Haven    |
                | 5           | Kristian |
                +-------------+----------+

        Salaries:
                +-------------+--------+
                | employee_id | salary |
                +-------------+--------+
                | 5           | 76071  |
                | 1           | 22517  |
                | 4           | 63539  |
                +-------------+--------+

    Output:
                +-------------+
                | employee_id |
                +-------------+
                | 1           |
                | 2           |
                +-------------+

    Explanation: Employees 1, 2, 4, and 5 are working at this company.
                 The name of employee 1 is missing.
                 The salary of employee 2 is missing.

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