package main

import "fmt"

func search(nums []int, target int) int {
	var n int = len(nums)
	var left, right, mid int = 0, n - 1, 0
	for left <= right {
		mid = left + (right-left)/2
		if nums[mid] == target {
			return mid
		}
		switch {
		case nums[left] <= nums[mid]:
			if nums[left] <= target && target < nums[mid] {
				right = mid - 1
			} else {
				left = mid + 1
			}
		default:
			if nums[mid] < target && target <= nums[right] {
				left = mid + 1
			} else {
				right = mid - 1
			}
		}
	}
	return -1
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		var n int
		fmt.Scan(&n)
		nums := make([]int, n)
		for i := 0; i < n; i++ {
			fmt.Scan(&nums[i])
		}
		var target int
		fmt.Scan(&target)
		fmt.Printf("%d ", search(nums, target))
		fmt.Println()
	}
}
