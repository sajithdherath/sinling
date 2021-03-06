 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B S c o r i n g A l g o r i t h m R e g i s t r y ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   K n o w l e d g e B a s e M a n a g e r   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
 	  
  
 	  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         { 	 	 	  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 {  
 	 	 	 T a k e A c t i o n ( o R e q ,   o R e s ) ;  
 	 	 }  
         }  
 	  
 	 p u b l i c   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 d o G e t ( o R e q ,   o R e s ) ;          
         }  
 	  
 	 p r i v a t e   v o i d   T a k e A c t i o n ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
 	 {  
         	 S t r i n g   s L e m m a   =   o R e q . g e t P a r a m e t e r ( " h L e m m a " ) ;  
         	 S t r i n g   s R u l e S e t   =   o R e q . g e t P a r a m e t e r ( " h R u l e S e t " ) ;  
         	  
         	 S t r i n g   s C o n f   =   o R e q . g e t P a r a m e t e r ( " t C o n f " ) ;  
         	 S t r i n g   s O v e r w i t e   =   o R e q . g e t P a r a m e t e r ( " t O v e r w r i t e " ) ;  
         	 S t r i n g   s S o u r c e P a g e   =   o R e q . g e t P a r a m e t e r ( " h S o u r c e P a g e " ) ;  
         	         	         	  
         	         	  
         	 i n t   i R u l e S e t   =   0 ;  
         	  
         	 i f ( s C o n f ! = n u l l )  
         	 {  
         	 	 i f ( s L e m m a ! = n u l l   & &   s L e m m a ! = " "   & &   s R u l e S e t ! = n u l l   & &   s R u l e S e t ! = " " )  
         	 	 {  
         	 	 	 i R u l e S e t   =   I n t e g e r . p a r s e I n t ( s R u l e S e t ) ;  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " C o n f i r m i n g   :   L e m m a = "   +   s L e m m a   +   "   :   R u l e S e t = "   +   i R u l e S e t ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " N o   D a t a   t o   C o n f i r m   L e m m a " ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 }  
         	 e l s e   i f ( s O v e r w i t e ! = n u l l )  
         	 {  
         	 	 i f ( s L e m m a ! = n u l l   & &   s L e m m a ! = " " )  
         	 	 {         	 	 	  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " O v e r w r i t i n g   :   L e m m a = "   +   s L e m m a ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 	 e l s e  
         	 	 {  
         	 	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " N o   D a t a   t o   O w e r w r i t e L e m m a " ,   s S o u r c e P a g e ) ;  
         	 	 }  
         	 }         	  
         	 e l s e  
         	 {  
         	 	 P r i n t T e m p A c t i o n P a g e ( o R e s ,   " N o   V a l i d   A c t i o n " ,   s S o u r c e P a g e ) ;  
         	 }  
         	  
         	 / / o R e s . s e n d R e d i r e c t ( s S o u r c e P a g e ) ;  
 	 }  
 	  
         p r i v a t e   v o i d   P r i n t T e m p A c t i o n P a g e ( H t t p S e r v l e t R e s p o n s e   o R e s ,   S t r i n g   s T e x t ,   S t r i n g   s N e x t P a g e )   t h r o w s   I O E x c e p t i o n  
         {  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 1 6 b e " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   M e n u < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > < a   h r e f = ' . / a d m i n . h t m l ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / a > < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > "   +   s T e x t   +   "   < / h 3 > " ) ;  
                  
                 o u t . p r i n t l n ( " < f o r m   i d = ' f r e s p o n s e '   a c t i o n = ' . / "   +   s N e x t P a g e   +   " '   a l i g n = ' c e n t e r '   m e t h o d = ' g e t ' > " ) ;                  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > < i n p u t   t y p e = ' s u b m i t '   n a m e = ' b O k '   v a l u e = ' O k ' > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / f o r m > " ) ;  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;  
         }  
      
 }  
