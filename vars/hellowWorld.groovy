def call() {
sh"docker build -t image:latest ."
  sh "docker images"

}

