package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javax.swing.*;
import java.io.*;

public class Controller {

    public TextField tf_head;
    public TextField tf_time1;
    public TextField tf_time2;
    public TextField tf_time3;
    public TextField tf_img_url;
    public TextArea text_exp;
    public TextArea text_mat;
    public TextArea text_const;
    public TextArea text_note;
    public MenuItem menu_new;
    public MenuItem menu_close;
    public MenuItem menu_about;
    public TextArea text_complete;
    public Button btn_css;
    public Button btn_code;


    public void createCode(ActionEvent actionEvent) throws IOException {

        String myFile = recipehtml.recipehtml();
        String[] htmlFile = myFile.split("#"); //this part is devided html file by the "#" character

        String temp = htmlFile[0]+tf_head.getText()+htmlFile[1]+tf_time1.getText()+htmlFile[2]+
                tf_time2.getText()+htmlFile[3]+tf_time3.getText()+htmlFile[4]+text_exp.getText()+
                    htmlFile[5]+makeList(text_mat.getText())+htmlFile[6]+tf_img_url.getText()+htmlFile[7]+
                    makeList(text_const.getText())+htmlFile[8]+text_note.getText()+htmlFile[9];

        text_complete.setDisable(false);
        text_complete.setText(temp);

        tf_head.setDisable(true);
        tf_time1.setDisable(true);
        tf_time2.setDisable(true);
        tf_time3.setDisable(true);
        tf_img_url.setDisable(true);
        text_const.setDisable(true);
        text_exp.setDisable(true);
        text_mat.setDisable(true);
        text_note.setDisable(true);
        btn_code.setText("Clear Code!");
        btn_code.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Clear(e);
            }
        });
    }

    public void Clear(ActionEvent actionEvent) {
        tf_head.clear();
        tf_time1.clear();
        tf_time2.clear();
        tf_time3.clear();
        tf_img_url.clear();
        text_const.clear();
        text_exp.clear();
        text_mat.clear();
        text_note.clear();
        text_complete.clear();

        tf_head.setDisable(false);
        tf_time1.setDisable(false);
        tf_time2.setDisable(false);
        tf_time3.setDisable(false);
        tf_img_url.setDisable(false);
        text_const.setDisable(false);
        text_exp.setDisable(false);
        text_mat.setDisable(false);
        text_note.setDisable(false);
        text_complete.setDisable(true);
        btn_code.setText("Create Code!");
        btn_code.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                try {
                    createCode(e);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }

    public void getCssFile(ActionEvent actionEvent) throws IOException {

        String readed = recipecss.recipecss();
        String location = DirectionSelect(actionEvent);
        fileWrite(readed,"recipe.css",location);
    }

    public void menu_close(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void about(ActionEvent actionEvent) {


        JOptionPane.showMessageDialog(null,"                                                      Page Creator\n\n" +
                "\n" +
                        "This programs formats a website by using the data entered. \n" +
                        "\n" +
                        "\tNotes:\n" +
                        "\n" +
                        "* You should use \"#\" if you want to do listing inside the program. \n" +
                "(This also includes ingredients and instructions)\n" +
                        "\n" +
                        "* The input of \"image location\" must be 'http://..'\n" +
                        "\n" +
                        "* The css code that you get by pressing \"Get Css Code\" button should be in the \n" +
                "same location with html code and css folder."+
                "\n\n                                               www.burakkiymaz.com\n" +
                "                                                © 2016 Burak Kıymaz","About",1);
    }


    private String DirectionSelect(ActionEvent actionEvent){// this function selects a directory to be saved
        File selected =null;
        File defaultDirectory;
        DirectoryChooser choose = new DirectoryChooser();
        choose.setTitle("Select Save Folder");

        try {   //  default saving directory selection
            defaultDirectory = new File("C:/");
            choose.setInitialDirectory(defaultDirectory);
            selected = choose.showDialog(((Node)(actionEvent.getSource())).getScene().getWindow());
        }catch (Exception e){
            try {
                defaultDirectory = new File("/home");
                choose.setInitialDirectory(defaultDirectory);
                selected = choose.showDialog(((Node)(actionEvent.getSource())).getScene().getWindow());
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Your operating system could not be determined.");
            }
        }

        return selected.toString();
    }



    private void fileWrite(String myFile,String fileName, String selected) throws IOException {

        try {
            File f = new File(selected +"/"+fileName);
            if (f.exists()==false)
                f.createNewFile();
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(myFile);
            bw.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }

    private String makeList(String sentence){  // This function is put into the separated part with "#" seperator
        String[] temp = sentence.split("#");
        String done="";
        for (int i=1;i<temp.length;i++){
            done = done+"<li>"+temp[i]+"</li>\n";
        }
        return done;

    }



}
