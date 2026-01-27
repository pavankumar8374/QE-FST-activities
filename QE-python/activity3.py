n=True

while n==True:
    play=input('enter yes or no:')
    if play=='yes':
        player1=input('enter player1')
        player2=input('eneter player2')
        if (player1=='rock' and player2=='scissor') or (player1=='paper' and player2=='rock') or (player1=='scissor' and player2=='paper'):
            print('player1 wins')
        elif (player2=='rock' and player1=='scissor') or (player2=='paper' and player1=='rock') or (player2=='scissor' and player1=='paper'):
            print('player2 wins')
        else:
            print('draw')
       
    else:
        print('quit')
        n=False
    
     
    