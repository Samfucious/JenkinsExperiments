def fibonacci() {
	println "Fibonacci start"
	
	def target = 100
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

return this
