//Fibonacci Numbers
// Şammas Çölkesen

var input=prompt("How many fibonacci numbers do you want ? ");

var  n = input
		
		var a = -1;
		var b = 1;
		var c = 0;

		document.write("The Fibonacci Series are : ");

		for(var i=1; i<=n; i++) {
			
			c = a + b;
			var temp = a;
			a = b;
			b = c;
			
			document.write("<br>"+c);
		}

		document.write("<br>---------------------------------");

//max value 


		var a = -1;
		var b = 1;
		var c = 0;

	c=a+b;
	//for range input start
	//c=start;
	document.write("The Fibonacci Series are : ");
	while(c <= n) {
						
		a = b;
		b = c;
		
		document.write("<br>"+c);
		
		c = a + b;
	}


