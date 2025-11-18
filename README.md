# jenkins-shared-library
```
@Library('my-shared-library') _

teamPipeline(
    projectName: 'team-a-service',
    repoUrl: 'git@github.com:team-a/service.git',
    branch: 'master',
    user: 'Alice',
    deploy: true,
    env: 'staging',
    label: 'test'
)
```

```
@Library('jenkins-shared-library@master') _

pipeline {
    agent {
        kubernetes {
            yaml '''
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: node
    image: node:18-alpine
    command:
    - cat
    tty: true
'''
        }
    }

    stages {
        stage('Checkout') {
            steps {
                gitCheckout(
                    url: 'https://github.com/vercel/next.js.git',
                )
            }
        }

        stage('NPM Install') {
            steps {
                container('node') {
                    script {
                        npm.install()
                    }
                }
            }
        }

        stage('NPM Start') {
            steps {
                container('node') {
                    script {
                        npm.start()
                    }
                }
            }
        }
    }
}

```
