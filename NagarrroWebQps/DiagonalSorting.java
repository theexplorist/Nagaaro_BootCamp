package NagarrroWebQps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalSorting {

	private static void sortSol(int[][] mat, int cr, int cc) {
		// TODO Auto-generated method stub

		List<Integer> diagonal = new ArrayList<>();
		int r = cr;
		int c = cc;
		while(r < mat.length && c < mat[0].length) {
			diagonal.add(mat[r][c]);
			r++;
			c++;
		}
		Collections.sort(diagonal);
		System.out.println(diagonal);
		
		int index  = 0;
		while(cr < mat.length && cc < mat[0].length) {
			mat[cr][cc] = diagonal.get(index);
			cr++;
			cc++;
			index++;
		}
		
		//System.out.println(Arrays.deepToString(mat));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		sortSol(mat, 0, 0);
		
		for(int cr = 0; cr < mat.length; cr++) {
			sortSol(mat, cr, 0);
		}
		
		//System.out.println(Arrays.deepToString(mat));
		
		for(int cc = 0; cc < mat[0].length; cc++) {
			sortSol(mat, 0, cc);
		}
		
		System.out.println(Arrays.deepToString(mat));
	}

}
