pipeline {
	agent any

	stages {
		stage ("fibonacci") {
			steps {
				script {
					fibonacci(100)
				}
			}
		}
	}
}

def fibonacci(target) {
	def a = 1
	def b = 1

	println(a)
	
	while (b < target) {
		println(b)
		def t = b
		b = a + b
		a = t
	}
}
