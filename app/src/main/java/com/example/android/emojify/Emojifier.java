package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

/**
 * Created by Quang Huy on 8/28/2017.
 */

public class Emojifier {
    private static final String TAG = "Emojifier";

    public static void detectFaces(Context context, Bitmap mResultsBitmap) {
        FaceDetector detector = new FaceDetector.Builder(context)
                .setTrackingEnabled(false)
                .setLandmarkType(FaceDetector.ALL_LANDMARKS)
                .build();
        Frame frame = new Frame.Builder().setBitmap(mResultsBitmap).build();
        SparseArray<Face> faces = detector.detect(frame);
        Log.d(TAG, "detectFaces: num = " + faces.size());
    }
}
