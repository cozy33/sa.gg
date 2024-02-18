package me.bread.supplybase.core.domain.entity

import me.bread.supplybase.core.domain.enums.StartingPoint
import me.bread.supplybase.core.domain.vo.MatchId
import java.time.Instant

class Match(
    val id: MatchId,
    val teams: Map<StartingPoint, Team>,
    val createdAt: Instant,
    val updatedAt: Instant,
)
