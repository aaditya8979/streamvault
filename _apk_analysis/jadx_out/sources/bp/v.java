package bp;

import com.yk.e.util.AdLog;
import com.yk.e.util.MainCacheRefService;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Timer timer = MainCacheRefService.IL1Iii;
        AdLog.d("MainCacheRefService", "preloadService, ".concat("refTime onRefresh"));
    }
}
