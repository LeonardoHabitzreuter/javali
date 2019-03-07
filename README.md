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

### Build the project
```
mvn package
```

### Start database
```
docker container run -d javali/database db
```