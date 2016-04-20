package sample;

/**
 * Created by burak on 4/18/16.
 */
public class recipehtml {
    public static String recipehtml(){
        String code = "" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Recipe</title>\n" +
                "\n" +
                "    <!-- The css code should be in the same location with html code and css folder.-->\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/recipe.css\"/>\n" +
                "\n" +
                "</head>\n" +
                "<body>\n" +
                "<!-- Code Beginning-->\n" +
                "    <section class=\"recipe-container\">\n" +
                "        <!-- Header-->\n" +
                "        <header class=\"recipe-header\">#</header>\n" +
                "        <article>\n" +
                "            <div class=\"recipe-prep\">\n" +
                "                <table class=\"recipe-table\">\n" +
                "                    <td>\n" +
                "                        <!-- Preparing time-->\n" +
                "                        <h3 class=\"recipe-table-h\">Preparing Time</h3>\n" +
                "                        <!-- time-->\n" +
                "                        <p># min</p>\n" +
                "                    </td>\n" +
                "\n" +
                "                    <td style=\"border-left: 1px solid black;border-right: 1px solid black; \">\n" +
                "                        <!-- Cooking Time -->\n" +
                "                        <h3 class=\"recipe-table-h\" >Cooking Time</h3>\n" +
                "                        <!--Time-->\n" +
                "                        <p># min</p>\n" +
                "                    </td>\n" +
                "\n" +
                "                    <td>\n" +
                "                        <!-- Total Time.-->\n" +
                "                        <h3 class=\"recipe-table-h\">Total Time</h3>\n" +
                "                        <!-- Time.-->\n" +
                "                        <p># min</p>\n" +
                "                    </td>\n" +
                "                </table>\n" +
                "\n" +
                "\n" +
                "                <!-- Explanation Area -->\n" +
                "                <p>\n" +
                "                    #\n" +
                "                </p>\n" +
                "                \n" +
                "                <h2 class=\"recipe-header2\">Ingredients</h2>\n" +
                "                <ul class=\"recipe-list\">\n" +
                "                    #\n" +
                "                </ul>\n" +
                "\n" +
                "            </div>\n" +
                "            <div class=\"recipe-image\">\n" +
                "\n" +
                "                <img src=\"#\"/>\n" +
                "                <br/>\n" +
                "                <button onclick=\"myFunction()\" class=\"recipe-print\">Print</button>\n" +
                "            </div>\n" +
                "            <div class=\"recipe-inst\">\n" +
                "                <h2 class=\"recipe-header2\">Instructions</h2>\n" +
                "                <!-- Instructions -->\n" +
                "\n" +
                "                <ol>\n" +
                "                    #\n" +
                "                </ol>\n" +
                "\n" +
                "                <h2 class=\"recipe-header2\">Notes</h2>\n" +
                "                <!-- Notes-->\n" +
                "                <p>#</p>\n" +
                "            </div>\n" +
                "        </article>\n" +
                "\n" +
                "    </section>\n" +
                "    <script>\n" +
                "        function myFunction() {\n" +
                "            window.print();\n" +
                "        }\n" +
                "    </script>\n" +
                "<!-- Code End-->\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        return code;
    }
}
