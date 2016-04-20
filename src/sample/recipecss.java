package sample;

/**
 * Created by burak on 4/18/16.
 */
public class recipecss {
    public  static String recipecss(){
        String code ="" +
                "section.recipe-container{\n" +
                "    width: 583px;\n" +
                "    font-family: Arial;\n" +
                "    border: 1px dashed black;\n" +
                "    padding: 0 10px 10px 10px;\n" +
                "    color: #596767;\n" +
                "}\n" +
                "\n" +
                "    header.recipe-header{\n" +
                "        font-weight: bold;\n" +
                "        font-size: 20px;\n" +
                "        margin: 10px 0;\n" +
                "    }\n" +
                "    div.recipe-prep {\n" +
                "        position: relative;\n" +
                "        display: inline-block;\n" +
                "        width: 365px;\n" +
                "        min-height: 400px;\n" +
                "    }\n" +
                "        table.recipe-table{\n" +
                "            border-bottom: 1px dotted black;\n" +
                "            border-top: 1px dotted black;\n" +
                "            width: 365px;\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 15px;\n" +
                "        }\n" +
                "\n" +
                "            table.recipe-table td h3{\n" +
                "                margin: 0 auto;\n" +
                "                font-size: 15px;\n" +
                "            }\n" +
                "\n" +
                "            table.recipe-table td p{\n" +
                "                margin: 0 auto;\n" +
                "                font-size: 12px;\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "    div.recipe-image{\n" +
                "        position: absolute;\n" +
                "        display: inline-block;\n" +
                "        min-height: 400px;\n" +
                "        margin-left: 5px;\n" +
                "\n" +
                "    }\n" +
                "        div.recipe-image img{\n" +
                "            width: 205px;\n" +
                "            position: relative;\n" +
                "            vertical-align: middle;\n" +
                "        }\n" +
                "\n" +
                "        div.recipe-image button.recipe-print{\n" +
                "            margin:10px auto;\n" +
                "            width: 205px ;\n" +
                "            border: 1px solid black;\n" +
                "            background-color: white;\n" +
                "        }\n" +
                "        div.recipe-image button.recipe-print:hover{\n" +
                "            background-color: #596767;\n" +
                "            color: white;\n" +
                "            cursor: hand;\n" +
                "        }\n" +
                "        div.recipe-image button.recipe-print:focus{\n" +
                "            background-color: black;\n" +
                "            color: white;\n" +
                "            cursor: hand;\n" +
                "        }";
        return code;
    }
}
