class 큰수의법칙 {
  public static void main(String[] args) {
    // N 원. 단, N은 항상 10의 배수.
    int n = 1260;
    int count = 0;

    int[] coinTypes = { 500, 100, 50, 10 }; // 큰 화폐부터 차례로 확인.
    for (int coin : coinTypes) {
      count += n;
      n %= coin;
      System.out.println(n +", "+ coin +", "+6);
    }

    System.out.println(count);
  }
}