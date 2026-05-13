package j0;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.CachePolicy;
import coil.view.Precision;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import n0.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.w0;
import tn.p;

/* JADX INFO: compiled from: DefaultRequestOptions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\b\b\u0002\u0010%\u001a\u00020!\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u00106\u001a\u000203\u0012\b\b\u0002\u00107\u001a\u000203\u0012\b\b\u0002\u00108\u001a\u000203¢\u0006\u0004\b9\u0010:J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0010\u0010$R\u0017\u0010(\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b\b\u0010'R\u0017\u0010)\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\r\u0010'R\u0019\u0010/\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00101\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b\u001c\u0010.R\u0019\u00102\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b\"\u0010.R\u0017\u00106\u001a\u0002038\u0006¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b+\u00105R\u0017\u00107\u001a\u0002038\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b\u0016\u00105R\u0017\u00108\u001a\u0002038\u0006¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b0\u00105¨\u0006;"}, d2 = {"Lj0/a;", "", "other", "", "equals", "", "hashCode", "Ldo/h0;", "a", "Ldo/h0;", "i", "()Ldo/h0;", "interceptorDispatcher", "b", "h", "fetcherDispatcher", "c", "d", "decoderDispatcher", "n", "transformationDispatcher", "Ln0/c$a;", "e", "Ln0/c$a;", "o", "()Ln0/c$a;", "transitionFactory", "Lcoil/size/Precision;", InneractiveMediationDefs.GENDER_FEMALE, "Lcoil/size/Precision;", InneractiveMediationDefs.GENDER_MALE, "()Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "g", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Z", "()Z", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "j", "Landroid/graphics/drawable/Drawable;", "l", "()Landroid/graphics/drawable/Drawable;", "placeholder", CampaignEx.JSON_KEY_AD_K, "error", "fallback", "Lcoil/request/CachePolicy;", "Lcoil/request/CachePolicy;", "()Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Ldo/h0;Ldo/h0;Ldo/h0;Ldo/h0;Ln0/c$a;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 interceptorDispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 fetcherDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 decoderDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 transformationDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.a transitionFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Precision precision;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean allowHardware;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean allowRgb565;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Drawable placeholder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Drawable error;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Drawable fallback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy memoryCachePolicy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy diskCachePolicy;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CachePolicy networkCachePolicy;

    public a() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public a(@NotNull h0 h0Var, @NotNull h0 h0Var2, @NotNull h0 h0Var3, @NotNull h0 h0Var4, @NotNull c.a aVar, @NotNull Precision precision, @NotNull Bitmap.Config config, boolean z10, boolean z11, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @NotNull CachePolicy cachePolicy, @NotNull CachePolicy cachePolicy2, @NotNull CachePolicy cachePolicy3) {
        this.interceptorDispatcher = h0Var;
        this.fetcherDispatcher = h0Var2;
        this.decoderDispatcher = h0Var3;
        this.transformationDispatcher = h0Var4;
        this.transitionFactory = aVar;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = z10;
        this.allowRgb565 = z11;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    public /* synthetic */ a(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, c.a aVar, Precision precision, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? w0.c().M() : h0Var, (i10 & 2) != 0 ? w0.b() : h0Var2, (i10 & 4) != 0 ? w0.b() : h0Var3, (i10 & 8) != 0 ? w0.b() : h0Var4, (i10 & 16) != 0 ? c.a.f75008b : aVar, (i10 & 32) != 0 ? Precision.AUTOMATIC : precision, (i10 & 64) != 0 ? o0.i.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & 2048) == 0 ? drawable3 : null, (i10 & 4096) != 0 ? CachePolicy.ENABLED : cachePolicy, (i10 & 8192) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i10 & 16384) != 0 ? CachePolicy.ENABLED : cachePolicy3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof a) {
            a aVar = (a) other;
            if (p.f(this.interceptorDispatcher, aVar.interceptorDispatcher) && p.f(this.fetcherDispatcher, aVar.fetcherDispatcher) && p.f(this.decoderDispatcher, aVar.decoderDispatcher) && p.f(this.transformationDispatcher, aVar.transformationDispatcher) && p.f(this.transitionFactory, aVar.transitionFactory) && this.precision == aVar.precision && this.bitmapConfig == aVar.bitmapConfig && this.allowHardware == aVar.allowHardware && this.allowRgb565 == aVar.allowRgb565 && p.f(this.placeholder, aVar.placeholder) && p.f(this.error, aVar.error) && p.f(this.fallback, aVar.fallback) && this.memoryCachePolicy == aVar.memoryCachePolicy && this.diskCachePolicy == aVar.diskCachePolicy && this.networkCachePolicy == aVar.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Drawable getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Drawable getFallback() {
        return this.fallback;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.interceptorDispatcher.hashCode() * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31;
        Drawable drawable = this.placeholder;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.error;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallback;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Precision getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final c.a getTransitionFactory() {
        return this.transitionFactory;
    }
}
