package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3487ig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3637og f27354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cif f27356c;

    public AbstractC3487ig(C3637og c3637og) {
        tn.p.k(c3637og, "dao");
        this.f27354a = c3637og;
        this.f27355b = new ConcurrentHashMap();
        this.f27356c = new Cif(a());
    }

    public static AdConfig.PingsV2Config a() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        return ((AdConfig) Y3.f26611a.a(AdConfig.class)).getPingsV2Config();
    }

    public static void a(int i10, String str, short s10, Rf rf2, long j10, InterfaceC3412fg interfaceC3412fg) {
        tn.p.k(rf2, "ping");
        tn.p.j(AbstractC3487ig.class.getSimpleName(), "getSimpleName(...)");
        String str2 = rf2.f26248a;
        tn.p.j(AbstractC3487ig.class.getSimpleName(), "getSimpleName(...)");
        Objects.toString(interfaceC3412fg);
        if (interfaceC3412fg == null) {
            a(rf2, s10);
        } else {
            ((C3386eg) interfaceC3412fg).a(rf2, i10, str, rf2.f26254g, j10);
        }
    }

    public static void a(Rf rf2, short s10) {
        C3440gi c3440gi = rf2.f26258k;
        if (c3440gi == null) {
            Gi gi2 = AbstractC3512jg.f27410a;
            AbstractC3512jg.a("PingFailed", kotlin.collections.a.o(bn.h.a("trigger", rf2.f26252e), bn.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)), bn.h.a("retryCount", Integer.valueOf(rf2.f26254g))));
            return;
        }
        C3589mi c3589mi = new C3589mi(c3440gi);
        String str = rf2.f26252e;
        int i10 = rf2.f26254g;
        tn.p.k(str, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        Map mapA = c3589mi.a();
        mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
        mapA.put("trigger", str);
        mapA.put("retryCount", String.valueOf(i10));
        AbstractC3512jg.a("PingFailed", mapA);
    }

    public static void a(Xf xf2, InterfaceC3412fg interfaceC3412fg) {
        tn.p.j(AbstractC3487ig.class.getSimpleName(), "getSimpleName(...)");
        String str = xf2.f26595a.f26248a;
        Objects.toString(interfaceC3412fg);
        if (interfaceC3412fg != null) {
            ((C3386eg) interfaceC3412fg).a(xf2.f26595a, xf2.f26596b, xf2.f26598d);
            return;
        }
        Rf rf2 = xf2.f26595a;
        C3440gi c3440gi = rf2.f26258k;
        if (c3440gi == null) {
            Gi gi2 = AbstractC3512jg.f27410a;
            AbstractC3512jg.a("PingSuccess", kotlin.collections.a.o(bn.h.a("trigger", rf2.f26252e), bn.h.a("retryCount", Integer.valueOf(rf2.f26254g))));
            return;
        }
        C3589mi c3589mi = new C3589mi(c3440gi);
        String str2 = rf2.f26252e;
        long j10 = rf2.f26256i;
        tn.p.k(str2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        Map mapA = c3589mi.a();
        mapA.put("trigger", str2);
        mapA.put("latency", Long.valueOf(j10));
        AbstractC3512jg.a("PingSuccess", mapA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.Xf r29, com.inmobi.media.InterfaceC3412fg r30, hn.c r31) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3487ig.a(com.inmobi.media.Xf, com.inmobi.media.fg, hn.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3487ig.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
