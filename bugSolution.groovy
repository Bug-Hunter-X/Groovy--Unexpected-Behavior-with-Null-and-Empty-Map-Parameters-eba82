```groovy
def myMethod(param) {
  if (param == null || (param instanceof Map && param.isEmpty())) {
    println "Parameter is null or empty map"
    return
  }
  // ... rest of the method, safe to access param
  println "param size is : ${param.size()}"
}

myMethod(null)
myMethod([:])
myMethod([key: "value"])
```