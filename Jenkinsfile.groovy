pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/sivaram2662/multi-stage-example.git'

            }

        }
    }
}
