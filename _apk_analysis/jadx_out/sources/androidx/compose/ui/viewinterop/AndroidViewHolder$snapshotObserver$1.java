package androidx.compose.ui.viewinterop;

import android.os.Looper;
import bn.r;
import com.ironsource.sdk.controller.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lbn/r;", f.b.f33720g, "invoke", "(Lsn/a;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements l<sn.a<? extends r>, r> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m4064invoke$lambda0(sn.a aVar) {
        p.k(aVar, "$tmp0");
        aVar.invoke();
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(sn.a<? extends r> aVar) {
        invoke2((sn.a<r>) aVar);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final sn.a<r> aVar) {
        p.k(aVar, f.b.f33720g);
        if (this.this$0.getHandler().getLooper() == Looper.myLooper()) {
            aVar.invoke();
        } else {
            this.this$0.getHandler().post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder$snapshotObserver$1.m4064invoke$lambda0(aVar);
                }
            });
        }
    }
}
