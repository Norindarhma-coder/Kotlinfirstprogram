fun main(args: Array<String>) {
    // Morse code decoder
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")
    var message = ""
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    // Splitting the string into Morse characters
    val characters = s.split(" ")
    // Iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.toList().indexOf(morseChar) // Konversi array ke List untuk indexOf
        // Character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}