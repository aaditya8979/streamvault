package yads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vn0 {
    @DoNotInline
    public static ye2 a(Context context, zn0 zn0Var, boolean z10) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        mm1 mm1Var = mediaMetricsManager == null ? null : new mm1(context, mediaMetricsManager.createPlaybackSession());
        if (mm1Var == null) {
            ih1.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new ye2(new xe2(LogSessionId.LOG_SESSION_ID_NONE));
        }
        if (z10) {
            zn0Var.getClass();
            kb0 kb0Var = (kb0) zn0Var.f97713o;
            kb0Var.getClass();
            pf1 pf1Var = kb0Var.f91536f;
            if (!pf1Var.f93581g) {
                pf1Var.f93578d.add(new of1(mm1Var));
            }
        }
        return new ye2(new xe2(mm1Var.f92442c.getSessionId()));
    }
}
