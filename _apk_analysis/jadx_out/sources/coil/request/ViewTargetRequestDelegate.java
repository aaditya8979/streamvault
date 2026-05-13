package coil.request;

import androidx.annotation.MainThread;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.ImageLoader;
import coil.util.Lifecycles;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import j0.f;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.g;
import l0.b;
import o0.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequestDelegate.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcoil/request/ViewTargetRequestDelegate;", "Lcoil/request/RequestDelegate;", "Lbn/r;", "e", "a", "c", "d", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "Lcoil/ImageLoader;", "b", "Lcoil/ImageLoader;", "imageLoader", "Lj0/f;", "Lj0/f;", "initialRequest", "Ll0/b;", "Ll0/b;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/g;", InneractiveMediationDefs.GENDER_FEMALE, "Lkotlinx/coroutines/g;", "job", "<init>", "(Lcoil/ImageLoader;Lj0/f;Ll0/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/g;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageLoader imageLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f initialRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b<?> target;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g job;

    public ViewTargetRequestDelegate(@NotNull ImageLoader imageLoader, @NotNull f fVar, @NotNull b<?> bVar, @NotNull Lifecycle lifecycle, @NotNull g gVar) {
        super(null);
        this.imageLoader = imageLoader;
        this.initialRequest = fVar;
        this.target = bVar;
        this.lifecycle = lifecycle;
        this.job = gVar;
    }

    @Override // coil.request.RequestDelegate
    public void a() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        i.m(this.target.getView()).c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // coil.request.RequestDelegate
    public void c() {
        this.lifecycle.addObserver(this);
        b<?> bVar = this.target;
        if (bVar instanceof LifecycleObserver) {
            Lifecycles.b(this.lifecycle, (LifecycleObserver) bVar);
        }
        i.m(this.target.getView()).c(this);
    }

    public void d() {
        g.a.a(this.job, null, 1, null);
        b<?> bVar = this.target;
        if (bVar instanceof LifecycleObserver) {
            this.lifecycle.removeObserver((LifecycleObserver) bVar);
        }
        this.lifecycle.removeObserver(this);
    }

    @MainThread
    public final void e() {
        this.imageLoader.b(this.initialRequest);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        i.m(this.target.getView()).a();
    }
}
