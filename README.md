# javali
IF java project

## Set up the poject

### Download maven
https://maven.apache.org/download.cgi

### Export mvn env:
export PATH=$PATH:/home/<user>/<folder>/apache-maven-3.6.0/bin

### Set up database
```
docker image build -t javali/database .
```

## Getting started

### Start database
```
bash db.sh
```

### Build the project
```
mvn install
```

### Run main class
```
mvn jetty:run
```
