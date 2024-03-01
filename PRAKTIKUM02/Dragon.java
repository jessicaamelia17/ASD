public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon ( int newX, int newY, int newDirection ){
        x = newX;
        y = newY;
        direction = newDirection;
    }

    public void changeDirection(int newDirection){
        if (newDirection>=1&&newDirection<=4){
            direction = newDirection;
        } else{
            System.out.println("Arah baru tidak valid. Arah harus berada di antara 1 hingga 4");
        }
    }

    public void move(int steps){
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
            default:
                System.out.println("Tidak valid");
        }
    }

    public void printStatus(){
        System.out.println("Posisi Dragon: (" + x + ", " + y+ ")");
        System.out.println("Arah Dragon: " + direction);
    }
}
