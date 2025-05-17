#!/usr/bin/env -S scala-cli shebang -q

//> using scala "3.6.2"

import scala.io.Source

val lines = Source.fromFile(args(0)).getLines().toList

lines
  .filter(_.contains("//chatglm.cn/"))
  .map(_.takeWhile(_ != ' '))
  .filterNot(_.contains(':')) // ipv4
  .map(_.split('.').drop(1).mkString("."))
  .groupBy(identity)
  .map((line, occurences) => (line, occurences.size))
  .toList
  .sortBy(-_._2)
  .filter(_._2 > 5)
  .foreach: (line, count) =>
    println(s"$count $line")
// .distinct
// .foreach(println)
