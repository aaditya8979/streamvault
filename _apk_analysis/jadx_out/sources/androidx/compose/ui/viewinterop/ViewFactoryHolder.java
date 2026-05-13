package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.ViewRootForInspector;
import bn.r;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRF\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013RB\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006!"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "typedView", "Landroid/view/View;", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "Lkotlin/Function1;", "Landroid/content/Context;", "value", "factory", "Lsn/l;", "getFactory", "()Lsn/l;", "setFactory", "(Lsn/l;)V", "Lbn/r;", "updateBlock", "getUpdateBlock", "setUpdateBlock", "getViewRoot", "viewRoot", GAMConfig.KEY_CONTEXT, "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {

    @Nullable
    private l<? super Context, ? extends T> factory;

    @Nullable
    private T typedView;

    @NotNull
    private l<? super T, r> updateBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder(@NotNull Context context, @Nullable CompositionContext compositionContext, @NotNull NestedScrollDispatcher nestedScrollDispatcher) {
        super(context, compositionContext, nestedScrollDispatcher);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(nestedScrollDispatcher, "dispatcher");
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher, int i10, i iVar) {
        this(context, (i10 & 2) != 0 ? null : compositionContext, (i10 & 4) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher);
    }

    @Nullable
    public final l<Context, T> getFactory() {
        return this.factory;
    }

    @Nullable
    public final T getTypedView$ui_release() {
        return this.typedView;
    }

    @NotNull
    public final l<T, r> getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }

    public final void setFactory(@Nullable l<? super Context, ? extends T> lVar) {
        this.factory = lVar;
        if (lVar != null) {
            Context context = getContext();
            p.j(context, GAMConfig.KEY_CONTEXT);
            T tInvoke = lVar.invoke(context);
            this.typedView = tInvoke;
            setView$ui_release(tInvoke);
        }
    }

    public final void setTypedView$ui_release(@Nullable T t10) {
        this.typedView = t10;
    }

    public final void setUpdateBlock(@NotNull l<? super T, r> lVar) {
        p.k(lVar, "value");
        this.updateBlock = lVar;
        setUpdate(new sn.a<r>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            public final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // sn.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                View typedView$ui_release = this.this$0.getTypedView$ui_release();
                if (typedView$ui_release != null) {
                    this.this$0.getUpdateBlock().invoke(typedView$ui_release);
                }
            }
        });
    }
}
