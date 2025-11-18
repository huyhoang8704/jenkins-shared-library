def call(Map config = [:]) {
    if (!config.url) {
        error "gitCheckout requires 'url'"
    }

    def branch = config.branch ?: 'main'

    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: config.url]]
    ])
}
