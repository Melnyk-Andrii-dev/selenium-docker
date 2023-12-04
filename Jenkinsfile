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
                bat "docker build -t=saoqaengineer/selenium:latest ."
            }
        }
        stage("Push Image"){
        environment{
            DOCKER_HUB = credentials('dockerhub-creds')
        }
            steps{
                bat 'docker login -u %DOCKER_HUB_USR% -p %DOCKER_HUB_PSW%'
                bat "docker push saoqaengineer/selenium:latest"
                bat "docker tag saoqaengineer/selenium:latest saoqaengineer/selenium:${env.BUILD_NUMBER}"
                bat "docker push saoqaengineer/selenium:${env.BUILD_NUMBER}"
            }
        }
    }

    post{
        always{
            bat "docker logout"
        }
    }

}