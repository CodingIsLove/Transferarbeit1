package ch.example.chris.wheeloffortune.Utilities;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRGenerator {


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void generateQRCodeImage(String text, String fileName) throws WriterException, IOException
    {
        String filePath = Constants.QR_CODE_IMAGE_BASE_PATH + fileName + ".png";

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, Constants.QR_CODE_SIZE, Constants.QR_CODE_SIZE);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}
