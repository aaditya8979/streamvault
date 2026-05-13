package gh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.zxing.DecodeHintType;
import java.util.Hashtable;
import java.util.Vector;
import k8.i;

/* JADX INFO: compiled from: DecodeImgThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f62417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f62418c;

    public e(String str, d dVar) {
        this.f62417b = str;
        this.f62418c = dVar;
    }

    public static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        while (true) {
            i13 >>= 1;
            if (i13 < i10 || (i12 = i12 >> 1) < i11) {
                break;
            }
            i14 <<= 1;
        }
        return i14;
    }

    public static Bitmap b(String str, int i10, int i11) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = a(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        if (TextUtils.isEmpty(this.f62417b) || this.f62418c == null) {
            return;
        }
        Bitmap bitmapB = b(this.f62417b, 400, 400);
        k8.e eVar = new k8.e();
        Hashtable hashtable = new Hashtable(2);
        Vector vector = new Vector();
        vector.addAll(b.f62407d);
        vector.addAll(b.f62408e);
        vector.addAll(b.f62409f);
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        eVar.d(hashtable);
        i iVarC = null;
        try {
            iVarC = eVar.c(new k8.b(new o8.i(new a(bitmapB))));
            Log.i("解析结果", iVarC.f());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (iVarC != null) {
            this.f62418c.a(iVarC);
        } else {
            this.f62418c.b();
        }
    }
}
