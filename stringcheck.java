class stringcheck{
  public static void main(String ar[]){
    String s = "hi, how are you doing how";
    String r = "123124214";
    String a = "HI, HOW ARE YOU DOING HOW";
    String b = "  twe   ";
    System.out.println(s.contains("er"));
    System.out.println(r.equals(s));
    System.out.println(s.isEmpty());
    System.out.println(s.indexOf("z"));
    System.out.println(s.toUpperCase());
    System.out.println(a.toLowerCase());
    System.out.println(a.trim());
    System.out.println(a.replace("H", "e"));
    System.out.println(a.equalsIgnoreCase(s));
  }
}