package o0;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageLoaderOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0005R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0/n;", "", "", "a", "Z", "()Z", "addLastModifiedToFileCacheKey", "b", "d", "networkObserverEnabled", "c", "e", "respectCacheHeaders", "", "I", "()I", "bitmapFactoryMaxParallelism", "Lcoil/decode/ExifOrientationPolicy;", "Lcoil/decode/ExifOrientationPolicy;", "()Lcoil/decode/ExifOrientationPolicy;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILcoil/decode/ExifOrientationPolicy;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean addLastModifiedToFileCacheKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean networkObserverEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean respectCacheHeaders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int bitmapFactoryMaxParallelism;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ExifOrientationPolicy bitmapFactoryExifOrientationPolicy;

    public n(boolean z10, boolean z11, boolean z12, int i10, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.addLastModifiedToFileCacheKey = z10;
        this.networkObserverEnabled = z11;
        this.respectCacheHeaders = z12;
        this.bitmapFactoryMaxParallelism = i10;
        this.bitmapFactoryExifOrientationPolicy = exifOrientationPolicy;
    }

    public /* synthetic */ n(boolean z10, boolean z11, boolean z12, int i10, ExifOrientationPolicy exifOrientationPolicy, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) == 0 ? z12 : true, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? ExifOrientationPolicy.RESPECT_PERFORMANCE : exifOrientationPolicy);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.addLastModifiedToFileCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ExifOrientationPolicy getBitmapFactoryExifOrientationPolicy() {
        return this.bitmapFactoryExifOrientationPolicy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBitmapFactoryMaxParallelism() {
        return this.bitmapFactoryMaxParallelism;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getNetworkObserverEnabled() {
        return this.networkObserverEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRespectCacheHeaders() {
        return this.respectCacheHeaders;
    }
}
