package ayds.ny3.newyorktimes.external

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object NYTimesArtistInfoServiceInjector {

    private const val NEW_YORK_TIMES_URL = "https://api.nytimes.com/svc/search/v2/"
    private val newYorkTimesRetrofit = buildRetrofit()

    private val newYorkTimesAPI: NYTimesAPI = newYorkTimesRetrofit.create(NYTimesAPI::class.java)
    private val newYorkTimesToArtistInfoResolver: NYTimesToArtistInfoResolver = JsonToArtistInfoResolver()

    val newYorkTimesArtistInfoServiceImpl: NYTimesArtistInfoService = NYTimesArtistInfoServiceImpl(
        newYorkTimesAPI,
        newYorkTimesToArtistInfoResolver
    )

    private fun buildRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(NEW_YORK_TIMES_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }

}