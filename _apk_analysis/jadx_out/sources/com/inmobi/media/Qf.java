package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes9.dex */
public final class Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Picasso f26183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mo.a f26184b = mo.g.b(false, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f26185c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pf f26186d = new Pf();

    public static final Picasso a(Context context) {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        Picasso picassoBuild = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new OkHttpClient.Builder().addInterceptor(new B8(((long) ((AdConfig) Y3.f26611a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize()) * 1024 * ((long) 1024))).build())).build();
        tn.p.j(picassoBuild, "build(...)");
        return picassoBuild;
    }

    public static Picasso b(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        return (Picasso) p000do.h.b(null, new Mf(context, null), 1, null);
    }
}
