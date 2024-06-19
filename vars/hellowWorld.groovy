def call() {
when {
  expression{ 
    env.BRANCH_NAME == 'master' || env.BRANCH_NAME == 'dev' 
  } 
}
}

