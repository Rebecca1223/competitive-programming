class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count = 0
        for person in details:
            if int(person[11]) > 6 or (int(person[11]) == 6 and int(person[12]) > 0):
                count += 1
                
        return count