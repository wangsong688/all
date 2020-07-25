package com.wss.all.util;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class ReadFile2Txt {

	public static void main(String[] args) {
        String filePath = "/Users/wangsongsong/IdeaProjects/ems-domain-facility-service/src/main";
        String outputPath1 = "/Users/wangsongsong/IdeaProjects/facility-全量代码.txt";
        try {
           mergeFiles(readFiles1(filePath, new ArrayList<String>()), outputPath1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static ArrayList<String> readFiles1(String path, ArrayList<String> fileNameList) {
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    readFiles1(files[i].getPath(), fileNameList);
                } else {
                    fileNameList.add(files[i].getPath());
                }
            }
        } else {
            fileNameList.add(file.getPath());
        }
        return fileNameList;
    }

	@SuppressWarnings("resource")
	public static boolean mergeFiles(List<String> fpaths, String resultPath) {
	    if (fpaths == null || fpaths.isEmpty()) {
	        return false;
	    }
	    if (fpaths.size() == 1) {
	        return new File(fpaths.get(0)).renameTo(new File(resultPath));
	    }
	 
	    File[] files = new File[fpaths.size()];
	    for (int i = 0; i < fpaths.size(); i ++) {
	        files[i] = new File(fpaths.get(i));
	        if (!files[i].exists() || !files[i].isFile()) {
	            return false;
	        }
	    }
	 
	    File resultFile = new File(resultPath);
	 
	    try {
	        FileChannel resultFileChannel = new FileOutputStream(resultFile, true).getChannel();
	        for (int i = 0; i < fpaths.size(); i ++) {
	            FileChannel blk = new FileInputStream(files[i]).getChannel();
	            resultFileChannel.transferFrom(blk, resultFileChannel.size(), blk.size());
	            blk.close();
	        }
	        resultFileChannel.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	        return false;
	    } catch (IOException e) {
	        e.printStackTrace();
	        return false;
	    }
	 
	    return true;
	}


}
