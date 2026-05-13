package androidx.compose.ui.viewinterop;

import android.os.Handler;
import bn.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Lbn/r;", "invoke", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements l<AndroidViewHolder, r> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m4063invoke$lambda0(sn.a aVar) {
        p.k(aVar, "$tmp0");
        aVar.invoke();
    }

    @Override // sn.l
    public /* bridge */ /* synthetic */ r invoke(AndroidViewHolder androidViewHolder) {
        invoke2(androidViewHolder);
        return r.f5635a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AndroidViewHolder androidViewHolder) {
        p.k(androidViewHolder, "it");
        Handler handler = this.this$0.getHandler();
        final sn.a aVar = this.this$0.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder$onCommitAffectingUpdate$1.m4063invoke$lambda0(aVar);
            }
        });
    }
}
