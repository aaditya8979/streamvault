package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3819w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f28398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig.AdChoiceConfig f28399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3605n9 f28400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28401e;

    public C3819w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(adChoiceConfig, "adChoiceConfig");
        this.f28397a = context;
        this.f28398b = image;
        this.f28399c = adChoiceConfig;
        this.f28400d = c3605n9;
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this.f28401e = "AdChoice-Image-" + string;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3819w r5, com.inmobi.media.Cj r6, java.lang.String r7, int r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof com.inmobi.media.C3719s
            if (r0 == 0) goto L16
            r0 = r9
            com.inmobi.media.s r0 = (com.inmobi.media.C3719s) r0
            int r1 = r0.f28082c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f28082c = r1
            goto L1b
        L16:
            com.inmobi.media.s r0 = new com.inmobi.media.s
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f28080a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f28082c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.c.b(r9)
            goto L47
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.c.b(r9)
            long r8 = (long) r8
            com.inmobi.media.v r2 = new com.inmobi.media.v
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.f28082c = r3
            java.lang.Object r9 = kotlinx.coroutines.TimeoutKt.e(r8, r2, r0)
            if (r9 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L50
            boolean r5 = r9.booleanValue()
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r5 = jn.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3819w.a(com.inmobi.media.w, com.inmobi.media.Cj, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3883yd r10) {
        /*
            r9 = this;
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f28398b
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L15
            boolean r2 = android.webkit.URLUtil.isNetworkUrl(r0)
            if (r2 == 0) goto L12
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L1b
        L15:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f28399c
            java.lang.String r0 = r0.getUrl()
        L1b:
            r4 = r0
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f28398b
            if (r0 == 0) goto L33
            int r0 = r0.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L2b
            goto L2c
        L2b:
            r2 = r1
        L2c:
            if (r2 == 0) goto L33
            int r0 = r2.intValue()
            goto L39
        L33:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f28399c
            int r0 = r0.getWidth()
        L39:
            r6 = r0
            com.inmobi.media.ads.network.inmobiJson.model.Image r0 = r9.f28398b
            if (r0 == 0) goto L50
            int r0 = r0.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L49
            r1 = r2
        L49:
            if (r1 == 0) goto L50
            int r0 = r1.intValue()
            goto L56
        L50:
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f28399c
            int r0 = r0.getHeight()
        L56:
            r7 = r0
            com.inmobi.media.core.config.models.AdConfig$AdChoiceConfig r0 = r9.f28399c
            int r5 = r0.getLoadTimeout()
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r4)
            if (r0 != 0) goto L83
            com.inmobi.media.n9 r10 = r9.f28400d
            if (r10 == 0) goto L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid URL: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "AdChoiceViewManager"
            r10.b(r1, r0)
        L7d:
            com.inmobi.media.dc r10 = new com.inmobi.media.dc
            r10.<init>()
            throw r10
        L83:
            do.y1 r0 = p000do.w0.c()
            com.inmobi.media.r r1 = new com.inmobi.media.r
            r8 = 0
            r2 = r1
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = p000do.g.g(r0, r1, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3819w.a(com.inmobi.media.yd):java.lang.Object");
    }
}
