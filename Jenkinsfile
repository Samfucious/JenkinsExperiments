pipeline {
	agent any

	stages {
		stage {
			steps {
				script {
					echo "first step"
				}
			}
		},
		
		stage ("fibonacci") {
			
			steps {
				script {
					echo "second step"
					echo "Fibonacci start"
					fibonacci(100)
					echo "Fibonacci end"
				}
			}
			
		},
		stage {
			steps {
				script {
					echo "last step"
				}
			}
		}
	}
}

def fibonacci(target) {
	def a = 1
	def b = 1

	echo "" + a
	
	while (b < target) {
		print ", " + b
		def t = b
		b = a + b
		a = t
	}
}
