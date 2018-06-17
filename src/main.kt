/*

    powered by AginSquash, 2018

*/

fun main(args: Array<String>) {



    while (true)
    {
        help()
        print(">>")
        val enteredCom = readLine()
        when (enteredCom)
        {
            "1", "[1]" ->
            {
                println(PassGenMain(true, true, false, 12))
                BeforeMenu()
            }


            "2", "[2]" -> customPass()

            "exit", "9", "[9]" -> exit()

            else -> help()
        }

    }
}

fun customPass()
{
    println("Selected Custom Password\nEnter Length")
    print(">>")
    try {
        val length = readLine()!!.toLong()
        println("Length: $length")
        println("Use numbers? y/n")
        var isNum = false

        var enteredLine = readLine().toString()
        if ((enteredLine=="y")||(enteredLine =="Y"))
        {
            println("Numbers enabled")
            isNum = true
        }

        var isLett = false
        println("Use letters? y/n")
        enteredLine = readLine().toString()
        if ((enteredLine=="y")||(enteredLine =="Y"))
        {
            println("Letters enabled")
            isLett = true
        }

        var isSymb = false
        println("Use symbols? y/n")
        enteredLine = readLine().toString()
        if ((enteredLine=="y")||(enteredLine =="Y"))
        {
            println("Symbols enabled")
            isSymb = true
        }

        if ((isNum)||(isLett)||(isSymb))
        {
            println("Generated:\n")
            println(PassGenMain(isNum, isLett, isSymb, length))
        } else{
            println("Error: num = $isNum, let = $isLett, sym = $isSymb")
        }

        BeforeMenu()

    } catch (e: NumberFormatException) {
        println("Length error $e. Please use number")

    }


}

fun BeforeMenu()
{
    println("\nEnter to continue")
    readLine()
}

fun exit()
{

    System.exit(0)
}

fun help() {



    println("\n		[v 1.0] powered by AginSquash. Source code aviable on GitHub \n          https://github.com/AginSquash/OpenPassGen_console_kotlin\n\n")



    println("[1]  -  PassGen with defalut settings (Length: 12, Numbers: true, Letters: true, Symbols: false")
    println("[2]  -  Custom PassGen")

    println("[9]  -  Exit")
}
