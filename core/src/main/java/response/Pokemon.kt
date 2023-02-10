package response

data class Pokemon
    (private val imageUrl: String,
     val number: String,
     val name: String,
     val types: List<PokemonTypes>
)
