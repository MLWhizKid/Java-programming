public class lecture1_exercise {
    public static void main(String[] args) {
        System.out.println("     J     A     V     V      A");
        System.out.println("     J    A A     V   V      A A");
        System.out.println("J    J   AAAAA     V V      AAAAA");
        System.out.println(" J  J   A     A     V      A     A");
        System.out.println("------------------------------");
        // 第二问
        System.out.print("(9.5*4.5 - 2.5*3) / (45.5 - 3.5)=");
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        System.out.println("------------------------------");
        // 第三问
        double width = 4.5;
        double height = 7.9;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
        System.out.println("------------------------------");
        // 第四问
        // 当前人口
        int currentPopulation = 312032486;
        // 一年的秒数
        int secondsInYear = 365 * 24 * 60 * 60;

        // 每年的出生人数
        int birthsPerYear = secondsInYear / 7;
        // 每年的死亡人数
        int deathsPerYear = secondsInYear / 13;
        // 每年的新移民人数
        int immigrantsPerYear = secondsInYear / 45;

        // 每年的人口增加数
        int populationIncreasePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        // 初始化预测人口为当前人口
        int projectedPopulation = currentPopulation;

        System.out.println("Year\tProjected Population");
        System.out.println("------------------------------");
        System.out.println("Current\t" + currentPopulation);

        // 计算并显示未来五年的人口预测
        for (int year = 1; year <= 5; year++) {
            projectedPopulation += populationIncreasePerYear;
            System.out.println(year + "\t" + projectedPopulation);
        }
    }
}
