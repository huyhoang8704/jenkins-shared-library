def call(Map config = [:]) {
    echo "Cloning repo ${config.repoUrl} branch ${config.branch ?: 'main'} for user ${config.user ?: 'Unknown'}"
}
