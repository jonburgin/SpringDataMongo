This project is a simple example of how to use spring data and mongodb in a maven project.
Enjoy.

-------------------------------------------------------------------------
INSTALLING MONGODB ON UBUNTU
-------------------------------------------------------------------------
--do the following to get teh gpg key that authenticates the debian package
sudo apt-key adv --keyserver keyserver.ubuntu.com --recv 9ECBEC467F0CEB10
--do the following to let ubuntu know about the software repository where MongoDb can be found
deb http://downloads-distro.mongodb.org/repo/ubuntu-upstart dist 10gen
--update the information in your repositories
sudo apt-get update
--If the previous ends in an error, check the keynumber and substitute it for the one at the end of line adv line above
--Now install the package from the repository
sudo apt-get install mongodb-10gen
--This MongoDB instance will store its data files in the /var/lib/mongodb and its log files in /var/log/mongodb, and run using the mongodb user account.
--to control the service:
sudo service mongodb start
sudo service mongodb stop
sudo service mongodb restart

--to start the mongo shell:
mongo

---------------------------------------------------------------
Some helpful references
--------------------------------------------------------------

spring data mongo reference api (it is embedded into spring data api):
http://static.springsource.org/spring-data/data-mongodb/docs/current/reference/html/
http://static.springsource.org/spring-data/data-mongodb/docs/current/reference/html/#mongo.core

spring data api:
http://static.springsource.org/spring-data/data-mongo/docs/current/api/index.html