pipeline {
    agent any
    environment {
        DOCKER_IMAGE_NAME = "deezer:latest"
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Draxa45/Deezer-microservice'
            }
        }
        stage ('Docker') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker image build -t deezer:latest .
                        '''
                  // def app=docker.build(DOCKER_IMAGE_NAME)
                }
            }
            post {
                failure {
                }
            }
        }

        stage ('StopPrevious') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker container stop deezer
                            docker container rm deezer
                        '''
                }
            }
            post {
                failure {
                   
                }
            }
        }



        stage ('Deploy') {
            when {
                branch 'master'
            }
            steps{
                script{
                    sh '''
                            docker run -d --name deezer -p 9070:8080 deezer:latest
                        '''
                }
            }
            post {
                failure {
               
                }
            }
        }
    }
}
