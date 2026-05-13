package r0;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.support.lastchange.LastChangeParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final hr.b f78508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final qr.l<?, ?> f78509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Handler f78510c;

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class a extends e implements r0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final p0.b f78511d;

        /* JADX INFO: renamed from: r0.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class C0942a extends as.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f78512e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<bn.r> f78513f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0942a(String str, a aVar, p<bn.r> pVar, qr.l<?, ?> lVar) {
                super(lVar, str);
                this.f78512e = aVar;
                this.f78513f = pVar;
            }

            @Override // hr.a
            public void c(jr.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = this.f78512e;
                p<bn.r> pVar = this.f78513f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // as.a, hr.a
            public void h(jr.d<?> dVar) {
                this.f78512e.o(this.f78513f, bn.r.f5635a);
            }
        }

        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class b extends as.b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f78514e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<bn.r> f78515f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, a aVar, p<bn.r> pVar, qr.l<?, ?> lVar) {
                super(lVar, str, str2);
                this.f78514e = aVar;
                this.f78515f = pVar;
            }

            @Override // hr.a
            public void c(jr.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = this.f78514e;
                p<bn.r> pVar = this.f78515f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // as.b, hr.a
            public void h(jr.d<?> dVar) {
                this.f78514e.o(this.f78515f, bn.r.f5635a);
            }
        }

        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class c extends as.c {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<bn.r> f78517f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(p<bn.r> pVar, qr.l<?, ?> lVar) {
                super(lVar);
                this.f78517f = pVar;
            }

            @Override // hr.a
            public void c(jr.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = a.this;
                p<bn.r> pVar = this.f78517f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // as.c, hr.a
            public void h(jr.d<?> dVar) {
                a.this.o(this.f78517f, bn.r.f5635a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull hr.b bVar, @Nullable qr.l<?, ?> lVar) {
            super(bVar, lVar);
            tn.p.k(bVar, "controlPoint");
            this.f78511d = p0.b.f76945b.a("AvTransportService");
        }

        @Override // r0.b
        public void a(@NotNull String str, @Nullable p<bn.r> pVar) {
            tn.p.k(str, "speed");
            p0.b.f(h(), "Play", null, 2, null);
            if (j("Play")) {
                e.m(this, pVar, null, 2, null);
            } else {
                e.g(this, new C0942a(str, this, pVar, i()), false, 2, null);
            }
        }

        @Override // r0.b
        public void b(@Nullable p<bn.r> pVar) {
            p0.b.f(h(), "Stop", null, 2, null);
            if (j("Stop")) {
                e.m(this, pVar, null, 2, null);
            } else {
                e.g(this, new c(pVar, i()), false, 2, null);
            }
        }

        @Override // r0.b
        public void c(@NotNull String str, @NotNull String str2, @Nullable p<bn.r> pVar) {
            tn.p.k(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            tn.p.k(str2, "title");
            p0.b.f(h(), "SetAVTransportURI: " + str2 + ", " + str, null, 2, null);
            if (j("SetAVTransportURI")) {
                e.m(this, pVar, null, 2, null);
                return;
            }
            String strB = n.f78540a.b(str, str2);
            p0.b.f(h(), "SetAVTransportURI: " + strB, null, 2, null);
            e.g(this, new b(str, strB, this, pVar, i()), false, 2, null);
        }

        @Override // r0.e
        @NotNull
        public p0.b h() {
            return this.f78511d;
        }
    }

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final p0.b f78518d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull hr.b bVar, @Nullable qr.l<?, ?> lVar) {
            super(bVar, lVar);
            tn.p.k(bVar, "controlPoint");
            this.f78518d = p0.b.f76945b.a("ContentService");
        }

        @Override // r0.e
        @NotNull
        public p0.b h() {
            return this.f78518d;
        }
    }

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class c extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final p0.b f78519d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull hr.b bVar, @Nullable qr.l<?, ?> lVar) {
            super(bVar, lVar);
            tn.p.k(bVar, "controlPoint");
            this.f78519d = p0.b.f76945b.a("RendererService");
        }

        @Override // r0.e
        @NotNull
        public p0.b h() {
            return this.f78519d;
        }
    }

    public e(@NotNull hr.b bVar, @Nullable qr.l<?, ?> lVar) {
        tn.p.k(bVar, "controlPoint");
        this.f78508a = bVar;
        this.f78509b = lVar;
        this.f78510c = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void g(e eVar, hr.a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeAction");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        eVar.f(aVar, z10);
    }

    public static /* synthetic */ void m(e eVar, p pVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyFailure");
        }
        if ((i10 & 2) != 0) {
            str = "Service not support this action.";
        }
        eVar.l(pVar, str);
    }

    public static final void n(p pVar, String str) {
        pVar.onFailure(str);
    }

    public static final void p(p pVar, Object obj) {
        pVar.onSuccess(obj);
    }

    public final void f(@NotNull hr.a aVar, boolean z10) {
        tn.p.k(aVar, "actionCallback");
        this.f78508a.e(new r0.a(aVar, z10));
    }

    @NotNull
    public abstract p0.b h();

    @Nullable
    public final qr.l<?, ?> i() {
        return this.f78509b;
    }

    public final boolean j(@NotNull String str) {
        tn.p.k(str, C3978d4.i.f31368v0);
        qr.l<?, ?> lVar = this.f78509b;
        boolean z10 = (lVar != null ? lVar.a(str) : null) == null;
        if (z10) {
            p0.b.i(h(), "[Unsupported]" + str, null, 2, null);
        }
        return z10;
    }

    public final void k(Runnable runnable) {
        if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            this.f78510c.post(runnable);
        }
    }

    public final <T> void l(@Nullable final p<T> pVar, @NotNull final String str) {
        tn.p.k(str, "exception");
        if (pVar != null) {
            k(new Runnable() { // from class: r0.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.n(pVar, str);
                }
            });
        }
    }

    public final <T> void o(@Nullable final p<T> pVar, final T t10) {
        if (pVar != null) {
            k(new Runnable() { // from class: r0.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.p(pVar, t10);
                }
            });
        }
    }

    public final void q(@NotNull r rVar, @NotNull LastChangeParser lastChangeParser) {
        tn.p.k(rVar, "subscriptionCallback");
        tn.p.k(lastChangeParser, "lastChangeParser");
        this.f78508a.b(new k(this.f78509b, 0, lastChangeParser, rVar, 2, null));
    }
}
