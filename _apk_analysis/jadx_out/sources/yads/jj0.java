package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import bt.k3;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class jj0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f91237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np3 f91238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj0 f91239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f91240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f91241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f91242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f91244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f91245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f91247k;

    public jj0(HandlerThread handlerThread, rc0 rc0Var, sc0 sc0Var, Handler handler, boolean z10) {
        super(handlerThread.getLooper());
        this.f91237a = handlerThread;
        this.f91238b = rc0Var;
        this.f91239c = sc0Var;
        this.f91240d = handler;
        this.f91245i = 3;
        this.f91246j = 5;
        this.f91244h = z10;
        this.f91241e = new ArrayList();
        this.f91242f = new HashMap();
    }

    public static int a(gj0 gj0Var, gj0 gj0Var2) {
        long j10 = gj0Var.f89999c;
        long j11 = gj0Var2.f89999c;
        int i10 = ib3.f90737a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final int a(String str) {
        for (int i10 = 0; i10 < this.f91241e.size(); i10++) {
            if (((gj0) this.f91241e.get(i10)).f89997a.f93603b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final gj0 a(String str, boolean z10) {
        int iA = a(str);
        if (iA != -1) {
            return (gj0) this.f91241e.get(iA);
        }
        if (!z10) {
            return null;
        }
        try {
            return ((rc0) this.f91238b).b(str);
        } catch (IOException e10) {
            ih1.b("DownloadManager", ih1.a("Failed to load download: " + str, e10));
            return null;
        }
    }

    public final gj0 a(gj0 gj0Var) {
        int i10 = gj0Var.f89998b;
        if (i10 == 3 || i10 == 4) {
            throw new IllegalStateException();
        }
        int iA = a(gj0Var.f89997a.f93603b);
        if (iA == -1) {
            this.f91241e.add(gj0Var);
            Collections.sort(this.f91241e, new k3());
        } else {
            boolean z10 = gj0Var.f89999c != ((gj0) this.f91241e.get(iA)).f89999c;
            this.f91241e.set(iA, gj0Var);
            if (z10) {
                Collections.sort(this.f91241e, new k3());
            }
        }
        try {
            ((rc0) this.f91238b).a(gj0Var);
        } catch (IOException e10) {
            ih1.b("DownloadManager", ih1.a("Failed to update index.", e10));
        }
        this.f91240d.obtainMessage(2, new ij0(gj0Var, false, new ArrayList(this.f91241e), null)).sendToTarget();
        return gj0Var;
    }

    public final gj0 a(gj0 gj0Var, int i10, int i11) {
        if (i10 == 3 || i10 == 4) {
            throw new IllegalStateException();
        }
        return a(new gj0(gj0Var.f89997a, i10, gj0Var.f89999c, System.currentTimeMillis(), gj0Var.f90001e, i11, 0, gj0Var.f90004h));
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            int[] iArr = {3, 4};
            rc0 rc0Var = (rc0) this.f91238b;
            rc0Var.a();
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i10]);
            }
            sb2.append(')');
            Cursor cursorA = rc0Var.a(sb2.toString(), (String[]) null);
            while (cursorA.moveToPosition(cursorA.getPosition() + 1)) {
                try {
                    arrayList.add(rc0.a(cursorA));
                } finally {
                }
            }
            cursorA.close();
        } catch (IOException unused) {
            ih1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i11 = 0; i11 < this.f91241e.size(); i11++) {
            ArrayList arrayList2 = this.f91241e;
            gj0 gj0Var = (gj0) arrayList2.get(i11);
            arrayList2.set(i11, new gj0(gj0Var.f89997a, 5, gj0Var.f89999c, System.currentTimeMillis(), gj0Var.f90001e, 0, 0, gj0Var.f90004h));
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ArrayList arrayList3 = this.f91241e;
            gj0 gj0Var2 = (gj0) arrayList.get(i12);
            arrayList3.add(new gj0(gj0Var2.f89997a, 5, gj0Var2.f89999c, System.currentTimeMillis(), gj0Var2.f90001e, 0, 0, gj0Var2.f90004h));
        }
        Collections.sort(this.f91241e, new k3());
        try {
            ((rc0) this.f91238b).c();
        } catch (IOException e10) {
            ih1.b("DownloadManager", ih1.a("Failed to update index.", e10));
        }
        ArrayList arrayList4 = new ArrayList(this.f91241e);
        for (int i13 = 0; i13 < this.f91241e.size(); i13++) {
            this.f91240d.obtainMessage(2, new ij0((gj0) this.f91241e.get(i13), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final void a(gj0 gj0Var, int i10) {
        if (i10 == 0) {
            if (gj0Var.f89998b == 1) {
                a(gj0Var, 0, 0);
            }
        } else if (i10 != gj0Var.f90002f) {
            int i11 = gj0Var.f89998b;
            if (i11 == 0 || i11 == 2) {
                i11 = 1;
            }
            a(new gj0(gj0Var.f89997a, i11, gj0Var.f89999c, System.currentTimeMillis(), gj0Var.f90001e, i10, 0, gj0Var.f90004h));
        }
    }

    public final void b() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f91241e.size(); i11++) {
            gj0 gj0Var = (gj0) this.f91241e.get(i11);
            lj0 lj0Var = (lj0) this.f91242f.get(gj0Var.f89997a.f93603b);
            int i12 = gj0Var.f89998b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        lj0Var.getClass();
                        if (!(!lj0Var.f91989e)) {
                            throw new IllegalStateException();
                        }
                        if (this.f91244h || this.f91243g != 0 || i10 >= this.f91245i) {
                            a(gj0Var, 0, 0);
                            lj0Var.a(false);
                        }
                    } else {
                        if (i12 != 5 && i12 != 7) {
                            throw new IllegalStateException();
                        }
                        if (lj0Var == null) {
                            lj0 lj0Var2 = new lj0(gj0Var.f89997a, ((sc0) this.f91239c).a(gj0Var.f89997a), gj0Var.f90004h, true, this.f91246j, this);
                            this.f91242f.put(gj0Var.f89997a.f93603b, lj0Var2);
                            lj0Var2.start();
                        } else if (!lj0Var.f91989e) {
                            lj0Var.a(false);
                        }
                    }
                } else if (lj0Var != null) {
                    if (!(!lj0Var.f91989e)) {
                        throw new IllegalStateException();
                    }
                    lj0Var.a(false);
                }
            } else if (lj0Var != null) {
                if (!(!lj0Var.f91989e)) {
                    throw new IllegalStateException();
                }
                lj0Var.a(false);
            } else if (this.f91244h || this.f91243g != 0 || this.f91247k >= this.f91245i) {
                lj0Var = null;
            } else {
                gj0 gj0VarA = a(gj0Var, 2, 0);
                lj0Var = new lj0(gj0VarA.f89997a, ((sc0) this.f91239c).a(gj0VarA.f89997a), gj0VarA.f90004h, false, this.f91246j, this);
                this.f91242f.put(gj0VarA.f89997a.f93603b, lj0Var);
                int i13 = this.f91247k;
                this.f91247k = i13 + 1;
                if (i13 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                lj0Var.start();
            }
            if (lj0Var != null && !lj0Var.f91989e) {
                i10++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        ?? EmptyList;
        qc0 qc0Var = null;
        i = 0;
        int i10 = 0;
        switch (message.what) {
            case 0:
                this.f91243g = message.arg1;
                try {
                    try {
                        ((rc0) this.f91238b).b();
                        int[] iArr = {0, 1, 2, 5, 7};
                        rc0 rc0Var = (rc0) this.f91238b;
                        rc0Var.a();
                        StringBuilder sb2 = new StringBuilder("state IN (");
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (i11 > 0) {
                                sb2.append(',');
                            }
                            sb2.append(iArr[i11]);
                        }
                        sb2.append(')');
                        qc0 qc0Var2 = new qc0(rc0Var.a(sb2.toString(), (String[]) null));
                        while (qc0Var2.f94004a.moveToPosition(qc0Var2.f94004a.getPosition() + 1)) {
                            try {
                                this.f91241e.add(rc0.a(qc0Var2.f94004a));
                            } catch (IOException e10) {
                                e = e10;
                                qc0Var = qc0Var2;
                                ih1.b("DownloadManager", ih1.a("Failed to load index.", e));
                                this.f91241e.clear();
                                ib3.a((Closeable) qc0Var);
                            } catch (Throwable th2) {
                                th = th2;
                                qc0Var = qc0Var2;
                                ib3.a((Closeable) qc0Var);
                                throw th;
                            }
                            break;
                        }
                        ib3.a((Closeable) qc0Var2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
                this.f91240d.obtainMessage(0, new ArrayList(this.f91241e)).sendToTarget();
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 1:
                this.f91244h = message.arg1 != 0;
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 2:
                this.f91243g = message.arg1;
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 3:
                String str = (String) message.obj;
                int i12 = message.arg1;
                if (str != null) {
                    gj0 gj0VarA = a(str, false);
                    if (gj0VarA != null) {
                        a(gj0VarA, i12);
                    } else {
                        try {
                            ((rc0) this.f91238b).a(i12, str);
                        } catch (IOException e12) {
                            ih1.b("DownloadManager", ih1.a("Failed to set manual stop reason: ".concat(str), e12));
                        }
                    }
                    break;
                } else {
                    for (int i13 = 0; i13 < this.f91241e.size(); i13++) {
                        a((gj0) this.f91241e.get(i13), i12);
                    }
                    try {
                        rc0 rc0Var2 = (rc0) this.f91238b;
                        rc0Var2.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i12));
                            rc0Var2.f94365b.getWritableDatabase().update(rc0Var2.f94364a, contentValues, rc0.f94362e, null);
                        } catch (Throwable th4) {
                            throw new v30(th4);
                        }
                    } catch (IOException e13) {
                        ih1.b("DownloadManager", ih1.a("Failed to set manual stop reason", e13));
                    }
                    break;
                }
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 4:
                this.f91245i = message.arg1;
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 5:
                this.f91246j = message.arg1;
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 6:
                pj0 pj0Var = (pj0) message.obj;
                int i14 = message.arg1;
                gj0 gj0VarA2 = a(pj0Var.f93603b, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gj0VarA2 != null) {
                    int i15 = gj0VarA2.f89998b;
                    long j10 = (i15 == 5 || i15 == 3 || i15 == 4) ? jCurrentTimeMillis : gj0VarA2.f89999c;
                    int i16 = (i15 == 5 || i15 == 7) ? 7 : i14 != 0 ? 1 : 0;
                    pj0 pj0Var2 = gj0VarA2.f89997a;
                    if (!pj0Var2.f93603b.equals(pj0Var.f93603b)) {
                        throw new IllegalArgumentException();
                    }
                    if (pj0Var2.f93606e.isEmpty() || pj0Var.f93606e.isEmpty()) {
                        EmptyList = Collections.emptyList();
                    } else {
                        EmptyList = new ArrayList(pj0Var2.f93606e);
                        for (int i17 = 0; i17 < pj0Var.f93606e.size(); i17++) {
                            v33 v33Var = (v33) pj0Var.f93606e.get(i17);
                            if (!EmptyList.contains(v33Var)) {
                                EmptyList.add(v33Var);
                            }
                        }
                    }
                    a(new gj0(new pj0(pj0Var2.f93603b, pj0Var.f93604c, pj0Var.f93605d, EmptyList, pj0Var.f93607f, pj0Var.f93608g, pj0Var.f93609h), i16, j10, jCurrentTimeMillis, -1L, i14, 0, new nj0()));
                } else {
                    a(new gj0(pj0Var, i14 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i14, 0, new nj0()));
                }
                b();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 7:
                String str2 = (String) message.obj;
                gj0 gj0VarA3 = a(str2, true);
                if (gj0VarA3 == null) {
                    ih1.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    a(gj0VarA3, 5, 0);
                    b();
                }
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 8:
                a();
                i10 = 1;
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 9:
                lj0 lj0Var = (lj0) message.obj;
                String str3 = lj0Var.f91986b.f93603b;
                this.f91242f.remove(str3);
                boolean z10 = lj0Var.f91989e;
                if (!z10) {
                    int i18 = this.f91247k - 1;
                    this.f91247k = i18;
                    if (i18 == 0) {
                        removeMessages(11);
                    }
                }
                if (!lj0Var.f91992h) {
                    Exception exc = lj0Var.f91993i;
                    if (exc != null) {
                        ih1.b("DownloadManager", ih1.a("Task failed: " + lj0Var.f91986b + ", " + z10, exc));
                    }
                    gj0 gj0VarA4 = a(str3, false);
                    gj0VarA4.getClass();
                    int i19 = gj0VarA4.f89998b;
                    if (i19 != 2) {
                        if (i19 != 5 && i19 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z10) {
                            throw new IllegalStateException();
                        }
                        if (i19 == 7) {
                            int i20 = gj0VarA4.f90002f;
                            a(gj0VarA4, i20 == 0 ? 0 : 1, i20);
                            b();
                        } else {
                            this.f91241e.remove(a(gj0VarA4.f89997a.f93603b));
                            try {
                                np3 np3Var = this.f91238b;
                                String str4 = gj0VarA4.f89997a.f93603b;
                                rc0 rc0Var3 = (rc0) np3Var;
                                rc0Var3.a();
                                try {
                                    rc0Var3.f94365b.getWritableDatabase().delete(rc0Var3.f94364a, "id = ?", new String[]{str4});
                                } catch (Throwable th5) {
                                    throw new v30(th5);
                                }
                            } catch (IOException unused) {
                                ih1.b("DownloadManager", "Failed to remove from database");
                            }
                            this.f91240d.obtainMessage(2, new ij0(gj0VarA4, true, new ArrayList(this.f91241e), null)).sendToTarget();
                        }
                    } else {
                        if (!(!z10)) {
                            throw new IllegalStateException();
                        }
                        gj0 gj0Var = new gj0(gj0VarA4.f89997a, exc == null ? 3 : 4, gj0VarA4.f89999c, System.currentTimeMillis(), gj0VarA4.f90001e, gj0VarA4.f90002f, exc == null ? 0 : 1, gj0VarA4.f90004h);
                        this.f91241e.remove(a(gj0Var.f89997a.f93603b));
                        try {
                            ((rc0) this.f91238b).a(gj0Var);
                        } catch (IOException e14) {
                            ih1.b("DownloadManager", ih1.a("Failed to update index.", e14));
                        }
                        this.f91240d.obtainMessage(2, new ij0(gj0Var, false, new ArrayList(this.f91241e), exc)).sendToTarget();
                    }
                    b();
                    break;
                } else {
                    b();
                }
                this.f91240d.obtainMessage(1, i10, this.f91242f.size()).sendToTarget();
                return;
            case 10:
                lj0 lj0Var2 = (lj0) message.obj;
                int i21 = message.arg1;
                int i22 = message.arg2;
                int i23 = ib3.f90737a;
                long j11 = ((((long) i21) & 4294967295L) << 32) | (4294967295L & ((long) i22));
                gj0 gj0VarA5 = a(lj0Var2.f91986b.f93603b, false);
                gj0VarA5.getClass();
                if (j11 == gj0VarA5.f90001e || j11 == -1) {
                    return;
                }
                a(new gj0(gj0VarA5.f89997a, gj0VarA5.f89998b, gj0VarA5.f89999c, System.currentTimeMillis(), j11, gj0VarA5.f90002f, gj0VarA5.f90003g, gj0VarA5.f90004h));
                return;
            case 11:
                for (int i24 = 0; i24 < this.f91241e.size(); i24++) {
                    gj0 gj0Var2 = (gj0) this.f91241e.get(i24);
                    if (gj0Var2.f89998b == 2) {
                        try {
                            ((rc0) this.f91238b).a(gj0Var2);
                        } catch (IOException e15) {
                            ih1.b("DownloadManager", ih1.a("Failed to update index.", e15));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f91242f.values().iterator();
                while (it.hasNext()) {
                    ((lj0) it.next()).a(true);
                }
                try {
                    ((rc0) this.f91238b).b();
                    break;
                } catch (IOException e16) {
                    ih1.b("DownloadManager", ih1.a("Failed to update index.", e16));
                }
                this.f91241e.clear();
                this.f91237a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
