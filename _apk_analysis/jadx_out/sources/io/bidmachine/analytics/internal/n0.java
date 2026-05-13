package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.j2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J:\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ6\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00070\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\fJ&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u000eJ!\u0010\t\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0083@ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0010J#\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lio/bidmachine/analytics/internal/n0;", "", "", "readerName", "", "Lio/bidmachine/analytics/internal/h0;", "failedRuleList", "Lkotlin/Result;", "Lbn/r;", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;", "monitorName", "(Ljava/lang/String;Lhn/c;)Ljava/lang/Object;", "readerRecord", "(Lio/bidmachine/analytics/internal/h0;)Ljava/lang/Object;", "readerRecordList", "(Ljava/util/List;Lhn/c;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ljava/util/List;)V", "Lio/bidmachine/analytics/internal/n0$a;", "Lio/bidmachine/analytics/internal/n0$a;", "config", "Lio/bidmachine/analytics/internal/l0;", "Lio/bidmachine/analytics/internal/l0;", "readerRepository", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Ldo/l0;", "d", "Ldo/l0;", "scope", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/n0$a;Lio/bidmachine/analytics/internal/l0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l0 readerRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p000do.l0 scope;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, d2 = {"Lio/bidmachine/analytics/internal/n0$a;", "", "Lio/bidmachine/analytics/ReaderConfig;", "a", "Lio/bidmachine/analytics/ReaderConfig;", "c", "()Lio/bidmachine/analytics/ReaderConfig;", "readerConfig", "", "b", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/explorestack/protobuf/Struct;", "Lcom/explorestack/protobuf/Struct;", "()Lcom/explorestack/protobuf/Struct;", "extras", "Lio/bidmachine/analytics/internal/g0$a;", "d", "Lio/bidmachine/analytics/internal/g0$a;", "()Lio/bidmachine/analytics/internal/g0$a;", "contentExtractor", "<init>", "(Lio/bidmachine/analytics/ReaderConfig;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;Lio/bidmachine/analytics/internal/g0$a;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ReaderConfig readerConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Struct extras;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final g0.a contentExtractor;

        public a(ReaderConfig readerConfig, String str, Struct struct, g0.a aVar) {
            this.readerConfig = readerConfig;
            this.sessionId = str;
            this.extras = struct;
            this.contentExtractor = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g0.a getContentExtractor() {
            return this.contentExtractor;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Struct getExtras() {
            return this.extras;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ReaderConfig getReaderConfig() {
            return this.readerConfig;
        }
    }

    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker", f = "ReaderTracker.kt", l = {53}, m = "sendRecords-gIAlu-s")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68961b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68963d;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68961b = obj;
            this.f68963d |= Integer.MIN_VALUE;
            Object objA = n0.this.a((String) null, this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker", f = "ReaderTracker.kt", l = {101}, m = "sendRecords")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68965b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68967d;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68965b = obj;
            this.f68967d |= Integer.MIN_VALUE;
            return n0.this.a((List<ReaderRecord>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldo/l0;", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/g0;", "<anonymous>", "(Ldo/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker$sendRecords$4$1", f = "ReaderTracker.kt", l = {90}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super Result<? extends g0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68968a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<ReaderRecord> f68970c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<ReaderRecord> list, hn.c<? super d> cVar) {
            super(2, cVar);
            this.f68970c = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super Result<g0>> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return n0.this.new d(this.f68970c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objG = in.a.g();
            int i10 = this.f68968a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                g0 g0Var = new g0(n0.this.config.getReaderConfig().getUrl(), n0.this.config.getReaderConfig().getName(), n0.this.config.getExtras(), this.f68970c, n0.this.config.getContentExtractor(), null, 32, null);
                this.f68968a = 1;
                objA = g0Var.a(this);
                if (objA == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                objA = ((Result) obj).m7542unboximpl();
            }
            n0 n0Var = n0.this;
            List<ReaderRecord> list = this.f68970c;
            if (Result.m7540isSuccessimpl(objA)) {
                l0 l0Var = n0Var.readerRepository;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((ReaderRecord) obj2).getError() != null) {
                        arrayList.add(obj2);
                    }
                }
                l0Var.b(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((ReaderRecord) obj3).getError() == null) {
                        arrayList2.add(obj3);
                    }
                }
                n0Var.readerRepository.c(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    n0Var.a((ReaderRecord) it.next());
                }
            }
            n0 n0Var2 = n0.this;
            List<ReaderRecord> list2 = this.f68970c;
            if (Result.m7537exceptionOrNullimpl(objA) != null) {
                n0Var2.readerRepository.c(list2);
            }
            return Result.m7533boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.ReaderTracker$trackReaderRecordList$1", f = "ReaderTracker.kt", l = {38, 40}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f68972b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f68974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<ReaderRecord> f68975e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, List<ReaderRecord> list, hn.c<? super e> cVar) {
            super(2, cVar);
            this.f68974d = str;
            this.f68975e = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return n0.this.new e(this.f68974d, this.f68975e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List arrayList;
            Object objG = in.a.g();
            int i10 = this.f68972b;
            if (i10 == 0) {
                kotlin.c.b(obj);
                arrayList = new ArrayList();
                n0 n0Var = n0.this;
                String str = this.f68974d;
                List<ReaderRecord> list = this.f68975e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((ReaderRecord) obj2).getError() != null) {
                        arrayList2.add(obj2);
                    }
                }
                n0Var.a(str, arrayList2);
                List<ReaderRecord> list2 = this.f68975e;
                n0 n0Var2 = n0.this;
                for (ReaderRecord readerRecord : list2) {
                    if (Result.m7539isFailureimpl(n0Var2.a(readerRecord))) {
                        arrayList.add(readerRecord);
                    }
                }
                n0 n0Var3 = n0.this;
                String str2 = this.f68974d;
                this.f68971a = arrayList;
                this.f68972b = 1;
                if (n0Var3.a(str2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return bn.r.f5635a;
                }
                arrayList = (List) this.f68971a;
                kotlin.c.b(obj);
                ((Result) obj).m7542unboximpl();
            }
            if (!arrayList.isEmpty()) {
                n0 n0Var4 = n0.this;
                this.f68971a = null;
                this.f68972b = 2;
                if (n0Var4.a((List<ReaderRecord>) arrayList, this) == objG) {
                    return objG;
                }
            }
            return bn.r.f5635a;
        }
    }

    public n0(p0 p0Var, a aVar, l0 l0Var) {
        this.config = aVar;
        this.readerRepository = l0Var;
        this.name = aVar.getReaderConfig().getName();
        this.scope = kotlinx.coroutines.d.a(new p000do.k0("AnalyticsMonitor: " + aVar.getReaderConfig().getName()).plus(j2.b(null, 1, null)).plus(p0Var.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(ReaderRecord readerRecord) {
        try {
            Result.a aVar = Result.Companion;
            if (readerRecord.getError() == null) {
                Object objA = this.readerRepository.a(readerRecord.getName(), readerRecord.getRule());
                if (Result.m7539isFailureimpl(objA)) {
                    objA = null;
                }
                ReaderRecord readerRecord2 = (ReaderRecord) objA;
                if (readerRecord2 != null) {
                    return this.readerRepository.a(readerRecord.a((62 & 1) != 0 ? readerRecord.id : readerRecord2.getId(), (62 & 2) != 0 ? readerRecord.name : null, (62 & 4) != 0 ? readerRecord.timestamp : 0L, (62 & 8) != 0 ? readerRecord.dataHash : null, (62 & 16) != 0 ? readerRecord.rule : null, (62 & 32) != 0 ? readerRecord.error : null, (62 & 64) != 0 ? readerRecord.isDirty : (this.config.getReaderConfig().getUniqueOnly() && tn.p.f(readerRecord.getDataHash(), readerRecord2.getDataHash())) ? false : true));
                }
            }
            return this.readerRepository.b(readerRecord);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, hn.c<? super kotlin.Result<? extends kotlin.Result<? extends java.util.List<io.bidmachine.analytics.internal.ReaderRecord>>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.bidmachine.analytics.internal.n0.b
            if (r0 == 0) goto L13
            r0 = r6
            io.bidmachine.analytics.internal.n0$b r0 = (io.bidmachine.analytics.internal.n0.b) r0
            int r1 = r0.f68963d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68963d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.n0$b r0 = new io.bidmachine.analytics.internal.n0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f68961b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68963d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f68960a
            kotlin.c.b(r6)     // Catch: java.lang.Throwable -> L62
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.c.b(r6)
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L62
            io.bidmachine.analytics.internal.l0 r6 = r4.readerRepository     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L62
            boolean r6 = kotlin.Result.m7540isSuccessimpl(r5)     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L59
            r6 = r5
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L62
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L62
            r2 = r2 ^ r3
            if (r2 == 0) goto L59
            r0.f68960a = r5     // Catch: java.lang.Throwable -> L62
            r0.f68963d = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r6 != r1) goto L59
            return r1
        L59:
            kotlin.Result r5 = kotlin.Result.m7533boximpl(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = kotlin.Result.m7534constructorimpl(r5)     // Catch: java.lang.Throwable -> L62
            goto L6d
        L62:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.c.a(r5)
            java.lang.Object r5 = kotlin.Result.m7534constructorimpl(r5)
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n0.a(java.lang.String, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String readerName, List<ReaderRecord> failedRuleList) {
        try {
            Result.a aVar = Result.Companion;
            l0 l0Var = this.readerRepository;
            ArrayList arrayList = new ArrayList(cn.x.x(failedRuleList, 10));
            Iterator<T> it = failedRuleList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ReaderRecord) it.next()).getRule());
            }
            return Result.m7534constructorimpl(Result.m7533boximpl(l0Var.a(readerName, arrayList)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<io.bidmachine.analytics.internal.ReaderRecord> r11, hn.c<? super bn.r> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof io.bidmachine.analytics.internal.n0.c
            if (r0 == 0) goto L13
            r0 = r12
            io.bidmachine.analytics.internal.n0$c r0 = (io.bidmachine.analytics.internal.n0.c) r0
            int r1 = r0.f68967d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68967d = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.n0$c r0 = new io.bidmachine.analytics.internal.n0$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f68965b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68967d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r12)
            goto L5e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.c.b(r12)
            io.bidmachine.analytics.internal.l0 r12 = r10.readerRepository
            java.lang.Object r12 = r12.a(r11)
            boolean r2 = kotlin.Result.m7540isSuccessimpl(r12)
            if (r2 == 0) goto L5e
            r2 = r12
            bn.r r2 = (bn.r) r2
            do.l0 r4 = r10.scope
            io.bidmachine.analytics.internal.n0$d r7 = new io.bidmachine.analytics.internal.n0$d
            r2 = 0
            r7.<init>(r11, r2)
            r5 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            do.p0 r11 = p000do.g.b(r4, r5, r6, r7, r8, r9)
            r0.f68964a = r12
            r0.f68967d = r3
            java.lang.Object r11 = r11.N(r0)
            if (r11 != r1) goto L5e
            return r1
        L5e:
            bn.r r11 = bn.r.f5635a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.n0.a(java.util.List, hn.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final void b(String readerName, List<ReaderRecord> readerRecordList) {
        p000do.i.d(this.scope, null, null, new e(readerName, readerRecordList, null), 3, null);
    }
}
