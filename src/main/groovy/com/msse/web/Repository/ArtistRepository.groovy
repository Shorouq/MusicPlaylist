package com.msse.web.Repository

import com.msse.web.domain.Artist
import org.springframework.data.repository.CrudRepository

/**
 * Created by z001hk8 on 2/11/17.
 */
interface ArtistRepository extends CrudRepository<Artist, Long> {

}