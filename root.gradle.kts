plugins {
    id("fabric-loom") version "1.5-SNAPSHOT" apply false
    id("com.replaymod.preprocess") version "fad42fb94c"
}

preprocess {
    // Here you define all versions you're supporting
    val mc12004 = createNode("1.20.4", 12004, "yarn")
    val mc12002 = createNode("1.20.2", 12002, "yarn")

    mc12004.link(mc12002)
}
