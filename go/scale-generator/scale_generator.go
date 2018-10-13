package scale

import (
	"strings"
)

type Tonic struct {
	int
}

var tonicsWithSharp = [12]string{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"}
var tonicsWithFlat = [12]string{"A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab"}

func indexOf(arr []string, elem string) int {
	for i, e := range arr {
		if e == elem {
			return i
		}
	}
	return -1
}

func useSharp(tonic string) bool {
	for _, t := range []string{"C", "G", "D", "A", "E", "B", "F#", "a", "e", "b", "f#", "c#", "g#", "d#"} {
		if t == tonic {
			return true
		}
	}
	return false
}

var defaultInterval = strings.Repeat("m", 12)

func Scale(tonic, interval string) []string {
	if len(interval) == 0 {
		interval = defaultInterval
	}

	var tonics [12]string
	if useSharp(tonic) {
		tonics = tonicsWithSharp
	} else {
		tonics = tonicsWithFlat
	}
	tonic = strings.ToUpper(tonic[:1]) + tonic[1:]

	var result []string
	start := indexOf(tonics[:], tonic)
	for _, c := range interval {
		var v int
		switch c {
		case 'm': v = 1
		case 'M': v = 2
		case 'A': v = 3
		}
		result = append(result, tonics[start])
		start = (start + v) % 12
	}
	return result
}
