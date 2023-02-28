// Write an immediately invoked function that takes n as parameter and prints each number from 1 to n (comma separated).
// For each multiple of 3, print "Fizz" instead of the number.
// For each multiple of 5, print "Buzz" instead of the number.
// For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.

// Example input: 16
// Example output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16


var n =16;
        const FizzBuzz =()=> {
                
            for ( var i=0; i<=n; i++ ) {
           

                if ( i %3 === 0 && i%5 === 0  ) {
                    console.log('FizzBuzz');
                }
                else if ( i % 5 === 0 ) {
                    console.log('Buzz');
                }
                else if (  i %3 === 0) {
                    console.log("Fizz");
                }
                else {
                    console.log(i)
                }

            }
        }
        FizzBuzz();