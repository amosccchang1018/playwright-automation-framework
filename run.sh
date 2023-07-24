# Set the image name
IMAGE_NAME="my_java_app"

# Get the absolute path to the script's directory
SCRIPT_DIRECTORY=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

# Build the Docker image
docker build -t $IMAGE_NAME -f Dockerfile-java $SCRIPT_DIRECTORY

# Run the test cases in the Docker container
docker run -it --rm $IMAGE_NAME mvn -Dtest=LoginTest,LoginE2ETest,WebScrapingTest test