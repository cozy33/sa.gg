package me.bread.core.domain.entity

import me.bread.core.domain.enums.Weapon
import me.bread.core.domain.vo.MemberId

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
