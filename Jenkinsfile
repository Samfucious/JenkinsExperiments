import hudson.model.*

def out = getBinding().out;

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

	out.println(a)
	
	while (b < target) {
		out.println(b)
		def t = b
		b = a + b
		a = t
	}
}
