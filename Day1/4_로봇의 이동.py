def solution(moves):
    r = c = 0
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    direction = 1 # 로봇의 방향 변수 - 인덱스 1(3시 방향)
    for cmd in moves:
        if cmd == 'G':
            r = r + dr[direction]
            c = c + dc[direction]
        elif cmd == 'R':
            direction = (direction + 1) % 4
        elif cmd == 'L':
            direction = (direction + 3) % 4
            # 반대방향으로 가고 싶으면 빼면 된다.


    return [r, c]


print(solution('GGGRGGG'))
print(solution('GGRGGG'))
print(solution('GGGGGGGRGGGRGGRGGGLGGG'))
print(solution('GGLLLGLGGG'))
