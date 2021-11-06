package com.company;

public class Point {
        private int x;
        private int y;

        public Point(int x, int y){
            if (x >= 0  && x <=400 && y >= 0 && y<=400) {
                this.x = x;
                this.y = y;
            }
        }

        public int getX() { return x; }
        public int getY() { return y; }

        public void setX(int x) {
            this.x = x;
        }
        public void setY(int y) {
            this.y = y;
        }

        public void moveBy(int dx, int dy) {
            setX(getX() + dx);
            setY(getY() + dy);
        }

}
