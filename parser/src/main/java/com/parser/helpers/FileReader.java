package com.parser.helpers;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    public FileReader(){}

    public List<String> getFilesString(String path){
        List<File> files = listFiles(path);
        List<String> filesData = files.stream().map(this::getStringFromFile).collect(Collectors.toList());
        return filesData;
    }


    private String getStringFromFile(File file){
        String result = null;
        try {
            result = FileUtils.readFileToString(file, String.valueOf(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private List<File> listFiles(String path){
        String[] ext = {"java"};
        List<File> allFiles = (List<File>) FileUtils.listFiles(new File(path), ext,true);
        return allFiles;
    }

}
