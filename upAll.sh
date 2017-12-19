sudo docker build -t dac-stateless/core ./core
sudo docker run -p 8080:8080 -p 3700:3700 -d --name core dac-stateless/core
sudo docker build -t dac-stateless/jsf-client ./jsf-client
sudo docker run -p 8081:8080 -d --name jsf-client --link core:host-core dac-stateless/jsf-client
sudo docker build -t dac-stateless/jsp-client ./jsp-client
sudo docker run -p 8082:8080 -d --name jsp-client --link core:host-core dac-stateless/jsp-client
