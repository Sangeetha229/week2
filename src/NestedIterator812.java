//import java.util.Iterator;
//import java.util.List;
//import java.util.*;
//
//public class NestedIterator812 implements Iterator<Integer> {
//    List<Integer> flattenList=null;
//    int current=0;
//
//    public NestedIterator812 (List<NestedInteger> nestedList) {
//        flattenList=new ArrayList<>();
//        for(int i =0 ; i < nestedList.size(); i++)
//        {
//            if(nestedList.get(i).isInteger())
//                flattenList.add(nestedList.get(i).getInteger());
//            else{
//                helper(nestedList.get(i));
//            }
//
//          /*for(NestedInteger  listvalue:nestedList){
//              helper(listvalue);
//          }*/
//        }
//    }
//
//    @Override
//    public Integer next() {
//        return flattenList.get(current++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return (current<flattenList.size());
//
//    }
//
//    private void helper(NestedInteger passedlistvalue){
//        if(passedlistvalue.isInteger()){
//            flattenList.add(passedlistvalue.getInteger());
//        }
//        else{
//            for(int i =0; i <passedlistvalue.getList().size();i++){
//                helper(passedlistvalue.getList().get(i));
//            }
//
//            /*for(NestedInteger  value:passedlistvalue.getList()){
//              helper(value);
//          }*/
//
//      }
//    }
//    public static void main(String[] args) {
//        int[][] image = {{1, 1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 0, 0},
//                {1, 0, 0, 1, 1, 0, 1, 1},
//                {1, 2, 2, 2, 2, 0, 1, 0},
//                {1, 1, 1, 2, 2, 0, 1, 0},
//                {1, 1, 1, 2, 2, 2, 2, 0},
//                {1, 1, 1, 1, 1, 2, 1, 1},
//                {1, 1, 1, 1, 1, 2, 2, 1},
//        };
//int[][] image = {};
//
//      ArrayList<Integer> nestedlist = new ArrayList<>();
//        //nestedlist={{1,2},{3},{4,5}};
//        falttenArray812 i = new falttenArray812(nestedList);
//  while (i.hasNext()) {
//      i.next();
//  }
//
//
//            }
//}
//
///**
// * Your NestedIterator object will be instantiated and called as such:
// * NestedIterator i = new NestedIterator(nestedList);
// * while (i.hasNext()) v[f()] = i.next();
// */
