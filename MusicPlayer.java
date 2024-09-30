
public class MusicPlayer
{
private String Music;
public MusicPlayer(){
Music = "Tidak ada Lagu";
}
public void startPlaying(String filename)
{
Music = filename;
System.out.println("Sedang memutar: "+Music);
}
}