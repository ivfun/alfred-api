package org.ivfun.alfred.api.repository

import org.ivfun.alfred.api.document.Webhook
import org.springframework.data.mongodb.repository.MongoRepository

interface WebhookRepository: MongoRepository<Webhook, String>
{
}