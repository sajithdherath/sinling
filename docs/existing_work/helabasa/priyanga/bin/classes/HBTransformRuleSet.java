 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B T r a n s f o r m R u l e S e t   {  
  
 	 / / p r i v a t e   s t a t i c   M a p < S t r i n g ,   I n t e g e r >   m a p _ I D s   =   n e w   H a s h M a p < S t r i n g ,   I n t e g e r > ( ) ; 	 	  
 	 	  
 	 p r i v a t e   H B W o r d 	 o _ L e m m a   =   n u l l ; 	  
 	 p r i v a t e   i n t 	 	 i _ T y p e   =   0 ;  
 	 p r i v a t e   i n t 	 	 i _ S u b T y p e   =   0 ;  
 	 p r i v a t e   L i s t < H B T r a n s f o r m R u l e >   l i s t _ R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	 p r i v a t e   S t r i n g   s _ N a m e   =   " " ;  
 	 p r i v a t e   i n t 	 i _ I D   =   0 ;  
 	  
  
  
 	 p u b l i c   s t a t i c   v o i d   I n i t ( )  
 	 {  
 / / 	 	 m a p _ I D s . p u t ( " N N " ,   n e w   I n t e g e r ( 9 ) ) ; 	 	  
 / / 	 	 m a p _ I D s . p u t ( " P R " ,   n e w   I n t e g e r ( 0 ) ) ;  
 / / 	 	 m a p _ I D s . p u t ( " K R " ,   n e w   I n t e g e r ( 1 ) ) ;  
 / / 	 	 m a p _ I D s . p u t ( " A L " ,   n e w   I n t e g e r ( 8 ) ) ;  
 / / 	 	  
 / / 	 	 m a p _ I D s . p u t ( " L M " ,   n e w   I n t e g e r ( 0 ) ) ;  
 / / 	 	 m a p _ I D s . p u t ( " D S " ,   n e w   I n t e g e r ( 0 ) ) ;  
 / / 	 	 m a p _ I D s . p u t ( " I S " ,   n e w   I n t e g e r ( 1 ) ) ;  
 / / 	 	 m a p _ I D s . p u t ( " P L " ,   n e w   I n t e g e r ( 2 ) ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   i n t   G e t R u l e C o u n t ( )  
 	 {  
 	 	 r e t u r n   l i s t _ R u l e s . s i z e ( ) ;  
 	 }  
 	 p u b l i c   H B T r a n s f o r m R u l e   G e t R u l e ( i n t   i P o s )  
 	 {  
 	 	 r e t u r n   l i s t _ R u l e s . g e t ( i P o s ) ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t ( )    
 	 {  
 	 	 o _ L e m m a   =   n e w   H B W o r d ( ) ; 	  
 	 }  
  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t ( i n t   i T y p e ,   i n t   i S u b T y p e ,   H B W o r d   o L e m m a )    
 	 {  
 	 	 o _ L e m m a   =   o L e m m a ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t ( i n t   i T y p e ,   i n t   i S u b T y p e ,   S t r i n g   s L e m m a )    
 	 {  
 	 	 o _ L e m m a   =   n e w   H B W o r d ( s L e m m a ) ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
 	 	  
 	 p u b l i c   i n t   G e t T y p e ( )    
 	 {  
 	 	 r e t u r n   i _ T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t S u b T y p e ( )    
 	 {  
 	 	 r e t u r n   i _ S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   A d d R u l e ( H B T r a n s f o r m R u l e   o R u l e )  
 	 {  
 	 	 o R u l e . S e t R u l e S e t ( t h i s ) ;  
 	 	 l i s t _ R u l e s . a d d ( o R u l e ) ;  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e   F i n d R u l e ( i n t   i T y p e ,   i n t   i S u b T y p e )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	 	  
 	 	 	  
 	 	 	 i f ( i T y p e   = =   o R u l e . G e t T y p e ( )   & &   i S u b T y p e   = =   o R u l e . G e t S u b T y p e ( ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   o R u l e ;  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   v o i d   F i n d R u l e s ( i n t   i T y p e ,   i n t   i S u b T y p e ,   L i s t < H B T r a n s f o r m R u l e >   l s t R u l e s )  
 	 {  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	 	  
 	 	 	  
 	 	 	 i f ( i T y p e   = =   o R u l e . G e t T y p e ( )   & &   i S u b T y p e   = =   o R u l e . G e t S u b T y p e ( ) )  
 	 	 	 {  
 	 	 	 	 l s t R u l e s . a d d ( o R u l e ) ; 	 	 	 	  
 	 	 	 }  
 	 	 } 	 	  
 	 }  
 	  
 	  
 	 / / R e t u r n s   a   s c o r e   r e p r e s e n t   t h e   m a t c h i n g   w i t h   l e m m a  
 	 p u b l i c   i n t   M a t c h L e m m a ( H B W o r d   o W o r d )  
 	 {  
 	 	 r e t u r n   o _ L e m m a . M a t c h ( o W o r d ) ; 	 	  
 	 }  
 	  
 	 / / R e t u r n s   t h e   R u l e   i f   t h e r e   i s   a   m a t c h i n g   f o r m   i n   t h e   r u l e   s e t  
 	 p u b l i c   L i s t < H B T r a n s f o r m R u l e >   M a t c h F o r m s ( H B W o r d   o W o r d )  
 	 { 	 	  
 	 	 l o n g   i S c o r e   =   0 ;  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 	 	 L i s t < H B T r a n s f o r m R u l e >   o M a t c h i n g R u l e s   =   n u l l ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	  
 	 	 	 i S c o r e   =   o R u l e . M a t c h F o r m ( o W o r d ) ;    
 	 	 	 	 	 	  
 	 	 	 i f ( i S c o r e   >   0 )  
 	 	 	 {  
 	 	 	 	 i f ( o M a t c h i n g R u l e s = = n u l l )  
 	 	 	 	 {  
 	 	 	 	 	 o M a t c h i n g R u l e s   =   n e w   A r r a y L i s t < H B T r a n s f o r m R u l e > ( ) ;  
 	 	 	 	 }  
 	 	 	 	  
 	 	 	 	 o M a t c h i n g R u l e s . a d d ( o R u l e ) ; 	 	 	 	  
 	 	 	 }  
 	 	 } 	 	 	 	  
 	 	 r e t u r n   o M a t c h i n g R u l e s ;  
 	 }  
 	  
 / / 	 p u b l i c   v o i d   M a t c h F o r m s ( H B W o r d   o W o r d ,   L i s t < H B T r a n s f o r m R u l e >   l i s t R u l e s )  
 / / 	 { 	 	  
 / / 	 	 l o n g   i S c o r e   =   0 ;  
 / / 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 / / 	 	  
 / / 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 / / 	 	 {  
 / / 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	  
 / / 	 	 	 i S c o r e   =   o R u l e . M a t c h F o r m ( o W o r d ) ;    
 / / 	 	 	 	 	 	  
 / / 	 	 	 / / i f ( i S c o r e   >   0 )  
 / / 	 	 	 {  
 / / 	 	 	 	 l i s t R u l e s . a d d ( o R u l e ) ; 	 	 	 	  
 / / 	 	 	 }  
 / / 	 	 } 	 	  
 / / 	 } 	  
 	  
 	  
 	 p u b l i c   v o i d   M a t c h F o r m s ( H B W o r d   o W o r d ,   L i s t < H B T r a n s f o r m >   l i s t T r a n s f o r m s )  
 	 { 	 	 	 	  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 	 	  
 	 	 L i s t < H B W o r d >   l i s t L e m m a s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 { 	 	 	 	 	 	  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	  
 	 	 	 o R u l e . M a t c h F o r m ( o W o r d ,   l i s t L e m m a s ) ;  
 	 	 	 	 	 	  
 	 	 	 i n t   i L C   =   l i s t L e m m a s . s i z e ( ) ;  
 	 	 	 f o r ( i n t   j = 0 ;   j < i L C ;   j + + )  
 	 	 	 {  
 	 	 	 	 H B W o r d   o L e m m a   =   l i s t L e m m a s . g e t ( j ) ;  
 	 	 	 	 l i s t T r a n s f o r m s . a d d ( n e w   H B T r a n s f o r m ( o L e m m a ,   o R u l e ,   o W o r d ) ) ;  
 	 	 	 } 	 	 	 	  
 	 	 } 	 	  
 	 } 	  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " [ R u l e S e t   :   "   +   H e l a b a s a . a r r _ W o r d C a t e g o r i e s [ i _ T y p e ]   +   "   :   "   +     H e l a b a s a . a r r _ W o r d C a t e g o r i e s [ i _ S u b T y p e ]   +   "   =   "   +   o _ L e m m a . G e t N a t u r a l F o r m ( )   +   " ] < b r > \ n \ r " ) ;  
 	 	  
 	 	 i n t   i C o u n t   =   l i s t _ R u l e s . s i z e ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B T r a n s f o r m R u l e   o R u l e   =   l i s t _ R u l e s . g e t ( i ) ; 	 	 	  
 	 	 	 o R u l e . D e b u g P r i n t ( ) ;  
 	 	 } 	 	  
 	 	  
 	 }  
 	  
 / / 	 / / R e t u r n s   a   n o r m a l i z e d   L e m m a   f o r m   o f   t h e   g i v e n   w o r d   a c c o r d i n g   t o   t h i s   r u l e  
 / / 	 p u b l i c   H B W o r d   G e n e r a t e L e m m a ( H B W o r d   o W o r d )  
 / / 	 {  
 / / 	 	 r e t u r n   o _ L e m m a . E x t r a c t V a r i a b l e P a r t ( o W o r d ) ; 	 	  
 / / 	 } 	  
 	  
 	  
 / / 	 N N - L M = * G  
 / / 	 P R - D S = L M +�  
 / / 	 P R - I S = L M +���  
 / / 	 P R - P L = L M +�  
 / / 	 K R - D S = L M +�  
 / / 	 K R - I S = L M +���  
 / / 	 K R - P L = L M +���  
 / / 	 A L - D S = L M +�  
 / / 	 A L - D S = L M +����  
 / / 	 A L - P L = L M +���  
 / / 	 A L - P L = L M +���  
 	  
 	 p u b l i c   v o i d   E x t r a c t R u l e ( S t r i n g   s R u l e )  
 	 {  
 	 	 S t r i n g   s B a s e T o k s [ ]   =   s R u l e . s p l i t ( " [ - = + ] " ) ;  
 	 	 i f ( s B a s e T o k s . l e n g t h < 3 )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   E x t r a c t R u l e   :   I n c o r r e c t   L e n g t h   [ "   +   s B a s e T o k s . l e n g t h   +   " ]   i n   E n t r y   :   "   +   s R u l e   +   " < b r > " ) ;  
 	 	 	 r e t u r n ;  
 	 	 }  
 	 	 	  
 	 	 i n t   i T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 0 ] ) . i n t V a l u e ( ) ;  
 	 	 i n t   i S u b T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 1 ] ) . i n t V a l u e ( ) ;  
 	 	 S t r i n g   s V a l   =   s B a s e T o k s [ 2 ] ;  
 	 	  
 	 	 H B T r a n s f o r m R u l e   o R u l e   =   n u l l ;  
 	 	  
 	 	 i f ( s V a l . e q u a l s ( " L M " ) )  
 	 	 {  
 	 	 	 i f ( s B a s e T o k s . l e n g t h > 3 )  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ J O I N ,   s B a s e T o k s [ 3 ] ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   " " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 i f ( s B a s e T o k s [ 2 ] . l e n g t h ( ) > 2   & &   s B a s e T o k s [ 2 ] . s u b s t r i n g ( 0 ,   2 ) . e q u a l s ( H e l a b a s a . H B S _ L E M M A ) )  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   s B a s e T o k s [ 2 ] . s u b s t r i n g ( 2 ,   s B a s e T o k s [ 2 ] . l e n g t h ( ) - 2 ) ) ;  
 	 	 	 }  
 	 	 	 e l s e 	 	  
 	 	 	 {  
 	 	 	 	 o R u l e   =   n e w   H B T r a n s f o r m R u l e ( i T y p e ,   i S u b T y p e ,   H B T r a n s f o r m R u l e . H B T R _ A P P E N D ,   s B a s e T o k s [ 2 ] ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 t h i s . A d d R u l e ( o R u l e ) ; 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B T r a n s f o r m R u l e S e t   E x t r a c t R u l e S e t ( S t r i n g   s R u l e )  
 	 {  
 	 	 S t r i n g   s B a s e T o k s [ ]   =   s R u l e . s p l i t ( " [ - = ] " ) ;  
 	 	 i f ( s B a s e T o k s . l e n g t h < 3 )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   E x t r a c t R u l e   :   I n c o r r e c t   L e n g t h   [ "   +   s B a s e T o k s . l e n g t h   +   " ]   i n   E n t r y   :   "   +   s R u l e   +   " < b r > " ) ;  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	 	  
 	 	 i n t   i T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 0 ] ) . i n t V a l u e ( ) ;  
 	 	 i n t   i S u b T y p e   =   H e l a b a s a . m a p _ I D s . g e t ( s B a s e T o k s [ 1 ] ) . i n t V a l u e ( ) ;  
 	 	 H B T r a n s f o r m R u l e S e t   o R u l e S e t   =   n e w   H B T r a n s f o r m R u l e S e t ( i T y p e ,   i S u b T y p e ,   s B a s e T o k s [ 2 ] ) ;  
 	 	 r e t u r n   o R u l e S e t ;  
 	 }  
 	  
 	  
 	 p u b l i c   S t r i n g   G e t N a m e ( )    
 	 {  
 	 	 r e t u r n   s _ N a m e ;  
 	 }  
  
 	 p u b l i c   v o i d   S e t N a m e ( S t r i n g   s N a m e )    
 	 {  
 	 	 t h i s . s _ N a m e   =   s N a m e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t I D ( )  
 	 {  
 	 	 r e t u r n   i _ I D ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t I D ( i n t   i I D )  
 	 {  
 	 	 i _ I D   =   i I D ;  
 	 }  
 }  
