package main

import "fmt"

func missingNumber(nums []int) int {
	xor := 0
	for i, num := range nums {
		xor = xor ^ (i + 1) ^ num
	}
	return xor
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
		fmt.Println(missingNumber(nums))
	}
}
