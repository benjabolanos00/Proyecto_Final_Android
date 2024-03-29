package uabc.ic.benjaminbolanos.proyectofinalandroid.pojo

import com.google.gson.annotations.SerializedName

class Participant (
    @SerializedName("assists"                        ) var assists                        : Int?     = null,
    @SerializedName("baronKills"                     ) var baronKills                     : Int?     = null,
    @SerializedName("bountyLevel"                    ) var bountyLevel                    : Int?     = null,
    @SerializedName("champExperience"                ) var champExperience                : Int?     = null,
    @SerializedName("champLevel"                     ) var champLevel                     : Int?     = null,
    @SerializedName("championId"                     ) var championId                     : Int?     = null,
    @SerializedName("championName"                   ) var championName                   : String?  = null,
    @SerializedName("championTransform"              ) var championTransform              : Int?     = null,
    @SerializedName("consumablesPurchased"           ) var consumablesPurchased           : Int?     = null,
    @SerializedName("damageDealtToBuildings"         ) var damageDealtToBuildings         : Int?     = null,
    @SerializedName("damageDealtToObjectives"        ) var damageDealtToObjectives        : Int?     = null,
    @SerializedName("damageDealtToTurrets"           ) var damageDealtToTurrets           : Int?     = null,
    @SerializedName("damageSelfMitigated"            ) var damageSelfMitigated            : Int?     = null,
    @SerializedName("deaths"                         ) var deaths                         : Int?     = null,
    @SerializedName("detectorWardsPlaced"            ) var detectorWardsPlaced            : Int?     = null,
    @SerializedName("doubleKills"                    ) var doubleKills                    : Int?     = null,
    @SerializedName("dragonKills"                    ) var dragonKills                    : Int?     = null,
    @SerializedName("eligibleForProgression"         ) var eligibleForProgression         : Boolean? = null,
    @SerializedName("firstBloodAssist"               ) var firstBloodAssist               : Boolean? = null,
    @SerializedName("firstBloodKill"                 ) var firstBloodKill                 : Boolean? = null,
    @SerializedName("firstTowerAssist"               ) var firstTowerAssist               : Boolean? = null,
    @SerializedName("firstTowerKill"                 ) var firstTowerKill                 : Boolean? = null,
    @SerializedName("gameEndedInEarlySurrender"      ) var gameEndedInEarlySurrender      : Boolean? = null,
    @SerializedName("gameEndedInSurrender"           ) var gameEndedInSurrender           : Boolean? = null,
    @SerializedName("goldEarned"                     ) var goldEarned                     : Int?     = null,
    @SerializedName("goldSpent"                      ) var goldSpent                      : Int?     = null,
    @SerializedName("individualPosition"             ) var individualPosition             : String?  = null,
    @SerializedName("inhibitorKills"                 ) var inhibitorKills                 : Int?     = null,
    @SerializedName("inhibitorTakedowns"             ) var inhibitorTakedowns             : Int?     = null,
    @SerializedName("inhibitorsLost"                 ) var inhibitorsLost                 : Int?     = null,
    @SerializedName("item0"                          ) var item0                          : Int?     = null,
    @SerializedName("item1"                          ) var item1                          : Int?     = null,
    @SerializedName("item2"                          ) var item2                          : Int?     = null,
    @SerializedName("item3"                          ) var item3                          : Int?     = null,
    @SerializedName("item4"                          ) var item4                          : Int?     = null,
    @SerializedName("item5"                          ) var item5                          : Int?     = null,
    @SerializedName("item6"                          ) var item6                          : Int?     = null,
    @SerializedName("itemsPurchased"                 ) var itemsPurchased                 : Int?     = null,
    @SerializedName("killingSprees"                  ) var killingSprees                  : Int?     = null,
    @SerializedName("kills"                          ) var kills                          : Int?     = null,
    @SerializedName("lane"                           ) var lane                           : String?  = null,
    @SerializedName("largestCriticalStrike"          ) var largestCriticalStrike          : Int?     = null,
    @SerializedName("largestKillingSpree"            ) var largestKillingSpree            : Int?     = null,
    @SerializedName("largestMultiKill"               ) var largestMultiKill               : Int?     = null,
    @SerializedName("longestTimeSpentLiving"         ) var longestTimeSpentLiving         : Int?     = null,
    @SerializedName("magicDamageDealt"               ) var magicDamageDealt               : Int?     = null,
    @SerializedName("magicDamageDealtToChampions"    ) var magicDamageDealtToChampions    : Int?     = null,
    @SerializedName("magicDamageTaken"               ) var magicDamageTaken               : Int?     = null,
    @SerializedName("neutralMinionsKilled"           ) var neutralMinionsKilled           : Int?     = null,
    @SerializedName("nexusKills"                     ) var nexusKills                     : Int?     = null,
    @SerializedName("nexusLost"                      ) var nexusLost                      : Int?     = null,
    @SerializedName("nexusTakedowns"                 ) var nexusTakedowns                 : Int?     = null,
    @SerializedName("objectivesStolen"               ) var objectivesStolen               : Int?     = null,
    @SerializedName("objectivesStolenAssists"        ) var objectivesStolenAssists        : Int?     = null,
    @SerializedName("participantId"                  ) var participantId                  : Int?     = null,
    @SerializedName("pentaKills"                     ) var pentaKills                     : Int?     = null,
    @SerializedName("perks"                          ) var perks                          : Perks?   = Perks(),
    @SerializedName("physicalDamageDealt"            ) var physicalDamageDealt            : Int?     = null,
    @SerializedName("physicalDamageDealtToChampions" ) var physicalDamageDealtToChampions : Int?     = null,
    @SerializedName("physicalDamageTaken"            ) var physicalDamageTaken            : Int?     = null,
    @SerializedName("profileIcon"                    ) var profileIcon                    : Int?     = null,
    @SerializedName("puuid"                          ) var puuid                          : String?  = null,
    @SerializedName("quadraKills"                    ) var quadraKills                    : Int?     = null,
    @SerializedName("riotIdName"                     ) var riotIdName                     : String?  = null,
    @SerializedName("riotIdTagline"                  ) var riotIdTagline                  : String?  = null,
    @SerializedName("role"                           ) var role                           : String?  = null,
    @SerializedName("sightWardsBoughtInGame"         ) var sightWardsBoughtInGame         : Int?     = null,
    @SerializedName("spell1Casts"                    ) var spell1Casts                    : Int?     = null,
    @SerializedName("spell2Casts"                    ) var spell2Casts                    : Int?     = null,
    @SerializedName("spell3Casts"                    ) var spell3Casts                    : Int?     = null,
    @SerializedName("spell4Casts"                    ) var spell4Casts                    : Int?     = null,
    @SerializedName("summoner1Casts"                 ) var summoner1Casts                 : Int?     = null,
    @SerializedName("summoner1Id"                    ) var summoner1Id                    : Int?     = null,
    @SerializedName("summoner2Casts"                 ) var summoner2Casts                 : Int?     = null,
    @SerializedName("summoner2Id"                    ) var summoner2Id                    : Int?     = null,
    @SerializedName("summonerId"                     ) var summonerId                     : String?  = null,
    @SerializedName("summonerLevel"                  ) var summonerLevel                  : Int?     = null,
    @SerializedName("summonerName"                   ) var summonerName                   : String?  = null,
    @SerializedName("teamEarlySurrendered"           ) var teamEarlySurrendered           : Boolean? = null,
    @SerializedName("teamId"                         ) var teamId                         : Int?     = null,
    @SerializedName("teamPosition"                   ) var teamPosition                   : String?  = null,
    @SerializedName("timeCCingOthers"                ) var timeCCingOthers                : Int?     = null,
    @SerializedName("timePlayed"                     ) var timePlayed                     : Int?     = null,
    @SerializedName("totalDamageDealt"               ) var totalDamageDealt               : Int?     = null,
    @SerializedName("totalDamageDealtToChampions"    ) var totalDamageDealtToChampions    : Int?     = null,
    @SerializedName("totalDamageShieldedOnTeammates" ) var totalDamageShieldedOnTeammates : Int?     = null,
    @SerializedName("totalDamageTaken"               ) var totalDamageTaken               : Int?     = null,
    @SerializedName("totalHeal"                      ) var totalHeal                      : Int?     = null,
    @SerializedName("totalHealsOnTeammates"          ) var totalHealsOnTeammates          : Int?     = null,
    @SerializedName("totalMinionsKilled"             ) var totalMinionsKilled             : Int?     = null,
    @SerializedName("totalTimeCCDealt"               ) var totalTimeCCDealt               : Int?     = null,
    @SerializedName("totalTimeSpentDead"             ) var totalTimeSpentDead             : Int?     = null,
    @SerializedName("totalUnitsHealed"               ) var totalUnitsHealed               : Int?     = null,
    @SerializedName("tripleKills"                    ) var tripleKills                    : Int?     = null,
    @SerializedName("trueDamageDealt"                ) var trueDamageDealt                : Int?     = null,
    @SerializedName("trueDamageDealtToChampions"     ) var trueDamageDealtToChampions     : Int?     = null,
    @SerializedName("trueDamageTaken"                ) var trueDamageTaken                : Int?     = null,
    @SerializedName("turretKills"                    ) var turretKills                    : Int?     = null,
    @SerializedName("turretTakedowns"                ) var turretTakedowns                : Int?     = null,
    @SerializedName("turretsLost"                    ) var turretsLost                    : Int?     = null,
    @SerializedName("unrealKills"                    ) var unrealKills                    : Int?     = null,
    @SerializedName("visionScore"                    ) var visionScore                    : Int?     = null,
    @SerializedName("visionWardsBoughtInGame"        ) var visionWardsBoughtInGame        : Int?     = null,
    @SerializedName("wardsKilled"                    ) var wardsKilled                    : Int?     = null,
    @SerializedName("wardsPlaced"                    ) var wardsPlaced                    : Int?     = null,
    @SerializedName("win"                            ) var win                            : Boolean? = null
){
}