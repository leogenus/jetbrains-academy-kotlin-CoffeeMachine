data class BankAccount(val deposited: Long, val withdrawn: Long) {
    val balance: Long = this.deposited - this.withdrawn
}
