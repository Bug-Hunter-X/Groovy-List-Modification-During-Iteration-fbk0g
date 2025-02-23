```groovy
def unusualBug() {
  def list = [1, 2, 3]
  list.eachWithIndex { element, index ->
    if (element == 2) {
      list.remove(element) // Modifying the list while iterating
    }
    println "Element: $element, Index: $index"
  }
}

unusualBug()
```