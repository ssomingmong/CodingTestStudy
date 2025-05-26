// 1316_그룹 단어 체커

import java.io.*;

public class GroupWordCheckers_1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26];
            char prev = 0;
            boolean isGroup = true;

            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if(ch != prev) {
                    if(visited[ch - 'a']) {
                        isGroup = false;
                        break;
                    }

                    visited[ch - 'a'] = true;
                }

                prev = ch;
            }    

            if(isGroup) count++;
        }

        System.out.println(count);
    }
}
