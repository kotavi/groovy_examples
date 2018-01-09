import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance = 0.0
    String type

    BigDecimal deposit(BigDecimal value) {
        balance += value
    }

    BigDecimal withdraw(BigDecimal value) {
        balance -= value
    }

    BigDecimal plus(Account other) {
        this.balance + other.balance
    }


// Replacing this code by '@ToString'
//    String toString() {
//        "Account Balance: $balance"
//    }

}

Account savings = new Account(balance: 100.00)
Account checking = new Account(balance: 500.00)

println savings
println checking
println savings + checking

Account checking2 = new Account(type:"Checking")
checking2.deposit(100.00)
println checking2
Account savings2 = new Account(type:"Savings")
savings2.deposit(50.00)
println savings2
savings2.withdraw(20.00)
println savings2