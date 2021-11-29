# BINARY SEARCH

##### Binary search is a textbook algorithm based on the idea to compare the target value to the middle element of the array.

[![](img)](https://coderscat.com/images/binary-search-algo-01.jpg)

- If the target value is smaller - continue to search on the left.
- If the target value is larger - continue to search on the right.
- If the target value is equal to the middle element - we're done.

## Algorithm

Initialise left and right pointers : left = 0, right = n - 1.

While left <= right :

Compare middle element of the array nums[pivot] to the target value target.

If the middle element is the target target = nums[pivot] : return pivot.

If the target is not yet found :

If target < nums[pivot], continue the search on the left right = pivot - 1.

Else continue the search on the right left = pivot + 1.
