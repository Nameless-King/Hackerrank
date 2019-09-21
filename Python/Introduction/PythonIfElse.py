import os
import math
import random
import re
import sys

if __name == '__main__':
    n = int(input().strip())
    if n % 2 != 0:
        print("Weird")
    else:
        if n in (2,4) or n > 20:
            print("Not Weird")
        else:
            print("Weird") 
