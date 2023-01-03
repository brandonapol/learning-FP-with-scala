def abbreviate(name: String): String = {
    val firstName = name.substring(0, 1)
    val spaceIndex = name.indexOf(" ")
    val lastName = name.substring(spaceIndex + 1)
    firstName + ". " + lastName
}

