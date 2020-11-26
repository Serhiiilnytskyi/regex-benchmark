| Regex name  | Regex | Benchmark method |
| ------------- | ------------- |  ------------- | 
| SHORT REGEX | ":([A-Za-z0-9_]*)" | benchShortRegex() |
| LONG REGEX | ":([A-Za-z][A-Za-z0-9_]*)" |  benchLongRegex() |
| QUICK REGEX | ":([A-Za-z]*&#124;[A-Za-z][A-Za-z0-9_]*)" | benchQuickRegex() |


## TEST OUTPUT:
```
Benchmark                                                                    (path)   Mode  Cnt           Score           Error  Units
BenchmarkRunner.init                                                            N/A  thrpt    5  1497961932.796 ± 296758129.104  ops/s
RegexBenchmarkTests.benchLongRegex                            /some/path/:someToken  thrpt   10     2643128.748 ±    127669.578  ops/s
RegexBenchmarkTests.benchLongRegex             /some/token/:someTokenWithDigits123/  thrpt   10      872165.339 ±     72098.177  ops/s
RegexBenchmarkTests.benchLongRegex   /some/path/:someToken/:someTokenWithDigits123/  thrpt   10      628053.929 ±     56073.871  ops/s
RegexBenchmarkTests.benchQuickRegex                           /some/path/:someToken  thrpt   10     4249609.621 ±    305927.361  ops/s
RegexBenchmarkTests.benchQuickRegex            /some/token/:someTokenWithDigits123/  thrpt   10     3653500.767 ±   1129421.611  ops/s
RegexBenchmarkTests.benchQuickRegex  /some/path/:someToken/:someTokenWithDigits123/  thrpt   10     2573417.818 ±    172760.860  ops/s
RegexBenchmarkTests.benchShortRegex                           /some/path/:someToken  thrpt   10     2018126.486 ±    337520.510  ops/s
RegexBenchmarkTests.benchShortRegex            /some/token/:someTokenWithDigits123/  thrpt   10      747829.296 ±    182823.237  ops/s
RegexBenchmarkTests.benchShortRegex  /some/path/:someToken/:someTokenWithDigits123/  thrpt   10      634368.110 ±     28715.601  ops/s
```
#### ":([A-Za-z0-9_]*)" 
##### /some/path/:someToken 
```
Result "com.benchmark.RegexBenchmarkTests.benchLongRegex":
  2643128.748 ±(99.9%) 127669.578 ops/s [Average]
  (min, avg, max) = (2457299.970, 2643128.748, 2733821.230), stdev = 84445.521
  CI (99.9%): [2515459.169, 2770798.326] (assumes normal distribution)
```
##### /some/token/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchLongRegex":
  872165.339 ±(99.9%) 72098.177 ops/s [Average]
  (min, avg, max) = (750921.964, 872165.339, 916348.453), stdev = 47688.480
  CI (99.9%): [800067.162, 944263.515] (assumes normal distribution)
```
##### /some/path/:someToken/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchLongRegex":
  628053.929 ±(99.9%) 56073.871 ops/s [Average]
  (min, avg, max) = (550463.747, 628053.929, 662548.936), stdev = 37089.394
  CI (99.9%): [571980.057, 684127.800] (assumes normal distribution)
```
#### ":([A-Za-z][A-Za-z0-9_]*)" 
##### /some/path/:someToken 
```
Result "com.benchmark.RegexBenchmarkTests.benchQuickRegex":
 4249609.621 ±(99.9%) 305927.361 ops/s [Average]
  (min, avg, max) = (3923269.645, 4249609.621, 4434934.467), stdev = 202352.007
  CI (99.9%): [3943682.260, 4555536.982] (assumes normal distribution)
```
##### /some/token/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchQuickRegex":
  3653500.767 ±(99.9%) 1129421.611 ops/s [Average]
  (min, avg, max) = (1759750.905, 3653500.767, 4208606.866), stdev = 747042.466
  CI (99.9%): [2524079.157, 4782922.378] (assumes normal distribution)
```
##### /some/path/:someToken/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchQuickRegex":
  2573417.818 ±(99.9%) 172760.860 ops/s [Average]
  (min, avg, max) = (2405560.179, 2573417.818, 2790452.763), stdev = 114270.612
  CI (99.9%): [2400656.958, 2746178.678] (assumes normal distribution)
```
#### ":([A-Za-z]*&#124;[A-Za-z][A-Za-z0-9_]*)" 
##### /some/path/:someToken 
```
Result "com.benchmark.RegexBenchmarkTests.benchShortRegex":
  2018126.486 ±(99.9%) 337520.510 ops/s [Average]
  (min, avg, max) = (1571907.414, 2018126.486, 2336363.201), stdev = 223248.920
  CI (99.9%): [1680605.976, 2355646.996] (assumes normal distribution)
```
##### /some/token/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchShortRegex":
  747829.296 ±(99.9%) 182823.237 ops/s [Average]
  (min, avg, max) = (567100.673, 747829.296, 890657.798), stdev = 120926.252
  CI (99.9%): [565006.059, 930652.533] (assumes normal distribution)
```
##### /some/path/:someToken/:someTokenWithDigits123/
```
Result "com.benchmark.RegexBenchmarkTests.benchShortRegex":
  634368.110 ±(99.9%) 28715.601 ops/s [Average]
  (min, avg, max) = (602912.428, 634368.110, 657055.847), stdev = 18993.592
  CI (99.9%): [605652.510, 663083.711] (assumes normal distribution)
```
