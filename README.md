@Library('my-shared-library') _

teamPipeline(
    projectName: 'team-a-service',
    repoUrl: 'git@github.com:team-a/service.git',
    branch: 'master',
    user: 'Alice',
    deploy: true,
    env: 'staging',
    agent: 'test'
)
# jenkins-shared-library
