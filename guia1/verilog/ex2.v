/*
	Walker Freitas dos Santos
     698774
	Guia_0101.
*/

module Guia_0101;
// define data	

	reg [5:0]b[4:0];
	integer i;

//actions

	initial 
	 begin:main
	  b[0] = 5'b10101; 
	  b[1] = 5'b10110;
	  b[2] = 6'b101101; 
	  b[3] = 6'b111011; 
	  b[4] = 6'b111001;	  

	  for(i = 0; i < 5; i++)
	  	$display("%8b---%8d", b[i], b[i]);

	 end//main
    
endmodule //guia_0101
