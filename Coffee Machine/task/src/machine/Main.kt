package machine

import kotlin.system.exitProcess

private var inputWater = 400
private var inputMilk = 540
private var inputCoffeeBeans = 120
private var inputCups = 9
private var inputAmount = 550
private var inputAction = ""
private var inputBuyOption = 0

const val ACTION_BUY = "buy"
const val ACTION_FILL = "fill"
const val ACTION_TAKE = "take"
const val ACTION_REMAINING = "remaining"
const val ACTION_EXITS = "exit"

const val ACTION_BUY_ESPRESSO = 1
const val ACTION_BUY_LATTE = 2
const val ACTION_BUY_CAPPUCCINO = 3

fun main() {

    //displayMachineStatus()
    displayUserAction()

}

fun selectTakeOption() {
    println("I gave you $564")
    if (inputAmount >= 564) {
        inputAmount -= 564
    } else {
        //println("Sorry, not enough amount!")
        inputAmount = 0
    }

    displayUserAction()
}

fun selectFillOption() {

    println("Write how many ml of water you want to add:")
    print("")
    inputWater += readln().toInt()

    println("Write how many ml of milk you want to add :")
    print("")
    inputMilk += readln().toInt()

    println("Write how many grams of coffee beans you want to add:")
    print("")
    inputCoffeeBeans += readln().toInt()

    println("Write how many disposable cups you want to add:")
    print("")
    inputCups += readln().toInt()

    displayUserAction()

}

private fun displayMachineStatus() {
    println()
    println("The coffee machine has:")
    println("$inputWater ml of water")
    println("$inputMilk ml of milk")
    println("$inputCoffeeBeans g of coffee beans")
    println("$inputCups disposable cups")
    println("$$inputAmount of money")

    displayUserAction()

}

private fun displayUserAction() {
    println()
    println("Write action (buy, fill, take, remaining, exit): ")
    print("")
    inputAction = readln()

    when (inputAction) {
        ACTION_BUY -> {
            selectBuyOption()
        }

        ACTION_FILL -> {
            selectFillOption()
        }

        ACTION_TAKE -> {
            selectTakeOption()
        }

        ACTION_REMAINING -> {
            displayMachineStatus()
        }

        ACTION_EXITS -> {
            exitProcess(0)
        }

        else -> {
            println("Invalid option selected")
        }
    }

}

private fun selectBuyOption() {

    displayBuyOption()

    when (inputBuyOption) {
        ACTION_BUY_ESPRESSO -> {
            buyEspresso()
        }

        ACTION_BUY_LATTE -> {
            buyLatte()
        }

        ACTION_BUY_CAPPUCCINO -> {
            buyCappuccino()
        }

        else -> {
            println("invalid buy option")
        }
    }
}

fun buyEspresso() {

    if (validateResource(250, 0, 16, 1)) {
        inputWater -= 250
        inputMilk -= 0//no milk in Espresso
        inputCoffeeBeans -= 16
        inputCups -= 1
        inputAmount += 4
        println("I have enough resources, making you a coffee!")
    } else {
        noResourceMessage(250, 0, 16, 1)
    }

    displayUserAction()

}

fun buyLatte() {

    if (validateResource(350, 75, 20, 1)) {
        inputWater -= 350
        inputMilk -= 75
        inputCoffeeBeans -= 20
        inputCups -= 1
        inputAmount += 7
        println("I have enough resources, making you a coffee!")
        displayUserAction()
    } else {
        noResourceMessage(350, 75, 20, 1)
    }
    displayUserAction()
}

fun buyCappuccino() {

    if (validateResource(200, 100, 12, 1)) {
        inputWater -= 200
        inputMilk -= 100
        inputCoffeeBeans -= 12
        inputCups -= 1
        inputAmount += 6
        println("I have enough resources, making you a coffee!")
    } else {
        noResourceMessage(200, 100, 12, 1)
    }

    displayUserAction()

}

fun noResourceMessage(waterAmount: Int, milkAmount: Int, coffeeBeansAmount: Int, cupsAmount: Int) {

    if (inputWater < waterAmount) {
        println("Sorry, not enough water!")
    }
    if (inputMilk < milkAmount) {
        println("Sorry, not enough milk!")
    }
    if (inputCoffeeBeans < coffeeBeansAmount) {
        println("Sorry, not enough coffee beans!")
    }
    if (inputCups < cupsAmount) {
        println("Sorry, not enough cups!")
    }

}

fun validateResource(waterAmount: Int, milkAmount: Int, coffeeBeansAmount: Int, cupsAmount: Int): Boolean {
    return inputWater >= waterAmount &&
            inputMilk >= milkAmount &&
            inputCoffeeBeans >= coffeeBeansAmount &&
            inputCups >= cupsAmount
}

private fun displayBuyOption() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    print("")
    try {
        inputBuyOption = readln().toInt()
    } catch (e: Exception) {
        displayUserAction()
    }
}
