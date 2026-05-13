package io.bidmachine.analytics.internal;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.analytics.ReaderConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.g;
import p000do.j2;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u001e\u0010\u0018J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bR!\u0010\u0019\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0016R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lio/bidmachine/analytics/internal/i;", "Lio/bidmachine/analytics/internal/j;", "Lio/bidmachine/analytics/internal/i$a;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "Lkotlin/Result;", "Lio/bidmachine/analytics/internal/h$a;", "b", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lhn/c;)Ljava/lang/Object;", com.safedk.android.utils.i.f53156c, "Lbn/r;", "a", "(Lio/bidmachine/analytics/internal/i$a;)V", "Landroid/content/Context;", "applicationContext", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/content/Context;)V", "e", "", "Ldo/l0;", "d", "Lbn/g;", "()Ldo/l0;", "getScope$annotations", "()V", "scope", "Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/g;", "readerJob", "Lio/bidmachine/analytics/internal/i$a;", "<init>", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractC5330i extends AbstractC5331j<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bn.g scope = kotlin.b.b(d.f68890a);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g readerJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a configuration;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$a */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/bidmachine/analytics/internal/i$a;", "", "", "a", "J", "b", "()J", "interval", "", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "Ljava/util/List;", "c", "()Ljava/util/List;", "rules", "Lio/bidmachine/analytics/internal/h;", "Lio/bidmachine/analytics/internal/h;", "()Lio/bidmachine/analytics/internal/h;", "callback", "<init>", "(JLjava/util/List;Lio/bidmachine/analytics/internal/h;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long interval;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<ReaderConfig.Rule> rules;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5329h callback;

        public a(long j10, List<ReaderConfig.Rule> list, InterfaceC5329h interfaceC5329h) {
            this.interval = j10;
            this.rules = list;
            this.callback = interfaceC5329h;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC5329h getCallback() {
            return this.callback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        public final List<ReaderConfig.Rule> c() {
            return this.rules;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$b */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.service.reader.AnalyticsReaderService$onEnable$1", f = "AnalyticsReaderService.kt", l = {38, 41}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f68879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f68880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f68881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f68882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f68883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ AbstractC5330i f68884g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, AbstractC5330i abstractC5330i, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f68883f = aVar;
            this.f68884g = abstractC5330i;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = new b(this.f68883f, this.f68884g, cVar);
            bVar.f68882e = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
        
            r12 = r0;
            r0 = r1;
            r1 = r5;
            r5 = r7;
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ba -> B:12:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r11.f68881d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r11.f68882e
                do.l0 r1 = (p000do.l0) r1
                kotlin.c.b(r12)
                goto L45
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f68880c
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f68879b
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.Object r6 = r11.f68878a
                io.bidmachine.analytics.internal.i r6 = (io.bidmachine.analytics.internal.AbstractC5330i) r6
                java.lang.Object r7 = r11.f68882e
                do.l0 r7 = (p000do.l0) r7
                kotlin.c.b(r12)
                kotlin.Result r12 = (kotlin.Result) r12
                java.lang.Object r12 = r12.m7542unboximpl()
                r8 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L84
            L3d:
                kotlin.c.b(r12)
                java.lang.Object r12 = r11.f68882e
                r1 = r12
                do.l0 r1 = (p000do.l0) r1
            L45:
                r12 = r11
            L46:
                boolean r5 = kotlinx.coroutines.d.h(r1)
                if (r5 == 0) goto Lbc
                io.bidmachine.analytics.internal.i$a r5 = r12.f68883f
                java.util.List r5 = r5.c()
                io.bidmachine.analytics.internal.i r6 = r12.f68884g
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r5 = r5.iterator()
                r10 = r5
                r5 = r1
                r1 = r10
            L60:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L98
                java.lang.Object r8 = r1.next()
                io.bidmachine.analytics.ReaderConfig$Rule r8 = (io.bidmachine.analytics.ReaderConfig.Rule) r8
                r12.f68882e = r5
                r12.f68878a = r6
                r12.f68879b = r7
                r12.f68880c = r1
                r12.f68881d = r3
                java.lang.Object r8 = io.bidmachine.analytics.internal.AbstractC5330i.a(r6, r8, r12)
                if (r8 != r0) goto L7d
                return r0
            L7d:
                r10 = r0
                r0 = r12
                r12 = r8
                r8 = r7
                r7 = r5
                r5 = r1
                r1 = r10
            L84:
                boolean r9 = kotlin.Result.m7539isFailureimpl(r12)
                if (r9 == 0) goto L8b
                r12 = r4
            L8b:
                io.bidmachine.analytics.internal.h$a r12 = (io.bidmachine.analytics.internal.InterfaceC5329h.Data) r12
                if (r12 == 0) goto L92
                r8.add(r12)
            L92:
                r12 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                r7 = r8
                goto L60
            L98:
                java.util.List r7 = (java.util.List) r7
                io.bidmachine.analytics.internal.i$a r1 = r12.f68883f
                io.bidmachine.analytics.internal.h r1 = r1.getCallback()
                r1.a(r7)
                io.bidmachine.analytics.internal.i$a r1 = r12.f68883f
                long r6 = r1.getInterval()
                r12.f68882e = r5
                r12.f68878a = r4
                r12.f68879b = r4
                r12.f68880c = r4
                r12.f68881d = r2
                java.lang.Object r1 = p000do.s0.a(r6, r12)
                if (r1 != r0) goto Lba
                return r0
            Lba:
                r1 = r5
                goto L46
            Lbc:
                bn.r r12 = bn.r.f5635a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.AbstractC5330i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$c */
    @jn.d(c = "io.bidmachine.analytics.sdk.service.reader.AnalyticsReaderService", f = "AnalyticsReaderService.kt", l = {51}, m = "scan-gIAlu-s")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f68885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f68886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68887c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f68889e;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f68887c = obj;
            this.f68889e |= Integer.MIN_VALUE;
            Object objB = AbstractC5330i.this.b(null, this);
            return objB == in.a.g() ? objB : Result.m7533boximpl(objB);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.i$d */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldo/l0;", "a", "()Ldo/l0;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements sn.a<p000do.l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f68890a = new d();

        public d() {
            super(0);
        }

        @Override // sn.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p000do.l0 invoke() {
            return kotlinx.coroutines.d.a(j2.b(null, 1, null).plus(p0.INSTANCE.a().c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(io.bidmachine.analytics.ReaderConfig.Rule r9, hn.c<? super kotlin.Result<io.bidmachine.analytics.internal.InterfaceC5329h.Data>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.AbstractC5330i.c
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.i$c r0 = (io.bidmachine.analytics.internal.AbstractC5330i.c) r0
            int r1 = r0.f68889e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68889e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.i$c r0 = new io.bidmachine.analytics.internal.i$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f68887c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f68889e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f68886b
            io.bidmachine.analytics.ReaderConfig$Rule r9 = (io.bidmachine.analytics.ReaderConfig.Rule) r9
            java.lang.Object r0 = r0.f68885a
            io.bidmachine.analytics.internal.i r0 = (io.bidmachine.analytics.internal.AbstractC5330i) r0
            kotlin.c.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L4e
        L31:
            r10 = move-exception
            goto L57
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.c.b(r10)
            kotlin.Result$a r10 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L55
            r0.f68885a = r8     // Catch: java.lang.Throwable -> L55
            r0.f68886b = r9     // Catch: java.lang.Throwable -> L55
            r0.f68889e = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r10 = r8.a(r9, r0)     // Catch: java.lang.Throwable -> L55
            if (r10 != r1) goto L4d
            return r1
        L4d:
            r0 = r8
        L4e:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = kotlin.Result.m7534constructorimpl(r10)     // Catch: java.lang.Throwable -> L31
            goto L61
        L55:
            r10 = move-exception
            r0 = r8
        L57:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.c.a(r10)
            java.lang.Object r10 = kotlin.Result.m7534constructorimpl(r10)
        L61:
            r2 = r9
            boolean r9 = kotlin.Result.m7539isFailureimpl(r10)
            if (r9 == 0) goto L6a
            r9 = 0
            goto L6b
        L6a:
            r9 = r10
        L6b:
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L7e
            io.bidmachine.analytics.internal.h$a r9 = new io.bidmachine.analytics.internal.h$a
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r9 = kotlin.Result.m7534constructorimpl(r9)
            goto Lb6
        L7e:
            java.lang.Throwable r9 = kotlin.Result.m7537exceptionOrNullimpl(r10)
            boolean r10 = r9 instanceof java.util.concurrent.CancellationException
            if (r10 != 0) goto Lb7
            boolean r10 = r9 instanceof java.io.FileNotFoundException
            if (r10 == 0) goto L8d
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.TrackerError.a.READER_NO_CONTENT
            goto L96
        L8d:
            boolean r10 = r9 instanceof java.lang.SecurityException
            if (r10 == 0) goto L94
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.TrackerError.a.READER_NO_ACCESS
            goto L96
        L94:
            io.bidmachine.analytics.internal.q0$a r10 = io.bidmachine.analytics.internal.TrackerError.a.READER_INVALID
        L96:
            if (r9 == 0) goto L9e
            java.lang.String r9 = io.bidmachine.analytics.internal.s0.a(r9)
            if (r9 != 0) goto La0
        L9e:
            java.lang.String r9 = ""
        La0:
            io.bidmachine.analytics.internal.h$a r7 = new io.bidmachine.analytics.internal.h$a
            io.bidmachine.analytics.internal.q0 r4 = new io.bidmachine.analytics.internal.q0
            java.lang.String r0 = r0.getName()
            r4.<init>(r0, r10, r9)
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r9 = kotlin.Result.m7534constructorimpl(r7)
        Lb6:
            return r9
        Lb7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.AbstractC5330i.b(io.bidmachine.analytics.ReaderConfig$Rule, hn.c):java.lang.Object");
    }

    public abstract Object a(ReaderConfig.Rule rule, hn.c<? super String> cVar);

    @Override // io.bidmachine.analytics.internal.AbstractC5331j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(a configuration) {
        this.configuration = configuration;
    }

    public final p000do.l0 b() {
        return (p000do.l0) this.scope.getValue();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5331j
    public void e(Context applicationContext) {
        kotlinx.coroutines.g gVar = this.readerJob;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC5331j
    public void f(Context applicationContext) {
        kotlinx.coroutines.g gVar = this.readerJob;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        a aVar = this.configuration;
        if (aVar == null) {
            return;
        }
        this.readerJob = p000do.i.d(b(), null, null, new b(aVar, this, null), 3, null);
    }
}
