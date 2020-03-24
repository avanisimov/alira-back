package com.alira.back.events.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.*

@Document(collection = "events")
data class Event(
    @Id
    val id: UUID = UUID.randomUUID(),

    val createdDate: Instant = Instant.now(),
    val modificationDate: Instant = Instant.now(),
    val isDeleted: Boolean = false,

    val title: String = "",
    val description: String = "",

    val images: List<String> = emptyList(),

    val eventStartDate: Instant = Instant.now(),
    val eventEndDate: Instant = Instant.now(),
    val monetizationType: MonetizationType = MonetizationType.DEFAULT,
    val subjectType: EventSubjectType = EventSubjectType.DEFAULT,
    val place: Place? = null

)