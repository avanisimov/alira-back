package com.alira.back.events

import com.alira.back.events.entity.Event
import com.alira.back.events.repository.EventsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/events")
class EventsController {

    @Autowired
    lateinit var eventsRepository: EventsRepository

    @GetMapping()
    fun getEvents(): ResponseEntity<GetEventsResponse> {
        return ResponseEntity.ok(
            GetEventsResponse(
                eventsRepository.findAll()
            )
        )
    }

}

data class GetEventsResponse(
    val items: List<Event>
)