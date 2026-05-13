package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC5330i;
import io.bidmachine.analytics.internal.t0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0005\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lio/bidmachine/analytics/internal/d0;", "Lio/bidmachine/analytics/internal/i;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "", "a", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lhn/c;)Ljava/lang/Object;", "Lio/bidmachine/analytics/internal/i$a;", com.safedk.android.utils.i.f53156c, "Lbn/r;", "(Lio/bidmachine/analytics/internal/i$a;)V", "Landroid/content/Context;", "applicationContext", "d", "(Landroid/content/Context;)V", InneractiveMediationDefs.GENDER_FEMALE, "e", "Lio/bidmachine/analytics/internal/e0;", "g", "Lio/bidmachine/analytics/internal/e0;", "purchaseStorage", "Lkotlin/Function1;", "Lio/bidmachine/analytics/internal/o;", "h", "Lsn/l;", "billingManagerFactory", "i", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "j", "Lio/bidmachine/analytics/internal/o;", "billingManager", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "<init>", "(Lio/bidmachine/analytics/internal/e0;Lsn/l;)V", "l", "b", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class d0 extends AbstractC5330i {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e0 purchaseStorage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sn.l<Context, C5336o> billingManagerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C5336o billingManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lio/bidmachine/analytics/internal/o;", "a", "(Landroid/content/Context;)Lio/bidmachine/analytics/internal/o;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements sn.l<Context, C5336o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68832a = new a();

        public a() {
            super(1);
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5336o invoke(Context context) {
            return new C5336o(context);
        }
    }

    @jn.d(c = "io.bidmachine.analytics.sdk.service.reader.apur.PurchaseReaderService", f = "PurchaseReaderService.kt", l = {26}, m = "dataHash")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68834b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68836d;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68834b = obj;
            this.f68836d |= Integer.MIN_VALUE;
            return d0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(e0 e0Var, sn.l<? super Context, C5336o> lVar) {
        this.purchaseStorage = e0Var;
        this.billingManagerFactory = lVar;
        this.name = "apur";
    }

    public /* synthetic */ d0(e0 e0Var, sn.l lVar, int i10, tn.i iVar) {
        this(e0Var, (i10 & 2) != 0 ? a.f68832a : lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.bidmachine.analytics.internal.AbstractC5330i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(io.bidmachine.analytics.ReaderConfig.Rule r6, hn.c<? super java.lang.String> r7) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r6 = r7 instanceof io.bidmachine.analytics.internal.d0.c
            if (r6 == 0) goto L13
            r6 = r7
            io.bidmachine.analytics.internal.d0$c r6 = (io.bidmachine.analytics.internal.d0.c) r6
            int r0 = r6.f68836d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f68836d = r0
            goto L18
        L13:
            io.bidmachine.analytics.internal.d0$c r6 = new io.bidmachine.analytics.internal.d0$c
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f68834b
            java.lang.Object r0 = in.a.g()
            int r1 = r6.f68836d
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r6 = r6.f68833a
            io.bidmachine.analytics.internal.d0 r6 = (io.bidmachine.analytics.internal.d0) r6
            kotlin.c.b(r7)
            goto L56
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.c.b(r7)
            io.bidmachine.analytics.internal.o r7 = r5.billingManager
            if (r7 == 0) goto L7a
            co.b$a r1 = co.b.f6773c
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            r3 = 10
            long r3 = co.d.s(r3, r1)
            long r3 = co.b.q(r3)
            r6.f68833a = r5
            r6.f68836d = r2
            java.lang.Object r7 = r7.a(r3, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            r6 = r5
        L56:
            io.bidmachine.analytics.internal.n r7 = (io.bidmachine.analytics.internal.C5335n) r7
            io.bidmachine.analytics.internal.e0 r6 = r6.purchaseStorage
            r6.a(r7)
            if (r7 == 0) goto L72
            boolean r6 = r7.e()
            if (r6 != 0) goto L6a
            java.lang.String r6 = r7.a()
            return r6
        L6a:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data is empty"
            r6.<init>(r7)
            throw r6
        L72:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Data not received yet"
            r6.<init>(r7)
            throw r6
        L7a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Not configured"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.d0.a(io.bidmachine.analytics.ReaderConfig$Rule, hn.c):java.lang.Object");
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5331j
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5330i, io.bidmachine.analytics.internal.AbstractC5331j
    /* JADX INFO: renamed from: a */
    public void b(AbstractC5330i.a configuration) {
        super.b(configuration);
        Context context = this.context;
        if (context == null) {
            throw new IllegalArgumentException("Context is null".toString());
        }
        if (configuration.c().size() != 1) {
            throw new IllegalStateException(("Reader " + getName() + " should contains only one rule, received " + configuration.c().size()).toString());
        }
        List listU0 = bo.d0.U0(s0.b(((ReaderConfig.Rule) cn.f0.t0(configuration.c())).getPath()), new String[]{"-"}, false, 0, 6, null);
        if (listU0.size() != 2) {
            throw new IllegalStateException("Path should contains min and max value".toString());
        }
        t0.Companion companion = t0.INSTANCE;
        t0 t0VarA = companion.a(bo.d0.s1((String) listU0.get(0)).toString());
        if (t0VarA == null) {
            throw new IllegalStateException("Min version not found".toString());
        }
        t0 t0VarA2 = companion.a(bo.d0.s1((String) listU0.get(1)).toString());
        if (t0VarA2 == null) {
            throw new IllegalStateException("Max version not found".toString());
        }
        C5336o c5336oInvoke = this.billingManager;
        if (c5336oInvoke == null) {
            c5336oInvoke = this.billingManagerFactory.invoke(context);
        }
        this.billingManager = c5336oInvoke;
        t0 t0VarL = c5336oInvoke.l();
        if (t0VarL == null) {
            throw new IllegalStateException("Version not found".toString());
        }
        if (t0VarL.compareTo(t0VarA) < 0 || t0VarL.compareTo(t0VarA2) > 0) {
            throw new IllegalStateException(("Version " + t0VarL + " not supported by config").toString());
        }
        if (!c5336oInvoke.t()) {
            throw new IllegalStateException("No host found".toString());
        }
        if (!c5336oInvoke.s()) {
            throw new IllegalStateException("No permission".toString());
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5331j
    public void d(Context applicationContext) {
        this.context = applicationContext;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5330i, io.bidmachine.analytics.internal.AbstractC5331j
    public void e(Context applicationContext) {
        super.e(applicationContext);
        C5336o c5336o = this.billingManager;
        if (c5336o != null) {
            c5336o.j();
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5330i, io.bidmachine.analytics.internal.AbstractC5331j
    public void f(Context applicationContext) {
        C5336o c5336o = this.billingManager;
        if (c5336o != null) {
            c5336o.i();
        }
        super.f(applicationContext);
    }
}
