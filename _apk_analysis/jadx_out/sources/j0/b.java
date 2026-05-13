package j0;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.request.CachePolicy;
import coil.view.Precision;
import coil.view.Scale;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import n0.c;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import tn.p;

/* JADX INFO: compiled from: DefinedRequestOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010)\u001a\u0004\u0018\u00010%\u0012\b\u0010/\u001a\u0004\u0018\u00010*\u0012\b\u00104\u001a\u0004\u0018\u000100\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u000109\u0012\b\u0010=\u001a\u0004\u0018\u000109\u0012\b\u0010>\u001a\u0004\u0018\u000109¢\u0006\u0004\b?\u0010@J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0019\u0010$\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010)\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00104\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0014\u00103R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b\b\u00106R\u0019\u00108\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b\u000e\u00106R\u0019\u0010<\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b+\u0010;R\u0019\u0010=\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\b\u001f\u0010;R\u0019\u0010>\u001a\u0004\u0018\u0001098\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b1\u0010;¨\u0006A"}, d2 = {"Lj0/b;", "", "other", "", "equals", "", "hashCode", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "h", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lk0/h;", "b", "Lk0/h;", InneractiveMediationDefs.GENDER_MALE, "()Lk0/h;", "sizeResolver", "Lcoil/size/Scale;", "c", "Lcoil/size/Scale;", "l", "()Lcoil/size/Scale;", "scale", "Ldo/h0;", "d", "Ldo/h0;", "g", "()Ldo/h0;", "interceptorDispatcher", "e", InneractiveMediationDefs.GENDER_FEMALE, "fetcherDispatcher", "decoderDispatcher", "n", "transformationDispatcher", "Ln0/c$a;", "Ln0/c$a;", "o", "()Ln0/c$a;", "transitionFactory", "Lcoil/size/Precision;", "i", "Lcoil/size/Precision;", CampaignEx.JSON_KEY_AD_K, "()Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "allowHardware", "allowRgb565", "Lcoil/request/CachePolicy;", "Lcoil/request/CachePolicy;", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/Lifecycle;Lk0/h;Lcoil/size/Scale;Ldo/h0;Ldo/h0;Ldo/h0;Ldo/h0;Ln0/c$a;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final k0.h sizeResolver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Scale scale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 interceptorDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 fetcherDispatcher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 decoderDispatcher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final h0 transformationDispatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final c.a transitionFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Precision precision;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean allowHardware;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Boolean allowRgb565;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final CachePolicy networkCachePolicy;

    public b(@Nullable Lifecycle lifecycle, @Nullable k0.h hVar, @Nullable Scale scale, @Nullable h0 h0Var, @Nullable h0 h0Var2, @Nullable h0 h0Var3, @Nullable h0 h0Var4, @Nullable c.a aVar, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.lifecycle = lifecycle;
        this.sizeResolver = hVar;
        this.scale = scale;
        this.interceptorDispatcher = h0Var;
        this.fetcherDispatcher = h0Var2;
        this.decoderDispatcher = h0Var3;
        this.transformationDispatcher = h0Var4;
        this.transitionFactory = aVar;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof b) {
            b bVar = (b) other;
            if (p.f(this.lifecycle, bVar.lifecycle) && p.f(this.sizeResolver, bVar.sizeResolver) && this.scale == bVar.scale && p.f(this.interceptorDispatcher, bVar.interceptorDispatcher) && p.f(this.fetcherDispatcher, bVar.fetcherDispatcher) && p.f(this.decoderDispatcher, bVar.decoderDispatcher) && p.f(this.transformationDispatcher, bVar.transformationDispatcher) && p.f(this.transitionFactory, bVar.transitionFactory) && this.precision == bVar.precision && this.bitmapConfig == bVar.bitmapConfig && p.f(this.allowHardware, bVar.allowHardware) && p.f(this.allowRgb565, bVar.allowRgb565) && this.memoryCachePolicy == bVar.memoryCachePolicy && this.diskCachePolicy == bVar.diskCachePolicy && this.networkCachePolicy == bVar.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.lifecycle;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        k0.h hVar = this.sizeResolver;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Scale scale = this.scale;
        int iHashCode3 = (iHashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        h0 h0Var = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
        h0 h0Var2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 31;
        h0 h0Var3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 31;
        h0 h0Var4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 31;
        c.a aVar = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Precision precision = this.precision;
        int iHashCode9 = (iHashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.networkCachePolicy;
        return iHashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final k0.h getSizeResolver() {
        return this.sizeResolver;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }
}
