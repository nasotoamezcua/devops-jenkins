pipeline {
    agent any
    tools {
        maven 'maven3.9.11'
    }   
    stages {
		/*
        stage('Checkout SCM') {
            steps {
                git branch: 'main', url: 'https://github.com/nasotoamezcua/devops-jenkins.git'
            }
        }*/
        stage('Compile') {
            steps {
				sh 'ls -la'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
       
        
    }
    
}