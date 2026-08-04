class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        res = []
        for str in strs:
            sortedString = ''.join(sorted(str))
            if sortedString in map:
                tempList = map.get(sortedString)
                tempList.append(str)
                map[sortedString] = tempList
            else:
                tempList = []
                tempList.append(str)
                map[sortedString] = tempList

        for List in map.values():
            res.append(List)
        return res