package main

import "fmt"

func findMin(nums []int) int {
	n := len(nums)
	if n == 1 {
		return nums[0]
	}
	left, right, mid := 0, n-1, 0
	for left < right {
		mid = left + (right-left)/2
		switch {
		case nums[mid] < nums[right] && nums[mid] < nums[left]:
			right = mid
		case nums[mid] > nums[left] && nums[mid] < nums[right]:
			right = mid
		case nums[mid] == nums[left] && nums[left] < nums[right]:
			right = mid
		case nums[mid] > nums[left] && nums[mid] < nums[right]:
			left = mid + 1
		default:
			left = mid + 1
		}
	}
	return nums[left]
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
		fmt.Println(findMin(nums))
	}
}
