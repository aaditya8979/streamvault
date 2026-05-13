package bp;

import android.content.Context;
import com.yk.e.inf.IComCallback;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.MainPreloadService;
import java.util.Timer;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainPreloadService f5856b;

    public q(MainPreloadService mainPreloadService, Context context) {
        this.f5856b = mainPreloadService;
        this.f5855a = context;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        MainPreloadService mainPreloadService = this.f5856b;
        Timer timer = MainPreloadService.IL1Iii;
        mainPreloadService.getClass();
        String str2 = PreloadManager.tag;
        AdLog.e(str2, "preloadService, " + ("reqTimer failed, msg = " + str));
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        PreloadManager.getInstance(this.f5855a).preloadCacheList4Timer(this.f5855a);
    }
}
