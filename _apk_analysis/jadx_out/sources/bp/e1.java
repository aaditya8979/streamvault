package bp;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e1 f5756d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5757a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5758b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5759c = 0;

    public final synchronized void a(Context context, IComCallback iComCallback) {
        String strE;
        try {
            AdLog.i("Applovin initSdk");
            strE = r0.e(context, "OKT_MAX_SDK_KEY");
        } catch (Exception e10) {
            AdLog.ad("init max sdk failed, msg = " + e10.getMessage());
            AdLog.e(e10.getMessage(), e10);
            iComCallback.onFailed(-1, e10.getMessage());
        }
        if (TextUtils.isEmpty(strE)) {
            iComCallback.onFailed(-1, "Max sdk init failed, sdk key is empty");
            return;
        }
        this.f5757a.offer(new e0(this, context, strE, iComCallback));
        if (!this.f5758b) {
            ((Runnable) this.f5757a.poll()).run();
        }
    }
}
