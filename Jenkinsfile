pipeline {
    agent any
    tools {
        maven 'maven3.9.11'
    }   
    stages {
        stage('Checkout SCM') {
            steps {
                git branch: 'main', url: 'https://github.com/nasotoamezcua/devops-jenkins.git'
            }
        }
        stage('Build') {
            steps {
				sh 'ls -la'
                sh 'mvn clean package -DskipTests'
            }
        }   
        
        stage('Test') {
            steps {
                sh 'cat /etc/os-release'
            }
        }
       
        
    }
    
}