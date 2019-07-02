public class Tweet {
    protected int idTw;
    private String username;
    protected String msg;
    public Tweet(int idTw, String username, String msg){
        this.idTw = idTw;
        this.username = username;
        this.msg = username;
    }
    public void darLike(String username){
    }
    //def toString():
      //      # saida = _idTw _username: _msg {likes}
    public String toString(){
        return "_idTW:" + " " + idTw + "_usearname:" + " " + username + "_msg:"; //falta o like

    }

}

