pipeline{

    agent any

    stages{
        stage("Build Jar"){
            steps{
                bat "mvn clean package -DskipTests"
                echo "doing mvn package"
            }
        }
        stage("Build Image"){
            steps{
                bat "docker build -t=saoqaengineer/selenium ."
            }
        }
        stage("Push Image"){
            steps{
                bat "docker push saoqaengineer/selenium"
            }
        }
    }

}