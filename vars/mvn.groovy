def build() {
    sh "mvn clean package"
}

def sonar() {
    sh "mvn sonar:sonar"
}

def deploy() {
    sh "mvn clean deploy"
}
