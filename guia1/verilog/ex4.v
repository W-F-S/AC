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

    function conversor( [7:0]num);
        
         integer teste;

         begin :conversor //iniciar a função

             if(num >= 4) begin//iniciar if
                 
                 conversor( num/4 ); //começar o sistema recursivo mandando o numero dividido pela base pedida
                 teste = (x%base); //pegar o resto da divisão
                 $display("%8d", teste);//mostrar o resto da divisao

             end else begin 
                 $display("%8d", num); //mostrar o resto da divisao 
             end
             
         end
    endfunction


/*	if(x >= base){
		conversor(base, x/base);
		System.out.print(x%base);
	}
	else{
		System.out.print(x);
	}*/


	initial begin:main
	 
	  //b[0] =  5'b10111;
	  b[1] =  5'b10011; 
	  b[2] = 6'b101101; 
	  b[3] = 6'b100101;	  
      //b[4] = 6'b101111;

     // $display("binario:%8b base-4: %8x", b[0], b[0]);
      $display("binario:%8b octal:%16o", b[1], b[1]);
   	  $display("binario:%8b hexadecimal: %9x", b[2], b[2]);
      $display("binario:%8b octal:%16o", b[3], b[3]);
     // $display("binario:%8b base-4: %8x", b[4], b[4]);
	  

	 end//main
    
endmodule //guia_0101
