# Pattern 1 - Character Triangle

## Problem Description
Print a triangle pattern using characters (A-Z).

## Solution
This solution prints a triangle where each row `i` contains characters from 'A' to 'A'+i.

### Output Example:


## Complexity Analysis
- **Time Complexity:** O(n²) - nested loops iterate through n rows and increasing number of columns
- **Space Complexity:** O(1) - only using constant extra space

## Approach
- Outer loop iterates from 1 to n (number of rows)
- Inner loop prints characters from 'A' to 'A'+i for each row
- Simple character arithmetic used to generate the pattern
- char A in int value is 65 so if we add +1 value each it become B then C.... to Z 
- In char a value is different it 97 but work same