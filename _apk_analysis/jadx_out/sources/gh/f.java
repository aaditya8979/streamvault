package gh;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.DecodeHintType;
import com.yzq.zxinglibrary.android.CaptureActivity;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import k8.k;

/* JADX INFO: compiled from: DecodeThread.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptureActivity f62419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hashtable<DecodeHintType, Object> f62420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f62421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f62422e = new CountDownLatch(1);

    public f(CaptureActivity captureActivity, k kVar) {
        this.f62419b = captureActivity;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>();
        this.f62420c = hashtable;
        Vector vector = new Vector();
        if (captureActivity.config.isDecodeBarCode()) {
            vector.addAll(b.f62407d);
        }
        vector.addAll(b.f62409f);
        vector.addAll(b.f62408e);
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        hashtable.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, kVar);
    }

    public Handler a() {
        try {
            this.f62422e.await();
        } catch (InterruptedException unused) {
        }
        return this.f62421d;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f62421d = new c(this.f62419b, this.f62420c);
        this.f62422e.countDown();
        Looper.loop();
    }
}
