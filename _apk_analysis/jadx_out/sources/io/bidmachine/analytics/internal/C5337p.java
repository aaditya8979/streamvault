package io.bidmachine.analytics.internal;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.analytics.internal.C5335n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import me.goldze.mvvmhabit.base.ContainerActivity;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020\u001d\u0012\u0006\u0010.\u001a\u00020\u001d¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004JE\u0010\f\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\f\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0013J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010$J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010-\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010.\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010,¨\u00061"}, d2 = {"Lio/bidmachine/analytics/internal/p;", "", "Lio/bidmachine/analytics/internal/n$a;", "t", "()Lio/bidmachine/analytics/internal/n$a;", "q", "Lkotlin/Function0;", "Landroid/os/Bundle;", "activeBillingDataFetcher", "historyBillingDataFetcher", "Lkotlin/Function1;", "detailsBillingDataFetcher", "a", "(Lsn/a;Lsn/a;Lsn/l;)Lio/bidmachine/analytics/internal/n$a;", "", "v", "()Z", "u", "l", "()Landroid/os/Bundle;", "o", InneractiveMediationDefs.GENDER_MALE, "p", AdActivity.REQUEST_KEY_EXTRA, "d", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "e", "s", "", "", "productIdList", "(Ljava/util/Collection;)Landroid/os/Bundle;", "r", ContainerActivity.BUNDLE, "", "c", "(Landroid/os/Bundle;)Ljava/util/List;", "b", "Lio/bidmachine/analytics/internal/n;", "n", "()Lio/bidmachine/analytics/internal/n;", "Lio/bidmachine/analytics/internal/x;", "Lio/bidmachine/analytics/internal/x;", "billingInterface", "Ljava/lang/String;", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "billingVersion", "<init>", "(Lio/bidmachine/analytics/internal/x;Ljava/lang/String;Ljava/lang/String;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C5337p {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bn.g<String> f69016e = kotlin.b.b(j.f69039a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bn.g<String> f69017f = kotlin.b.b(i.f69038a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final bn.g<String> f69018g = kotlin.b.b(d.f69033a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bn.g<String> f69019h = kotlin.b.b(g.f69036a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final bn.g<String> f69020i = kotlin.b.b(f.f69035a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bn.g<String> f69021j = kotlin.b.b(e.f69034a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final bn.g<String> f69022k = kotlin.b.b(c.f69032a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final bn.g<String> f69023l = kotlin.b.b(a.f69030a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final bn.g<String> f69024m = kotlin.b.b(b.f69031a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final bn.g<String> f69025n = kotlin.b.b(h.f69037a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final bn.g<String> f69026o = kotlin.b.b(k.f69040a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5344x billingInterface;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String billingVersion;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f69030a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("ZW5hYmxlUGVuZGluZ1B1cmNoYXNlcw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f69031a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SVRFTV9JRF9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f69032a = new c();

        public c() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("cGxheUJpbGxpbmdMaWJyYXJ5VmVyc2lvbg==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f69033a = new d();

        public d() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("UkVTUE9OU0VfQ09ERQ==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f69034a = new e();

        public e() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("REVUQUlMU19MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$f */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f69035a = new f();

        public f() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SU5BUFBfUFVSQ0hBU0VfREFUQV9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$g */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f69036a = new g();

        public g() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("SU5BUFBfUFVSQ0hBU0VfSVRFTV9MSVNU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$h */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f69037a = new h();

        public h() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("U0tVX0RFVEFJTFNfUkVTUE9OU0VfRk9STUFU");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$i */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f69038a = new i();

        public i() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("aW5hcHA=");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$j */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class j extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f69039a = new j();

        public j() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("c3Vicw==");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$k */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class k extends Lambda implements sn.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f69040a = new k();

        public k() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s0.a("UFJPRFVDVF9ERVRBSUxT");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$l, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R!\u0010\r\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R!\u0010\u0011\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R!\u0010\u0015\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R!\u0010\u0019\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R!\u0010\u001d\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R!\u0010!\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R!\u0010%\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R!\u0010)\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0004\u0012\u0004\b(\u0010\b\u001a\u0004\b'\u0010\u0006R!\u0010-\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R!\u00101\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0004\u0012\u0004\b0\u0010\b\u001a\u0004\b/\u0010\u0006R\u0014\u00103\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lio/bidmachine/analytics/internal/p$l;", "", "", "productTypeSubs$delegate", "Lbn/g;", "j", "()Ljava/lang/String;", "getProductTypeSubs$annotations", "()V", "productTypeSubs", "productTypeInApp$delegate", "i", "getProductTypeInApp$annotations", "productTypeInApp", "argResponseCode$delegate", "d", "getArgResponseCode$annotations", "argResponseCode", "argResponsePurchaseItemList$delegate", "g", "getArgResponsePurchaseItemList$annotations", "argResponsePurchaseItemList", "argResponsePurchaseDataList$delegate", InneractiveMediationDefs.GENDER_FEMALE, "getArgResponsePurchaseDataList$annotations", "argResponsePurchaseDataList", "argResponseDetailsList$delegate", "e", "getArgResponseDetailsList$annotations", "argResponseDetailsList", "argPlayBillingLibraryVersion$delegate", "c", "getArgPlayBillingLibraryVersion$annotations", "argPlayBillingLibraryVersion", "argEnablePendingPurchases$delegate", "a", "getArgEnablePendingPurchases$annotations", "argEnablePendingPurchases", "argItemIdList$delegate", "b", "getArgItemIdList$annotations", "argItemIdList", "argSkuDetailsResponseFormat$delegate", "h", "getArgSkuDetailsResponseFormat$annotations", "argSkuDetailsResponseFormat", "valSkuDetailsResponseFormatProductDetails$delegate", CampaignEx.JSON_KEY_AD_K, "getValSkuDetailsResponseFormatProductDetails$annotations", "valSkuDetailsResponseFormatProductDetails", "", "RESULT_OK", "I", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        public final String a() {
            return (String) C5337p.f69023l.getValue();
        }

        public final String b() {
            return (String) C5337p.f69024m.getValue();
        }

        public final String c() {
            return (String) C5337p.f69022k.getValue();
        }

        public final String d() {
            return (String) C5337p.f69018g.getValue();
        }

        public final String e() {
            return (String) C5337p.f69021j.getValue();
        }

        public final String f() {
            return (String) C5337p.f69020i.getValue();
        }

        public final String g() {
            return (String) C5337p.f69019h.getValue();
        }

        public final String h() {
            return (String) C5337p.f69025n.getValue();
        }

        public final String i() {
            return (String) C5337p.f69017f.getValue();
        }

        public final String j() {
            return (String) C5337p.f69016e.getValue();
        }

        public final String k() {
            return (String) C5337p.f69026o.getValue();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$m */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class m extends Lambda implements sn.a<Bundle> {
        public m() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C5337p.this.l();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$n */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class n extends Lambda implements sn.a<Bundle> {
        public n() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C5337p.this.o();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$o */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", AdActivity.REQUEST_KEY_EXTRA, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class o extends Lambda implements sn.l<Bundle, Bundle> {
        public o() {
            super(1);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(Bundle bundle) {
            return C5337p.this.d(bundle);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class C0797p extends Lambda implements sn.a<Bundle> {
        public C0797p() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C5337p.this.m();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$q */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class q extends Lambda implements sn.a<Bundle> {
        public q() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            return C5337p.this.p();
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.p$r */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", AdActivity.REQUEST_KEY_EXTRA, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    public static final class r extends Lambda implements sn.l<Bundle, Bundle> {
        public r() {
            super(1);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(Bundle bundle) {
            return C5337p.this.e(bundle);
        }
    }

    public C5337p(InterfaceC5344x interfaceC5344x, String str, String str2) {
        this.billingInterface = interfaceC5344x;
        this.packageName = str;
        this.billingVersion = str2;
    }

    private final Bundle a(Collection<String> productIdList) {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        bundle.putStringArrayList(companion.b(), new ArrayList<>(productIdList));
        return bundle;
    }

    private final C5335n.a a(sn.a<Bundle> activeBillingDataFetcher, sn.a<Bundle> historyBillingDataFetcher, sn.l<? super Bundle, Bundle> detailsBillingDataFetcher) {
        C5335n.a aVar = new C5335n.a(null, null, null, 7, null);
        Bundle bundleInvoke = activeBillingDataFetcher.invoke();
        Bundle bundleInvoke2 = historyBillingDataFetcher.invoke();
        List<String> listC = c(bundleInvoke);
        List<String> listC2 = c(bundleInvoke2);
        C5335n.a aVarA = C5335n.a.a(aVar, a(bundleInvoke), a(bundleInvoke2), null, 4, null);
        Set setL1 = cn.f0.l1(cn.f0.O0(listC, listC2));
        return setL1.isEmpty() ^ true ? C5335n.a.a(aVarA, null, null, b(detailsBillingDataFetcher.invoke(a(setL1))), 3, null) : aVarA;
    }

    private final List<String> a(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.f());
                return stringArrayList == null ? cn.w.m() : stringArrayList;
            }
        }
        return cn.w.m();
    }

    private final List<String> b(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.e());
                return stringArrayList == null ? cn.w.m() : stringArrayList;
            }
        }
        return cn.w.m();
    }

    private final List<String> c(Bundle bundle) {
        if (bundle != null) {
            Companion companion = INSTANCE;
            if (bundle.getInt(companion.d()) == 0) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(companion.g());
                return stringArrayList == null ? cn.w.m() : stringArrayList;
            }
        }
        return cn.w.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle d(Bundle request) {
        return this.billingInterface.a(this.packageName, INSTANCE.i(), request, r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle e(Bundle request) {
        return this.billingInterface.a(this.packageName, INSTANCE.j(), request, r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle l() {
        return this.billingInterface.a(this.packageName, INSTANCE.i(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle m() {
        return this.billingInterface.a(this.packageName, INSTANCE.j(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle o() {
        return this.billingInterface.b(this.packageName, INSTANCE.i(), s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle p() {
        return this.billingInterface.b(this.packageName, INSTANCE.j(), s());
    }

    private final C5335n.a q() {
        return !u() ? new C5335n.a(null, null, null, 7, null) : a(new m(), new n(), new o());
    }

    private final Bundle r() {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        bundle.putString(companion.h(), companion.k());
        return bundle;
    }

    private final Bundle s() {
        Bundle bundle = new Bundle();
        Companion companion = INSTANCE;
        bundle.putString(companion.c(), this.billingVersion);
        bundle.putBoolean(companion.a(), true);
        return bundle;
    }

    private final C5335n.a t() {
        return !v() ? new C5335n.a(null, null, null, 7, null) : a(new C0797p(), new q(), new r());
    }

    private final boolean u() {
        return this.billingInterface.a(this.packageName, INSTANCE.i()) == 0;
    }

    private final boolean v() {
        return this.billingInterface.a(this.packageName, INSTANCE.j()) == 0;
    }

    public final C5335n n() {
        return new C5335n(q(), t());
    }
}
