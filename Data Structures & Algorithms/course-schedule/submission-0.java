class Solution {

     Map<Integer, List<Integer>> preMap = new HashMap<>();

     Set<Integer> visitedSet = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }
        for(int[] prereq : prerequisites){
            preMap.get(prereq[0]).add(prereq[1]);
        }

        for(int course=0;course<numCourses;course++){
            if(!dfs(course))
                return false;
        }
        return true;
    }

    public boolean dfs(int course){
        if(visitedSet.contains(course))
            return false;
        if(preMap.get(course).isEmpty())
            return true;
        visitedSet.add(course);
        for(int pre : preMap.get(course)){
            if(!dfs(pre))
                return false;
        }
        visitedSet.remove(course);
        preMap.put(course, new ArrayList<>());
        return true;
    }

}
