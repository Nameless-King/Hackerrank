if __name__ == '__main__':
    l_student_grades = []
    smallest = None
    for _ in range(int(input())):
        name = input()
        score = float(input())
        if smallest == None or score < smallest:
            smallest = score
        l_student_grades.append([name,score])

    second_smallest = None
    for item in l_student_grades:
        if (second_smallest == None or item[1] < second_smallest) and item[1]!= smallest:
            second_smallest = item[1]
        
 
    l_second_last =[]
    [l_second_last.append(item) for item in l_student_grades if item[1]==second_smallest]
    l_second_last.sort(key=lambda x: x[0])
    for item in l_second_last:
        print(item[0])
