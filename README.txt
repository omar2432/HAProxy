-create an external network (so the microservices can communicate with HAProxy if they are in a different docker-compose file)
$ docker network create haproxy-network

-go to the project folder and run:
$ docker-compose up -d

-I have already created multiple instances from serviceA and serviceB inside the docker-compose file
-Created the HealthController with the /health API for HAProxy inside both services
-Added haproxy.cfg file with detailed comments

you can use http://localhost/api/serviceA/greet
and http://localhost/api/serviceB/data with username omar and password pass123
and http://localhost:9000/stats for the stats

In C:\Windows\System32\drivers\etc\hosts added:
127.0.0.1 xyz.com
127.0.0.1 abc.com

with haproxy2.cfg
you can use:
http://xyz.com/data
http://abc.com/data
http://abc.com/serviceB/data


