
val map = mapOf(
        'G' to 'C',
        'C' to 'G',
        'T' to 'A',
        'A' to 'U'
)

fun transcribeToRna(dna: String): String {
    return dna.map { c -> map.getOrDefault(c, c) }.joinToString("")
}
