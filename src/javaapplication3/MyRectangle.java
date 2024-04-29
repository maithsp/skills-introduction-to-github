public class MyRectangle {
    public int botx;
    public int boty;
    public int topx;
    public int topy;
    private int area;

    public MyRectangle(int bx, int by, int tx, int ty){
        botx=bx;
        boty=by;
        topx=tx;
        topy=ty;
    }

    public int area(){
        area=(topx-botx)*(topy-boty);
        return area;
    }

    public MyRectangle overlap(MyRectangle rect1, MyRectangle rect2){
        MyRectangle returnRectangle;
        if ((rect2.topx-rect1.botx)>0 && (rect2.topy-rect1.boty)>0) {   ///if there is an overlapping
            returnRectangle = new MyRectangle((rect2.botx-rect1.botx),
                    (rect2.boty-rect1.boty),
                    (rect2.topx-rect1.topx),
                    (rect2.topy-rect1.topy));
        }
        else {
            returnRectangle = new MyRectangle(0,0,0,0); ///if not,create an empty square
        }
        return returnRectangle;
    }
}
