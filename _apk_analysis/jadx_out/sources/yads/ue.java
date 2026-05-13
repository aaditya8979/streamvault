package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class ue {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f95617d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh f95618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zg f95619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te f95620c;

    public /* synthetic */ ue(Context context) {
        this(new bh(), new zg(context), new te(context));
    }

    public ue(bh bhVar, zg zgVar, te teVar) {
        this.f95618a = bhVar;
        this.f95619b = zgVar;
        this.f95620c = teVar;
    }

    public final void a(Context context) {
        Object objM7534constructorimpl;
        if (this.f95619b.b() && f95617d.compareAndSet(false, true)) {
            boolean z10 = !this.f95618a.f88002a.b(context);
            if (this.f95620c.f95179a.b()) {
                try {
                    Result.a aVar = Result.Companion;
                    AppMetricaLibraryAdapter.activate(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().withAdvIdentifiersTracking(z10).build());
                    objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
                    boolean z11 = ad1.f87661a;
                }
            }
        }
    }
}
