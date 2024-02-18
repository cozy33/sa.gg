package me.bread.supplybase.core.domain.entity

import me.bread.supplybase.core.domain.enums.Weapon
import me.bread.supplybase.core.domain.vo.MemberId

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
