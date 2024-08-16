package main

import "fmt"

func maxProfit(prices []int) int {
	var length, min_price, max_profit int = len(prices), prices[0], 0
	if prices == nil || length == 0 {
		return 0
	}
	for i := 1; i < length; i++ {
		if prices[i] <= min_price {
			min_price = prices[i]
			continue
		}
		max_profit = max(prices[i]-min_price, max_profit)
	}
	return max_profit
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
		fmt.Println(maxProfit(nums))
	}
}
