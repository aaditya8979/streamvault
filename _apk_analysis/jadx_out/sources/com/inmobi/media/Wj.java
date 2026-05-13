package com.inmobi.media;

import androidx.compose.material.TextFieldImplKt;
import com.inmobi.media.I2;
import com.inmobi.media.Wj;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class Wj implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wj f26549a = new Wj();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f26550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f26551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bn.g f26552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f26553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static C3552l6 f26554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile C3516jk f26555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final sn.l f26556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C3416fk f26557i;

    static {
        String simpleName = Wj.class.getSimpleName();
        tn.p.j(simpleName, "getSimpleName(...)");
        f26550b = simpleName;
        List listS = cn.w.s("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdRequestPayloadCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "browserOpenFailed", "landingsPageStarted", "landingsCompleteSuccess", "landingsCompleteFailed", "ImmersiveNotSupported", "AdNotReady", "IAPFetchFailed", "BillingClientConnectionError", "BillingClientNotCompatible", "PingFailed", "PingStarted", "PingSuccess", "CompanionWebViewLoadCalled", "CompanionWebViewLoadFailed", "CompanionFireAdReady", "CompanionFireAdFailed", "CompanionWebViewPageStarted", "CompanionWebViewLoadFinished", "AttachedToWindow", "VideoLoadStarted", "VideoLoadSuccess", "VideoLoadFailure", "VideoStart", "VideoFirstQuartile", "VideoSecondQuartile", "VideoThirdQuartile", "VideoComplete", "VideoDestroyed");
        f26551c = listS;
        f26552d = kotlin.b.b(new sn.a() { // from class: n9.e5
            @Override // sn.a
            public final Object invoke() {
                return Wj.c();
            }
        });
        f26553e = new AtomicBoolean(false);
        Vj vj2 = new Vj();
        f26556h = new sn.l() { // from class: n9.f5
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Wj.a((I2) obj);
            }
        };
        TelemetryConfig telemetryConfigB = b();
        f26555g = new C3516jk(new Yj(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetConfig().isImageEnabled(), telemetryConfigB.getAssetConfig().isGifEnabled(), telemetryConfigB.getAssetConfig().isVideoEnabled(), telemetryConfigB.isGeneralEventsDisabled(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), cn.f0.g1(listS));
        Y3.a("telemetry", vj2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final bn.r a(I2 i22) {
        tn.p.k(i22, "it");
        int i10 = i22.f25635a;
        if (i10 != 1 && i10 != 2) {
            switch (i10) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                    C3416fk c3416fk = f26557i;
                    if (c3416fk != null) {
                        Map map = i22.f25637c;
                        Object obj = map != null ? map.get("data") : null;
                        c3416fk.a("CrashEventOccurred", obj instanceof T4 ? (T4) obj : null);
                    }
                    break;
                case 151:
                    C3416fk c3416fk2 = f26557i;
                    if (c3416fk2 != null) {
                        Map map2 = i22.f25637c;
                        Object obj2 = map2 != null ? map2.get("data") : null;
                        Wn wn2 = obj2 instanceof Wn ? (Wn) obj2 : null;
                        if (wn2 != null && AbstractC3492il.a(wn2)) {
                            C3850x5.f28483a.getClass();
                            if (!C3850x5.r()) {
                                c3416fk2.a("MainThreadBlockedEvent", wn2);
                            }
                        }
                    }
                    break;
                case 152:
                    C3416fk c3416fk3 = f26557i;
                    if (c3416fk3 != null) {
                        Map map3 = i22.f25637c;
                        Object obj3 = map3 != null ? map3.get("data") : null;
                        c3416fk3.a(obj3 instanceof C3896z1 ? (C3896z1) obj3 : null);
                    }
                    break;
            }
        } else {
            f26553e.set(false);
            C3552l6 c3552l6 = f26554f;
            if (c3552l6 != null) {
                c3552l6.f27540f.set(false);
                c3552l6.f27541g.set(true);
                c3552l6.f27542h.clear();
                c3552l6.f27544j = null;
            }
            f26554f = null;
            f26557i = null;
            ((C3857xc) Ji.f25751e.getValue()).a(f26556h);
        }
        return bn.r.f5635a;
    }

    public static boolean a(String str, Map map, EnumC3287ak enumC3287ak) {
        boolean zA;
        C3516jk c3516jk = f26555g;
        if (c3516jk == null) {
            tn.p.C("mTelemetryValidator");
            c3516jk = null;
        }
        c3516jk.getClass();
        tn.p.k(enumC3287ak, "telemetryEventType");
        tn.p.k(map, "keyValueMap");
        tn.p.k(str, "eventType");
        if (c3516jk.f27423a.f26654a) {
            int iOrdinal = enumC3287ak.ordinal();
            if (iOrdinal == 0) {
                zA = c3516jk.f27424b.a(str, map);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                zA = true;
            }
        } else {
            zA = false;
        }
        return !zA;
    }

    public static TelemetryConfig b() {
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(TelemetryConfig.class, "clazz");
        return (TelemetryConfig) Y3.f26611a.a(TelemetryConfig.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r4) {
        /*
            boolean r0 = r4 instanceof com.inmobi.media.Tj
            if (r0 == 0) goto L13
            r0 = r4
            com.inmobi.media.Tj r0 = (com.inmobi.media.Tj) r0
            int r1 = r0.f26379b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26379b = r1
            goto L18
        L13:
            com.inmobi.media.Tj r0 = new com.inmobi.media.Tj
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f26378a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26379b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r4)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L31:
            kotlin.c.b(r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = com.inmobi.media.Wj.f26553e
            boolean r4 = r4.getAndSet(r3)
            if (r4 != 0) goto L65
            com.inmobi.media.Wj r4 = com.inmobi.media.Wj.f26549a
            r0.f26379b = r3
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L47
            return r1
        L47:
            bn.g r4 = com.inmobi.media.Ji.f25751e
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.xc r4 = (com.inmobi.media.C3857xc) r4
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [2, 1, 150, 152, 151} // fill-array
            sn.l r1 = com.inmobi.media.Wj.f26556h
            r4.a(r0, r1)
            com.inmobi.media.fk r4 = new com.inmobi.media.fk
            com.inmobi.media.core.config.models.TelemetryConfig r0 = b()
            r4.<init>(r0)
            com.inmobi.media.Wj.f26557i = r4
        L65:
            bn.r r4 = bn.r.f5635a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(String str, Map map, EnumC3287ak enumC3287ak) {
        tn.p.k(str, "eventType");
        tn.p.k(map, "keyValueMap");
        tn.p.k(enumC3287ak, "telemetryEventType");
        p000do.i.d(A9.f25147c, null, null, new Uj(str, map, enumC3287ak, null), 3, null);
    }

    public static final C3365dk c() {
        return new C3365dk(AbstractC3456h9.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r9.a(r8, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r8 != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.inmobi.media.C3390ek r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(com.inmobi.media.ek, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.inmobi.media.Jf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c r18) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.inmobi.media.Qj
            if (r0 == 0) goto L13
            r0 = r5
            com.inmobi.media.Qj r0 = (com.inmobi.media.Qj) r0
            int r1 = r0.f26201c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26201c = r1
            goto L18
        L13:
            com.inmobi.media.Qj r0 = new com.inmobi.media.Qj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f26199a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f26201c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.c.b(r5)
            bn.g r5 = com.inmobi.media.Wj.f26552d
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.dk r5 = (com.inmobi.media.C3365dk) r5
            r0.f26201c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= 0) goto L50
            r4.a()
        L50:
            bn.r r5 = bn.r.f5635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Wj.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        if (f26553e.get()) {
            C3325c6 eventConfig = b().getEventConfig();
            eventConfig.f26920k = b().getTelemetryUrl();
            C3552l6 c3552l6 = f26554f;
            if (c3552l6 == null) {
                f26554f = new C3552l6("telemetry", (C3365dk) f26552d.getValue(), this, eventConfig, this);
            } else {
                tn.p.k(eventConfig, "eventConfig");
                c3552l6.f27544j = eventConfig;
            }
            C3552l6 c3552l62 = f26554f;
            if (c3552l62 != null) {
                c3552l62.a(true);
            }
        }
    }
}
