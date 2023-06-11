import java.io.*;
class CountingConsonants{
public static void main(String args[])throws Exception{
FileReader r=new FileReader("c:\\yash\\a.txt");
BufferedReader br=new BufferedReader(r);
int i;
int count=0;
while((i=br.read())!=-1){
if(((char)i>'A'&&(char)i<'Z')||((char)i>'a'&&(char)i<'z')){
if((char)i!='a'&&(char)i!='e'&&(char)i!='i'&&(char)i!='o'&&(char)i!='u'&&(char)i!='A'&&(char)i!='E'&&(char)i!='I'&&(char)i!='O'&&(char)i!='U'){
  count++;
}
}
}
r.close();
 br.close();
 System.out.println("Vowels are : " +count++);
        
}
}