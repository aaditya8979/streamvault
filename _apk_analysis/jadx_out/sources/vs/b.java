package vs;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import top.zibin.luban.Checker;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f86165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f86166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86169e;

    public b(d dVar, File file, boolean z10) throws IOException {
        this.f86166b = file;
        this.f86165a = dVar;
        this.f86169e = z10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(dVar.open(), null, options);
        this.f86167c = options.outWidth;
        this.f86168d = options.outHeight;
    }

    public File a() throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = b();
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f86165a.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Checker checker = Checker.SINGLE;
        if (checker.isJPG(this.f86165a.open())) {
            bitmapDecodeStream = c(bitmapDecodeStream, checker.getOrientation(this.f86165a.open()));
        }
        bitmapDecodeStream.compress((this.f86169e || bitmapDecodeStream.hasAlpha()) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f86166b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f86166b;
    }

    public final int b() {
        int i10 = this.f86167c;
        if (i10 % 2 == 1) {
            i10++;
        }
        this.f86167c = i10;
        int i11 = this.f86168d;
        if (i11 % 2 == 1) {
            i11++;
        }
        this.f86168d = i11;
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(this.f86167c, this.f86168d) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d10 = fMin;
            if (d10 > 0.5625d || d10 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d10));
            }
            int i12 = iMax / 1280;
            if (i12 == 0) {
                return 1;
            }
            return i12;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public final Bitmap c(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
