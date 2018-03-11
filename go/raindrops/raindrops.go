package raindrops

import (
	"strconv"
	"strings"
)

func Convert(n int) string {
	sb := strings.Builder{}

	if n%3 == 0 {
		sb.WriteString("Pling")
	}
	if n%5 == 0 {
		sb.WriteString("Plang")
	}
	if n%7 == 0 {
		sb.WriteString("Plong")
	}
	if sb.Len() == 0 {
		sb.WriteString(strconv.Itoa(n))
	}
	return sb.String()
}
