package Session04.Bai6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {

        String review =
                "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};
        for (String badWord : blacklist) {
            String regex = "(?i)" + Pattern.quote(badWord);
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuffer sb = new StringBuffer();

            while (matcher.find()) {
                String stars = "**".repeat(matcher.group().length());
                matcher.appendReplacement(sb, stars);
            }
            matcher.appendTail(sb);
            review = sb.toString();
        }
        int previewLength = 40;

        if (review.length() > previewLength) {
            int cutIndex = review.substring(0, previewLength).lastIndexOf(" ");
            if (cutIndex == -1) cutIndex = previewLength;

            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cutIndex));
            sb.append("...");

            review = sb.toString();
        }
        System.out.println("Review sau khi xử lý: " + review);
    }
}
