import java.util.Stack;

/*
 * Take an absolute path and reduce it: 
 * /a/b/../foo.txt -> /a/foo.txt,
 *  /a/../b/./foo.txt -> /b/foo.txt
 */
public class Problem1 {
	public String reducePath(String path){
		String[] parts = path.split("/");
		Stack<String> absPath = new Stack<>();
		for(String s: parts){
			if(s.equals("..")){
				absPath.pop();
			}else if (!s.equals(".")){
				absPath.push(s);
			}
		}
		
		return "/"+ absPath.toArray().toString();
		
	}
}
