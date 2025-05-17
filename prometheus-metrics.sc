#!/usr/bin/env -S scala-cli shebang -q

//> using scala "3.5.2"

import scala.io.Source

val lines = Source.fromFile(args(0)).getLines().toList

lines
  .filterNot(_.startsWith("#"))
  .map(_.takeWhile(_ != '{'))
  .groupBy(identity)
  .map((line, occurences) => (line, occurences.size))
  .toList
  .sortBy(-_._2)
  .take(50)
  .foreach: (line, count) =>
    println(s"$count $line")

println("-----------------------")
println(lines.size + " lines in total")
