fun Date?.customFormat(): String? {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH-mm-ssZZZ", Locale.getDefault())
    if(this != null) {
        return formatter.format(this) // this hace referencia al Date
    }
    return  null
}

val Date.formatSize: Int
    get() = this.customFormat()?.length ?: 0
    // el ? es para dejar algo en nulo