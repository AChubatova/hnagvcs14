package Tiger010

import Tiger010.buildTypes.*
import Tiger010.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger010")
    name = "Tiger010"

    vcsRoot(Tiger010_cVCSroot)

    buildType(Tiger010_Hi3)
    buildType(Tiger010_Hi2)
    buildType(Tiger010_Hi1)
    buildType(Tiger010_Hi0)

    subProject(Tiger01048.Project)
    subProject(Tiger01049.Project)
    subProject(Tiger01044.Project)
    subProject(Tiger01045.Project)
    subProject(Tiger01046.Project)
    subProject(Tiger01047.Project)
    subProject(Tiger01040.Project)
    subProject(Tiger01041.Project)
    subProject(Tiger01042.Project)
    subProject(Tiger01043.Project)
    subProject(Tiger01019.Project)
    subProject(Tiger01015.Project)
    subProject(Tiger01016.Project)
    subProject(Tiger01017.Project)
    subProject(Tiger01018.Project)
    subProject(Tiger01011.Project)
    subProject(Tiger01012.Project)
    subProject(Tiger01013.Project)
    subProject(Tiger01014.Project)
    subProject(Tiger01010.Project)
    subProject(Tiger0108.Project)
    subProject(Tiger0109.Project)
    subProject(Tiger0100.Project)
    subProject(Tiger01026.Project)
    subProject(Tiger0101.Project)
    subProject(Tiger01027.Project)
    subProject(Tiger0102.Project)
    subProject(Tiger01028.Project)
    subProject(Tiger01029.Project)
    subProject(Tiger0103.Project)
    subProject(Tiger01022.Project)
    subProject(Tiger0104.Project)
    subProject(Tiger01023.Project)
    subProject(Tiger0105.Project)
    subProject(Tiger01024.Project)
    subProject(Tiger0106.Project)
    subProject(Tiger01025.Project)
    subProject(Tiger0107.Project)
    subProject(Tiger01020.Project)
    subProject(Tiger01021.Project)
    subProject(Tiger01037.Project)
    subProject(Tiger01038.Project)
    subProject(Tiger01039.Project)
    subProject(Tiger01033.Project)
    subProject(Tiger01034.Project)
    subProject(Tiger01035.Project)
    subProject(Tiger01036.Project)
    subProject(Tiger01030.Project)
    subProject(Tiger01031.Project)
    subProject(Tiger01032.Project)
})
