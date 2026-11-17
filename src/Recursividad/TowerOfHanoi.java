package Recursividad;

public class TowerOfHanoi{
    private int totalDisk;
   
    public TowerOfHanoi(int totalDisk){
        this.totalDisk = totalDisk;
    }

    public void solve(){
        moveTower(totalDisk,1,3,2);    
    }

    private void moveTower(int numDisk,int start, int end, int temp){
        if(numDisk==1){
           moveOneDisk(start,end);
        }else{
            moveTower(numDisk-1,start,temp,end);
            moveOneDisk(start,end);
            moveTower(numDisk-1,temp,end,start);
        }
    }

    private void moveOneDisk(int start, int end){
        System.out.println("Move one disk from " + start + " to " + end);
    }
}
