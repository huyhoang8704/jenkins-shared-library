def call(Map config = [:]) {
    if (!config.deploy) {
        echo "Skipping deploy"
        return
    }
    echo "Deploying ${config.projectName} to ${config.env ?: 'dev'}"
}
