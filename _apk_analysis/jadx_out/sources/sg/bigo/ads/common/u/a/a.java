package sg.bigo.ads.common.u.a;

import android.net.TrafficStats;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import org.apache.http.conn.ConnectTimeoutException;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.a.d;
import sg.bigo.ads.common.u.h;
import sg.bigo.ads.common.u.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements sg.bigo.ads.common.u.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f82389a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final g f82390b;

    /* JADX INFO: renamed from: sg.bigo.ads.common.u.a.a$a, reason: collision with other inner class name */
    public static class C1024a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f82393a;

        public C1024a(d dVar) {
            this.f82393a = dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            d dVar = this.f82393a;
            if (dVar != null) {
                dVar.f82403a.disconnect();
            }
        }
    }

    public a(@Nullable g gVar) {
        this.f82390b = gVar;
        e.k();
    }

    private void a(@NonNull c cVar, @NonNull sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, boolean z10) {
        InputStream inputStreamA;
        URL url;
        TrafficStats.setThreadStatsTag(9999000);
        boolean z11 = false;
        d dVar = null;
        try {
            d dVar2 = new d(cVar);
            try {
                d.a aVarB = dVar2.b();
                if (aVarB != null) {
                    bVar.a(cVar.f82395a, aVarB.f82410b, aVarB.f82413e);
                    if (aVarB.f82411c == 0 && (url = aVarB.f82409a) != null) {
                        this.f82389a.a(cVar.f82396b, url);
                        try {
                            c cVarA = cVar.a(aVarB.f82409a);
                            sg.bigo.ads.common.t.a.a(0, 3, "AndroidNetClient", "process redirect, " + aVarB.f82409a);
                            if (cVar.f82397c) {
                                cVar.f82395a.a("Accept-Encoding");
                            }
                            a(cVarA, bVar, z10);
                            sg.bigo.ads.common.utils.g.a((Closeable) null);
                            dVar2.f82403a.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return;
                        } catch (i unused) {
                        }
                    }
                }
                if (bVar.a(cVar.f82395a, dVar2.f82404b)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AndroidNetClient", cVar + ", responseCode = " + dVar2.f82404b + ", is valid.");
                    inputStreamA = dVar2.a();
                    try {
                        a(bVar, cVar, bVar.a(new sg.bigo.ads.common.u.c.a(cVar.f82395a.f82433j, dVar2.f82404b, inputStreamA, dVar2.f82405c, z10 ? null : new C1024a(dVar2))));
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = dVar2;
                        try {
                            a(bVar, cVar, new h(th instanceof SocketTimeoutException ? 702 : th instanceof ConnectTimeoutException ? 701 : 700, th.getMessage()));
                            sg.bigo.ads.common.t.a.a(0, "AndroidNetClient", cVar + ", error = " + th.getMessage());
                            sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                            if (dVar != null) {
                                dVar.f82403a.disconnect();
                            }
                            TrafficStats.clearThreadStatsTag();
                            return;
                        } catch (Throwable th3) {
                            if (z10) {
                                sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                                if (dVar != null) {
                                    dVar.f82403a.disconnect();
                                }
                            }
                            TrafficStats.clearThreadStatsTag();
                            throw th3;
                        }
                    }
                } else {
                    String strA = aVarB != null ? aVarB.f82412d : null;
                    InputStream errorStream = dVar2.f82403a.getErrorStream();
                    if (TextUtils.isEmpty(strA)) {
                        strA = sg.bigo.ads.common.utils.g.a(errorStream);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(strA)) {
                        sb2.append(strA);
                        sb2.append(", ");
                    }
                    sb2.append("responseCode is ");
                    sb2.append(dVar2.f82404b);
                    sb2.append(", validate fail.");
                    sg.bigo.ads.common.t.a.a(0, "AndroidNetClient", cVar + ", responseCode = " + dVar2.f82404b + ", is invalid.");
                    a(bVar, cVar, new sg.bigo.ads.common.u.e(dVar2.f82404b, sb2.toString()));
                    z11 = true;
                    inputStreamA = errorStream;
                }
                if (z10 || z11) {
                    sg.bigo.ads.common.utils.g.a((Closeable) inputStreamA);
                    dVar2.f82403a.disconnect();
                }
                TrafficStats.clearThreadStatsTag();
            } catch (Throwable th4) {
                th = th4;
                inputStreamA = null;
            }
        } catch (Throwable th5) {
            th = th5;
            inputStreamA = null;
        }
    }

    private static void a(@NonNull sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, @NonNull c cVar, @NonNull sg.bigo.ads.common.u.c.c cVar2) {
        if (!cVar.b()) {
            cVar.f82395a.f82434k.c();
        }
        bVar.a(cVar.f82395a, cVar2);
    }

    private static void a(@NonNull sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, @NonNull c cVar, @NonNull h hVar) {
        if (!cVar.b()) {
            T t10 = cVar.f82395a.f82434k;
            if (hVar.getClass() == h.class) {
                t10.b();
            } else if (hVar.getClass() == sg.bigo.ads.common.u.e.class) {
                t10.c();
            }
        }
        bVar.a(cVar.f82395a, hVar);
    }

    @Override // sg.bigo.ads.common.u.d
    public final void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.b bVar) {
        new e(cVar.f82435l, cVar, bVar) { // from class: sg.bigo.ads.common.u.a.a.1
            @Override // sg.bigo.ads.common.u.a.e
            public final void a(sg.bigo.ads.common.u.b.c cVar2, sg.bigo.ads.common.u.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar2, true);
            }
        }.l();
    }

    public final void a(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c> bVar, boolean z10) {
        a(new c(cVar, this.f82389a, this.f82390b), bVar, z10);
    }

    @Override // sg.bigo.ads.common.u.d
    public final void b(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.b bVar) {
        new e(cVar.f82435l, cVar, bVar) { // from class: sg.bigo.ads.common.u.a.a.2
            @Override // sg.bigo.ads.common.u.a.e
            public final void a(sg.bigo.ads.common.u.b.c cVar2, sg.bigo.ads.common.u.b bVar2) {
                a.this.a(cVar2, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar2, true);
            }
        }.l();
    }

    @Override // sg.bigo.ads.common.u.d
    public final void c(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull sg.bigo.ads.common.u.b bVar) {
        a(cVar, (sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c>) bVar, false);
    }
}
