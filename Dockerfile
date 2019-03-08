FROM mysql:8.0.15
LABEL maintainer="Leonardo Habitzreuter <leo.habitzreuter@gmail.com>"
EXPOSE 3306
ENV MYSQL_ROOT_PASSWORD=rootpass
ENV MYSQL_DATABASE=javali
ENV MYSQL_USER=dbuser
ENV MYSQL_PASSWORD=pass
CMD ["mysqld", "--default-authentication-plugin", "mysql_native_password"]