package io.vltmn.aoc2021
package example

import org.scalatest.funsuite.AnyFunSuite

class Day20Test extends AnyFunSuite {
  val day = new Day20
  val demoInput = "..#.#..#####.#.#.#.###.##.....###.##.#..###.####..#####..#....#..#..##..###..######.###...####..#..#####..##..#.#####...##.#.#..#.##..#.#......#.###.######.###.####...#.##.##..#..#..#####.....#.#....###..#.##......#.....#..#..#..##..#...##.######.####.####.#.#...#.......#..#.#.#...####.##.#......#..#...##.#.##..#...##.#.##..###.#......#.#.......#.#.#.####.###.##...#.....####.#..#..#.##.#....##..#.####....##...##..#...#......#.#.......#.......##..####..#...#.#.#...##..#.#..###..#####........#..####......#..#\n\n#..#.\n#....\n##..#\n..#..\n..###"

  test("Part1 works correctly") {
    assertResult(35)(day.part1(demoInput))
  }

  test("Part2 works correctly") {
    assertResult(3351)(day.part2(demoInput))
  }
}
