import java.util.HashSet;
class dup{
    public static void main(String[] args){
    
    int[] arr={12, 10, 9, 45, 2, 10, 10, 45};
    HashSet<Integer> seen=new HashSet<>();
    HashSet<Integer> duplicates=new HashSet<>();
    for(int num:arr){
        if(!seen.add(num)){
            duplicates.add(num);
        }
    }
    System.out.println(duplicates);
    System.out.println(seen);
}
}