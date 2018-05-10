//Control Structures

/**Create An Account Class
 * - create a property of type BigDecimal called balance with an initial value of 0.0
 * - create a method called deposit
 * - use a conditional structure to check if the amount being passed is less than zero
 * If it is we should catch this case because we don't want to deposit negative numbers.
 * In this case throw an exception.*/

class AccountClass {
    BigDecimal balance = 0.0

    def deposit(BigDecimal value) {
        if (value < 0) {
            throw new Exception("Deposit amount must be > 0")
        }
        balance += value
    }
/**
 * Create another method called deposit that takes a list of amounts
 * use a for loop to loop over these amounts and call deposit*/
    def deposit(List amounts) {
        for (amount in amounts) {
            deposit(amount)
        }
    }
}
/**
 * Now that we have our class let's test it out.
 * You can do all of this in the same file
 * Create an instance of the account class
 * deposit a valid amount
 * deposit an invalid amount (what happens?)
 * try / catch on invalid amounts
 * deposit a list of amounts.*/

AccountClass account1 = new AccountClass()
account1.deposit(300)
println account1.balance
try {
    account1.deposit([300, 4, 0, 12, 0.3])
} catch (Exception e) {
    println e.message
}

println account1.balance


def text = "Now that we have our class let's test it out."

def result = (text.contains("test")) ? "hello" : "nothing"
println result
result = (text.contains("test")) ? "hello" : null
println result

result = (text.contains("testing")) ?: "nothing"
println result