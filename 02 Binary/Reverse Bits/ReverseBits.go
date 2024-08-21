package main

import "fmt"

func reverseBits(n int) int {
	var result int
	for i := 0; i < 32; i++ {
		result |= (n & 1) << (31 - i)
		n >>= 1
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
		fmt.Println(reverseBits(n))
	}
}
