package me.bread.core.domain.entity

import me.bread.core.domain.enums.WinLoseDraw
import me.bread.core.domain.vo.ClanId
import me.bread.core.domain.vo.MatchId

class Team(
    val clanId: ClanId,
    val matchId: MatchId,
    val winLoseDraw: WinLoseDraw,
    val winCount: Int,
    val loseCount: Int,
)
