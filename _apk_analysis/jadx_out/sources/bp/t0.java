package bp;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.yk.e.AbstractC4634il;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements OnInitializationCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f5871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f5872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f5873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f5874d;

    public t0(j0 j0Var, long j10, IComCallback iComCallback, Context context) {
        this.f5874d = j0Var;
        this.f5871a = j10;
        this.f5872b = iComCallback;
        this.f5873c = context;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        AdLog.i("Admob SDK is initialized");
        j0 j0Var = this.f5874d;
        j0Var.f5792f = true;
        if (j0Var.f5787a == 0) {
            j0Var.f5787a = System.currentTimeMillis() - this.f5871a;
            AbstractC4634il.f3394lLi1LL.put("admob", Long.valueOf(this.f5874d.f5787a));
            AdLog.i("admob init time = " + this.f5874d.f5787a + "ms");
        }
        this.f5874d.h(true, "", this.f5872b);
        this.f5874d.d(this.f5873c);
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d(Constant.TAG, String.format(Locale.getDefault(), "Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
    }
}
