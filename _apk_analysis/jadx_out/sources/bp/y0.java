package bp;

import com.yk.e.util.AdLog;
import com.yk.e.util.MainCacheRefService;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements t1 {
    @Override // bp.t1
    public final void a() {
        Timer timer = MainCacheRefService.IL1Iii;
        AdLog.d("MainCacheRefService", "preloadService, ".concat("start cacheRef"));
        MainCacheRefService.IL1Iii = new Timer();
        MainCacheRefService.ILil = new v();
        Timer timer2 = MainCacheRefService.IL1Iii;
        TimerTask timerTask = MainCacheRefService.ILil;
        long j10 = MainCacheRefService.I1I;
        timer2.schedule(timerTask, j10, j10);
    }
}
