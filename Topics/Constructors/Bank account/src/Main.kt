// write the BankAccount class here
class BankAccount(_deposited: Long, _withdrawn: Long) {
    var deposited: Long = _deposited
    var withdrawn: Long = _withdrawn
    var balance = deposited - withdrawn
}