package ab;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(int i10, int i11) {
        if (i10 % 2 == 1) {
            i10++;
        }
        if (i11 % 2 == 1) {
            i11++;
        }
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(i10, i11) / iMax;
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

    public static int[] b(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return new int[]{-1, -1};
        }
        int iA = a(i10, i11);
        long jC = c();
        int i12 = -1;
        boolean z10 = false;
        int i13 = -1;
        while (!z10) {
            i12 = i10 / iA;
            i13 = i11 / iA;
            if (i12 * i13 * 4 > jC) {
                iA *= 2;
            } else {
                z10 = true;
            }
        }
        return new int[]{i12, i13};
    }

    public static long c() {
        long j10 = Runtime.getRuntime().totalMemory();
        if (j10 > 104857600) {
            return 104857600L;
        }
        return j10;
    }

    public static int d(Context context, String str) {
        ExifInterface exifInterface;
        int i10;
        InputStream inputStreamA = null;
        try {
            if (ma.d.c(str)) {
                inputStreamA = la.e.a(context, Uri.parse(str));
                exifInterface = new ExifInterface(inputStreamA);
            } else {
                exifInterface = new ExifInterface(str);
            }
            int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i10 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            } else if (attributeInt == 6) {
                i10 = 90;
            } else {
                if (attributeInt != 8) {
                    return 0;
                }
                i10 = 270;
            }
            return i10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        } finally {
            k.a(inputStreamA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            r0 = 0
            int r1 = d(r6, r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            if (r1 <= 0) goto L87
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            boolean r3 = ma.d.c(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            if (r3 == 0) goto L21
            android.net.Uri r3 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            java.io.InputStream r3 = la.e.a(r6, r3)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            android.graphics.BitmapFactory.decodeStream(r3, r0, r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            goto L25
        L21:
            android.graphics.BitmapFactory.decodeFile(r7, r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> L9f
            r3 = r0
        L25:
            int r4 = r2.outWidth     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            int r5 = r2.outHeight     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            int r4 = a(r4, r5)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            r2.inSampleSize = r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            r4 = 0
            r2.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            boolean r4 = ma.d.c(r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            if (r4 == 0) goto L45
            android.net.Uri r4 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            java.io.InputStream r3 = la.e.a(r6, r4)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r0, r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
            goto L49
        L45:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r7, r2)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L82
        L49:
            if (r2 == 0) goto L79
            android.graphics.Bitmap r1 = f(r2, r1)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            boolean r2 = ma.d.c(r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            if (r2 == 0) goto L60
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            java.io.OutputStream r6 = la.e.b(r6, r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            goto L65
        L60:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
        L65:
            r0 = r6
            g(r1, r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e
            r6 = r0
            goto L7b
        L6b:
            r6 = move-exception
            r7 = r0
            goto L80
        L6e:
            r6 = move-exception
            r7 = r0
            goto L85
        L71:
            r6 = move-exception
            r7 = r0
            r1 = r2
            goto L80
        L75:
            r6 = move-exception
            r7 = r0
            r1 = r2
            goto L85
        L79:
            r6 = r0
            r1 = r2
        L7b:
            r0 = r3
            goto L89
        L7d:
            r6 = move-exception
            r7 = r0
            r1 = r7
        L80:
            r0 = r3
            goto Lb6
        L82:
            r6 = move-exception
            r7 = r0
            r1 = r7
        L85:
            r0 = r3
            goto La2
        L87:
            r6 = r0
            r1 = r6
        L89:
            ab.k.a(r0)
            ab.k.a(r6)
            if (r1 == 0) goto Lb4
            boolean r6 = r1.isRecycled()
            if (r6 != 0) goto Lb4
        L97:
            r1.recycle()
            goto Lb4
        L9b:
            r6 = move-exception
            r7 = r0
            r1 = r7
            goto Lb6
        L9f:
            r6 = move-exception
            r7 = r0
            r1 = r7
        La2:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lb5
            ab.k.a(r0)
            ab.k.a(r7)
            if (r1 == 0) goto Lb4
            boolean r6 = r1.isRecycled()
            if (r6 != 0) goto Lb4
            goto L97
        Lb4:
            return
        Lb5:
            r6 = move-exception
        Lb6:
            ab.k.a(r0)
            ab.k.a(r7)
            if (r1 == 0) goto Lc7
            boolean r7 = r1.isRecycled()
            if (r7 != 0) goto Lc7
            r1.recycle()
        Lc7:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.c.e(android.content.Context, java.lang.String):void");
    }

    public static Bitmap f(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void g(Bitmap bitmap, FileOutputStream fileOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
            k.a(fileOutputStream);
            k.a(byteArrayOutputStream);
        } catch (Exception e11) {
            e = e11;
            byteArrayOutputStream2 = byteArrayOutputStream;
            e.printStackTrace();
            k.a(fileOutputStream);
            k.a(byteArrayOutputStream2);
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            k.a(fileOutputStream);
            k.a(byteArrayOutputStream2);
            throw th;
        }
    }
}
