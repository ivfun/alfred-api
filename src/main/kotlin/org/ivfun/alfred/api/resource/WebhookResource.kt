package org.ivfun.alfred.api.resource

import org.ivfun.alfred.api.document.Webhook
import org.ivfun.alfred.api.service.WebhookService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["webhook"])
class WebhookResource(val webhookService : WebhookService)
{

    @RequestMapping(method = [RequestMethod.POST])
    fun save(@RequestBody webhook: Webhook) :Webhook?
    {
       return webhookService.save(webhook)
    }
}