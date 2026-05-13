package sg.bigo.ads.common.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3978d4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.common.h.b.e;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f82168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f82169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f82170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f82171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f82172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.h.a.a f82173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f82174g;

    public interface a {
        void a(sg.bigo.ads.common.h.a aVar);

        void a(sg.bigo.ads.common.h.a aVar, int i10, long j10);

        void a(sg.bigo.ads.common.h.a aVar, String str, long j10, long j11);
    }

    public b(@NonNull Context context, sg.bigo.ads.common.h.a.a aVar, boolean z10, @NonNull a aVar2) {
        this.f82174g = context;
        this.f82172e = aVar2;
        sg.bigo.ads.common.h.b.b.a(z10);
        this.f82173f = aVar;
        this.f82168a = new CopyOnWriteArrayList<>();
        this.f82169b = new CopyOnWriteArrayList<>();
        this.f82170c = new CopyOnWriteArrayList<>();
        this.f82171d = new CopyOnWriteArrayList<>();
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return null;
        }
        for (sg.bigo.ads.common.h.a aVar : list) {
            if (TextUtils.equals(str, aVar.f82145c) && TextUtils.equals(str2, aVar.f82146d)) {
                return aVar;
            }
        }
        return null;
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, sg.bigo.ads.common.h.a aVar) {
        int iIndexOf = list.indexOf(aVar);
        if (iIndexOf < 0) {
            return null;
        }
        try {
            return list.get(iIndexOf);
        } catch (Exception e10) {
            a("getExistDownloadInfo e=" + e10.getMessage(), (sg.bigo.ads.common.h.a) null);
            return null;
        }
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, boolean z10) {
        for (sg.bigo.ads.common.h.a aVar : list) {
            boolean z11 = true;
            if (z10) {
                int i10 = aVar.f82153k >= 3 ? 1800000 : 300000;
                if (aVar.f82154l <= 0 || System.currentTimeMillis() - aVar.f82154l <= i10) {
                    z11 = false;
                }
            }
            if (z11) {
                return aVar;
            }
            a("no download info execute.", aVar);
        }
        return null;
    }

    private void a(Context context, sg.bigo.ads.common.h.a aVar) {
        aVar.f82155m = SystemClock.elapsedRealtime();
        a("execute download start", aVar);
        if (f.b(aVar.f82145c, aVar.f82146d)) {
            a("executeDownload use local file", aVar);
            f.c(aVar.f82145c, aVar.f82146d);
            aVar.f82152j = 3;
            aVar.f82151i = f.a(aVar.a(), 1);
            this.f82168a.remove(aVar);
            this.f82169b.add(aVar);
            this.f82172e.a(aVar, 0, 0L);
            a();
            return;
        }
        if (!p.b()) {
            this.f82168a.remove(aVar);
            this.f82172e.a(aVar, "internal storage is not enough", SystemClock.elapsedRealtime() - aVar.f82155m, 0L);
            a();
        } else {
            sg.bigo.ads.common.h.b.b.a(context, aVar);
            sg.bigo.ads.common.h.b.b.a(aVar.f82143a, this);
            a("execute downloader", aVar);
            sg.bigo.ads.common.h.b.b.b(aVar.f82143a);
        }
    }

    public static void a(String str, sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadManager", str + ", download info = " + (aVar != null ? aVar.toString() : null));
    }

    public static boolean a(List<sg.bigo.ads.common.h.a> list, String str) {
        if (!q.a((CharSequence) str) && !k.a((Collection) list)) {
            Iterator<sg.bigo.ads.common.h.a> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().f82144b)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b() {
        return this.f82168a.size() < this.f82173f.f82164a;
    }

    public final sg.bigo.ads.common.h.a a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return null;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f82168a, str, str2);
        if (aVarA == null) {
            aVarA = a(this.f82169b, str, str2);
        }
        if (aVarA == null) {
            aVarA = a(this.f82170c, str, str2);
        }
        return aVarA == null ? a(this.f82171d, str, str2) : aVarA;
    }

    public final void a() {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        a("continue to execute download task", (sg.bigo.ads.common.h.a) null);
        if (!b()) {
            a("no idle download thread", (sg.bigo.ads.common.h.a) null);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a((List<sg.bigo.ads.common.h.a>) this.f82170c, false);
        if (aVarA != null) {
            a("waiting to downloading", aVarA);
            this.f82170c.remove(aVarA);
        }
        if (aVarA == null && (aVarA = a((List<sg.bigo.ads.common.h.a>) this.f82171d, true)) != null) {
            a("failed to downloading", aVarA);
            this.f82171d.remove(aVarA);
        }
        if (aVarA == null) {
            a("no download info execute.", (sg.bigo.ads.common.h.a) null);
        } else {
            this.f82168a.add(aVarA);
            a(this.f82174g, aVarA);
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(String str) {
        final sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA == null) {
            a("onStart info is null.", (sg.bigo.ads.common.h.a) null);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.f82172e.a(aVarA);
                }
            });
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(final String str, final String str2, final long j10) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.4
            @Override // java.lang.Runnable
            public final void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                b.a("download failed", aVarA);
                aVarA.f82152j = 4;
                if (!aVarA.f82156n) {
                    aVarA.f82153k++;
                }
                aVarA.f82154l = System.currentTimeMillis();
                b.this.f82172e.a(aVarA, str2, jElapsedRealtime - aVarA.f82155m, j10);
                b.a("download failed update fail count", aVarA);
                b.this.f82168a.remove(aVarA);
                b.this.f82171d.add(aVarA);
                b.a("downloading to failed", aVarA);
                b.this.a();
            }
        });
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(sg.bigo.ads.common.h.a aVar, boolean z10) {
        a("start the download, force=".concat(String.valueOf(z10)), aVar);
        if (f.b(aVar.a())) {
            a("downloaded and exist local file", aVar);
            f.c(aVar.f82145c, aVar.f82146d);
            this.f82172e.a(aVar, 0, 0L);
            return;
        }
        if (a(this.f82168a, aVar) != null) {
            a("downloading", aVar);
            return;
        }
        if (this.f82173f.b()) {
            this.f82172e.a(aVar, "Unable to download media file.", 0L, 0L);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f82170c, aVar);
        if (aVarA != null) {
            a("waiting", aVar);
            aVarA.f82144b = aVar.f82144b;
            if (!z10 && !b()) {
                a("waiting not executing", aVar);
                return;
            }
        }
        sg.bigo.ads.common.h.a aVarA2 = a(this.f82171d, aVar);
        if (aVarA2 != null) {
            a(C3978d4.i.f31363t, aVar);
            this.f82171d.remove(aVarA2);
            aVarA2.f82144b = aVar.f82144b;
            aVarA2.f82152j = 0;
            aVar = aVarA2;
        }
        if (!b() && !z10) {
            a("join download waiting queue", aVar);
            this.f82170c.add(aVar);
        } else {
            a("execute download", aVar);
            aVar.f82156n = z10;
            this.f82168a.add(aVar);
            a(this.f82174g, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    @Override // sg.bigo.ads.common.h.b.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r12) {
        /*
            r11 = this;
            sg.bigo.ads.common.h.a r12 = sg.bigo.ads.common.h.b.b.a(r12)
            if (r12 != 0) goto Ld
            r12 = 0
            java.lang.String r0 = "onLoading info is null."
            a(r0, r12)
            return
        Ld:
            int r0 = r12.f82152j
            r1 = 1
            if (r0 == r1) goto L19
            java.lang.String r0 = "onLoading"
            a(r0, r12)
            r12.f82152j = r1
        L19:
            long r2 = r12.f82151i
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L36
            long r5 = r12.f82149g
            long r7 = r12.f82150h
            long r7 = r5 - r7
            r9 = 100
            long r7 = r7 * r9
            r9 = 10
            long r2 = r2 * r9
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L36
            r12.f82150h = r5
            r0 = r1
            goto L37
        L36:
            r0 = r4
        L37:
            if (r0 == 0) goto L74
            boolean r0 = r12.h()
            if (r0 == 0) goto L74
            android.content.Context r0 = r11.f82174g
            int r0 = sg.bigo.ads.common.aa.c.a(r0)
            r2 = 3
            if (r0 != r2) goto L4a
            r2 = r1
            goto L4b
        L4a:
            r2 = r4
        L4b:
            if (r2 != 0) goto L5d
            r2 = 4
            if (r0 != r2) goto L52
            r2 = r1
            goto L53
        L52:
            r2 = r4
        L53:
            if (r2 != 0) goto L5d
            r2 = 5
            if (r0 != r2) goto L5a
            r0 = r1
            goto L5b
        L5a:
            r0 = r4
        L5b:
            if (r0 == 0) goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 == 0) goto L74
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f82155m
            long r2 = r2 - r4
            java.lang.String r0 = "partial download callback"
            a(r0, r12)
            sg.bigo.ads.common.h.b$2 r0 = new sg.bigo.ads.common.h.b$2
            r0.<init>()
            sg.bigo.ads.common.n.d.a(r1, r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.h.b.b(java.lang.String):void");
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void c(String str) {
        sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA != null) {
            aVarA.f82152j = 2;
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void d(final String str) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b.a("download succeed", aVarA);
                aVarA.f82152j = 3;
                b.this.f82168a.remove(aVarA);
                b.this.f82169b.add(aVarA);
                b.this.f82172e.a(aVarA, 1, jElapsedRealtime - aVarA.f82155m);
                b.a("downloading to downloaded", aVarA);
                sg.bigo.ads.common.h.b.b.a(aVarA.f82143a);
                b.this.a();
            }
        });
    }
}
