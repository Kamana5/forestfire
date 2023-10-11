# forestfire

The forest fire model is a very simple model of the evolution of a forest over a long period of time. In the model, the forest is represented by a regular grid of cells where each cell is in one of three possible states:

- the cell is empty
- the cell is occupied by a living tree
- the cell is burning
The lifetime of a tree starts when it is born and the lifetime ends when the tree dies by burning in a forest fire. To update the state of a cell, we apply the following four rules to all cells simultaneously:

a burning cell becomes empty (marking the death of a tree)
a cell occupied by a living tree becomes burning if at least one nearby cell is also burning
a cell occupied by a living tree is struck by lightning and becomes burning with some probability 
a cell that is empty grows a tree with some probability  (marking the birth of new tree)

Note: This is a CISC 124 school project
