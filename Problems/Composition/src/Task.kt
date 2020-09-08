data class OperatingSystem(var name: String = "")
data class DualBoot(
    var primaryOs: OperatingSystem = OperatingSystem(),
    var secondaryOs: OperatingSystem = OperatingSystem()
)
