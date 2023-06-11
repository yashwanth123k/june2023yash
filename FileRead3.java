import java.io.*;
class FileRead3{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\yash\\a.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigits=0;
while((i=br.read())!=-1){
if(((char)i>=0)&&((char)i<=9))countDigits++;}
System.out.println("The digits is:"+countDigits);
br.close();
fr.close();
}
}