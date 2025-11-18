def install() {
    echo "[NPM] Installing packages..."
    def cmd = "npm install"
    def exitCode = sh(script: cmd, returnStatus: true)

    if (exitCode != 0) {
        error "[NPM] Install failed with exit code: ${exitCode}"
    }
}

def build() {
    echo "[NPM] Running npm build..."
    def cmd = "npm run build"
    def exitCode = sh(script: cmd, returnStatus: true)

    if (exitCode != 0) {
        error "[NPM] Build failed with exit code: ${exitCode}"
    }
}

def test() {
    echo "[NPM] Running npm test..."
    def cmd = "npm test"
    def exitCode = sh(script: cmd, returnStatus: true)

    if (exitCode != 0) {
        error "[NPM] Test failed with exit code: ${exitCode}"
    }
}

def start() {
    echo "[NPM] Starting application..."
    def cmd = "npm start & sleep 10"
    def exitCode = sh(script: cmd, returnStatus: true)

    if (exitCode != 0) {
        error "[NPM] Start failed with exit code: ${exitCode}"
    }
}
