pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Build the Maven project
                bat "\"C:\\Windows\\System32\\cmd.exe\" /c mvn clean install"
            }
        }
        stage('Test') {
            steps {
                // Run tests
                bat "\"C:\\Windows\\System32\\cmd.exe\" /c mvn test"
            }
        }
    }
    
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
