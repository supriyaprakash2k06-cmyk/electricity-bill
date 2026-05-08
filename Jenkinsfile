pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Cloning code...'
            }
        }

        stage('Build') {
            steps {
                bat '.\\maven\\apache-maven-3.9.15\\bin\\mvn.cmd clean compile'
            }
        }

        stage('Test') {
            steps {
                bat '.\\maven\\apache-maven-3.9.15\\bin\\mvn.cmd test'
            }
        }
    }
}

