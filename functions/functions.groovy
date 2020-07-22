def fibonacci(target) {
	println "Fibonacci start"

	def a = 1
	def b = 1

	println a
	
	while (b < target) {
		println b
		def t = b
		b = a + b
		a = t
	}
	
	println "Fibonacci end"
}

def fibonacci() {
	fibonacci(100)
}

return this
