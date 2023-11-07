fun createMemoFor(name: String): String {
    if (name == "Eve") {
        val memo = """Dear $name, a quick reminder about the 
            |party we have scheduled next Tuesday at
            |the 'Low ceremony Cafe's at Noon. | Plaese to...""".trimMargin()
        return memo
    }
    return ""
}
println(createMemoFor("Eve"))