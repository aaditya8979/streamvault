package io.bidmachine.analytics.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.internal.Y;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 $*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0007B+\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\"\u0010#J#\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0014J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u0015J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0016J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "", "Lio/bidmachine/analytics/internal/s;", "encryptionManager", "", "data", "a", "(Lio/bidmachine/analytics/internal/s;[B)[B", "", IronSourceConstants.REQUEST_URL, "content", "Lbn/r;", "(Ljava/lang/String;[B)V", "Ljava/net/URLConnection;", "connection", "", "b", "(Ljava/net/URLConnection;)I", "Lkotlin/Result;", "(Ljava/net/URLConnection;)Ljava/lang/Object;", "(Lhn/c;)Ljava/lang/Object;", "()Lio/bidmachine/analytics/internal/Y;", "()[B", "Lio/bidmachine/analytics/internal/o0;", "Lio/bidmachine/analytics/internal/o0;", "requestMethod", "Ljava/lang/String;", "Lio/bidmachine/analytics/internal/p0;", "c", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "d", "Lio/bidmachine/analytics/internal/s;", "<init>", "(Lio/bidmachine/analytics/internal/o0;Ljava/lang/String;Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/s;)V", "e", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class Y<Self extends Y<Self>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0 requestMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String requestUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 dispatchers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5339s encryptionManager;

    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest", f = "NetworkRequest.kt", l = {26}, m = "execute-IoAF18A")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f68814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y<Self> f68815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f68816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y<Self> y10, hn.c<? super b> cVar) {
            super(cVar);
            this.f68815b = y10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68814a = obj;
            this.f68816c |= Integer.MIN_VALUE;
            Object objA = this.f68815b.a(this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "Ldo/l0;", "Lkotlin/Result;", "<anonymous>", "(Ldo/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest$execute$2", f = "NetworkRequest.kt", l = {32}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super Result<? extends Self>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y<Self> f68818b;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/Y;", "Self", "Ldo/l0;", "", "<anonymous>", "(Ldo/l0;)[B"}, k = 3, mv = {1, 7, 1})
        @jn.d(c = "io.bidmachine.analytics.sdk.tracker.network.NetworkRequest$execute$2$content$1", f = "NetworkRequest.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super byte[]>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f68819a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y<Self> f68820b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Y<Self> y10, hn.c<? super a> cVar) {
                super(2, cVar);
                this.f68820b = y10;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super byte[]> cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
                return new a(this.f68820b, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f68819a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                Y<Self> y10 = this.f68820b;
                return y10.a(((Y) y10).encryptionManager, this.f68820b.b());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y<Self> y10, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f68818b = y10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super Result<? extends Self>> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new c(this.f68818b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM7534constructorimpl;
            Object objG = in.a.g();
            int i10 = this.f68817a;
            try {
                try {
                    if (i10 == 0) {
                        kotlin.c.b(obj);
                        if (((Y) this.f68818b).encryptionManager == null) {
                            Result.a aVar = Result.Companion;
                            return Result.m7533boximpl(Result.m7534constructorimpl(this.f68818b.a()));
                        }
                        p000do.h0 h0VarB = ((Y) this.f68818b).dispatchers.b();
                        a aVar2 = new a(this.f68818b, null);
                        this.f68817a = 1;
                        obj = p000do.g.g(h0VarB, aVar2, this);
                        if (obj == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    byte[] bArr = (byte[]) obj;
                    Y<Self> y10 = this.f68818b;
                    y10.a(((Y) y10).requestUrl, bArr);
                    Result.a aVar3 = Result.Companion;
                    objM7534constructorimpl = Result.m7534constructorimpl(this.f68818b.a());
                } catch (Throwable unused) {
                    Result.a aVar4 = Result.Companion;
                    return Result.m7533boximpl(Result.m7534constructorimpl(this.f68818b.a()));
                }
            } catch (Throwable th2) {
                Result.a aVar5 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            return Result.m7533boximpl(objM7534constructorimpl);
        }
    }

    public Y(o0 o0Var, String str, p0 p0Var, C5339s c5339s) {
        this.requestMethod = o0Var;
        this.requestUrl = str;
        this.dispatchers = p0Var;
        this.encryptionManager = c5339s;
    }

    public /* synthetic */ Y(o0 o0Var, String str, p0 p0Var, C5339s c5339s, int i10, tn.i iVar) {
        this(o0Var, str, p0Var, (i10 & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_bh_3_3_0() : c5339s);
    }

    private final Object a(URLConnection connection) {
        try {
            Result.a aVar = Result.Companion;
            if (connection instanceof HttpURLConnection) {
                ((HttpURLConnection) connection).disconnect();
            }
            return Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:4:0x0011, B:6:0x0027, B:8:0x003b, B:11:0x0040, B:13:0x0043, B:16:0x0052, B:21:0x005f, B:23:0x0068, B:24:0x006f, B:25:0x0070, B:35:0x0088, B:44:0x00a1, B:45:0x00bb, B:37:0x008c, B:39:0x0094, B:41:0x009a), top: B:53:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, byte[] r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.Y.a(java.lang.String, byte[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(C5339s encryptionManager, byte[] data) {
        if (data != null) {
            return C5340t.a(data, encryptionManager);
        }
        return null;
    }

    private final int b(URLConnection connection) {
        if (connection instanceof HttpURLConnection) {
            return ((HttpURLConnection) connection).getResponseCode();
        }
        return -1;
    }

    public abstract Self a();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(hn.c<? super kotlin.Result<? extends Self>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.Y.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.Y$b r0 = (io.bidmachine.analytics.internal.Y.b) r0
            int r1 = r0.f68816c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68816c = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.Y$b r0 = new io.bidmachine.analytics.internal.Y$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f68814a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68816c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.c.b(r6)
            io.bidmachine.analytics.internal.p0 r6 = r5.dispatchers
            do.h0 r6 = r6.c()
            io.bidmachine.analytics.internal.Y$c r2 = new io.bidmachine.analytics.internal.Y$c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f68816c = r3
            java.lang.Object r6 = p000do.g.g(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.m7542unboximpl()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.Y.a(hn.c):java.lang.Object");
    }

    public abstract byte[] b();
}
