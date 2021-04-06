package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2525">
 * https://www.acmicpc.net/problem/2525
 * </a>
 */
public class BOJ_2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = parseInt(st.nextToken());
        int minute = parseInt(st.nextToken());
        int plusMinute = parseInt(br.readLine());

        String result = DateTimeFormatter
                .ofPattern("H m")
                .format(LocalTime.of(hour, minute).plusMinutes(plusMinute));

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }

}