package io.github.wulkanowy.messages.pojo

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val id: Long,
    val title: String,
    val content: String,
    val versionMin: Int? = null,
    val versionMax: Int? = null,
    val targetRegisterHost: String? = null,
    val type: MessageType,
)
