package org.ivfun.alfred.api.service.impl

import org.ivfun.alfred.api.document.Webhook
import org.ivfun.alfred.api.repository.WebhookRepository
import org.ivfun.alfred.api.service.WebhookService
import org.springframework.stereotype.Service

@Service
class WebhookServiceImpl (val webhookRepository: WebhookRepository)
: WebhookService
{
    override fun save(webhook: Webhook): Webhook
    {
        if (!webhook.deleted!!)
        {
            return webhookRepository.save(webhook)
        }
        throw IllegalArgumentException("insert problems")
    }

}

