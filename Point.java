public class Point {
    int x = 0;
    int y = 0;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int pos){
        x = pos;
        y = pos;
    }

    public Point(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String coordinate(){
        return "(" + x + ", " + y +")";
    }
    
    public String quadrant(){
        if (x > 0 && y > 0){
            return "I";
        }
        else if (x < 0 && y > 0){
            return "II";
        }
        else if (x < 0 && y < 0){
            return "III";
        }
        else if (x > 0 && y < 0){
            return "IV";
        }
        else if (x == 0 && y == 0){
            return "origin";
        }
        else return "on an axis";
    }


}
