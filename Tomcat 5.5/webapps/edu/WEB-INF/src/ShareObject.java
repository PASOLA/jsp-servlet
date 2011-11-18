public class ShareObject{
private int count;
private String str;
public ShareObject(){
	count = 0;
	str ="";
	}
	public void setCount(int num){
		count += num;
		}
	public int getCount(){
	return count;
	}
	public void setStr(String s){
	str += s;
	}
	public String getStr(){
	return str;
	}
}		