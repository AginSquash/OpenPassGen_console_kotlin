/*

    powered by AginSquash, 2018

*/

import java.security.SecureRandom


fun PassGenMain(numEn: Boolean, letEn: Boolean, symEn: Boolean, length: Long): String {
    var pass = ""
    var much = length
    while (much != 0L) {
        val nlsR = SecureRandom()
        val nls = nlsR.nextInt(3)
        when (nls) {
            0 -> if (numEn == true) {
                pass = pass + NumGen()
            } else {
                much = much + 1
            }
            1 -> if (letEn == true) {
                pass = pass + LetGen()
            } else {
                much = much + 1
            }
            2 -> if (symEn == true) {
                pass = pass + SymGen()
            } else {
                much = much + 1
            }
        }
        much = much - 1
    }
    return pass
}

private fun NumGen(): String {
    val numR = SecureRandom()
    val num = numR.nextInt(10)
    return num.toString()
}

private fun LetGen(): String {
    var letter: Char
    val letR = SecureRandom()
    val let = letR.nextInt(52)
    letter = ' '
    when (let) {
        0 -> letter = 'Q'
        1 -> letter = 'W'
        2 -> letter = 'E'
        3 -> letter = 'R'
        4 -> letter = 'T'
        5 -> letter = 'Y'
        6 -> letter = 'U'
        7 -> letter = 'I'
        8 -> letter = 'O'
        9 -> letter = 'P'
        10 -> letter = 'A'
        11 -> letter = 'S'
        12 -> letter = 'D'
        13 -> letter = 'F'
        14 -> letter = 'G'
        15 -> letter = 'H'
        16 -> letter = 'J'
        17 -> letter = 'K'
        18 -> letter = 'L'
        19 -> letter = 'Z'
        20 -> letter = 'X'
        21 -> letter = 'C'
        22 -> letter = 'V'
        23 -> letter = 'B'
        24 -> letter = 'N'
        25 -> letter = 'M'
        26 -> letter = 'q'
        27 -> letter = 'w'
        28 -> letter = 'e'
        29 -> letter = 'r'
        30 -> letter = 't'
        31 -> letter = 'y'
        32 -> letter = 'u'
        33 -> letter = 'i'
        34 -> letter = 'o'
        35 -> letter = 'p'
        36 -> letter = 'a'
        37 -> letter = 's'
        38 -> letter = 'd'
        39 -> letter = 'f'
        40 -> letter = 'g'
        41 -> letter = 'h'
        42 -> letter = 'j'
        43 -> letter = 'k'
        44 -> letter = 'l'
        45 -> letter = 'z'
        46 -> letter = 'x'
        47 -> letter = 'c'
        48 -> letter = 'v'
        49 -> letter = 'b'
        50 -> letter = 'n'
        51 -> letter = 'm'
    }
    return letter.toString()

}

fun SymGen(): String {
    var symbol: Char
    val letR = SecureRandom()
    val let = letR.nextInt(15)
    symbol = ' '
    when (let) {
        0 -> symbol = '`'
        1 -> symbol = '!'
        2 -> symbol = '@'
        3 -> symbol = '$'
        4 -> symbol = '%'
        5 -> symbol = '^'
        6 -> symbol = '&'
        7 -> symbol = '*'
        8 -> symbol = '('
        9 -> symbol = ')'
        10 -> symbol = '-'
        11 -> symbol = '_'
        12 -> symbol = '+'
        13 -> symbol = '='
        14 -> symbol = '~'
    }
    return symbol.toString()
}