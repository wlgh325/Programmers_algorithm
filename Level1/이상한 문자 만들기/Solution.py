def solution(s):
    new = ""    # 변경된 새 문자
    idx = 0 # 단어의 index
    # 문자 하나씩 꺼내기
    for c in s:
        # 공백이 아닌 경우 홀수/짝수 idx인지 나누기
        if c != ' ':
            if idx % 2 == 0:
                new += c.upper()
            else:
                new += c.lower()
            idx+=1
        else:
            # 공백인 경우 공백 추가하고 idx 초기화
            new += " "
            idx=0
    return new