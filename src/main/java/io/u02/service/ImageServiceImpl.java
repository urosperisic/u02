package io.u02.service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    private static final Logger LOG = LoggerFactory.getLogger(ImageServiceImpl.class);

    @Override
    public String downloadImage() {

        File image = new File("C:\\Users\\u\\Desktop\\b.jpg");

        try {
            URL url = new URL("https://assets.manutd.com/AssetPicker/images/0/0/11/204/773332/GettyImages-93003640411550658313247_large.jpg");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            BufferedInputStream in = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(image);
            BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read = in.read(buffer, 0, 1024)) >= 0) {
                bout.write(buffer, 0 , read);
            }
            bout.close();
            in.close();
            LOG.info("Download complete from URL");
        } catch (IOException ex) {
            LOG.error("Failed to download image, '{}'", image, ex);
        }

        return "Download complete";

    }

    @Override
    public String downloadImage(String fileName) {

        File dir = new File("C:\\Users\\u\\Desktop\\");
        File f = new File(dir, fileName);
        File image = new File("C:\\Users\\u\\Desktop\\a.jpg");

        if (f.exists()) {
            try {
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
                FileOutputStream fos = new FileOutputStream(image);
                BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
                byte[] buffer = new byte[1024];
                int read = 0;
                while ((read = in.read(buffer, 0, 1024)) >= 0) {
                    bout.write(buffer, 0 , read);
                }
                bout.close();
                in.close();
                LOG.info("Download complete from local");
            } catch (IOException ex) {
                LOG.error("Failed to download image, '{}'", image, ex);
            }
            return "Download file " + fileName;
        }

        return "File not found";

    }

}
