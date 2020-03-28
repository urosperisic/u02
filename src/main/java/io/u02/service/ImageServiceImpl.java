package io.u02.service;

import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class ImageServiceImpl implements ImageService {
    @Override
    public String[] downloadImage() {

        File slika = new File("C:\\Users\\u\\Desktop\\a.jpg");

        try {
            URL url = new URL("https://assets.manutd.com/AssetPicker/images/0/0/11/204/773332/GettyImages-93003640411550658313247_large.jpg");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(slika);
            BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = in.read(buffer, 0, 1024)) >= 0) {
                bout.write(buffer, 0 , read);
            }
            bout.close();
            in.close();
            System.out.println("Download Complete!!!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File file = new File("C:\\Users\\u\\Desktop");
        return file.list();
    }

}
