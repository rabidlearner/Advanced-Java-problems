import java.util.*;
class Main
{
public static void transform(int[] arr)
{
Map<Integer, Integer> map = new TreeMap<>();

for (int i = 0; i < arr.length; i++) {
map.put(arr[i], i);
}

int rank = 1;

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
arr[entry.getValue()] = rank++;
}
}

public static void main(String[] args)
{
int[] A = { 7,2,10,9,5 };

transform(A);
System.out.println("The rank corresponding to each entry is as follows:");
System.out.println(Arrays.toString(A));
}
}