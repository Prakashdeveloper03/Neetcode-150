package main

import "fmt"

func productExceptSelf(nums []int) []int {
	n := len(nums)
	leftProduct := make([]int, n)
	rightProduct := make([]int, n)
	result := make([]int, n)
	for i := range leftProduct {
		leftProduct[i] = 1
		rightProduct[i] = 1
	}
	for i := 1; i < n; i++ {
		leftProduct[i] = leftProduct[i-1] * nums[i-1]
	}
	for i := n - 2; i >= 0; i-- {
		rightProduct[i] = rightProduct[i+1] * nums[i+1]
	}
	for i := 0; i < n; i++ {
		result[i] = leftProduct[i] * rightProduct[i]
	}
	return result
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
		result := productExceptSelf(nums)
		for _, v := range result {
			fmt.Printf("%d ", v)
		}
		fmt.Println()
	}
}
