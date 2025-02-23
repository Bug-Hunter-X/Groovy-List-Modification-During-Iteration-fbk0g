```groovy
def unusualBugSolution() {
  def list = [1, 2, 3]
  def newList = []
  list.each { element ->
    if (element != 2) {
      newList << element
    }
  }
  println newList // Output: [1, 3]
}

unusualBugSolution()
```