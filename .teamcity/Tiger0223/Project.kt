package Tiger0223

import Tiger0223.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0223")
    name = "Tiger0223"

    vcsRoot(Tiger0223_cVCSroot)
})
