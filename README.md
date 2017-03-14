1. Open Java VisualVM from your jdk
2. Start both unit test classes (one after another) with additional JVM parameter -Dcom.sun.management.jmxremote
3. Watch blocking behavior of threads in VisualVM

4. Look at the exceptions thrown by org.apache.camel.util.ObjectHelper (=> java.lang.ClassNotFoundException) in the blocking demo
For all beans called directly via DSL (XML) with additional constant parameters an exception is thrown by class loader.
Class loader (java.lang.ClassLoader.loadClass) also is synchronized and that's why app is blocking and throughput gets bad.

