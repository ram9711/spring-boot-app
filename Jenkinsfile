pipeline {
    agent any
    environment {
        SONAR_TOKEN = credentials('sonar-token') // Store token in Jenkins credentials
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/ram9711/spring-boot-app.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                sh """
                    mvn sonar:sonar \
                      -Dsonar.projectKey=ram9711_spring-boot-app \
                      -Dsonar.organization=ram9711 \
                      -Dsonar.host.url=https://sonarcloud.io \
                      -Dsonar.login=$SONAR_TOKEN
                """
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}
