package com.msse.web.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.validation.constraints.NotNull
import java.beans.Transient

/**
 * Created by z001hk8 on 2/7/17.
 */

@Entity
class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id

    @NotNull
    String name

    @OneToMany
    List<Release> releases

}
