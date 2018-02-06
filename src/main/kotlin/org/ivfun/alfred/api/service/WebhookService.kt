package org.ivfun.alfred.api.service

import org.ivfun.alfred.api.document.Webhook

interface WebhookService
{
    fun save(webhook: Webhook): Webhook
}