package androidx.activity.contextaware;

import android.content.Context;
import hn.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import p000do.k;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    public final /* synthetic */ k<R> $co;
    public final /* synthetic */ l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(k<R> kVar, l<Context, R> lVar) {
        this.$co = kVar;
        this.$onContextAvailable = lVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(@NotNull Context context) {
        Object objM7534constructorimpl;
        p.k(context, GAMConfig.KEY_CONTEXT);
        c cVar = this.$co;
        l<Context, R> lVar = this.$onContextAvailable;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(lVar.invoke(context));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        cVar.resumeWith(objM7534constructorimpl);
    }
}
