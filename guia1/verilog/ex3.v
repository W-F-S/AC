/*
	Walker Freitas dos Santos
     698774
	Guia_0101.
*/

module Guia_0101;
// define data	

	reg [7:0]b[4:0];
	integer i;

//actions

	initial 
	 begin:main
	 // b[0]; //'b71; 
	  b[0] = 71;
	  b[1] = 43; 
	  b[2] = 67; 
	  b[3] = 175;	  
      b[4] = 151

      $display("decimal:%8d octal:%16o", b[1], b[1]);
	  for(i = 2; i < 5; i++)
	  	$display("decimal:%8d hexadecimal: %8x", b[i], b[i]);

	 end//main
    
endmodule //guia_0101
