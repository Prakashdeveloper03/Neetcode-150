package main

import "fmt"

func duplicates(nums []int) bool {
	counter := make(map[int]int)
	for _, x := range nums {
		if counter[x] >= 1 {
			return true
		}
		counter[x]++
	}
	return false
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
		fmt.Println(duplicates(nums))
	}
}
