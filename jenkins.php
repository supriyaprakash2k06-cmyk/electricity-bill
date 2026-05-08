pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning code...'
            }
        }

        stage('Compile Java') {
            steps {
                bat 'javac ElectricityBill.java'
            }
        }

        stage('Compile Test') {
            steps {
                bat 'javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" ElectricityBillTest.java'
            }
        }

        stage('Run JUnit Test') {
            steps {
                bat 'java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ElectricityBillTest'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment Successful'
            }
        }
    }
}