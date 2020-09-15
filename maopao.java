package zhangyanbin;
	public class maopao { 
		  public static void main(String[] args) {
		  int a[] = { 6, 18, 333, 7, 2, 4, 444, 999, 687 };
		  int i, j, n, temp;
		  n = a.length;
		  for (j = 0; j < n; j++) {
		  for (i = 0; i < n - j; i++) {
		  try {
		  if (a[i] > a[i + 1]) {
		  temp = a[i];
		  a[i] = a[i + 1];
		  a[i + 1] = temp;
		  }
		  } catch (Exception e) {  
		  }
		  }
		  }
		  for (i = 0; i < n; i++) {
		  System.out.print(a[i] + " ");
		  }
		  }
		  }
