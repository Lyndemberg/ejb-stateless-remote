sudo docker stop core
sudo docker stop jsf-client
sudo docker stop jsp-client
sudo docker rm core
sudo docker rm jsf-client
sudo docker rm jsp-client
sudo docker rmi -f dac-stateless/core
sudo docker rmi -f dac-stateless/jsf-client
sudo docker rmi -f dac-stateless/jsp-client

