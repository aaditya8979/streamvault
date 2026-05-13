package rd;

import android.content.Context;
import android.util.TypedValue;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: BannerUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f78894a = new a();

    public final int a(@NotNull Context context, int i10) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public final int b(@NotNull Context context, float f10) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return (int) ((f10 / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final int c(@NotNull Context context, float f10) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
