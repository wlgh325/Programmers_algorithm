def solution(participant, completion):
    answer = ''
    
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if participant[i] == completion[i]:
            continue
        else:
            answer = participant[i]
            return answer
        
    answer = participant[len(participant) -1]
        
    '''
    for i in completion:
        if i in participant:
            participant.remove(i)
    
    answer = participant[0]
    '''
    
    
    return answer