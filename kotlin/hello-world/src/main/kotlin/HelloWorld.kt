fun hello(name: String = ""): String {
    return "Hello, ${if (name.trim() == "") "World" else name}!"
}
