class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortDic = {}
        for s in strs:
            name = "".join(sorted(s))
            if name in sortDic:
                temp = sortDic.get(name)
                temp.append(s)
                sortDic[name] = temp
            else:
                sortDic[name] = [s]
        retArr = []
        for key in sortDic:
            retArr.append(sortDic.get(key))
        return retArr
