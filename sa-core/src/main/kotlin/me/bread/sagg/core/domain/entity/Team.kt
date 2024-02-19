package me.bread.sagg.core.domain.entity

import me.bread.sagg.core.domain.enums.WinLoseDraw
import me.bread.sagg.core.domain.vo.ClanId
import me.bread.sagg.core.domain.vo.MatchId

class Team(
    val clanId: ClanId,
    val matchId: MatchId,
    val winLoseDraw: WinLoseDraw,
    val winCount: Int,
    val loseCount: Int,
)
