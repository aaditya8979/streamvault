package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.Struct;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.bidmachine.analytics.MonitorConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import p000do.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0002\u0006\u0012B\u001f\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00040\u00042\u0006\u0010\t\u001a\u00020\bH\u0083@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0083@ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0006\u0010\u0010J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Lio/bidmachine/analytics/internal/X;", "", "Lio/bidmachine/analytics/internal/Q;", "monitorRecord", "Lkotlin/Result;", "Lbn/r;", "a", "(Lio/bidmachine/analytics/internal/Q;)Ljava/lang/Object;", "", "limit", "", "(ILhn/c;)Ljava/lang/Object;", "monitorRecordList", "(Ljava/util/List;Lhn/c;)Ljava/lang/Object;", "", "force", "(Z)V", "()V", "b", "(Lio/bidmachine/analytics/internal/Q;)V", "Lio/bidmachine/analytics/internal/X$b;", "Lio/bidmachine/analytics/internal/X$b;", "config", "Lio/bidmachine/analytics/internal/V;", "Lio/bidmachine/analytics/internal/V;", "monitorRepository", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Ldo/l0;", "d", "Ldo/l0;", "scope", "Lkotlinx/coroutines/g;", "e", "Lkotlinx/coroutines/g;", "retrySendJob", "Ljava/util/concurrent/atomic/AtomicBoolean;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroyed", "Lio/bidmachine/analytics/internal/p0;", "dispatchers", "<init>", "(Lio/bidmachine/analytics/internal/p0;Lio/bidmachine/analytics/internal/X$b;Lio/bidmachine/analytics/internal/V;)V", "g", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final V monitorRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p000do.l0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g retrySendJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isDestroyed = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0013"}, d2 = {"Lio/bidmachine/analytics/internal/X$b;", "", "Lio/bidmachine/analytics/MonitorConfig;", "a", "Lio/bidmachine/analytics/MonitorConfig;", "b", "()Lio/bidmachine/analytics/MonitorConfig;", "monitorConfig", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/explorestack/protobuf/Struct;", "Lcom/explorestack/protobuf/Struct;", "()Lcom/explorestack/protobuf/Struct;", "extras", "<init>", "(Lio/bidmachine/analytics/MonitorConfig;Ljava/lang/String;Lcom/explorestack/protobuf/Struct;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final MonitorConfig monitorConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String sessionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Struct extras;

        public b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.monitorConfig = monitorConfig;
            this.sessionId = str;
            this.extras = struct;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Struct getExtras() {
            return this.extras;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MonitorConfig getMonitorConfig() {
            return this.monitorConfig;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$forceSendAndDestroy$1$1", f = "MonitorTracker.kt", l = {44}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68788a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<MonitorRecord> f68790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<MonitorRecord> list, hn.c<? super c> cVar) {
            super(2, cVar);
            this.f68790c = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((c) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return X.this.new c(this.f68790c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f68788a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                X x10 = X.this;
                List<MonitorRecord> list = this.f68790c;
                this.f68788a = 1;
                if (x10.a(list, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$scheduleSend$1", f = "MonitorTracker.kt", l = {118, 120}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68791a;

        public d(hn.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return X.this.new d(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f68791a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                long interval = X.this.config.getMonitorConfig().getInterval();
                this.f68791a = 1;
                if (p000do.s0.a(interval, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    ((Result) obj).m7542unboximpl();
                    return bn.r.f5635a;
                }
                kotlin.c.b(obj);
            }
            X x10 = X.this;
            this.f68791a = 2;
            if (x10.a(0, this) == objG) {
                return objG;
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker", f = "MonitorTracker.kt", l = {102}, m = "sendRecords")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f68794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68795c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f68797e;

        public e(hn.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68795c = obj;
            this.f68797e |= Integer.MIN_VALUE;
            return X.this.a((List<MonitorRecord>) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldo/l0;", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/P;", "<anonymous>", "(Ldo/l0;)Lkotlin/Result;"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$sendRecords$2$1$1", f = "MonitorTracker.kt", l = {94}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super Result<? extends P>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68798a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<MonitorRecord> f68800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<MonitorRecord> list, hn.c<? super f> cVar) {
            super(2, cVar);
            this.f68800c = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super Result<P>> cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return X.this.new f(this.f68800c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objG = in.a.g();
            int i10 = this.f68798a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                P p10 = new P(X.this.config.getMonitorConfig().getUrl(), X.this.config.getMonitorConfig().getName(), X.this.config.getExtras(), this.f68800c, null, 16, null);
                this.f68798a = 1;
                objA = p10.a(this);
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
            X x10 = X.this;
            List<MonitorRecord> list = this.f68800c;
            if (Result.m7540isSuccessimpl(objA)) {
                x10.monitorRepository.b(list);
            }
            X x11 = X.this;
            List<MonitorRecord> list2 = this.f68800c;
            if (Result.m7537exceptionOrNullimpl(objA) != null) {
                x11.monitorRepository.c(list2);
            }
            return Result.m7533boximpl(objA);
        }
    }

    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker", f = "MonitorTracker.kt", l = {75}, m = "sendRecordsIfLimitReached-gIAlu-s")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f68802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68803c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f68805e;

        public g(hn.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68803c = obj;
            this.f68805e |= Integer.MIN_VALUE;
            Object objA = X.this.a(0, this);
            return objA == in.a.g() ? objA : Result.m7533boximpl(objA);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.tracker.MonitorTracker$trackMonitorRecord$1", f = "MonitorTracker.kt", l = {55, 57}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MonitorRecord f68808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MonitorRecord monitorRecord, hn.c<? super h> cVar) {
            super(2, cVar);
            this.f68808c = monitorRecord;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return X.this.new h(this.f68808c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f68806a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                if (Result.m7540isSuccessimpl(X.this.a(this.f68808c))) {
                    X x10 = X.this;
                    int batchSize = x10.config.getMonitorConfig().getBatchSize();
                    this.f68806a = 1;
                    if (x10.a(batchSize, this) == objG) {
                        return objG;
                    }
                } else {
                    X x11 = X.this;
                    List listE = cn.v.e(this.f68808c);
                    this.f68806a = 2;
                    if (x11.a((List<MonitorRecord>) listE, this) == objG) {
                        return objG;
                    }
                }
            } else if (i10 == 1) {
                kotlin.c.b(obj);
                ((Result) obj).m7542unboximpl();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return bn.r.f5635a;
        }
    }

    public X(p0 p0Var, b bVar, V v10) {
        this.config = bVar;
        this.monitorRepository = v10;
        this.name = bVar.getMonitorConfig().getName();
        this.scope = kotlinx.coroutines.d.a(new p000do.k0("AnalyticsMonitor: " + bVar.getMonitorConfig().getName()).plus(j2.b(null, 1, null)).plus(p0Var.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, hn.c<? super kotlin.Result<? extends kotlin.Result<? extends java.util.List<io.bidmachine.analytics.internal.MonitorRecord>>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.X.g
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.X$g r0 = (io.bidmachine.analytics.internal.X.g) r0
            int r1 = r0.f68805e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68805e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.X$g r0 = new io.bidmachine.analytics.internal.X$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f68803c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68805e
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r9 = r0.f68802b
            java.lang.Object r0 = r0.f68801a
            io.bidmachine.analytics.internal.X r0 = (io.bidmachine.analytics.internal.X) r0
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L98
            goto L86
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.c.b(r10)
            kotlin.Result$a r10 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.internal.V r10 = r8.monitorRepository     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.internal.X$b r2 = r8.config     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.MonitorConfig r2 = r2.getMonitorConfig()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.internal.X$b r6 = r8.config     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = r6.getSessionId()     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.internal.X$b r7 = r8.config     // Catch: java.lang.Throwable -> L98
            io.bidmachine.analytics.MonitorConfig r7 = r7.getMonitorConfig()     // Catch: java.lang.Throwable -> L98
            int r7 = r7.getBatchSize()     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r10.a(r2, r6, r7)     // Catch: java.lang.Throwable -> L98
            boolean r2 = kotlin.Result.m7540isSuccessimpl(r10)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L84
            r2 = r10
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L98
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L98
            r6 = r6 ^ r5
            if (r6 == 0) goto L81
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L98
            if (r6 < r9) goto L81
            r0.f68801a = r8     // Catch: java.lang.Throwable -> L98
            r0.f68802b = r10     // Catch: java.lang.Throwable -> L98
            r0.f68805e = r5     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto L84
            return r1
        L81:
            a(r8, r4, r5, r3)     // Catch: java.lang.Throwable -> L98
        L84:
            r0 = r8
            r9 = r10
        L86:
            java.lang.Throwable r10 = kotlin.Result.m7537exceptionOrNullimpl(r9)     // Catch: java.lang.Throwable -> L98
            if (r10 == 0) goto L8f
            a(r0, r4, r5, r3)     // Catch: java.lang.Throwable -> L98
        L8f:
            kotlin.Result r9 = kotlin.Result.m7533boximpl(r9)     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = kotlin.Result.m7534constructorimpl(r9)     // Catch: java.lang.Throwable -> L98
            goto La3
        L98:
            r9 = move-exception
            kotlin.Result$a r10 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.c.a(r9)
            java.lang.Object r9 = kotlin.Result.m7534constructorimpl(r9)
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.a(int, hn.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(MonitorRecord monitorRecord) {
        try {
            Result.a aVar = Result.Companion;
            return this.monitorRepository.a(monitorRecord);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(kotlin.c.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<io.bidmachine.analytics.internal.MonitorRecord> r12, hn.c<? super bn.r> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof io.bidmachine.analytics.internal.X.e
            if (r0 == 0) goto L13
            r0 = r13
            io.bidmachine.analytics.internal.X$e r0 = (io.bidmachine.analytics.internal.X.e) r0
            int r1 = r0.f68797e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68797e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.X$e r0 = new io.bidmachine.analytics.internal.X$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f68795c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68797e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r12 = r0.f68794b
            java.lang.Object r0 = r0.f68793a
            io.bidmachine.analytics.internal.X r0 = (io.bidmachine.analytics.internal.X) r0
            kotlin.c.b(r13)
            goto L94
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.c.b(r13)
            io.bidmachine.analytics.internal.V r13 = r11.monitorRepository
            java.lang.Object r13 = r13.a(r12)
            boolean r2 = kotlin.Result.m7540isSuccessimpl(r13)
            if (r2 == 0) goto L99
            r2 = r13
            bn.r r2 = (bn.r) r2
            io.bidmachine.analytics.internal.X$b r2 = r11.config
            io.bidmachine.analytics.MonitorConfig r2 = r2.getMonitorConfig()
            int r2 = r2.getBatchSize()
            java.util.List r12 = cn.f0.h0(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = cn.x.x(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L66:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r12.next()
            java.util.List r4 = (java.util.List) r4
            do.l0 r5 = r11.scope
            io.bidmachine.analytics.internal.X$f r8 = new io.bidmachine.analytics.internal.X$f
            r6 = 0
            r8.<init>(r4, r6)
            r7 = 0
            r9 = 3
            r10 = 0
            do.p0 r4 = p000do.g.b(r5, r6, r7, r8, r9, r10)
            r2.add(r4)
            goto L66
        L85:
            r0.f68793a = r11
            r0.f68794b = r13
            r0.f68797e = r3
            java.lang.Object r12 = kotlinx.coroutines.AwaitKt.a(r2, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            r0 = r11
            r12 = r13
        L94:
            r0.a(r3)
            r13 = r12
            goto L9a
        L99:
            r0 = r11
        L9a:
            java.lang.Throwable r12 = kotlin.Result.m7537exceptionOrNullimpl(r13)
            if (r12 == 0) goto La3
            r0.a(r3)
        La3:
            bn.r r12 = bn.r.f5635a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.X.a(java.util.List, hn.c):java.lang.Object");
    }

    public static /* synthetic */ void a(X x10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        x10.a(z10);
    }

    private final void a(boolean force) {
        kotlinx.coroutines.g gVar;
        if (this.isDestroyed.get()) {
            return;
        }
        if (force || (gVar = this.retrySendJob) == null || !gVar.isActive()) {
            kotlinx.coroutines.g gVar2 = this.retrySendJob;
            if (gVar2 != null) {
                g.a.a(gVar2, null, 1, null);
            }
            this.retrySendJob = p000do.i.d(this.scope, null, null, new d(null), 3, null);
        }
    }

    public final void a() {
        if (this.isDestroyed.compareAndSet(false, true)) {
            Object objA = this.monitorRepository.a(this.config.getMonitorConfig().getName(), this.config.getSessionId());
            if (Result.m7540isSuccessimpl(objA)) {
                p000do.i.d(this.scope, null, null, new c((List) objA, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final void b(MonitorRecord monitorRecord) {
        if (this.isDestroyed.get()) {
            return;
        }
        p000do.i.d(this.scope, null, null, new h(monitorRecord, null), 3, null);
    }
}
