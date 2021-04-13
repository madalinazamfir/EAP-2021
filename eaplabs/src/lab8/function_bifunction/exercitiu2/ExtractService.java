package lab8.function_bifunction.exercitiu2;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExtractService {

    public String extractStringFromHtml(String text) {
        String withoutHtmlTags = removeHtmlTags(text);
        return removeSpace(withoutHtmlTags);
    }

    public String extractWithCompose(String text) {
        UnaryOperator<String> removeHtmlTagsFunction = param -> {
            String result = new String();
            while (param.contains("<") || param.contains(">")) {
                int tagOpenIndex = param.indexOf("<");
                int tagCloseIntex = param.indexOf(">");
                param = param.replace(param.substring(tagOpenIndex, tagCloseIntex + 1), "");
            }
            return param;
        };
        UnaryOperator<String> removeSpaceFunction = String::trim;
        Function<String, String> composed = removeHtmlTagsFunction.andThen(removeSpaceFunction);
        return composed.apply(text);
    }

    private String removeHtmlTags(String text) {
        UnaryOperator<String> removeHtmlTagsFunction = param -> {
            String result = new String();
            while (param.contains("<") || param.contains(">")) {
                int tagOpenIndex = param.indexOf("<");
                int tagCloseIntex = param.indexOf(">");
                param = param.replace(param.substring(tagOpenIndex, tagCloseIntex + 1), "");
            }
            return param;
        };
        return  removeHtmlTagsFunction.apply(text);
    }

    private String removeSpace(String text) {
        UnaryOperator<String> removeSpaceFunction = String::trim;
        return removeSpaceFunction.apply(text);
    }

}
