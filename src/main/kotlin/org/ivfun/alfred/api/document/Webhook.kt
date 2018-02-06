package org.ivfun.alfred.api.document

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "webhooks")
data class Webhook
(
        @Id
        val id: String? = null,
        val ref: String? = null,
        val before: String? = null,
        val after: String? = null,
        val created : Boolean? = false,
        val deleted : Boolean? = false,
        val forced : Boolean? = false,
        val compare: String? = null,
        val head_commit: HeadCommit? = null,
        val repository: Repository? = null,
        val sender: Sender? = null
)

class HeadCommit
(
        val id: String? = null,
        val name: String? = null,
        val full_name: String? = null,
        val url: String? = null
)

data class Repository
(
        val id: String? = null,
        val message: String? = null,
        val timestamp: String? = null,
        val url: String? = null
)

data class Sender
(
        val id: String? = null,
        val login: String? = null,
        val avatar_url: String? = null
)