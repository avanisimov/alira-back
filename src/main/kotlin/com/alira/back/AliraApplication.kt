package com.alira.back

import com.alira.back.events.entity.Event
import com.alira.back.events.repository.EventsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.ZoneId
import java.time.ZonedDateTime


fun main(args: Array<String>) {
    runApplication<AliraApplication>(*args)
}

@SpringBootApplication
class AliraApplication : CommandLineRunner {

    @Autowired
    lateinit var eventsRepository: EventsRepository

    override fun run(vararg args: String?) {
        eventsRepository.deleteAll()
        eventsRepository.save(
            Event(
                title = "Балет без границ",
                eventStartDate = ZonedDateTime.of(2020, 3, 12, 10, 0, 0, 0, ZoneId.of("UTC+3")).toInstant(),
                eventEndDate = ZonedDateTime.of(2020, 3, 12, 10, 0, 0, 0, ZoneId.of("UTC+3")).toInstant(),
                images = listOf(
                    "https://www.bolshoi.ru/upload/iblock/1ed/1ed4bc57ccc08cb5341b78d52eaf54d9.jpg",
                    "https://www.bolshoi.ru/upload/iblock/9a5/9a52294dbfe8ceedff47f9bf7a747dc6.jpg",
                    "https://www.bolshoi.ru/upload/iblock/197/19707f7a6b47f3f925269a3fc036bae6.jpg"
                )
            )
        )
        eventsRepository.save(
            Event(
                title = "Эффективные технологии в образовании детей с РАЗ",
                eventStartDate = ZonedDateTime.of(2020, 4, 2, 10, 0, 0, 0, ZoneId.of("UTC+3")).toInstant(),
                eventEndDate = ZonedDateTime.of(2020, 4, 2, 10, 0, 0, 0, ZoneId.of("UTC+3")).toInstant(),
                images = listOf(
                    "https://www.bolshoi.ru/upload/iblock/1ed/1ed4bc57ccc08cb5341b78d52eaf54d9.jpg",
                    "https://www.bolshoi.ru/upload/iblock/9a5/9a52294dbfe8ceedff47f9bf7a747dc6.jpg",
                    "https://www.bolshoi.ru/upload/iblock/197/19707f7a6b47f3f925269a3fc036bae6.jpg"
                )
            )
        )
    }
}