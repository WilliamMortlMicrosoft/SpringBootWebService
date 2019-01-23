mvn install
docker build --network=host -t helloworldwebservice:0.0.1 -f build/Dockerfile .