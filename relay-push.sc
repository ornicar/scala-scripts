#!/usr/bin/env -S scala-cli shebang -q

//> using scala "3.8.4"
//> using toolkit default

import sttp.client4.quick.*
import sttp.client4.Response

val token = "lip_fFprgYfDCC99uQoUksVI"
val roundId = "elsxDLDE"

val response: Response[String] = quickRequest
  .post(uri"http://l.org/api/broadcast/round/$roundId/push")
  .header("Authorization", s"Bearer $token")
  .body(pgn)
  .send()

println(response.body)

def pgn = """
[Event "2026 Ontario Open Crown"]
[Site "Canada"]
[Date "2026.05.18"]
[Round "6.11"]
[White "Kola, Venkat Karthikeya Reddy"]
[Black "Momin, Fayzan"]
[Result "1-0"]
[TimeControl "90min+30sec"]
[WhiteTitle "CM"]
[BlackTitle "-"]
[WhiteFideId "-"]
[BlackFideId "-"]
[WhiteElo "-"]
[BlackElo "-"]

1. d4 {[%clk 01:26:36]} d5 {[%clk 01:30:47]} 2. Nc3 {[%clk 01:25:38]} Nf6 3.
Bf4 {[%clk 01:26:02]} c5 {[%clk 01:30:40]} 4. e3 {[%clk 01:26:23]} cxd4 {[%clk
01:31:02]} 5. exd4 {[%clk 01:26:53]} a6 {[%clk 01:31:29]} 6. Nf3 {[%clk
01:27:15]} Bg4 {[%clk 01:31:53]} 7. Be2 {[%clk 01:26:39]} Nc6 {[%clk 01:32:15]}
8. O-O {[%clk 01:27:01]} e6 {[%clk 01:32:41]} 9. h3 {[%clk 01:27:26]} Bxf3
{[%clk 01:33:04]} 10. Bxf3 {[%clk 01:27:54]} Bd6 {[%clk 01:33:26]} 11. Ne2
{[%clk 01:26:57]} O-O {[%clk 01:33:38]} 12. c3 {[%clk 01:27:23]} b5 {[%clk
01:32:54]} 13. a4 {[%clk 01:24:58]} Na5 {[%clk 01:32:09]} 14. Bd2 {[%clk
01:05:06]} Qc7 {[%clk 01:32:17]} 15. b3 {[%clk 01:05:01]} Rab8 {[%clk
01:32:15]} 16. axb5 {[%clk 01:04:53]} axb5 {[%clk 01:32:36]} 17. c4 {[%clk
01:05:02]} Nc6 {[%clk 01:29:36]} 18. c5 {[%clk 01:05:13]} Be7 {[%clk 01:30:05]}
19. Bf4 {[%clk 01:04:10]} e5 {[%clk 01:30:16]} 20. dxe5 {[%clk 01:04:09]} Nxe5
{[%clk 01:30:41]} 21. Qd4 Nfd7 {[%clk 01:30:11]} 22. c6 {[%clk 01:01:21]} Nxf3+
{[%clk 01:30:23]} 23. gxf3 {[%clk 01:01:43]} Qxc6 {[%clk 01:30:28]} 24. Bxb8
{[%clk 01:00:04]} Rxb8 {[%clk 01:15:44]} {[%emt 00:10:59]} 25. Rac1 {[%clk
00:56:40]} {[%emt 00:03:53]} Qg6+ {[%clk 01:12:57]} {[%emt 00:03:17]} 26. Qg4
{[%clk 00:56:53]} {[%emt 00:00:18]} Ne5 {[%clk 01:10:31]} {[%emt 00:02:57]} 27.
Qxg6 {[%clk 00:54:15]} {[%emt 00:03:07]} Nxf3+ {[%clk 01:10:18]} {[%emt
00:00:43]} 28. Kg2 {[%clk 00:54:35]} {[%emt 00:00:10]} Nh4+ {[%clk 01:10:46]}
{[%emt 00:00:02]} 29. Kh1 {[%clk 00:54:57]} {[%emt 00:00:08]} Nxg6 {[%clk
01:10:15]} {[%emt 00:01:01]} 30. Rfd1 {[%clk 00:55:18]} {[%emt 00:00:09]} Rd8
{[%clk 01:10:16]} {[%emt 00:00:28]} 31. Nd4 {[%clk 00:55:42]} {[%emt 00:00:07]}
Ba3 {[%clk 01:04:18]} {[%emt 00:26:49]} 32. Rc7 {[%clk 00:55:09]} b4 {[%clk
01:02:51]} 33. Nc6 {[%clk 00:55:22]} Rf8 {[%clk 01:02:03]} 34. Rxd5 {[%clk
00:55:21]} Nf4 {[%clk 00:58:34]} 35. Rf5 {[%clk 00:55:38]} Ne6 {[%clk
00:57:48]} 36. Rb7 {[%clk 00:54:41]} g6 {[%clk 00:58:03]} 37. Rf3 {[%clk
00:54:21]} Ng5 {[%clk 00:52:58]} 38. Re3 {[%clk 00:51:23]} {[%emt 00:01:48]}
Bc1 {[%clk 00:52:48]} {[%emt 00:00:38]} 39. Re1 {[%clk 00:50:55]} {[%emt
00:01:00]} Bd2 {[%clk 00:53:05]} {[%emt 00:02:33]} 40. Re2 {[%clk 00:50:49]}
Bc3 {[%clk 00:53:06]} 41. Nxb4 {[%clk 00:46:30]} {[%emt 00:03:35]} Nxh3 {[%emt
00:00:19]} 42. Nd5 {[%clk 00:46:41]} {[%emt 00:00:15]} Bd4 {[%clk 00:52:17]}
{[%emt 00:01:32]} 43. f4 {[%clk 00:43:43]} {[%emt 00:04:10]} Nf2+ {[%clk
00:49:57]} {[%emt 00:02:09]} 44. Kg2 {[%clk 00:44:06]} {[%emt 00:00:08]} Ng4
{[%emt 00:00:14]} 45. Rd7 {[%clk 00:43:20]} {[%emt 00:04:45]} Kg7 46. Nc7
{[%clk 00:43:22]} Rb8 {[%clk 00:49:57]} 47. Ne6+ {[%clk 00:43:10]} Ra8 1-0
"""
