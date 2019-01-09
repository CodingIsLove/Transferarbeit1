package ch.example.chris.wheeloffortune.Utilities;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.zxing.WriterException;

import java.io.IOException;

public class Test {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) throws IOException, WriterException {



        QRInput[] qrInputs = {new QRInput("www.google.ch","Google"),
                new QRInput("www.gmail.com","gmail"), new QRInput("www.facebook.com","Facebook"),
                new QRInput("www.stackoverflow.com","Stackoverflow")};




        // Generate all the QRCodes
        for(QRInput qrInput : qrInputs){
            QRGenerator.generateQRCodeImage(qrInput.getContent(),qrInput.getFileName());
        }


    }



}
