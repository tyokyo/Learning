package download;


import java.util.ArrayList;
import java.util.List;

import download.myDownloader.Downloadable;
import download.myDownloader.Downloader;

class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Downloadable> list = new ArrayList<>();
        list.add(new Student(System.currentTimeMillis()+"","http://zzzia.net/cet/2016211551.jpg"));
        Thread.sleep(2);
        list.add(new Student(System.currentTimeMillis()+"","http://zzzia.net/cet/2016211552.jpg"));
        Thread.sleep(2);
        list.add(new Student(System.currentTimeMillis()+"","https://github.com/tyokyo/SIOEYE/blob/master/libs/commons-io-2.4.jar"));
        Thread.sleep(2);
        
        //链式批量下载
        Downloader.with(list)
                .setSavePath("E:\\Downloader")
                .setListener(System.out::println)
                .download();
    }

    static class Student implements Downloadable {
        private String name;
        private String url;

        Student(String name, String url) {
            this.name = name;
            this.url = url;
        }

        @Override
        public String getUrl() {
            return url;
        }

        @Override
        public String getFileName() {
            return name + ".jpg";
        }
    }
}