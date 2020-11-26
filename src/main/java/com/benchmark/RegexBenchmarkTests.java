package com.benchmark;

import java.util.regex.Matcher;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

public class RegexBenchmarkTests {

  @Fork(value = 2, warmups = 3)
  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  public void benchLongRegex(LongRegexPlan plan) {
    Matcher matcher = plan.searchTokenPattern.matcher(plan.path);
    while (matcher.find()) {
      //doSomething
    }
  }

  @Fork(value = 2, warmups = 3)
  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  public void benchShortRegex(ShortRegexPlan plan) {
    Matcher matcher = plan.searchTokenPattern.matcher(plan.path);
    while (matcher.find()) {
      //doSomething
    }
  }

  @Fork(value = 2, warmups = 3)
  @Benchmark
  @BenchmarkMode(Mode.Throughput)
  public void benchQuickRegex(QuickRegexPlan plan) {
    Matcher matcher = plan.searchTokenPattern.matcher(plan.path);
    while (matcher.find()) {
      //doSomething
    }
  }
}
