 p a c k a g e   h e l a b a s a . s e r v l e t s . u t i l s ;  
  
 p u b l i c   c l a s s   W e b U t i l s   {  
  
 	 p r i v a t e   s t a t i c   S t r i n g   s _ E n c o d i n g   =   " U T F - 8 " ; / / " I S O - 8 8 5 9 - 1 " ;  
  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g   T E S T _ J A V A _ R T _ V E R S I O N   =   " 1 . 6 . 0 _ 2 7 - b 2 7 " ;  
 	  
 	 p u b l i c   W e b U t i l s ( )   {  
 	 	  
 	 }  
  
 	 p u b l i c   s t a t i c   S t r i n g   G e t C h a r a c t e r E n c o d i n g ( )  
 	 { 	 	  
 	 	 S t r i n g   s J a v a R T V e r i o n s   =   S y s t e m . g e t P r o p e r t y ( " j a v a . r u n t i m e . v e r s i o n " ) ;  
 	 	 i f ( s J a v a R T V e r i o n s ! = n u l l   & &   s J a v a R T V e r i o n s   = =   T E S T _ J A V A _ R T _ V E R S I O N )  
 	 	 {  
 	 	 	 r e t u r n   " U T F - 8 " ;  
 	 	 }  
 	 	 r e t u r n   s _ E n c o d i n g ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   S t r i n g   D e c o d e P a r a m e t e r ( S t r i n g   s P a r a m )  
 	 {  
 	 	 i f ( s P a r a m ! = n u l l   & &   s P a r a m . l e n g t h ( ) > 0 )  
 	 	 {  
 	 	 	 t r y  
 	 	 	 {  
 	 	 	 	 r e t u r n   n e w   S t r i n g ( s P a r a m . g e t B y t e s   ( G e t C h a r a c t e r E n c o d i n g ( ) ) ,   " U T F - 8 " ) ;  
 	 	 	 }  
 	 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 	 {  
 	 	 	 	 r e t u r n   " D E C O D I N G _ E R R O R " ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 	 r e t u r n   s P a r a m ; 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   S t r i n g   M D 5 H a s h ( S t r i n g   t e x t )   {  
 	 	       t r y    
 	 	       {  
 	 	                 j a v a . s e c u r i t y . M e s s a g e D i g e s t   m d   =   j a v a . s e c u r i t y . M e s s a g e D i g e s t . g e t I n s t a n c e ( " M D 5 " ) ;  
 	 	                 b y t e [ ]   a r r a y   =   m d . d i g e s t ( t e x t . g e t B y t e s ( ) ) ;  
 	 	                 S t r i n g B u f f e r   s b   =   n e w   S t r i n g B u f f e r ( ) ;  
 	 	                 f o r   ( i n t   i   =   0 ;   i   <   a r r a y . l e n g t h ;   + + i )    
 	 	                 {  
 	 	                 	 s b . a p p e n d ( I n t e g e r . t o H e x S t r i n g ( ( a r r a y [ i ]   &   0 x F F )   |   0 x 1 0 0 ) . s u b s t r i n g ( 1 , 3 ) ) ;  
 	 	                 }  
 	 	                 r e t u r n   s b . t o S t r i n g ( ) ;  
 	 	       }    
 	 	       c a t c h   ( j a v a . s e c u r i t y . N o S u c h A l g o r i t h m E x c e p t i o n   e )    
 	 	       {  
 	 	       }  
 	 	       r e t u r n   " " ;  
 	 }  
 	  
 }  
