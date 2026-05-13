package h0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.intercept.EngineInterceptor;
import coil.memory.MemoryCache;
import coil.view.Scale;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import e0.a;
import j0.j;
import j0.l;
import j0.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.Size;
import k0.c;
import kotlin.Metadata;
import o0.h;
import o0.i;
import o0.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: MemoryCacheService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020!\u0012\b\u0010'\u001a\u0004\u0018\u00010%¢\u0006\u0004\b.\u0010/J(\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016J&\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0010J0\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0018\u0010*\u001a\u00020\u0013*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u0004\u0018\u00010+*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010,¨\u00060"}, d2 = {"Lh0/c;", "", "Lj0/f;", AdActivity.REQUEST_KEY_EXTRA, "mappedData", "Lj0/j;", "options", "Ly/c;", "eventListener", "Lcoil/memory/MemoryCache$Key;", InneractiveMediationDefs.GENDER_FEMALE, "cacheKey", "Lk0/g;", "size", "Lcoil/size/Scale;", "scale", "Lcoil/memory/MemoryCache$b;", "a", "cacheValue", "", "c", "(Lj0/f;Lcoil/memory/MemoryCache$Key;Lcoil/memory/MemoryCache$b;Lk0/g;Lcoil/size/Scale;)Z", "Lcoil/intercept/EngineInterceptor$b;", "result", "h", "Le0/a$a;", "chain", "Lj0/m;", "g", "e", "Lcoil/ImageLoader;", "Lcoil/ImageLoader;", "imageLoader", "Lj0/l;", "b", "Lj0/l;", "requestService", "Lo0/q;", "Lo0/q;", "logger", "d", "(Lcoil/memory/MemoryCache$b;)Z", "isSampled", "", "(Lcoil/memory/MemoryCache$b;)Ljava/lang/String;", "diskCacheKey", "<init>", "(Lcoil/ImageLoader;Lj0/l;Lo0/q;)V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageLoader imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l requestService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final q logger;

    public c(@NotNull ImageLoader imageLoader, @NotNull l lVar, @Nullable q qVar) {
        this.imageLoader = imageLoader;
        this.requestService = lVar;
        this.logger = qVar;
    }

    @Nullable
    public final MemoryCache.Value a(@NotNull j0.f request, @NotNull MemoryCache.Key cacheKey, @NotNull Size size, @NotNull Scale scale) {
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCacheE = this.imageLoader.e();
        MemoryCache.Value valueA = memoryCacheE != null ? memoryCacheE.a(cacheKey) : null;
        if (valueA == null || !c(request, cacheKey, valueA, size, scale)) {
            return null;
        }
        return valueA;
    }

    public final String b(MemoryCache.Value value) {
        Object obj = value.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @VisibleForTesting
    public final boolean c(@NotNull j0.f request, @NotNull MemoryCache.Key cacheKey, @NotNull MemoryCache.Value cacheValue, @NotNull Size size, @NotNull Scale scale) {
        if (this.requestService.c(request, o0.a.c(cacheValue.getBitmap()))) {
            return e(request, cacheKey, cacheValue, size, scale);
        }
        q qVar = this.logger;
        if (qVar == null || qVar.getLevel() > 3) {
            return false;
        }
        qVar.a("MemoryCacheService", 3, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final boolean d(MemoryCache.Value value) {
        Object obj = value.b().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean e(j0.f request, MemoryCache.Key cacheKey, MemoryCache.Value cacheValue, Size size, Scale scale) {
        boolean zD = d(cacheValue);
        if (k0.b.a(size)) {
            if (!zD) {
                return true;
            }
            q qVar = this.logger;
            if (qVar != null && qVar.getLevel() <= 3) {
                qVar.a("MemoryCacheService", 3, request.getData() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str = cacheKey.d().get("coil#transformation_size");
        if (str != null) {
            return p.f(str, size.toString());
        }
        int width = cacheValue.getBitmap().getWidth();
        int height = cacheValue.getBitmap().getHeight();
        k0.c width2 = size.getWidth();
        int i10 = width2 instanceof c.a ? ((c.a) width2).px : Integer.MAX_VALUE;
        k0.c height2 = size.getHeight();
        int i11 = height2 instanceof c.a ? ((c.a) height2).px : Integer.MAX_VALUE;
        double dC = a0.d.c(width, height, i10, i11, scale);
        boolean zA = h.a(request);
        if (zA) {
            double dH = n.h(dC, 1.0d);
            if (Math.abs(((double) i10) - (((double) width) * dH)) <= 1.0d || Math.abs(((double) i11) - (dH * ((double) height))) <= 1.0d) {
                return true;
            }
        } else if ((i.t(i10) || Math.abs(i10 - width) <= 1) && (i.t(i11) || Math.abs(i11 - height) <= 1)) {
            return true;
        }
        if (!(dC == 1.0d) && !zA) {
            q qVar2 = this.logger;
            if (qVar2 == null || qVar2.getLevel() > 3) {
                return false;
            }
            qVar2.a("MemoryCacheService", 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            return false;
        }
        if (dC <= 1.0d || !zD) {
            return true;
        }
        q qVar3 = this.logger;
        if (qVar3 == null || qVar3.getLevel() > 3) {
            return false;
        }
        qVar3.a("MemoryCacheService", 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
        return false;
    }

    @Nullable
    public final MemoryCache.Key f(@NotNull j0.f request, @NotNull Object mappedData, @NotNull j options, @NotNull y.c eventListener) {
        MemoryCache.Key memoryCacheKey = request.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.q(request, mappedData);
        String strF = this.imageLoader.getComponents().f(mappedData, options);
        eventListener.n(request, strF);
        if (strF == null) {
            return null;
        }
        List<m0.a> listN = request.N();
        Map<String, String> mapF = request.getParameters().f();
        if (listN.isEmpty() && mapF.isEmpty()) {
            return new MemoryCache.Key(strF, null, 2, null);
        }
        Map mapC = kotlin.collections.a.C(mapF);
        if (!listN.isEmpty()) {
            List<m0.a> listN2 = request.N();
            int size = listN2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mapC.put("coil#transformation_" + i10, listN2.get(i10).getCacheKey());
            }
            mapC.put("coil#transformation_size", options.getSize().toString());
        }
        return new MemoryCache.Key(strF, mapC);
    }

    @NotNull
    public final m g(@NotNull a.InterfaceC0737a chain, @NotNull j0.f request, @NotNull MemoryCache.Key cacheKey, @NotNull MemoryCache.Value cacheValue) {
        return new m(new BitmapDrawable(request.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getResources(), cacheValue.getBitmap()), request, DataSource.MEMORY_CACHE, cacheKey, b(cacheValue), d(cacheValue), i.u(chain));
    }

    public final boolean h(@Nullable MemoryCache.Key cacheKey, @NotNull j0.f request, @NotNull EngineInterceptor.b result) {
        MemoryCache memoryCacheE;
        Bitmap bitmap;
        if (request.getMemoryCachePolicy().getWriteEnabled() && (memoryCacheE = this.imageLoader.e()) != null && cacheKey != null) {
            Drawable drawableE = result.getDrawable();
            BitmapDrawable bitmapDrawable = drawableE instanceof BitmapDrawable ? (BitmapDrawable) drawableE : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
                String strD = result.getDiskCacheKey();
                if (strD != null) {
                    linkedHashMap.put("coil#disk_cache_key", strD);
                }
                memoryCacheE.b(cacheKey, new MemoryCache.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
