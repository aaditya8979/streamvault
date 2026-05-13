package fh;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: OpenCameraInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61712a = "fh.d";

    public static Camera a() {
        return b(-1);
    }

    @SuppressLint({"NewApi"})
    public static Camera b(int i10) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f61712a, "No cameras!");
            return null;
        }
        boolean z10 = i10 >= 0;
        if (!z10) {
            i10 = 0;
            while (i10 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i10++;
            }
        }
        if (i10 < numberOfCameras) {
            Log.i(f61712a, "Opening camera #" + i10);
            return Camera.open(i10);
        }
        if (!z10) {
            Log.i(f61712a, "No camera facing back; returning camera #0");
            return Camera.open(0);
        }
        Log.w(f61712a, "Requested camera does not exist: " + i10);
        return null;
    }
}
