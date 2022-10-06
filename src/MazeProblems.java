import java.util.Arrays;

public class MazeProblems {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},
                          {true,true,true},
                          {true,true,true}};
        int[][] ar=new int[maze.length][maze[0].length];

        maze1("",maze,0,0,1,ar);

    }
    static void maze1(String p,boolean[][] maze,int r,int c,int step,int [][]ar){
        if(r==maze.length-1 && c==maze[0].length-1){
            ar[r][c]=step;
            System.out.println(p);
            for (int[]m:ar) {
                System.out.println(Arrays.toString(m));
            }
            return;
        }
        if(!maze[r][c])return;
        ar[r][c]=step;
        if(r< maze.length-1){
            maze1(p+"D",maze,r+1,c,step+1,ar);
        }
        if (c<maze[0].length-1){
            maze1(p+"R",maze,r,c+1,step+1,ar);
        }
        ar[r][c]=0;


    }
}
