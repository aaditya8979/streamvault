package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import bo.d0;
import com.ironsource.G5;
import com.ironsource.Y5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h;
import tn.p;

/* JADX INFO: compiled from: GetCachedAsset.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class GetCachedAsset {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final Context context;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull Context context, @NotNull CacheWebViewAssets cacheWebViewAssets) {
        p.k(cacheRepository, "cacheRepository");
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    @RequiresApi(21)
    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strE1 = d0.e1(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strE1);
            p.j(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strE1), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    @RequiresApi(21)
    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object objM7534constructorimpl;
        String string = uri.toString();
        p.j(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) h.b(null, new GetCachedAsset$getCachedAsset$result$1(this, d0.i1(string, "/", null, 2, null), null), 1, null);
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objM7534constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        p.j(absolutePath, Y5.c.f30725c);
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, fileInputStream);
    }

    @RequiresApi(21)
    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", G5.N, 404, "Not Found", kotlin.collections.a.j(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object objM7534constructorimpl;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        String string = uri.toString();
        p.j(string, "uri.toString()");
        sb2.append(d0.i1(d0.m1(string, "?", null, 2, null), "/", null, 2, null));
        String string2 = sb2.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objM7534constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
    }

    @RequiresApi(21)
    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri, @NotNull String str) {
        p.k(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        p.k(str, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, str);
    }
}
