# algorithm

Error: Maven Compilation Error: Source option 5 is no longer supported
Add the following configuration to pom.xml.

<properties>
       <java.version>1.8</java.version>
       <maven.compiler.source>1.8</maven.compiler.source>
       <maven.compiler.target>1.8</maven.compiler.target>
</properties>
