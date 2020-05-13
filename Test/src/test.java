public class test {
    public static void main(String[] args) {
        test tt = new test();
        String s = translate("ISO-8859-1");
        System.out.println(s);
    }
    public static String translate(String str){
        String temp = "";
        try{
            temp = new String(str.getBytes(),"GBK");
            temp = temp.trim();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return temp;
    }
}
