package ayds.ny3.newyorktimes.external.data.entities

const val NYT_LOGO_URL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVioI832nuYIXqzySD8cOXRZEcdlAj3KfxA62UEC4FhrHVe0f7oZXp3_mSFG7nIcUKhg&usqp=CAU"

data class NYTArtistInfo(
    val artist: String,
    var abstract: String,
    val url: String,
    val nytLogoUrl: String = NYT_LOGO_URL
)