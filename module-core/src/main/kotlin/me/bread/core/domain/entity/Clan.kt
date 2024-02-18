package me.bread.core.domain.entity

import me.bread.core.domain.vo.ClanId
import java.time.LocalDateTime

class Clan(
    val id: ClanId,
    val clanNo: Long,
    val clanName: String,
    val winCount: Int,
    val loseCount: Int,
    val drawCount: Int,
    val innerClanMarkImgUrl: String,
    val outerClanMarkImgUrl: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deletedAt: LocalDateTime,
)
