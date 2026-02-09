"""Program to demonstrate matrix addition."""

def add_matrices(A, B):
    if len(A) != len(B) or len(A[0]) != len(B[0]):
        return None
    result = []
    for i in range(len(A)):
        row = []
        for j in range(len(A[0])):
            row.append(A[i][j] + B[i][j])
        result.append(row)
    return result

A = [[1, 2], [3, 4]]
B = [[5, 6], [7, 8]]
C = add_matrices(A, B)
print("A:", A)
print("B:", B)
print("A + B:", C)
