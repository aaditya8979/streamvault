package bp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yk.e.util.MainPreloadService;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5729b;

    public b0(Activity activity, int i10) {
        this.f5728a = activity;
        this.f5729b = i10;
    }

    @Override // bp.t1
    public final void a() {
        Intent intent = new Intent(this.f5728a, (Class<?>) MainPreloadService.class);
        intent.putExtra(TypedValues.CycleType.S_WAVE_PERIOD, this.f5729b);
        this.f5728a.startService(intent);
    }
}
