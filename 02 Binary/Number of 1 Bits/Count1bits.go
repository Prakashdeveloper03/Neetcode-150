package main

import "fmt"

func hammingWeight(n int) int {
	b := fmt.Sprintf("%b", n)
	var count int
	for _, v := range b {
		if v == '1' {
			count++
		}
	}
	return count
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		var n int
		fmt.Scan(&n)
		fmt.Println(hammingWeight(n))
	}
}
