# maze

Suppose we need to determine whether or not a particular maze can be solved. We will think of the maze as composed of tall thick green hedges surrounding numerous paths. There will be a single entrance to the maze and a place where we want to get: the goal. On the computer, a maze will be a two-dimensional array of characters such:


HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
H                                                    H                H                       H                H               H
H    HHHHHHH    HHHHH   H         H     HHHHHHHHHH   H HHHHH HHH   HHHH
H    H          H           H      H H    H    H           H      H       H               H     H      H       H
H    H    HHHHH   HHH     H   H     HHH     HHHHH    H H  H      HHHHH HHH HHH
E            H               H    H         H                       GH             H           H H   H     H       H 
HHH     HHHHHHH   HHHHHHH      H       H    H    H H HHHHHHH H HHH HH  HH
H H           H         H                H            H       H      H     H                         H             H H
H HHH HHHHH        HHHHHHHHH H      HH         H     H H HHHHH      HH  HHH H
H   H      H           H          H H                                 H      H         H     H            H          H
HHH       H H      HHH        H H HHH                HHH   HHH   HHH H HHHHHHH H H
H H   H H H                          H H              H              H            H         H   H H H       HH
H                                                                   H     H     H     H H H H    H   H   H H H   H
HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH


Where each 'H' represents the hedge, the 'E' represent the entrance to the maze, the 'G' represents the goal position and the blanks represent the paths between hedges. We will assume that the maze is stored in file called maze.

Write a Java programe to:
	1. Read in the maze.
	2. Mark all location tried with a dot "." and print the new maze to a file call maze.out.
	3. Print message to say whether there is a path to the goal or not.
