def solution(board, k):
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    d = 1
    r, c = 0, 0
    cnt = 0
    n = len(board)
    
    while cnt < k:
        cnt += 1
        nr = r + dr[d]
        nc = c + dc[d]
        if nr < 0 or nr >= n or nc < 0 or nc >= n or board[nr][nc] == 1:
            d = (d+1) % 4
            continue
        r = nr
        c = nc

    return [r, c]
        


print(solution([[0, 0, 0, 0, 0],
                [0, 1, 1, 0, 0],
                [0, 0, 0, 0, 0],
                [1, 0, 1, 0, 1],
                [0, 0, 0, 0, 0]], 10))

print(solution([[0, 0, 0, 1, 0, 1],
                [0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 1],
                [1, 1, 0, 0, 1, 0],
                [0, 0, 0, 0, 0, 0],
                [0, 0, 0, 0, 0, 0]], 20))

print(solution([[0, 0, 1, 0, 0],
                [0, 1, 0, 0, 0],
                [0, 0, 0, 0, 0],
                [1, 0, 0, 0, 1],
                [0, 0, 0, 0, 0]], 25))
