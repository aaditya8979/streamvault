package sg.bigo.ads.core.player;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.a.h;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.h.b;
import sg.bigo.ads.common.o;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.player.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements b.a, a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f84283a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public Context f84285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<n> f84286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<n> f84287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, a> f84288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.common.h.b f84289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.core.player.a f84290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.common.h.a.a f84291i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private sg.bigo.ads.core.player.a.d f84293k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f84284b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f84292j = 0;

    public interface a {
        void a();

        void a(int i10);

        void a(String str, sg.bigo.ads.common.h.a aVar);

        void b(int i10);
    }

    private b() {
    }

    private static sg.bigo.ads.api.a.d a(@NonNull n nVar) {
        h hVar;
        if (!nVar.aR() || nVar.aS() || (hVar = i.f81802a) == null || hVar.r() == null) {
            return null;
        }
        return hVar.r();
    }

    private static sg.bigo.ads.common.h.a a(Context context, String str, String str2, @NonNull n nVar, sg.bigo.ads.api.a.d dVar) {
        if (dVar == null) {
            return new sg.bigo.ads.common.h.a(str, nVar.a(context), str2, nVar.aR(), nVar.al(), nVar.aS(), null);
        }
        return new sg.bigo.ads.common.h.a(str, nVar.a(context), str2, nVar.aR(), nVar.al(), false, new sg.bigo.ads.common.h.c(dVar.a(nVar.v(), nVar.x()), dVar.c(nVar.x()), dVar.a(nVar.x()), dVar.b(nVar.x()), dVar.d(nVar.x())));
    }

    public static b a() {
        return f84283a;
    }

    private void a(File file) {
        sg.bigo.ads.common.h.b.a("filterAdFiles dir = " + file.getAbsolutePath(), (sg.bigo.ads.common.h.a) null);
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = o.d(this.f84285c);
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: sg.bigo.ads.core.player.b.4
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file2, File file3) {
                    long jLastModified = file2.lastModified() - file3.lastModified();
                    if (jLastModified > 0) {
                        return -1;
                    }
                    return jLastModified == 0 ? 0 : 1;
                }
            });
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                sg.bigo.ads.common.h.a.a aVar = this.f84291i;
                long jLastModified = file2.lastModified();
                int iA = aVar.a();
                boolean z10 = true;
                if (!(aVar.f82167d + jLastModified < jCurrentTimeMillis) && i10 < iA) {
                    z10 = false;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DownloadConfig", "needDelete lastModifiedTs=" + jLastModified + ", numTmp=" + iA);
                if (z10) {
                    sg.bigo.ads.common.h.b.a("delete expired file name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                    File file3 = new File(strD, file2.getName());
                    if (file3.exists()) {
                        sg.bigo.ads.common.h.b.a("delete expired cover name = " + file2.getName(), (sg.bigo.ads.common.h.a) null);
                        file3.delete();
                    }
                    file2.delete();
                }
            }
        }
    }

    private boolean a(n nVar, sg.bigo.ads.common.h.a aVar) {
        return TextUtils.equals(nVar.b(this.f84285c), aVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, @NonNull n nVar, a aVar) {
        String strAP = nVar.aP();
        String strAQ = nVar.aQ();
        sg.bigo.ads.common.h.a aVarA = a(context, strAP, strAQ, nVar, a(nVar));
        if (aVarA.c()) {
            sg.bigo.ads.common.t.a.a(0, 3, "DownloadInfo", "info SupportFillTime: " + aVarA.toString());
            this.f84287e.add(nVar);
        }
        boolean z10 = i.f81802a.n().a(9) && URLUtil.isHttpUrl(strAP);
        if (z10) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) nVar, strAP, "Invalid http url", 0L, 0L, 2, "", false);
        }
        if (!z10 && !q.a((CharSequence) strAP) && !q.a((CharSequence) strAQ)) {
            this.f84286d.add(nVar);
            this.f84288f.put(nVar.aJ(), aVar);
            sg.bigo.ads.common.h.b.a("downloadMedia", aVarA);
            this.f84289g.a(aVarA, false);
            this.f84290h.a(aVarA);
            return;
        }
        nVar.i(5);
        if (!aVarA.c()) {
            aVar.b(z10 ? 10118 : 10103);
            return;
        }
        aVar.a();
        this.f84288f.put(nVar.aJ(), aVar);
        this.f84290h.c(aVarA);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a(new File(o.b(bVar.f84285c)));
        bVar.a(new File(o.c(bVar.f84285c)));
    }

    private static sg.bigo.ads.core.player.a.d d() {
        sg.bigo.ads.common.h.b.a("start HttpProxyCacheServer ServerSocket", (sg.bigo.ads.common.h.a) null);
        return new sg.bigo.ads.core.player.a.d();
    }

    private void e() {
        if (System.currentTimeMillis() - this.f84292j > 3600000) {
            c();
        }
    }

    public final void a(final Context context, @NonNull final n nVar, final a aVar) {
        if (!this.f84284b.get()) {
            sg.bigo.ads.common.h.b.a("please execute initAdResource first", (sg.bigo.ads.common.h.a) null);
        } else if (sg.bigo.ads.common.n.d.a()) {
            b(context, nVar, aVar);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, nVar, aVar);
                }
            });
        }
    }

    public final void a(String str) {
        if (this.f84288f == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f84288f.remove(str);
    }

    @Override // sg.bigo.ads.common.h.b.a
    public final void a(sg.bigo.ads.common.h.a aVar) {
        Iterator<n> it = this.f84286d.iterator();
        boolean z10 = !q.a((CharSequence) aVar.f82158p);
        while (z10 && it.hasNext()) {
            n next = it.next();
            if (a(next, aVar)) {
                next.c(aVar.f82158p);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    @Override // sg.bigo.ads.common.h.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(sg.bigo.ads.common.h.a r27, int r28, long r29) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.b.a(sg.bigo.ads.common.h.a, int, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    @Override // sg.bigo.ads.common.h.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(sg.bigo.ads.common.h.a r20, java.lang.String r21, long r22, long r24) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.player.b.a(sg.bigo.ads.common.h.a, java.lang.String, long, long):void");
    }

    public final sg.bigo.ads.core.player.a.d b() {
        sg.bigo.ads.core.player.a.d dVar = this.f84293k;
        if (dVar != null) {
            return dVar;
        }
        sg.bigo.ads.core.player.a.d dVarD = d();
        this.f84293k = dVarD;
        return dVarD;
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void b(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download fill time source=", aVar);
        sg.bigo.ads.common.h.b.a("callback download fill time", aVar);
        Iterator<n> it = this.f84287e.iterator();
        boolean z10 = !q.a((CharSequence) aVar.f82158p);
        while (it.hasNext()) {
            n next = it.next();
            if (a(next, aVar)) {
                if (z10) {
                    next.c(aVar.f82158p);
                }
                next.i(2);
                a aVar2 = this.f84288f.get(next.aJ());
                if (aVar2 != null) {
                    aVar2.a("", aVar);
                    if (aVar.f82144b == null) {
                        this.f84288f.remove(next.aJ());
                    }
                }
                it.remove();
            }
        }
        e();
    }

    public final void c() {
        this.f84292j = System.currentTimeMillis();
        sg.bigo.ads.common.h.b.a("start resource delete task", (sg.bigo.ads.common.h.a) null);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.b.3
            @Override // java.lang.Runnable
            public final void run() {
                b.b(b.this);
            }
        }, 30000L);
    }

    @Override // sg.bigo.ads.core.player.a.c
    public final void c(sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.h.b.a("callback download check Process source=", aVar);
        int iG = aVar.g();
        long j10 = aVar.f82151i;
        if (j10 > 0 && aVar.f82149g * 100 >= j10 * ((long) iG)) {
            sg.bigo.ads.common.h.b.a("video download process is enough. download percent: " + aVar.f82149g + ", total size:" + aVar.f82151i, aVar);
            return;
        }
        sg.bigo.ads.common.h.b.a("video download process is not enough. download size: " + aVar.f82149g + ", total size:" + aVar.f82151i + ", begin to download backup", aVar);
        boolean zA = q.a((CharSequence) aVar.f82158p) ^ true;
        for (n nVar : this.f84286d) {
            if (a(nVar, aVar)) {
                if (zA) {
                    nVar.c(aVar.f82158p);
                }
                a aVar2 = this.f84288f.get(nVar.aJ());
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        }
    }
}
