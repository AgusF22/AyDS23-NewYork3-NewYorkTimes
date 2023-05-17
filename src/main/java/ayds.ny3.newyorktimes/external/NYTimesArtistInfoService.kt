package ayds.ny3.newyorktimes.external

import retrofit2.Response

interface NYTimesArtistInfoService {
    fun getArtistInfo(artist: String): NYTArtistInfo?
}

internal class NYTimesArtistInfoServiceImpl(
    private val newYorkTimesAPI: NYTimesAPI,
    private val newYorkTimesToArtistInfoResolver: NYTimesToArtistInfoResolver,
): NYTimesArtistInfoService {

    override fun getArtistInfo(artist: String): NYTArtistInfo? {
        val callResponse = getArtistInfoFromService(artist)
        return newYorkTimesToArtistInfoResolver.getArtistInfoFromExternalData(callResponse.body(), artist)
    }

    private fun getArtistInfoFromService(artistName: String): Response<String> {
        return newYorkTimesAPI.getArtistInfo(artistName).execute()
    }
}