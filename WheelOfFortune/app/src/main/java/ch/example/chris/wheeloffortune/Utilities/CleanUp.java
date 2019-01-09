package ch.example.chris.wheeloffortune.Utilities;

import android.os.Build;
import android.support.annotation.RequiresApi;
import java.io.File;
import java.io.FilenameFilter;

@RequiresApi(api = Build.VERSION_CODES.O)
public class CleanUp {
    private static File folder = new File(Constants.QR_CODE_IMAGE_BASE_PATH);
    private static String pngRegExpPattern= ".*png$";


    /**
     * Deletes all the .png files in the QRCodesTmp directory
     */
    public static void clearTemp(){
        //get all the png files
        File[] qr_images = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.matches(pngRegExpPattern);
            }
        });

        for(File file : qr_images){
            file.delete();
        }
    }
}
