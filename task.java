import java.io.*;

public class task {
    public static void main(String[] args) throws Exception {
        String data = "";
        File fr = new File("file.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(fr))) {
            String line;
            while ((line = br.readLine()) != null) {
                data += line + " ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array = data.replace("b ", "").replace(" a", "").split(" ");
        int a = Integer.parseInt(array[1]);
        int b = Integer.parseInt(array[0]);
        System.out.println(a);
        System.out.println(b);

        double pow_sol = pow(a, b);
        System.out.println(pow_sol);

        File result = new File("result.txt");
        PrintWriter res = new PrintWriter(result);
        res.println("Result :" + pow_sol);
        res.close();

    }

    public static double pow(int a, int b) {
        double res = a;
        if (b > 0) {
            for (int i = 0; i < b - 1; i++) {
                res = res * a;
            }
        } else if (b <= 0) {
            for (int i = 0; i >= b; i--) {
                res = res / a;
            }
        }
        return res;
    }
}