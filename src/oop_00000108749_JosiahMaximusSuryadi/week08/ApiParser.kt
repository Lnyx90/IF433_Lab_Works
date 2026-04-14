package oop_00000108749_JosiahMaximusSuryadi.week08

class ApiParser() {
    fun parseProduct(rawJson: Map<String, Any?>) : Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as? String ?: throw IllegalArgumentException()

        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

        val type = rawJson["type"] as? String
        return when (type) {
            "ELECTRONIC" -> {
                val warranty  = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
             else -> {
                 null
             }
        }
    }

    fun checkout(product: Product) {
        val (id, detail) = when (product) {
            is Electronic -> product.id to "${product.name} (Warranty ${product.warrantyMonths})"
            is Clothing -> product.id to "${product.name} (Size ${product.size})"
        }

        val transactionId = JavaPaymentService.processPayment(id)!!
        println("$transactionId -> $detail")
    }
}