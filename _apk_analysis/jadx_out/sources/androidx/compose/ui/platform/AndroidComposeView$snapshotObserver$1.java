package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lbn/r;", f.b.f33720g, "invoke", "(Lsn/a;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements sn.l<sn.a<? extends bn.r>, bn.r> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m3297invoke$lambda0(sn.a aVar) {
        tn.p.k(aVar, "$tmp0");
        aVar.invoke();
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ bn.r invoke(sn.a<? extends bn.r> aVar) {
        invoke2((sn.a<bn.r>) aVar);
        return bn.r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final sn.a<bn.r> aVar) {
        tn.p.k(aVar, f.b.f33720g);
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.f
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidComposeView$snapshotObserver$1.m3297invoke$lambda0(aVar);
                }
            });
        }
    }
}
