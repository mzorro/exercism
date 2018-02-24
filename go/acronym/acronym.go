// Package acronym should have a package comment that summarizes what it's about.
// https://golang.org/doc/effective_go.html#commentary
package acronym

import (
	"regexp"
	"strings"
)

// Abbreviate should have a comment documenting it.
func Abbreviate(s string) string {
	var abbr []byte
	for _, part := range regexp.MustCompile("[^A-Z]+").Split(strings.ToUpper(s), -1) {
		abbr = append(abbr, part[0])
	}
	return string(abbr)
}
