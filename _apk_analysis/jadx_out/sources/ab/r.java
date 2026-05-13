package ab;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.luck.picture.lib.thread.PictureThreadUtils;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f3710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f3711b;

    /* JADX INFO: compiled from: ToastUtils.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f3713c;

        public a(Context context, String str) {
            this.f3712b = context;
            this.f3713c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context contextB = ka.b.c().b();
            if (contextB == null) {
                contextB = this.f3712b.getApplicationContext();
            }
            Toast.makeText(contextB, this.f3713c, 0).show();
            String unused = r.f3711b = this.f3713c;
        }
    }

    public static boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f3710a < 1000) {
            return true;
        }
        f3710a = jCurrentTimeMillis;
        return false;
    }

    public static void c(Context context, String str) {
        if (b() && TextUtils.equals(str, f3711b)) {
            return;
        }
        Context contextB = ka.b.c().b();
        if (contextB == null) {
            contextB = context.getApplicationContext();
        }
        if (!PictureThreadUtils.m()) {
            PictureThreadUtils.n(new a(context, str));
        } else {
            Toast.makeText(contextB, str, 0).show();
            f3711b = str;
        }
    }
}
