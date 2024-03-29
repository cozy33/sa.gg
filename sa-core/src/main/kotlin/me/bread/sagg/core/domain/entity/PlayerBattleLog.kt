package me.bread.sagg.core.domain.entity

import me.bread.sagg.core.domain.enums.KillOrDeath
import me.bread.sagg.core.domain.enums.Weapon
import me.bread.sagg.core.domain.vo.MemberId

class PlayerBattleLog(
    val memberId: MemberId,
    val teamId: Long,
    val round: Int,
    val killOrDeath: KillOrDeath,
    val position: Position,
    val time: String,
    val weapon: Weapon,
)
