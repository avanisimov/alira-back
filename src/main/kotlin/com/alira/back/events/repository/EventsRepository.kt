package com.alira.back.events.repository

import com.alira.back.events.entity.Event
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface EventsRepository : MongoRepository<Event, UUID>