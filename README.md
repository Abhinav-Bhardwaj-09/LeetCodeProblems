# [Problem No. 1](src/TwoSum)
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

# [Problem No. 2](src/AddTwoNumbers)
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.




## Example 1:
![img.png](src/AddTwoNumbers/img.jpeg)

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807

## Example 2:

    Input: l1 = [0], l2 = [0]
    Output: [0]

## Example 3:

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]

<br/>
<br/>

# [Problem  No. 9](src/PalindromeNumber)
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

# [Problem No. 35](src/SearchInsertPosition)
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.


## Example 1:

    Input: nums = [1,3,5,6], target = 5
    Output: 2

## Example 2:

    Input: nums = [1,3,5,6], target = 2
    Output: 1

## Example 3:

    Input: nums = [1,3,5,6], target = 7
    Output: 4

<br/>
<br/>

# [Problem No. 53](src/MaximumSubarray)
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

# [Problem No. 58](src/LengthOfLastWord)
    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.


## Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.

## Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.

## Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.

<br/>
<br/>

# [Problem No. 62](src/UniquePaths)
    There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

    Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

    The test cases are generated so that the answer will be less than or equal to 2 * 109.





## Example 1:

![img1.png](src/UniquePaths/img1.png)

    Input: m = 3, n = 7
    Output: 28


## Example 2:

    Input: m = 3, n = 2
    Output: 3
    Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
                         1. Right -> Down -> Down
                         2. Down -> Down -> Right
                         3. Down -> Right -> Down

<br/>
<br/>

# [Problem No. 66](src/PlusOne)
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

## Example 1:

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
                 Incrementing by one gives 123 + 1 = 124.
                 Thus, the result should be [1,2,4].

## Example 2:

    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
                 Incrementing by one gives 4321 + 1 = 4322.
                 Thus, the result should be [4,3,2,2].

## Example 3:

    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
                 Incrementing by one gives 9 + 1 = 10.
                 Thus, the result should be [1,0].

<br/>
<br/>

# [Problem No. 104](src/MaximumDepthOfBinaryTree)
     Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


## Example 1:

![img.jpeg](src/MaximumDepthOfBinaryTree/img.jpeg)

    Input: root = [3,9,20,null,null,15,7]
    Output: 3

## Example 2:

    Input: root = [1,null,2]
    Output: 2

<br/>
<br/>

# [Problem No. 139](src/WordBreak)
    Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

_Note that the same word in the dictionary may be reused multiple times in the segmentation._

## Example 1:

    Input: s = "leetcode", wordDict = ["leet","code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".


## Example 2:

    Input: s = "applepenapple", wordDict = ["apple","pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
                 Note that you are allowed to reuse a dictionary word.

## Example 3:

    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: false

<br/>
<br/>

# [Problem No. 175](src/CombineTwoTables)

# Table
    Person:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | personId    | int     |
            | lastName    | varchar |
            | firstName   | varchar |
            +-------------+---------+

    personId is the primary key column for this table.
    This table contains information about the ID of some persons and their first and last names.



    Address:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | addressId   | int     |
            | personId    | int     |
            | city        | varchar |
            | state       | varchar |
            +-------------+---------+

    addressId is the primary key column for this table.
    Each row of this table contains information about the city and state of one person with ID = PersonId.
<br/>

    Write an SQL query to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.
    Return the result table in any order.



## Example 1:

    Input: 

        Person :
                +----------+----------+-----------+
                | personId | lastName | firstName |
                +----------+----------+-----------+
                | 1        | Wang     | Allen     |
                | 2        | Alice    | Bob       |
                +----------+----------+-----------+


        Address :
                +-----------+----------+---------------+------------+
                | addressId | personId | city          | state      |
                +-----------+----------+---------------+------------+
                | 1         | 2        | New York City | New York   |
                | 2         | 3        | Leetcode      | California |
                +-----------+----------+---------------+------------+

    Output:
            +-----------+----------+---------------+----------+
            | firstName | lastName | city          | state    |
            +-----------+----------+---------------+----------+
            | Allen     | Wang     | Null          | Null     |
            | Bob       | Alice    | New York City | New York |
            +-----------+----------+---------------+----------+
    

    Explanation: There is no address in the address table for the personId = 1 so we return null in their city and state.
                 addressId = 1 contains information about the address of personId = 2.

<br/>
<br/>

# [Problem No. 176](src/SecondHighestSalary)

# Table
    Employee:
            +-------------+------+
            | Column Name | Type |
            +-------------+------+
            | id          | int  |
            | salary      | int  |
            +-------------+------+

            id is the primary key column for this table.
            Each row of this table contains information about the salary of an employee.

<br/>

    Write an SQL query to report the second highest salary from the Employee table. If there is no second highest salary, the query should report null.




## Example 1:

    Input: 

        Employee:
                +----+--------+
                | id | salary |
                +----+--------+
                | 1  | 100    |
                | 2  | 200    |
                | 3  | 300    |
                +----+--------+

    Output:
            +---------------------+
            | SecondHighestSalary |
            +---------------------+
            | 200                 |
            +---------------------+


## Example 2:

    Input: 

        Employee:
                +----+--------+
                | id | salary |
                +----+--------+
                | 1  | 100    |
                +----+--------+

    Output:
            +---------------------+
            | SecondHighestSalary |
            +---------------------+
            | null                |
            +---------------------+

<br/>
<br/>

# [Problem No. 182](src/DuplicateEmails)

# Table
    Person:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | id          | int     |
            | email       | varchar |
            +-------------+---------+

    id is the primary key column for this table.
    Each row of this table contains an email. The emails will not contain uppercase letters.

<br/>

    Write an SQL query to report all the duplicate emails.
    Return the result table in any order.





## Example 1:

    Input: 

        Person table:
            +----+---------+
            | id | email   |
            +----+---------+
            | 1  | a@b.com |
            | 2  | c@d.com |
            | 3  | a@b.com |
            +----+---------+

    Output:
            +---------+
            | Email   |
            +---------+
            | a@b.com |
            +---------+

    Explanation: a@b.com is repeated two times.

<br/>
<br/>

#   [Problem No. 183](src/CustomersWhoNeverOrder)

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

# [Problem No. 191](src/NumberOf1Bits)
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

# [Problem No. 196](src/DeleteDuplicateEmails)

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

# [Problem No. 197](src/RisingTemperature)

# Table
    Weather:
            +---------------+---------+
            | Column Name   | Type    |
            +---------------+---------+
            | id            | int     |
            | recordDate    | date    |
            | temperature   | int     |
            +---------------+---------+

    id is the primary key for this table.
    This table contains information about the temperature on a certain day.

<br/>

    Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).
    Return the result table in any order.



## Example 1:

    Input: 

        Weather:
            +----+------------+-------------+
            | id | recordDate | temperature |
            +----+------------+-------------+
            | 1  | 2015-01-01 | 10          |
            | 2  | 2015-01-02 | 25          |
            | 3  | 2015-01-03 | 20          |
            | 4  | 2015-01-04 | 30          |
            +----+------------+-------------+

    Output:
            +----+
            | id |
            +----+
            | 2  |
            | 4  |
            +----+

    Explanation: In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
                 In 2015-01-04, the temperature was higher than the previous day (20 -> 30).

<br/>
<br/>

# [Problem No. 202](src/HappyNumber)
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

# [Problem No. 217](src/ContainsDuplicate)
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

# [Problem No. 232](src/ImplementQueueUsingStacks)
    Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should 
    support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

-   void push(int x) Pushes element x to the back of the queue.
-   int pop() Removes the element from the front of the queue and returns it.
-   int peek() Returns the element at the front of the queue.
-   boolean empty() Returns true if the queue is empty, false otherwise.

Notes:

-   You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
-   Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.




## Example 1:

    Input: ["MyQueue", "push", "push", "peek", "pop", "empty"]
           [[], [1], [2], [], [], []]
    Output: [null, null, null, 1, 1, false]
    Explanation: MyQueue myQueue = new MyQueue();
                 myQueue.push(1); // queue is: [1]
                 myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
                 myQueue.peek(); // return 1
                 myQueue.pop(); // return 1, queue is [2]
                 myQueue.empty(); // return false

<br/>
<br/>

# [Problem No. 242](src/ValidAnagram)
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging the letters of a different word 
    or phrase, typically using all the original letters exactly once.



## Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true


## Example 2:

    Input: s = "rat", t = "car"
    Output: false

<br/>
<br/>

# [Problem No. 258](src/AddDigits)
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

# [Problem No. 283](src/MoveZeroes)
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.


## Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]

## Example 2:

    Input: nums = [0]
    Output: [0]

<br/>
<br/>

# [Problem No. 303](src/RangeSumQuery_Immutable)
     Given an integer array nums, handle multiple queries of the following type:

    Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

Implement the NumArray class:

- NumArray(int[] nums) Initializes the object with the integer array nums.
- int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


## Example 1:

    Input: ["NumArray", "sumRange", "sumRange", "sumRange"]
           [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
    Output: [null, 1, -1, -3]
    Explanation: NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
                 numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
                 numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
                 numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

<br/>
<br/>

# [Problem No. 389](src/FindTheDifference)
    You are given two strings s and t.

    String t is generated by random shuffling string s and then add one more letter at a random position.
    
    Return the letter that was added to t.

## Example 1:

    Input: s = "abcd", t = "abcde"
    Output: "e"
    Explanation: 'e' is the letter that was added.


## Example 2:

    Input: s = "", t = "y"
    Output: "y"

<br/>
<br/>

# [Problem No. 496](src/NextGreaterElement_I)
    The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

    You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
    
    For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
    
    Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.




## Example 1:

    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
    Output: [-1,3,-1]
    Explanation: The next greater element for each value of nums1 is as follows:
                 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
                 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
                 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

## Example 2:

    Input: nums1 = [2,4], nums2 = [1,2,3,4]
    Output: [3,-1]
    Explanation: The next greater element for each value of nums1 is as follows:
                 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
                 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

<br/>
<br/>

# [Problem No. 502](src/IPO)

    Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on 
    some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before 
    the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.

    You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
    
    Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
    
    Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
    
    The answer is guaranteed to fit in a 32-bit signed integer.




## Example 1:

    Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
    Output: 4
    Explanation: Since your initial capital is 0, you can only start the project indexed 0.
                 After finishing it you will obtain profit 1 and your capital becomes 1.
                 With capital 1, you can either start the project indexed 1 or the project indexed 2.
                 Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
                 Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.

## Example 2:

    Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
    Output: 6


<br/>
<br/>

# [Problem No. 511](src/GamePlayAnalysis_I)

# Table
    Activity:
            +--------------+---------+
            | Column Name  | Type    |
            +--------------+---------+
            | player_id    | int     |
            | device_id    | int     |
            | event_date   | date    |
            | games_played | int     |
            +--------------+---------+

    (player_id, event_date) is the primary key of this table.
    This table shows the activity of players of some games.
    Each row is a record of a player who logged in and played a number of games (possibly 0) before logging out on someday using some device.

<br/>

    Write an SQL query to report the first login date for each player.
    Return the result table in any order.



## Example 1:

    Input: 

        Activity table:
            +-----------+-----------+------------+--------------+
            | player_id | device_id | event_date | games_played |
            +-----------+-----------+------------+--------------+
            | 1         | 2         | 2016-03-01 | 5            |
            | 1         | 2         | 2016-05-02 | 6            |
            | 2         | 3         | 2017-06-25 | 1            |
            | 3         | 1         | 2016-03-02 | 0            |
            | 3         | 4         | 2018-07-03 | 5            |
            +-----------+-----------+------------+--------------+

    Output:
            +-----------+-------------+
            | player_id | first_login |
            +-----------+-------------+
            | 1         | 2016-03-01  |
            | 2         | 2017-06-25  |
            | 3         | 2016-03-02  |
            +-----------+-------------+

<br/>
<br/>

# [Problem No. 540](src/SingleElementInSortedArray)
    You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

    Return the single element that appears only once.


## Example 1:

    Input: nums = [1,1,2,3,3,4,4,8,8]
    Output: 2

## Example 2:

    Input: nums = [3,3,7,7,10,11,11]
    Output: 10


<br/>
<br/>

# [Problem No. 566](src/ReshapeTheMatrix)
    In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

    You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

    The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

    If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.



## Example 1:
![img1.jpeg](src/ReshapeTheMatrix/img1.jpeg)

    Input: mat = [[1,2],[3,4]], r = 1, c = 4
    Output: [[1,2,3,4]]


## Example 2:
![img2.jpeg](src/ReshapeTheMatrix/img2.jpeg)

    Input: mat = [[1,2],[3,4]], r = 2, c = 4
    Output: [[1,2],[3,4]]

<br/>
<br/>

# [Problem No. 584](src/FindCustomerReferee)

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

# [Problem No. 586](src/CustomerPlacingTheLargestNumberOfOrders)

# Table
    Orders:
            +-----------------+----------+
            | Column Name     | Type     |
            +-----------------+----------+
            | order_number    | int      |
            | customer_number | int      |
            +-----------------+----------+

    order_number is the primary key for this table.
    This table contains information about the order ID and the customer ID.

<br/>

    Write an SQL query to find the customer_number for the customer who has placed the largest number of orders.
    The test cases are generated so that exactly one customer will have placed more orders than any other customer.



## Example 1:

    Input: 

        Orders:
            +--------------+-----------------+
            | order_number | customer_number |
            +--------------+-----------------+
            | 1            | 1               |
            | 2            | 2               |
            | 3            | 3               |
            | 4            | 3               |
            +--------------+-----------------+

    Output:
            +-----------------+
            | customer_number |
            +-----------------+
            | 3               |
            +-----------------+

    Explanation: The customer with number 3 has two orders, which is greater than either customer 1 or 2 because each of them only has one order. 
                 So, the result is customer_number 3.

<br/>
<br/>

# [Problem No. 589](src/N_aryTreePreOrderTraversal)
    Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

    Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)




## Example 1:
![img1.png](src/N_aryTreePreOrderTraversal/img1.png)

    Input: root = [1,null,3,2,4,null,5,6]
    Output: [1,3,5,6,2,4]

## Example 2:
![img2.png](src/N_aryTreePreOrderTraversal/img2.png)

    Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]


<br/>
<br/>

# [Problem No. 595](src/BigCountries)

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

# [Problem No. 607](src/SalesPerson)

# Table

    SalesPerson: 
                +-----------------+---------+
                | Column Name     | Type    |
                +-----------------+---------+
                | sales_id        | int     |
                | name            | varchar |
                | salary          | int     |
                | commission_rate | int     |
                | hire_date       | date    |
                +-----------------+---------+

    sales_id is the primary key column for this table.
    Each row of this table indicates the name and the ID of a salesperson alongside their salary, commission rate, and hire date.



    Company:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | com_id      | int     |
                | name        | varchar |
                | city        | varchar |
                +-------------+---------+

    com_id is the primary key column for this table.
    Each row of this table indicates the name and the ID of a company and the city in which the company is located.



    Orders:
                +-------------+------+
                | Column Name | Type |
                +-------------+------+
                | order_id    | int  |
                | order_date  | date |
                | com_id      | int  |
                | sales_id    | int  |
                | amount      | int  |
                +-------------+------+

    order_id is the primary key column for this table.
    com_id is a foreign key to com_id from the Company table.
    sales_id is a foreign key to sales_id from the SalesPerson table.
    Each row of this table contains information about one order. This includes the ID of the company, the ID of the salesperson, the date of the order, and the amount paid.

<br/>

    Write an SQL query to report the names of all the salespersons who did not have any orders related to the company with the name "RED".
    Return the result table in any order.



## Example 1:

    Input: 

        SalesPerson:
            +----------+------+--------+-----------------+------------+
            | sales_id | name | salary | commission_rate | hire_date  |
            +----------+------+--------+-----------------+------------+
            | 1        | John | 100000 | 6               | 4/1/2006   |
            | 2        | Amy  | 12000  | 5               | 5/1/2010   |
            | 3        | Mark | 65000  | 12              | 12/25/2008 |
            | 4        | Pam  | 25000  | 25              | 1/1/2005   |
            | 5        | Alex | 5000   | 10              | 2/3/2007   |
            +----------+------+--------+-----------------+------------+

        Company:
            +--------+--------+----------+
            | com_id | name   | city     |
            +--------+--------+----------+
            | 1      | RED    | Boston   |
            | 2      | ORANGE | New York |
            | 3      | YELLOW | Boston   |
            | 4      | GREEN  | Austin   |
            +--------+--------+----------+

        Orders:
            +----------+------------+--------+----------+--------+
            | order_id | order_date | com_id | sales_id | amount |
            +----------+------------+--------+----------+--------+
            | 1        | 1/1/2014   | 3      | 4        | 10000  |
            | 2        | 2/1/2014   | 4      | 5        | 5000   |
            | 3        | 3/1/2014   | 1      | 1        | 50000  |
            | 4        | 4/1/2014   | 1      | 4        | 25000  |
            +----------+------------+--------+----------+--------+
    

    Output:
            +------+
            | name |
            +------+
            | Amy  |
            | Mark |
            | Alex |
            +------+

    Explanation: According to orders 3 and 4 in the Orders table, it is easy to tell that only salesperson John and Pam have sales to company RED, so we report all the other names in the table salesperson.

<br/>
<br/>

# [Problem No. 608](src/TreeNode)

# Table
    Tree:
            +-------------+------+
            | Column Name | Type |
            +-------------+------+
            | id          | int  |
            | p_id        | int  |
            +-------------+------+

            id is the primary key column for this table.
            Each row of this table contains information about the id of a node and the id of its parent node in a tree.
            The given structure is always a valid tree.

<br/>

Each node in the tree can be one of three types:

- "Leaf": if the node is a leaf node.
- "Root": if the node is the root of the tree.
- "Inner": If the node is neither a leaf node nor a root node.

<br/>

    Write an SQL query to report the type of each node in the tree.
    Return the result table in any order.



## Example 1:

![input1](src/TreeNode/img.png)

    Input: 

        Tree:
                +----+------+
                | id | p_id |
                +----+------+
                | 1  | null |
                | 2  | 1    |
                | 3  | 1    |
                | 4  | 2    |
                | 5  | 2    |
                +----+------+

    Output:
            +----+-------+
            | id | type  |
            +----+-------+
            | 1  | Root  |
            | 2  | Inner |
            | 3  | Leaf  |
            | 4  | Leaf  |
            | 5  | Leaf  |
            +----+-------+

    Explanation: Node 1 is the root node because its parent node is null and it has child nodes 2 and 3.
                 Node 2 is an inner node because it has parent node 1 and child node 4 and 5.
                 Nodes 3, 4, and 5 are leaf nodes because they have parent nodes and they do not have child nodes.


## Example 2:

![input2](src/TreeNode/img_1.png)

    Input: 

        Tree:
                +----+------+
                | id | p_id |
                +----+------+
                | 1  | null |
                +----+------+

    Output:
            +----+-------+
            | id | type  |
            +----+-------+
            | 1  | Root  |
            +----+-------+

    Explanation: If there is only one node on the tree, you only need to output its root attributes.

<br/>
<br/>

# [Problem No. 627](src/SwapSalary)

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

# [Problem No. 709](src/ToLowerCase)
    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.


## Example 1:

    Input: s = "Hello"
    Output: "hello"

## Example 2:

    Input: s = "here"
    Output: "here"

## Example 3:

    Input: s = "LOVELY"
    Output: "lovely"

<br/>
<br/>

# [Problem No. 771](src/JewelsAndStones)
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

# [Problem No. 832](src/FlippingAnImage)
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

# [Problem No. 876](src/MiddleOfTheLinkedList)
    Given the head of a singly linked list, return the middle node of the linked list.

    If there are two middle nodes, return the second middle node.


## Example 1:

![img1.jpeg](src/MiddleOfTheLinkedList/img1.jpeg)

    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3.

## Example 2:

![img2.jpeg](src/MiddleOfTheLinkedList/img2.jpeg)

    Input: head = [1,2,3,4,5,6]
    Output: [4,5,6]
    Explaination: Since the list has two middle nodes with values 3 and 4, we return the second one.

<br/>
<br/>

# [Problem No. 976](src/LargestPerimeterTriangle)
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

# [Problem No. 1011](src/CapacityToShipPackagesWithinD_Days)

    A conveyor belt has packages that must be shipped from one port to another within days days.

    The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

    Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

<br/>

## Example 1:

    Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
    Output: 15
    Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
                 1st day: 1, 2, 3, 4, 5
                 2nd day: 6, 7
                 3rd day: 8
                 4th day: 9
                 5th day: 10
                
    Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.

## Example 2:

    Input: weights = [3,2,2,4,1,4], days = 3
    Output: 6
    Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
                 1st day: 3, 2
                 2nd day: 2, 4
                 3rd day: 1, 4

## Example 3:

    Input: weights = [1,2,3,1,1], days = 4
    Output: 3
    Explanation: 1st day: 1
                 2nd day: 2
                 3rd day: 3
                 4th day: 1, 1

<br/>
<br/>

# [Problem No. 1050](src/ActorsAndDirectorsWhoCooperatedAtLeastThreeTimes)

# Table
    ActorDirector:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | actor_id    | int     |
                | director_id | int     |
                | timestamp   | int     |
                +-------------+---------+
    timestamp is the primary key column for this table.

<br/>

    Write a SQL query for a report that provides the pairs (actor_id, director_id) where the actor has cooperated with the director at least three times.
    Return the result table in any order.



## Example 1:

    Input: 

        ActorDirector:
            +-------------+-------------+-------------+
            | actor_id    | director_id | timestamp   |
            +-------------+-------------+-------------+
            | 1           | 1           | 0           |
            | 1           | 1           | 1           |
            | 1           | 1           | 2           |
            | 1           | 2           | 3           |
            | 1           | 2           | 4           |
            | 2           | 1           | 5           |
            | 2           | 1           | 6           |
            +-------------+-------------+-------------+

    Output:
            +-------------+-------------+
            | actor_id    | director_id |
            +-------------+-------------+
            | 1           | 1           |
            +-------------+-------------+

    Explanation: The only pair is (1, 1) where they cooperated exactly 3 times.

<br/>
<br/>

# [Problem No. 1084](src/SalesAnalysis_III)

# Table

    Product: 
                +--------------+---------+
                | Column Name  | Type    |
                +--------------+---------+
                | product_id   | int     |
                | product_name | varchar |
                | unit_price   | int     |
                +--------------+---------+

    product_id is the primary key of this table.
    Each row of this table indicates the name and the price of each product.



    Sales:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | seller_id   | int     |
                | product_id  | int     |
                | buyer_id    | int     |
                | sale_date   | date    |
                | quantity    | int     |
                | price       | int     |
                +-------------+---------+

    This table has no primary key, it can have repeated rows.
    product_id is a foreign key to the Product table.
    Each row of this table contains some information about one sale.


<br/>

    Write an SQL query that reports the products that were only sold in the first quarter of 2019. That is, between 2019-01-01 and 2019-03-31 inclusive.
    Return the result table in any order.



## Example 1:

    Input: 

        Product table:
            +------------+--------------+------------+
            | product_id | product_name | unit_price |
            +------------+--------------+------------+
            | 1          | S8           | 1000       |
            | 2          | G4           | 800        |
            | 3          | iPhone       | 1400       |
            +------------+--------------+------------+



        Sales table:
            +-----------+------------+----------+------------+----------+-------+
            | seller_id | product_id | buyer_id | sale_date  | quantity | price |
            +-----------+------------+----------+------------+----------+-------+
            | 1         | 1          | 1        | 2019-01-21 | 2        | 2000  |
            | 1         | 2          | 2        | 2019-02-17 | 1        | 800   |
            | 2         | 2          | 3        | 2019-06-02 | 1        | 800   |
            | 3         | 3          | 4        | 2019-05-13 | 2        | 2800  |
            +-----------+------------+----------+------------+----------+-------+

    

    Output:
            +-------------+--------------+
            | product_id  | product_name |
            +-------------+--------------+
            | 1           | S8           |
            +-------------+--------------+

    Explanation: The product with id 1 was only sold in the spring of 2019.
                 The product with id 2 was sold in the spring of 2019 but was also sold after the spring of 2019.
                 The product with id 3 was sold after spring 2019.
                 We return only product 1 as it is the product that was only sold in the spring of 2019.

<br/>
<br/>

# [Problem No. 1141](src/UserActivityForThePast30Days_I)

# Table

    Activity:
                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | user_id       | int     |
                | session_id    | int     |
                | activity_date | date    |
                | activity_type | enum    |
                +---------------+---------+
                
    There is no primary key for this table, it may have duplicate rows.
    The activity_type column is an ENUM of type ('open_session', 'end_session', 'scroll_down', 'send_message').
    The table shows the user activities for a social media website.
    Note that each session belongs to exactly one user.

<br/>

    Write an SQL query to find the daily active user count for a period of 30 days ending 2019-07-27 inclusively. A user was active on someday if they made at least one activity on that day.
    Return the result table in any order.



## Example 1:

    Input: 

        Activity table:
            +---------+------------+---------------+---------------+
            | user_id | session_id | activity_date | activity_type |
            +---------+------------+---------------+---------------+
            | 1       | 1          | 2019-07-20    | open_session  |
            | 1       | 1          | 2019-07-20    | scroll_down   |
            | 1       | 1          | 2019-07-20    | end_session   |
            | 2       | 4          | 2019-07-20    | open_session  |
            | 2       | 4          | 2019-07-21    | send_message  |
            | 2       | 4          | 2019-07-21    | end_session   |
            | 3       | 2          | 2019-07-21    | open_session  |
            | 3       | 2          | 2019-07-21    | send_message  |
            | 3       | 2          | 2019-07-21    | end_session   |
            | 4       | 3          | 2019-06-25    | open_session  |
            | 4       | 3          | 2019-06-25    | end_session   |
            +---------+------------+---------------+---------------+
    

    Output:
            +------------+--------------+ 
            | day        | active_users |
            +------------+--------------+
            | 2019-07-20 | 2            |
            | 2019-07-21 | 2            |
            +------------+--------------+

    Explanation: Note that we do not care about days with zero active users.

<br/>
<br/>

# [Problem No. 1148](src/ArticleViews_I)

# Table
    Views:
            +---------------+---------+
            | Column Name   | Type    |
            +---------------+---------+
            | article_id    | int     |
            | author_id     | int     |
            | viewer_id     | int     |
            | view_date     | date    |
            +---------------+---------+

    There is no primary key for this table, it may have duplicate rows.
    Each row of this table indicates that some viewer viewed an article (written by some author) on some date.
    Note that equal author_id and viewer_id indicate the same person.

<br/>

    Write an SQL query to find all the authors that viewed at least one of their own articles.

    Return the result table sorted by id in ascending order.



## Example 1:

    Input: 

        Views table:
            +------------+-----------+-----------+------------+
            | article_id | author_id | viewer_id | view_date  |
            +------------+-----------+-----------+------------+
            | 1          | 3         | 5         | 2019-08-01 |
            | 1          | 3         | 6         | 2019-08-02 |
            | 2          | 7         | 7         | 2019-08-01 |
            | 2          | 7         | 6         | 2019-08-02 |
            | 4          | 7         | 1         | 2019-07-22 |
            | 3          | 4         | 4         | 2019-07-21 |
            | 3          | 4         | 4         | 2019-07-21 |
            +------------+-----------+-----------+------------+

    Output:
            +------+
            | id   |
            +------+
            | 4    |
            | 7    |
            +------+

<br/>
<br/>

# [Problem No. 1158](src/MarketAnalysis_I)

# Table

    Users: 
                +----------------+---------+
                | Column Name    | Type    |
                +----------------+---------+
                | user_id        | int     |
                | join_date      | date    |
                | favorite_brand | varchar |
                +----------------+---------+

    user_id is the primary key of this table.
    This table has the info of the users of an online shopping website where users can sell and buy items.


    Orders:
                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | order_id      | int     |
                | order_date    | date    |
                | item_id       | int     |
                | buyer_id      | int     |
                | seller_id     | int     |
                +---------------+---------+

    order_id is the primary key of this table.
    item_id is a foreign key to the Items table.
    buyer_id and seller_id are foreign keys to the Users table.


    Items:

                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | item_id       | int     |
                | item_brand    | varchar |
                +---------------+---------+
                
    item_id is the primary key of this table.

<br/>

    Write an SQL query to find for each user, the join date and the number of orders they made as a buyer in 2019.
    Return the result table in any order.



## Example 1:

    Input: 

        Users table:
            +---------+------------+----------------+
            | user_id | join_date  | favorite_brand |
            +---------+------------+----------------+
            | 1       | 2018-01-01 | Lenovo         |
            | 2       | 2018-02-09 | Samsung        |
            | 3       | 2018-01-19 | LG             |
            | 4       | 2018-05-21 | HP             |
            +---------+------------+----------------+



        Orders table:
            +----------+------------+---------+----------+-----------+
            | order_id | order_date | item_id | buyer_id | seller_id |
            +----------+------------+---------+----------+-----------+
            | 1        | 2019-08-01 | 4       | 1        | 2         |
            | 2        | 2018-08-02 | 2       | 1        | 3         |
            | 3        | 2019-08-03 | 3       | 2        | 3         |
            | 4        | 2018-08-04 | 1       | 4        | 2         |
            | 5        | 2018-08-04 | 1       | 3        | 4         |
            | 6        | 2019-08-05 | 2       | 2        | 4         |
            +----------+------------+---------+----------+-----------+

        
        Items table:
            +---------+------------+
            | item_id | item_brand |
            +---------+------------+
            | 1       | Samsung    |
            | 2       | Lenovo     |
            | 3       | LG         |
            | 4       | HP         |
            +---------+------------+
    

    Output:
            +-----------+------------+----------------+
            | buyer_id  | join_date  | orders_in_2019 |
            +-----------+------------+----------------+
            | 1         | 2018-01-01 | 1              |
            | 2         | 2018-02-09 | 2              |
            | 3         | 2018-01-19 | 0              |
            | 4         | 2018-05-21 | 0              |
            +-----------+------------+----------------+

<br/>
<br/>

# [Problem No. 1232](src/CheckIfItIsStraightLine)
    You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
    Check if these points make a straight line in the XY plane.


## Example 1:

![input1](src/CheckIfItIsStraightLine/img.png)

    Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    Output: true

## Example 2:

![input2](src/CheckIfItIsStraightLine/img_1.png)

    Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
    Output: false

<br/>
<br/>

# [Problem No. 1281](src/SubtractTheProductAndSumOfDigitsOfAnInteger)
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

# [Problem No. 1290](src/ConvertBinaryNumberInLinkedListToInteger)
    Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. 
    The linked list holds the binary representation of a number.

    Return the decimal value of the number in the linked list.
    
    The most significant bit is at the head of the linked list.

## Example 1:

![img1.png](src/ConvertBinaryNumberInLinkedListToInteger/img1.png)

    Input: head = [1,0,1]
    Output: 5
    Explanation: (101) in base 2 = (5) in base 10

## Example 2:

    Input: head = [0]
    Output: 0

<br/>
<br/>

# [Problem No. 1309](src/DecryptStringFromAlphabetToIntegerMapping)
    You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

- Characters ('a' to 'i') are represented by ('1' to '9') respectively.
- Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

_Return the string formed after mapping._

The test cases are generated so that a unique mapping will always exist.




## Example 1:

    Input: s = "10#11#12"
    Output: "jkab"
    Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

## Example 2:

    Input: s = "1326#"
    Output: "acz"

<br/>
<br/>

# [Problem No. 1356](src/SortIntegersByTheNumberOf1Bits)
    You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary
    representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

    Return the array after sorting it.


## Example 1:

    Input: arr = [0,1,2,3,4,5,6,7,8]
    Output: [0,1,2,4,8,3,5,6,7]
    Explantion: [0] is the only integer with 0 bits.
                [1,2,4,8] all have 1 bit.
                [3,5,6] have 2 bits.
                [7] has 3 bits.
                The sorted array by bits is [0,1,2,4,8,3,5,6,7]

## Example 2:

    Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
    Output: [1,2,4,8,16,32,64,128,256,512,1024]
    Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.

<br/>
<br/>

# [Problem No. 1393](src/CapitalGainOrLoss)

# Table

    Stocks: 
            +---------------+---------+
            | Column Name   | Type    |
            +---------------+---------+
            | stock_name    | varchar |
            | operation     | enum    |
            | operation_day | int     |
            | price         | int     |
            +---------------+---------+

    (stock_name, operation_day) is the primary key for this table.
    The operation column is an ENUM of type ('Sell', 'Buy')
    Each row of this table indicates that the stock which has stock_name had an operation on the day operation_day with the price.
    It is guaranteed that each 'Sell' operation for a stock has a corresponding 'Buy' operation in a previous day. It is also guaranteed that each 'Buy' operation for a stock has a corresponding 'Sell' operation in an upcoming day.


<br/>

    Write an SQL query to report the Capital gain/loss for each stock.
    The Capital gain/loss of a stock is the total gain or loss after buying and selling the stock one or many times.
    Return the result table in any order.



## Example 1:

    Input: 

        Stocks table:
            +---------------+-----------+---------------+--------+
            | stock_name    | operation | operation_day | price  |
            +---------------+-----------+---------------+--------+
            | Leetcode      | Buy       | 1             | 1000   |
            | Corona Masks  | Buy       | 2             | 10     |
            | Leetcode      | Sell      | 5             | 9000   |
            | Handbags      | Buy       | 17            | 30000  |
            | Corona Masks  | Sell      | 3             | 1010   |
            | Corona Masks  | Buy       | 4             | 1000   |
            | Corona Masks  | Sell      | 5             | 500    |
            | Corona Masks  | Buy       | 6             | 1000   |
            | Handbags      | Sell      | 29            | 7000   |
            | Corona Masks  | Sell      | 10            | 10000  |
            +---------------+-----------+---------------+--------+

    

    Output:
            +---------------+-------------------+
            | stock_name    | capital_gain_loss |
            +---------------+-------------------+
            | Corona Masks  | 9500              |
            | Leetcode      | 8000              |
            | Handbags      | -23000            |
            +---------------+-------------------+

    Explanation: Leetcode stock was bought at day 1 for 1000$ and was sold at day 5 for 9000$. Capital gain = 9000 - 1000 = 8000$.
                 Handbags stock was bought at day 17 for 30000$ and was sold at day 29 for 7000$. Capital loss = 7000 - 30000 = -23000$.
                 Corona Masks stock was bought at day 1 for 10$ and was sold at day 3 for 1010$. It was bought again at day 4 for 1000$ and was sold at day 5 for 500$. 
                 At last, it was bought at day 6 for 1000$ and was sold at day 10 for 10000$. Capital gain/loss is the sum of capital gains/losses for each ('Buy' --> 'Sell') operation = (1010 - 10) + (500 - 1000) + (10000 - 1000) = 1000 - 500 + 9000 = 9500$.

<br/>
<br/>

# [Problem No. 1407](src/TopTravellers)

# Table

    Users: 
                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | id            | int     |
                | name          | varchar |
                +---------------+---------+

    id is the primary key for this table.
    name is the name of the user.



    Rides:
                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | id            | int     |
                | user_id       | int     |
                | distance      | int     |
                +---------------+---------+

    id is the primary key for this table.
    user_id is the id of the user who traveled the distance "distance".


<br/>

    Write an SQL query to report the distance traveled by each user.
    Return the result table ordered by travelled_distance in descending order, if two or more users traveled the same distance, order them by their name in ascending order.



## Example 1:

    Input: 

        Users table:
            +------+-----------+
            | id   | name      |
            +------+-----------+
            | 1    | Alice     |
            | 2    | Bob       |
            | 3    | Alex      |
            | 4    | Donald    |
            | 7    | Lee       |
            | 13   | Jonathan  |
            | 19   | Elvis     |
            +------+-----------+



        Rides table:
            +------+----------+----------+
            | id   | user_id  | distance |
            +------+----------+----------+
            | 1    | 1        | 120      |
            | 2    | 2        | 317      |
            | 3    | 3        | 222      |
            | 4    | 7        | 100      |
            | 5    | 13       | 312      |
            | 6    | 19       | 50       |
            | 7    | 7        | 120      |
            | 8    | 19       | 400      |
            | 9    | 7        | 230      |
            +------+----------+----------+

    

    Output:
            +----------+--------------------+
            | name     | travelled_distance |
            +----------+--------------------+
            | Elvis    | 450                |
            | Lee      | 450                |
            | Bob      | 317                |
            | Jonathan | 312                |
            | Alex     | 222                |
            | Alice    | 120                |
            | Donald   | 0                  |
            +----------+--------------------+

    Explanation: Elvis and Lee traveled 450 miles, Elvis is the top traveler as his name is alphabetically smaller than Lee.
                 Bob, Jonathan, Alex, and Alice have only one ride and we just order them by the total distances of the ride.
                 Donald did not have any rides, the distance traveled by him is 0.

<br/>
<br/>



# [Problem No. 1470](src/ShuffleTheArray)
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

# [Problem No. 1480](src/RunningSumOf1dArray)
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

# [Problem No. 1484](src/GroupSoldProductsByTheDate)

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

# [Problem No. 1491](src/AverageSalaryExcludingTheMinimumAndMaximumSalary)
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

# [Problem No. 1502](src/CanMakeArithmeticProgressionFromSequence)
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



# [Problem No. 1512](src/NumberOfGoodPairs)
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

# [Problem No. 1523](src/CountOddNumbersInAnIntervalRange)
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

# [Problem No. 1527](src/PatientsWithCondition)

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

# [Problem No. 1572](src/MatrixDiagonalSum)
    Given a square matrix mat, return the sum of the matrix diagonals.

    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.


## Example 1:

![img1.png](src/MatrixDiagonalSum/img1.png)

    Input: mat = [[1,2,3],
                  [4,5,6],
                  [7,8,9]]
    Output: 3
    Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
                 Because element mat[1][1] = 5 is counted only once.

## Example 2:

    Input: mat = [[1,1,1,1],
                  [1,1,1,1],
                  [1,1,1,1],
                  [1,1,1,1]]
    Output: 8

## Example 3:

    Input: mat = [[5]]
    Output: 5

<br/>
<br/>

# [Problem No. 1581](src/CustomerWhoVisitedButDidNotMakeAnyTransactions)

# Table
    Visits:
            +-------------+---------+
            | Column Name | Type    |
            +-------------+---------+
            | visit_id    | int     |
            | customer_id | int     |
            +-------------+---------+

    visit_id is the primary key for this table.
    This table contains information about the customers who visited the mall.


    Transactions:
                +----------------+---------+
                | Column Name    | Type    |
                +----------------+---------+
                | transaction_id | int     |
                | visit_id       | int     |
                | amount         | int     |
                +----------------+---------+

    transaction_id is the primary key for this table.
    This table contains information about the transactions made during the visit_id.

<br/>

    Write a SQL query to find the IDs of the users who visited without making any transactions and the number of times they made these types of visits.
    Return the result table sorted in any order.



## Example 1:

    Input: 

        Visits:
                +----------+-------------+
                | visit_id | customer_id |
                +----------+-------------+
                | 1        | 23          |
                | 2        | 9           |
                | 4        | 30          |
                | 5        | 54          |
                | 6        | 96          |
                | 7        | 54          |
                | 8        | 54          |
                +----------+-------------+


        Transactions:
                +----------------+----------+--------+
                | transaction_id | visit_id | amount |
                +----------------+----------+--------+
                | 2              | 5        | 310    |
                | 3              | 5        | 300    |
                | 9              | 5        | 200    |
                | 12             | 1        | 910    |
                | 13             | 2        | 970    |
                +----------------+----------+--------+

    Output:
            +-------------+----------------+
            | customer_id | count_no_trans |
            +-------------+----------------+
            | 54          | 2              |
            | 30          | 1              |
            | 96          | 1              |
            +-------------+----------------+


    Explanation: Customer with id = 23 visited the mall once and made one transaction during the visit with id = 12.
                 Customer with id = 9 visited the mall once and made one transaction during the visit with id = 13.
                 Customer with id = 30 visited the mall once and did not make any transactions.
                 Customer with id = 54 visited the mall three times. During 2 visits they did not make any transactions, and during one visit they made 3 transactions.
                 Customer with id = 96 visited the mall once and did not make any transactions.
                 
                 As we can see, users with IDs 30 and 96 visited the mall one time without making any transactions. Also, user 54 visited the mall twice and did not make any transactions.

<br/>
<br/>

# [Problem No. 1587](src/BankAccountSummary_II)

# Table

    Users: 
                +--------------+---------+
                | Column Name  | Type    |
                +--------------+---------+
                | account      | int     |
                | name         | varchar |
                +--------------+---------+

    account is the primary key for this table.
    Each row of this table contains the account number of each user in the bank.
    There will be no two users having the same name in the table.



    Transactions:
                +---------------+---------+
                | Column Name   | Type    |
                +---------------+---------+
                | trans_id      | int     |
                | account       | int     |
                | amount        | int     |
                | transacted_on | date    |
                +---------------+---------+

    trans_id is the primary key for this table.
    Each row of this table contains all changes made to all accounts.
    amount is positive if the user received money and negative if they transferred money.
    All accounts start with a balance of 0.


<br/>

    Write an SQL query to report the name and balance of users with a balance higher than 10000. The balance of an account is equal to the sum of the amounts of all transactions involving that account.
    Return the result table in any order.



## Example 1:

    Input: 

        Users table:
            +------------+--------------+
            | account    | name         |
            +------------+--------------+
            | 900001     | Alice        |
            | 900002     | Bob          |
            | 900003     | Charlie      |
            +------------+--------------+



        Transactions table:
            +------------+------------+------------+---------------+
            | trans_id   | account    | amount     | transacted_on |
            +------------+------------+------------+---------------+
            | 1          | 900001     | 7000       |  2020-08-01   |
            | 2          | 900001     | 7000       |  2020-09-01   |
            | 3          | 900001     | -3000      |  2020-09-02   |
            | 4          | 900002     | 1000       |  2020-09-12   |
            | 5          | 900003     | 6000       |  2020-08-07   |
            | 6          | 900003     | 6000       |  2020-09-07   |
            | 7          | 900003     | -4000      |  2020-09-11   |
            +------------+------------+------------+---------------+

    

    Output:
            +------------+------------+
            | name       | balance    |
            +------------+------------+
            | Alice      | 11000      |
            +------------+------------+

    Explanation: Alice's balance is (7000 + 7000 - 3000) = 11000.
                 Bob's balance is 1000.
                 Charlie's balance is (6000 + 6000 - 4000) = 8000.

<br/>
<br/>

# [Problem No. 1588](src/SumOfAllOddLengthSubarrays)
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

# [Problem No. 1667](src/FixNamesInTable)

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

# [Problem No. 1672](src/RichestCustomerWealth)
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


## Example 1:

    Input: accounts = [[1,2,3],[3,2,1]]
    Output: 2
    Explaination: 1st customer has wealth = 1 + 2 + 3 = 6
                  2nd customer has wealth = 3 + 2 + 1 = 6
                  Both customers are considered the richest with a wealth of 6 each, so return 6.

## Example 2:

    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explaination: 1st customer has wealth = 6
                  2nd customer has wealth = 10
                  3rd customer has wealth = 8
                  The 2nd customer is the richest with a wealth of 10.

## Example 3:

    Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
    Output: 17

<br/>
<br/>

# [Problem No. 1693](src/DailyLeadsAndPartners)

# Table

    Product: 
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | date_id     | date    |
                | make_name   | varchar |
                | lead_id     | int     |
                | partner_id  | int     |
                +-------------+---------+

    This table does not have a primary key.
    This table contains the date and the name of the product sold and the IDs of the lead and partner it was sold to.
    The name consists of only lowercase English letters.


<br/>

    Write an SQL query that will, for each date_id and make_name, return the number of distinct lead_id's and distinct partner_id's.
    Return the result table in any order.





## Example 1:

    Input: 

        DailySales table:
            +-----------+-----------+---------+------------+
            | date_id   | make_name | lead_id | partner_id |
            +-----------+-----------+---------+------------+
            | 2020-12-8 | toyota    | 0       | 1          |
            | 2020-12-8 | toyota    | 1       | 0          |
            | 2020-12-8 | toyota    | 1       | 2          |
            | 2020-12-7 | toyota    | 0       | 2          |
            | 2020-12-7 | toyota    | 0       | 1          |
            | 2020-12-8 | honda     | 1       | 2          |
            | 2020-12-8 | honda     | 2       | 1          |
            | 2020-12-7 | honda     | 0       | 1          |
            | 2020-12-7 | honda     | 1       | 2          |
            | 2020-12-7 | honda     | 2       | 1          |
            +-----------+-----------+---------+------------+


    

    Output:
            +-----------+-----------+--------------+-----------------+
            | date_id   | make_name | unique_leads | unique_partners |
            +-----------+-----------+--------------+-----------------+
            | 2020-12-8 | toyota    | 2            | 3               |
            | 2020-12-7 | toyota    | 1            | 2               |
            | 2020-12-8 | honda     | 2            | 2               |
            | 2020-12-7 | honda     | 3            | 2               |
            +-----------+-----------+--------------+-----------------+

    Explanation: For 2020-12-8, toyota gets leads = [0, 1] and partners = [0, 1, 2] while honda gets leads = [1, 2] and partners = [1, 2].
                 For 2020-12-7, toyota gets leads = [0] and partners = [1, 2] while honda gets leads = [0, 1, 2] and partners = [1, 2].

<br/>
<br/>

# [Problem No. 1729](src/FindFollowersCount)

# Table

    Followers:
            +-------------+------+
            | Column Name | Type |
            +-------------+------+
            | user_id     | int  |
            | follower_id | int  |
            +-------------+------+

    (user_id, follower_id) is the primary key for this table.
    This table contains the IDs of a user and a follower in a social media app where the follower follows the user.


<br/>

    Write an SQL query that will, for each user, return the number of followers.
    Return the result table ordered by user_id in ascending order.



## Example 1:

    Input: 

        Followers table:
            +---------+-------------+
            | user_id | follower_id |
            +---------+-------------+
            | 0       | 1           |
            | 1       | 0           |
            | 2       | 0           |
            | 2       | 1           |
            +---------+-------------+


    Output:
            +---------+----------------+
            | user_id | followers_count|
            +---------+----------------+
            | 0       | 1              |
            | 1       | 1              |
            | 2       | 2              |
            +---------+----------------+

    Explanation: The followers of 0 are {1}
                 The followers of 1 are {0}
                 The followers of 2 are {0,1}

<br/>
<br/>

# [Problem No. 1741](src/FindTotalTimeSpentByEachEmployee)

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

# [Problem No. 1757](src/RecyclableAndLowFatProducts)

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

# [Problem No. 1795](src/RearrangeProductsTable)

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

# [Problem No. 1822](src/SignOfTheProductOfAnArray)
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

# [Problem No. 1873](src/CalculateSpecialBonus)

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

# [Problem No. 1890](src/TheLatestLoginIn2020)

# Table

    Logins:
            +----------------+----------+
            | Column Name    | Type     |
            +----------------+----------+
            | user_id        | int      |
            | time_stamp     | datetime |
            +----------------+----------+

    (user_id, time_stamp) is the primary key for this table.
    Each row contains information about the login time for the user with ID user_id.


<br/>

    Write an SQL query to report the latest login for all users in the year 2020. Do not include the users who did not login in 2020.
    Return the result table in any order.



## Example 1:

    Input: 

        Logins table:
            +---------+---------------------+
            | user_id | time_stamp          |
            +---------+---------------------+
            | 6       | 2020-06-30 15:06:07 |
            | 6       | 2021-04-21 14:06:06 |
            | 6       | 2019-03-07 00:18:15 |
            | 8       | 2020-02-01 05:10:53 |
            | 8       | 2020-12-30 00:46:50 |
            | 2       | 2020-01-16 02:49:50 |
            | 2       | 2019-08-25 07:59:08 |
            | 14      | 2019-07-14 09:00:00 |
            | 14      | 2021-01-06 11:59:59 |
            +---------+---------------------+


    Output:
            +---------+---------------------+
            | user_id | last_stamp          |
            +---------+---------------------+
            | 6       | 2020-06-30 15:06:07 |
            | 8       | 2020-12-30 00:46:50 |
            | 2       | 2020-01-16 02:49:50 |
            +---------+---------------------+

    Explanation: User 6 logged into their account 3 times but only once in 2020, so we include this login in the result table.
                 User 8 logged into their account 2 times in 2020, once in February and once in December. We include only the latest one (December) in the result table.
                 User 2 logged into their account 2 times but only once in 2020, so we include this login in the result table.
                 User 14 did not login in 2020, so we do not include them in the result table.

<br/>
<br/>

# [Problem No. 1929](src/ConcatenationOfArray)
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

# [Problem No. 1965](src/EmployeesWithMissingInformation)

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


# [Problem No. 2011](src/FinalValueOfVariableAfterPerformingOperations)
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

# [Problem No. 2160](src/MinimumSumOfFourDigitNumberAfterSplittingDigits)
    You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
    
    For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
    
    Return the minimum possible sum of new1 and new2.



## Example 1:

    Input: num = 2932
    Output: 52
    Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
                 The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.

## Example 2:

    Input: num = 4009
    Output: 13
    Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
                 The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.

<br/>
<br/>


# [Problem No. 2235](src/AddTwoIntegers)
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

# [Problem No. 2413](src/SmallestEvenMultiple)
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

# [Problem No. 2469](src/ConvertTheTemperature)
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

# [Problem No. 2520](src/CountTheDigitsThatDivideNumber)
    Given an integer num, return the number of digits in num that divide num.

    An integer val divides nums if nums % val == 0.

## Example 1:

    Input: num = 7
    Output: 1
    Explanation: 7 divides itself, hence the answer is 1.


## Example 2:

    Input: num = 121
    Output: 2
    Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.


## Example 3:

    Input: num = 1248
    Output: 4
    Explanation: 1248 is divisible by all of its digits, hence the answer is 4.

<br/>
<br/>

# [Problem No. 2535](src/DifferenceBetweenElementSumAndDigitSumOfAnArray)
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