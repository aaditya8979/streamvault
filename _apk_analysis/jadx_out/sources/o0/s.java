package o0;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import i0.c;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SystemCallbacks.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001\u000eB\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010'¨\u0006,"}, d2 = {"Lo0/s;", "Landroid/content/ComponentCallbacks2;", "Li0/c$a;", "Lbn/r;", "c", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "", AppLovinEventTypes.USER_COMPLETED_LEVEL, "onTrimMemory", "onLowMemory", "", "isOnline", "a", "d", "Landroid/content/Context;", "b", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Ljava/lang/ref/WeakReference;", "Lcoil/RealImageLoader;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release", "()Ljava/lang/ref/WeakReference;", "getImageLoader$coil_base_release$annotations", "()V", "imageLoader", "Li0/c;", "Li0/c;", "networkObserver", "e", "Z", "_isOnline", "Ljava/util/concurrent/atomic/AtomicBoolean;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isShutdown", "()Z", "isNetworkObserverEnabled", "<init>", "(Lcoil/RealImageLoader;Landroid/content/Context;Z)V", "g", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class s implements ComponentCallbacks2, c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WeakReference<RealImageLoader> imageLoader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0.c networkObserver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean _isOnline;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicBoolean _isShutdown;

    public s(@NotNull RealImageLoader realImageLoader, @NotNull Context context, boolean z10) {
        this.context = context;
        this.imageLoader = new WeakReference<>(realImageLoader);
        i0.c cVarA = z10 ? i0.d.a(context, this, realImageLoader.getLogger()) : new i0.b();
        this.networkObserver = cVarA;
        this._isOnline = cVarA.a();
        this._isShutdown = new AtomicBoolean(false);
    }

    @Override // i0.c.a
    public void a(boolean z10) {
        RealImageLoader realImageLoader = this.imageLoader.get();
        bn.r rVar = null;
        if (realImageLoader != null) {
            q logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 4) {
                logger.a("NetworkObserver", 4, z10 ? "ONLINE" : "OFFLINE", null);
            }
            this._isOnline = z10;
            rVar = bn.r.f5635a;
        }
        if (rVar == null) {
            d();
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean get_isOnline() {
        return this._isOnline;
    }

    public final void c() {
        this.context.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this._isShutdown.getAndSet(true)) {
            return;
        }
        this.context.unregisterComponentCallbacks(this);
        this.networkObserver.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        if (this.imageLoader.get() == null) {
            d();
            bn.r rVar = bn.r.f5635a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        RealImageLoader realImageLoader = this.imageLoader.get();
        bn.r rVar = null;
        if (realImageLoader != null) {
            q logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 2) {
                logger.a("NetworkObserver", 2, "trimMemory, level=" + i10, null);
            }
            realImageLoader.m(i10);
            rVar = bn.r.f5635a;
        }
        if (rVar == null) {
            d();
        }
    }
}
