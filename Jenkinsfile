pipeline {
    agent any

    stages {
        stage('Building') {
            steps {
                echo 'Building the code or the dev project'
            }
        }
        
         stage('Testing') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/hemantgandhi12g/WebDriverTestOnAWS.git']])
                sh 'mvn clean test'
            }
        }
         stage('Deployment') {
            steps {
                echo 'Deploying on staging server'
            }
        }
         stage('Delivery') {
            steps {
                echo 'Deploying on production server'
            }
        }
        
    }
}
