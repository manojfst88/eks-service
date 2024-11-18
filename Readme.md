<b>Spring boot Microservice Docker Kubernetes</b>

Step by step process for spring application using jenkins, docker and kubernetes to deploy in AWS

<b>Docker create and manage tags</b>

docker tag <local_image_name> manojfst88/eks-service:latest

docker push manojfst88/eks-service:latest

<b>Kubernetes apply deployment yaml</b>

kubectl apply -f deployment.yaml

<b>For creating deployment key use below command</b>

kubectl create secret docker-registry <registry-key-name> --docker-server=https://index.docker.io/v1/ --docker-username=<username> --docker-password=<token from docker hub> --docker-email=<docker_registered_email>
