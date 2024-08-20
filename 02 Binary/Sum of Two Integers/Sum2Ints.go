package main

import "fmt"

func getSum(a int, b int) int {
	var temp int = a
	for (a & b) != 0 {
		temp = a
		a = a ^ b
		b = (temp & b) << 1
	}
	return a | b
}

func main() {
	var t int
	fmt.Scan(&t)
	for t > 0 {
		t--
		var a, b int
		fmt.Scan(&a)
		fmt.Scan(&b)
		fmt.Println(getSum(a, b))
	}
}
