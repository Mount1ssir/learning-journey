class Solution:
    def isValid(self, s: str) -> bool:
        o=['(' , '{' , '[']
        c=[')' , '}' , ']']
        m={")":"(","]":"[","}":"{"}
        pile=[]
        for x in s : 
            if x in o : 
                pile.append(x)
            else : 
                if len(pile)==0 or m[x]!=pile[-1]: 
                    return False
                else : 
                    pile.pop()
        if len(pile)==0 : 
            return True
        else : 
            return False