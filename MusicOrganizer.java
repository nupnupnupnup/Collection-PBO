import java.util.ArrayList;

public class MusicOrganizer
{
private ArrayList<String> files;
private MusicPlayer player;
public MusicOrganizer()
{
files = new ArrayList<String>();
player = new MusicPlayer();
}
public void addFile(String filename)
{
files.add(filename);
}
public int getNumberOfFiles()
{
return files.size();
}
public void listFile(int index)
{
if(index >= 0 && index < files.size()) {
String filename = files.get(index);
System.out.println(filename);
}
}
public void listAllFiles()
{
int i=0;
for(String filename : files){
System.out.println(i+": "+filename);
i++;
}
}
public void removeFile(int index)
{
if(index >= 0 && index < files.size()) {
files.remove(index);
}
}
public void startPlaying(int index)
{
if(validIndex(index)){
String filename = files.get(index);
player.startPlaying(filename);
}
}
public void playAndWait(int index)
{
if(validIndex(index)){
String filename = files.get(index);
player.startPlaying(filename);
}
}
public boolean validIndex(int index)
{
boolean valid;
if(index<0){
System.out.println("Index cannot be negative: "+index);
valid = false;
}
else if(index>= files.size()){
System.out.println("Index is too large: "+ index);
valid=false;
}
else{
valid = true;
}
return valid;
}
}