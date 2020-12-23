/*
	Walker Freitas dos Santos
     698774
	Guia_0101.
*/

module Guia_0101;
// define data	

	reg [11:0]b[4:0];
	integer i;

//actions

	initial 
	 begin:main
	  b[0] = 23; 
	  b[1] = 54;
	  b[2] = 731; 
	  b[3] = 132; 
	  b[4] = 365;	  

	  for(i = 0; i < 5; i++)
	  	$display("%8d---%8b", b[i], b[i]);

	 end//main
    
endmodule //guia_0101
