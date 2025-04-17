import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		int bottom = 0;
		int mid = 0;
		int top = ray.length - 1;
		int secret = item;
		while(bottom <= top)
		{
			mid = (bottom + top) / 2;
			if(ray[mid] < secret)
			{
				bottom = mid + 1;
			}
			else if(ray[mid] > secret)
			{
				top = mid - 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
