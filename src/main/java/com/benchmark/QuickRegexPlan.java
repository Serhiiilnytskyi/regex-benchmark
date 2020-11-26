package com.benchmark;

import java.util.regex.Pattern;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class QuickRegexPlan {

  @Param({
      "/some/path/:someToken",
      "/some/token/:someTokenWithDigits123/",
      "/some/path/:someToken/:someTokenWithDigits123/"})
  public String path;

  public Pattern searchTokenPattern;

  @Setup(Level.Invocation)
  public void setUp() {
    searchTokenPattern = Pattern.compile(":([A-Za-z]*|[A-Za-z][A-Za-z0-9_]*)");
  }
}
