package me.bread.core.domain.entity

import me.bread.core.domain.enums.Weapon
import me.bread.core.domain.vo.ClanId
import me.bread.core.domain.vo.MemberId
import java.time.Instant

class Member(
    val id: MemberId,
    val nickname: String,
    val clanId: ClanId,
    val win: Int,
    val lose: Int,
    val draw: Int,
    val kills: Int,
    val deaths: Int,
    val mainWeapon: Weapon,
    val score: Int,
    val createdAt: Instant,
    val updatedAt: Instant,
    val deletedAt: Instant,
)
