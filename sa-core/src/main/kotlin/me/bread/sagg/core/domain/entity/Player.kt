package me.bread.sagg.core.domain.entity

import me.bread.sagg.core.domain.enums.Weapon
import me.bread.sagg.core.domain.vo.MemberId

class Player(
    val memberId: MemberId,
    val teamId: Long,
    val nickname: String,
    val win: Int,
    val lose: Int,
    val draw: Int,
    val killCount: Map<Weapon, Int>,
    val gainScore: Int,
)
