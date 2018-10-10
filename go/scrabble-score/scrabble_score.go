package scrabble

import "unicode"

func initMap() map[rune]int {
	m := make(map[rune]int)
	for _, c := range "AEIOULNRST" { m[c] = 1 }
	for _, c := range "DG"         { m[c] = 2 }
	for _, c := range "BCMP"       { m[c] = 3 }
	for _, c := range "FHVWY"      { m[c] = 4 }
	for _, c := range "K"          { m[c] = 5 }
	for _, c := range "JX"         { m[c] = 8 }
	for _, c := range "QZ"         { m[c] = 10 }
	return m
}

var m = initMap()

func Score(s string) int {
	sum := 0
	for _, c := range s {
		sum += m[unicode.ToUpper(c)]
	}
	return sum
}