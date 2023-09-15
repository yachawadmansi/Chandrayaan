public class spacecraft {
    protected int x;
    protected int y;
    protected int z;
    protected char currentDirection;
    public spacecraft(int x, int y, int z, char initialDirection) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.currentDirection = initialDirection;
    }

    public String getCurrentPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public char getCurrentDirection() {
        return currentDirection;
    }
    public void moveForward() {
        switch (currentDirection) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }
    public void moveBackward() {
        switch (currentDirection) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }
    public void turnLeft() {
        switch (currentDirection) {
            case 'N':
                currentDirection = 'W';
                break;
            case 'S':
                currentDirection = 'E';
                break;
            case 'E':
                currentDirection = 'N';
                break;
            case 'W':
                currentDirection = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (currentDirection) {
            case 'N':
                currentDirection = 'E';
                break;
            case 'S':
                currentDirection = 'W';
                break;
            case 'E':
                currentDirection = 'S';
                break;
            case 'W':
                currentDirection = 'N';
                break;
        }
    }

    void turnUp() {
        if (currentDirection != 'U') {
            currentDirection = 'U';
        }
    }

    // Method to turn the spacecraft down
    void turnDown() {
        if (currentDirection != 'D') {
            currentDirection = 'D';
        }
    }
}
