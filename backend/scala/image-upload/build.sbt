scalaVersion := "2.12.6"
name := "image-upload"
organization := "com.fernandocejas.instapixel"
version := "1.0"

// No need to run tests while building jar
test in assembly := {}

// Assembly configuration
assemblyOutputPath in assembly := file(baseDirectory.value.getPath + "/target/" + name.value + ".jar")
assemblyMergeStrategy in assembly := {
  case PathList("reference.conf") => MergeStrategy.concat
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case _ => MergeStrategy.first
}