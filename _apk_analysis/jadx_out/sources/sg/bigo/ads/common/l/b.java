package sg.bigo.ads.common.l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    @NonNull
    @WorkerThread
    public static sg.bigo.ads.common.a a(@NonNull Context context) {
        long jA = r.f82514a.a(15);
        sg.bigo.ads.common.a aVarA = a.a(context);
        if (aVarA == null) {
            try {
                aVarA = c.a(context, jA);
            } catch (Exception unused) {
            }
        }
        return aVarA == null ? new sg.bigo.ads.common.a("", true) : aVarA;
    }
}
