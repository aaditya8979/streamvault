package j0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import cn.r;
import coil.ImageLoader;
import coil.request.BaseRequestDelegate;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import coil.view.Scale;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import k0.Size;
import k0.c;
import kotlin.Metadata;
import o0.q;
import o0.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: RequestService.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0002H\u0002R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006&"}, d2 = {"Lj0/l;", "", "Lj0/f;", "initialRequest", "Lkotlinx/coroutines/g;", "job", "Lcoil/request/RequestDelegate;", "g", AdActivity.REQUEST_KEY_EXTRA, "", "throwable", "Lj0/d;", "b", "Lk0/g;", "size", "Lj0/j;", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", "c", "options", "a", "d", "e", "Lcoil/ImageLoader;", "Lcoil/ImageLoader;", "imageLoader", "Lo0/s;", "Lo0/s;", "systemCallbacks", "Lo0/m;", "Lo0/m;", "hardwareBitmapService", "Lo0/q;", "logger", "<init>", "(Lcoil/ImageLoader;Lo0/s;Lo0/q;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageLoader imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final s systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0.m hardwareBitmapService;

    public l(@NotNull ImageLoader imageLoader, @NotNull s sVar, @Nullable q qVar) {
        this.imageLoader = imageLoader;
        this.systemCallbacks = sVar;
        this.hardwareBitmapService = o0.f.a(qVar);
    }

    @WorkerThread
    public final boolean a(@NotNull j options) {
        return !o0.a.d(options.getConfig()) || this.hardwareBitmapService.getAllowHardware();
    }

    @NotNull
    public final d b(@NotNull f request, @NotNull Throwable throwable) {
        Drawable drawableS;
        if (!(throwable instanceof NullRequestDataException) || (drawableS = request.t()) == null) {
            drawableS = request.s();
        }
        return new d(drawableS, request, throwable);
    }

    public final boolean c(@NotNull f request, @NotNull Bitmap.Config requestedConfig) {
        if (!o0.a.d(requestedConfig)) {
            return true;
        }
        if (!request.getAllowHardware()) {
            return false;
        }
        l0.a aVar = request.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String();
        if (aVar instanceof l0.b) {
            View view = ((l0.b) aVar).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(f request, Size size) {
        return c(request, request.getBitmapConfig()) && this.hardwareBitmapService.a(size);
    }

    public final boolean e(f request) {
        return request.N().isEmpty() || r.P(o0.i.p(), request.getBitmapConfig());
    }

    @NotNull
    public final j f(@NotNull f request, @NotNull Size size) {
        Bitmap.Config bitmapConfig = e(request) && d(request, size) ? request.getBitmapConfig() : Bitmap.Config.ARGB_8888;
        CachePolicy networkCachePolicy = this.systemCallbacks.get_isOnline() ? request.getNetworkCachePolicy() : CachePolicy.DISABLED;
        boolean z10 = request.getAllowRgb565() && request.N().isEmpty() && bitmapConfig != Bitmap.Config.ALPHA_8;
        k0.c width = size.getWidth();
        c.b bVar = c.b.f72682a;
        return new j(request.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String(), bitmapConfig, request.getColorSpace(), size, (p.f(width, bVar) || p.f(size.getHeight(), bVar)) ? Scale.FIT : request.getScale(), o0.h.a(request), z10, request.getPremultipliedAlpha(), request.getDiskCacheKey(), request.getHeaders(), request.getTags(), request.getParameters(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), networkCachePolicy);
    }

    @NotNull
    public final RequestDelegate g(@NotNull f initialRequest, @NotNull kotlinx.coroutines.g job) {
        Lifecycle lifecycle = initialRequest.getLifecycle();
        l0.a aVar = initialRequest.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET java.lang.String();
        return aVar instanceof l0.b ? new ViewTargetRequestDelegate(this.imageLoader, initialRequest, (l0.b) aVar, lifecycle, job) : new BaseRequestDelegate(lifecycle, job);
    }
}
