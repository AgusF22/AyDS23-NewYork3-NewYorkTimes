package ayds.ny3.newyorktimes.external

import ayds.ny3.newyorktimes.external.data.entities.NYTArtistInfo

interface NYTimesArtistInfoService {
    fun getArtistInfo(artist: String): NYTArtistInfo?
}