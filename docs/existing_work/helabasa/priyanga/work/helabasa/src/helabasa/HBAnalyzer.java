 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n A n a l y z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S t e m m e r ;  
 i m p o r t   h e l a b a s a . v e r b s . H B V e r b A n a l y z e r ;  
 i m p o r t   h e l a b a s a . v e r b s . H B V e r b S t e m m e r ;  
  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B A n a l y z e r   {  
  
 	 p r i v a t e   H B N o u n S t e m m e r 	 o _ N o u n S t e m m e r   =   n e w   H B N o u n S t e m m e r ( ) ;  
 	 p r i v a t e   H B N o u n A n a l y z e r 	 o _ N o u n A n a l y z e r   =   n u l l ;  
 	  
 	 p r i v a t e   H B V e r b S t e m m e r 	 o _ V e r b S t e m m e r   =   n e w   H B V e r b S t e m m e r ( ) ;  
 	 p r i v a t e   H B V e r b A n a l y z e r 	 o _ V e r b A n a l y z e r   =   n u l l ; 	  
 	  
 	 p u b l i c   H B A n a l y z e r ( )    
 	 { 	 	  
 	 	 H B T r a n s f o r m R u l e S e t . I n i t ( ) ;  
 	 	 o _ N o u n A n a l y z e r   =   n e w   H B N o u n A n a l y z e r ( ) ;  
 	 	 o _ V e r b A n a l y z e r   =   n e w   H B V e r b A n a l y z e r ( ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A n a l y z e ( S t r i n g   s W o r d ,   L i s t < H B P O S >   l s t R e s u l t s )  
 	 {  
 	 	 A n a l y z e N o u n ( s W o r d ,   l s t R e s u l t s ) ;  
 	 	 A n a l y z e V e r b ( s W o r d ,   l s t R e s u l t s ) ;  
 	 }  
  
 	  
 	 p u b l i c   v o i d   A n a l y z e N o u n ( S t r i n g   s W o r d ,   L i s t < H B P O S >   l s t R e s u l t s )  
 	 {  
 / / 	 	 H B W o r d   o W o r d   =   n e w   H B W o r d ( s W o r d ) ;  
 / / 	 	 H B W o r d   o S t e m m e d   =   o _ N o u n S t e m m e r . S t e m ( o W o r d ) ;  
 / / 	 	 i f ( o S t e m m e d ! = n u l l )  
 / / 	 	 {  
 / / 	 	 	 o _ N o u n A n a l y z e r . A n a l y z e ( o S t e m m e d ,   l s t R e s u l t s ) ;  
 / / 	 	 }  
 / / 	 	 o _ N o u n A n a l y z e r . A n a l y z e ( o W o r d ,   l s t R e s u l t s ) ;  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   A n a l y z e V e r b ( S t r i n g   s W o r d ,   L i s t < H B P O S >   l s t R e s u l t s )  
 	 {  
 	 	 H B W o r d   o W o r d   =   n e w   H B W o r d ( s W o r d ) ;  
 	 	 H B W o r d   o S t e m m e d   =   o _ V e r b S t e m m e r . S t e m ( o W o r d ) ;  
 	 	 i f ( o S t e m m e d ! = n u l l )  
 	 	 {  
 	 	 	 o _ V e r b A n a l y z e r . A n a l y z e ( o S t e m m e d ,   l s t R e s u l t s ) ;  
 	 	 }  
 	 	 o _ V e r b A n a l y z e r . A n a l y z e ( o W o r d ,   l s t R e s u l t s ) ; 	 	  
 	 } 	  
 }  
