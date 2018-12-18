class XMinusY {

    int xminusY(int[] array) {
        int X = 0;
        int Y = 0;
        for (int num : array) {
            if (num % 2 == 0){
                Y += num;
            }else {
                X += num;
            }
        }
        return X - Y;
    }
}
