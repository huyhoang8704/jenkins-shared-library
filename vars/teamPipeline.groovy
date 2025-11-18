def call(Map config = [:]) {
    pipeline {
        agent { label config.label ?: 'any' }

        stages {
            stage('Clone code') {
                steps {
                    script {
                        cloneStep(config)
                    }
                }
            }

            stage('Build code') {
                steps {
                    script {
                        buildStep(config)
                        echo "Current date: ${org.example.Utils.getFormattedDate()}"
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        deployStep(config)
                    }
                }
            }
        }

        post {
            always {
                echo "Pipeline finished for ${config.projectName}"
            }
        }
    }
}
