# Set the image name
IMAGE_NAME="my-jenkins"

SCRIPT_DIR=$(dirname "$0")

docker build -t $IMAGE_NAME -f $SCRIPT_DIR/Dockerfile-jenkins $SCRIPT_DIR

docker run -p 8080:8080 -p 50000:50000 -v $SCRIPT_DIR:/var/jenkins_home/workspace my-jenkins