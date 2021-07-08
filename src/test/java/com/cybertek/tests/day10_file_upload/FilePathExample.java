package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){
        //Jamal's fullPath
        // /Users/jamaldemir/IdeaProjects/fromgit/EU3TestNGSelenium/src/test/resources/textfile.txt

        // fullPath =    C:\Users\ADMIN\IdeaProjects\EU3TestNGSelenium/src/test/resources/textfile.txt
        // projectPath = C:\Users\ADMIN\IdeaProjects\EU3TestNGSelenium
        //System.out.println(System.getProperty("user.dir"));   --> projectPath

        System.out.println(System.getProperty("os.name"));
        String projectPath = System.getProperty("user.dir");

        System.out.println("projectPath = " + projectPath);

        String filePath = "src/test/resources/textfile.txt";

        String fullPath = projectPath+"/"+filePath;
        System.out.println(fullPath);    //  --> fullPath

    }

}
