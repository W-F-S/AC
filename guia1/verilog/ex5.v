/*
	Walker Freitas dos Santos
     698774
	Guia_0101.
*/

module Guia_0101;
// define data	

	reg [5:0]b[4:0];
     reg [0:8][0:7] a;
	integer i;

//actions

	initial 
	 begin:main


     // $display("binario:%8b base-4: %8x", b[0], b[0]);
      a[0] = "p";
      a[1] = "u";
      a[2] = "c";
      a[3] = "c";
      a[4] = "c";
      a[5] = "c";
      a[6] = "c";
      a[7] = "d";
      a[8] = "s";

      $display("binario:%8s octal:%16h", s, s);

     // $display("binario:%8b base-4: %8x", b[4], b[4]);
	  

	 end//main
    
endmodule //guia_0101
