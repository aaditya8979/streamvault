package coil.request;

import android.view.View;
import androidx.annotation.MainThread;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.ui.AdActivity;
import j0.o;
import kotlin.Metadata;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.i;
import p000do.m1;
import p000do.p0;
import p000do.w0;

/* JADX INFO: compiled from: ViewTargetRequestManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0017R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Ldo/p0;", "Lj0/g;", "job", "Lj0/o;", "b", "Lbn/r;", "a", "Lcoil/request/ViewTargetRequestDelegate;", AdActivity.REQUEST_KEY_EXTRA, "c", "Landroid/view/View;", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lj0/o;", "currentDisposable", "Lkotlinx/coroutines/g;", "d", "Lkotlinx/coroutines/g;", "pendingClear", "e", "Lcoil/request/ViewTargetRequestDelegate;", "currentRequest", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "isRestart", "<init>", "(Landroid/view/View;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o currentDisposable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g pendingClear;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewTargetRequestDelegate currentRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isRestart;

    public ViewTargetRequestManager(@NotNull View view) {
        this.view = view;
    }

    public final synchronized void a() {
        g gVar = this.pendingClear;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.pendingClear = i.d(m1.f59865b, w0.c().M(), null, new ViewTargetRequestManager$dispose$1(this, null), 2, null);
        this.currentDisposable = null;
    }

    @NotNull
    public final synchronized o b(@NotNull p0<? extends j0.g> job) {
        o oVar = this.currentDisposable;
        if (oVar != null && o0.i.s() && this.isRestart) {
            this.isRestart = false;
            oVar.a(job);
            return oVar;
        }
        g gVar = this.pendingClear;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.pendingClear = null;
        o oVar2 = new o(this.view, job);
        this.currentDisposable = oVar2;
        return oVar2;
    }

    @MainThread
    public final void c(@Nullable ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.currentRequest;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.d();
        }
        this.currentRequest = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewAttachedToWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.isRestart = true;
        viewTargetRequestDelegate.e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @MainThread
    public void onViewDetachedFromWindow(@NotNull View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.currentRequest;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.d();
        }
    }
}
