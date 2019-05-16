# javali
IF java project

## Set up the poject

### Download maven
https://maven.apache.org/download.cgi

### Export mvn env:
export PATH=$PATH:/home/<user>/<folder>/apache-maven-3.6.0/bin

## Getting started

### Set up database
```
docker image build -t javali/database .
```

### Start database
```
bash db.sh
```

### Run migrations
```
psql prova root
```
```
use prova
```
```
\d cliente
```

### Build the project
```
mvn install
```

### Run main class
```
mvn jetty:run
```

### Run frontend
```
cd frontend && npm start
```