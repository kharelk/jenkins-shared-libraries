def call(Map config = [:]) {
    sh "echo Hello ${config.name}, Today is ${config.dayOfWeek}'n"
    sh "echo Hello ${config.test}'n"
}

