import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.ArrayList;
import java.util.List;

public class User {
//    naoLidos: int timeline: Tweet[] myTweets: Tweet[] seguidores: User[] seguidos: User[]
    private int naoLidos;
    private List<Tweet> timeline;
    private List<Tweet> mytweets;
    protected List<User> seguidores;
    protected List<User> seguidos;
    public User(String username){                                               //def constructor(username): # nao esqueca de inicializar nenhum atributo
        this.naoLidos = naoLidos;
        this.timeline = new ArrayList<Tweet>();
        this.mytweets = new ArrayList<Tweet>();
        this.seguidores = new ArrayList<User>();
        this.seguidos = new ArrayList<User>();
    }
    //def twittar(tweet):
    public void twittar(Tweet){
        mytweets = Tweet ;
    }
    //def follow(other: User):
    public void follow(User User){
    }
    //def darLike(idTw):
    public <idTw> void darLoke(idTw){                   //rever

    }
    //def get unread():
    public int getNaoLidos() {
        return naoLidos;
    }
    //def get timeline():
    public List<Tweet> getTimeline() {
        return timeline;
    }
    public String toString(){
        return this.username;

    }
}

