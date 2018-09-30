/******************************************************************************
 *  Name:    Jared Hunter
 *  NetID:   
 *  Precept: 
 *
 *  Partner Name:     Kyle Fackrell
 *  Partner NetID:    
 *  Partner Precept:  
 *
 *  Hours to complete assignment (optional):
 *
 ******************************************************************************/

Programming Assignment 2: Deques and Randomized Queues


/******************************************************************************
 *  Explain briefly how you implemented the randomized queue and deque.
 *  Which data structure did you choose (array, linked list, etc.)
 *  and why?
 *****************************************************************************/
 
For Deque we used a doubly linked list to easily access the first
and last items as well as the neighboring items using next and prev. 
For randomizedQueue we used an array since arrays are are more efficient 
when dealing with random items.

/******************************************************************************
 *  How much memory (in bytes) do your data types use to store n items
 *  in the worst case? Use the 64-bit memory cost model from Section
 *  1.4 of the textbook and use tilde notation to simplify your answer.
 *  Briefly justify your answers and show your work.
 *
 *  Do not include the memory for the items themselves (as this
 *  memory is allocated by the client and depends on the item type)
 *  or for any iterators, but do include the memory for the references
 *  to the items (in the underlying array or linked list).
 *****************************************************************************/
I don't think this is correct but I can't seem to figure this out.

Randomized Queue:   ~  __20N___  bytes

Deque:              ~  __40N___  bytes




/******************************************************************************
 *  Known bugs / limitations.
 *****************************************************************************/

None that I know of.

/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *****************************************************************************/

None

/******************************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 *****************************************************************************/
Jared: For me, I wrote the RandomizedQueue.java file, and helped with adding comments in Subset and Deque.
Kyle: I did the Deque.java and Subset.java files.

/******************************************************************************
 *  Describe any serious problems you encountered.                    
 *****************************************************************************/

Kyle: I kept getting ArrayIndexOutOfBoundsException when using 
"int k = Integer.valueOf(args[0]);" in subset. I eventually got it to work by 
puting an integer in program arguments (which ends up being k), entering k or more
strings in the console and hitting enter then ctrl+z. I feel like I got it to work 
by accident so I'm not certain if this was the right way to do it. 

/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 *****************************************************************************/
