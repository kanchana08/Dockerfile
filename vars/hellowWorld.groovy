def call() {
sh"ls"
  sh"jenkins --version"
  sh"cd /var/lib/jenkins/workspace/sharw"
  sh"rm -rf file1"

}

