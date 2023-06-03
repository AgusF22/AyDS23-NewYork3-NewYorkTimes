package ayds.ny3.newyorktimes.external.data.tracks

import ayds.ny3.newyorktimes.external.NYTimesArtistInfoService
import ayds.ny3.newyorktimes.external.data.entities.NYTArtistInfo
import retrofit2.Response

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