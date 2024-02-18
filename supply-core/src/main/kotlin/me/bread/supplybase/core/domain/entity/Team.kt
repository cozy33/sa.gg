package me.bread.supplybase.core.domain.entity

import me.bread.supplybase.core.domain.enums.WinLoseDraw
import me.bread.supplybase.core.domain.vo.ClanId
import me.bread.supplybase.core.domain.vo.MatchId

class Team(
    val clanId: ClanId,
    val matchId: MatchId,
    val winLoseDraw: WinLoseDraw,
    val winCount: Int,
    val loseCount: Int,
)
