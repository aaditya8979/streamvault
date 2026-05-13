package yads;

import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.concurrent.Executor;
import kotlin.Result;
import yads.ve;

/* JADX INFO: loaded from: classes2.dex */
public final class ve implements dg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f96064c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te f96065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f96066b;

    public ve(te teVar, Executor executor) {
        this.f96065a = teVar;
        this.f96066b = executor;
    }

    public static void a(bg bgVar) {
        bgVar.a();
        bgVar.b();
        boolean z10 = ad1.f87661a;
    }

    public static final void a(ve veVar, bg bgVar) {
        Object objM7534constructorimpl;
        veVar.getClass();
        a(bgVar);
        if (veVar.f96065a.f95179a.b()) {
            try {
                Result.a aVar = Result.Companion;
                AppMetricaLibraryAdapter.reportEvent("ads_sdk", bgVar.f87994a, bgVar.f87995b);
                objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
                boolean z10 = ad1.f87661a;
            }
        }
    }

    public final void b(final bg bgVar) {
        this.f96066b.execute(new Runnable() { // from class: bt.hb
            @Override // java.lang.Runnable
            public final void run() {
                ve.a(this.f6069b, bgVar);
            }
        });
    }
}
