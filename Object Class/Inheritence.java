public class Inheritence {
  public static void main(String[] args) {

    Whatsapp a = new Whatsapp();
    Facebook b = new Facebook();
    Instagram c = new Instagram();
    Snapchat d = new Snapchat();

    a.text();

    b.post();
    b.text();

    c.story();
    c.post();
    c.text();
    
    System.out.println(d.take_snap());
    
  }
}

  class Whatsapp{
    void text()
    {
      System.out.println("Texting can be possible");
    }
  }

  class Facebook extends Whatsapp{  //Single Inheritence
    void post()
    {
      System.out.println("Posting can be possible");
    }
  }

  class Instagram extends Facebook{  //Multilevel Inheritence
    void story()
    {
      System.out.println("Uploading story is possible");

    }
    @Override
    void text()
    {
      System.out.println("Sending Reels also possible");
    }
  }

  class Snapchat extends Instagram{
    boolean can_post= false;
    int can_snap= 0;

    public int take_snap() {
        return can_snap;
    }
}
