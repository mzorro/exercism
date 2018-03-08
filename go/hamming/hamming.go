package hamming

import (
	"errors"
)

func Distance(a, b string) (d int, e error) {
	if len(a) != len(b) {
		e = errors.New("must be same length")
	} else {
		for i := range a {
			if a[i] != b[i] {
				d++
			}
		}
	}
	return
}
