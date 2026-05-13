package io.bidmachine.analytics.internal;

import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\fJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/bidmachine/analytics/internal/G;", "", "", "path", "Lao/i;", com.safedk.android.analytics.reporters.b.f52847d, "Lbn/r;", "a", "(Ljava/lang/String;Lao/i;)V", "", "b", "()Z", "(Ljava/lang/String;)V", "()V", "Lio/bidmachine/analytics/internal/J;", "Lio/bidmachine/analytics/internal/J;", C3978d4.a.f31215k, "Lio/bidmachine/analytics/internal/K;", "Lio/bidmachine/analytics/internal/K;", "stream", "Ldo/l0;", "c", "Ldo/l0;", "scope", "Lkotlinx/coroutines/g;", "d", "Lkotlinx/coroutines/g;", "job", "<init>", "(Lio/bidmachine/analytics/internal/J;Lio/bidmachine/analytics/internal/K;Ldo/l0;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final J storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K stream;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p000do.l0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private kotlinx.coroutines.g job;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/analytics/internal/G$a;", "", "Lio/bidmachine/analytics/internal/G;", "a", "()Lio/bidmachine/analytics/internal/G;", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
    public interface a {
        G a();
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Ldo/l0;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @jn.d(c = "io.bidmachine.analytics.sdk.service.reader.alog.LogCatReader$read$1", f = "LogCatReader.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f68720b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f68722d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f68722d = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            b bVar = G.this.new b(this.f68722d, cVar);
            bVar.f68720b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BufferedReader bufferedReader;
            in.a.g();
            if (this.f68719a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            K k10 = G.this.stream;
            G g10 = G.this;
            String str = this.f68722d;
            synchronized (k10) {
                try {
                    Result.a aVar = Result.Companion;
                    InputStream inputStreamA = g10.stream.a(bo.d0.U0(s0.b(str), new String[]{Z7.f30794r}, false, 0, 6, null));
                    bn.r rVar = null;
                    if (inputStreamA != null) {
                        Reader inputStreamReader = new InputStreamReader(inputStreamA, bo.c.f5639b);
                        bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    } else {
                        bufferedReader = null;
                    }
                    if (bufferedReader != null) {
                        try {
                            g10.a(str, on.k.d(bufferedReader));
                            bn.r rVar2 = bn.r.f5635a;
                            on.b.a(bufferedReader, null);
                        } finally {
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        rVar = bn.r.f5635a;
                    }
                    Result.m7534constructorimpl(rVar);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    Result.m7534constructorimpl(kotlin.c.a(th2));
                }
            }
            return bn.r.f5635a;
        }
    }

    public G(J j10, K k10, p000do.l0 l0Var) {
        this.storage = j10;
        this.stream = k10;
        this.scope = l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String path, ao.i<String> lines) {
        Iterator<String> it = lines.iterator();
        while (b() && it.hasNext()) {
            this.storage.a(path, it.next());
        }
    }

    private final boolean b() {
        kotlinx.coroutines.g gVar = this.job;
        return gVar != null && gVar.isActive();
    }

    public final void a() {
        kotlinx.coroutines.g gVar = this.job;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.job = null;
        synchronized (this.stream) {
            try {
                Result.a aVar = Result.Companion;
                this.stream.a();
                Result.m7534constructorimpl(bn.r.f5635a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
    }

    public final void a(String path) {
        kotlinx.coroutines.g gVar = this.job;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        this.job = p000do.i.d(this.scope, null, null, new b(path, null), 3, null);
    }
}
