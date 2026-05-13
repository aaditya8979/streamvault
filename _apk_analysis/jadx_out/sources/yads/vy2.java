package yads;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class vy2 implements nr {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f96227j = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f96228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur f96229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls f96230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wr f96231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f96232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Random f96233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f96234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f96235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public kr f96236i;

    public vy2(File file, bf1 bf1Var, jn0 jn0Var) {
        this(file, bf1Var, new ls(jn0Var, file), new wr(jn0Var));
    }

    public vy2(File file, bf1 bf1Var, ls lsVar, wr wrVar) {
        if (!c(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f96228a = file;
        this.f96229b = bf1Var;
        this.f96230c = lsVar;
        this.f96231d = wrVar;
        this.f96232e = new HashMap();
        this.f96233f = new Random();
        this.f96234g = true;
        this.f96235h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new uy2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(File file) throws kr {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ih1.b("SimpleCache", str);
        throw new kr(str);
    }

    public static long b(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized boolean c(File file) {
        return f96227j.add(file.getAbsoluteFile());
    }

    public final synchronized long a(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jB = b(str, j15, j14 - j15);
            if (jB > 0) {
                j12 += jB;
            } else {
                jB = -jB;
            }
            j15 += jB;
        }
        return j12;
    }

    public final synchronized TreeSet a(String str) {
        hs hsVar;
        hsVar = (hs) this.f96230c.f92075a.get(str);
        return (hsVar == null || hsVar.f90522c.isEmpty()) ? new TreeSet() : new TreeSet((Collection) hsVar.f90522c);
    }

    public final synchronized void a() {
        kr krVar = this.f96236i;
        if (krVar != null) {
            throw krVar;
        }
    }

    public final void a(File file, boolean z10, File[] fileArr, HashMap map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                vr vrVar = map != null ? (vr) map.remove(name) : null;
                if (vrVar != null) {
                    j10 = vrVar.f96174a;
                    j11 = vrVar.f96175b;
                }
                yy2 yy2VarA = yy2.a(file2, j10, j11, this.f96230c);
                if (yy2VarA != null) {
                    a(yy2VarA);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void a(String str, rz rzVar) {
        kr krVar;
        a();
        ls lsVar = this.f96230c;
        hs hsVarA = lsVar.a(str);
        hsVarA.f90524e = hsVarA.f90524e.a(rzVar);
        if (!r4.equals(r1)) {
            lsVar.f92079e.a(hsVarA);
        }
        try {
            this.f96230c.a();
        } finally {
        }
    }

    public final void a(yy2 yy2Var) {
        this.f96230c.a(yy2Var.f97751b).f90522c.add(yy2Var);
        ArrayList arrayList = (ArrayList) this.f96232e.get(yy2Var.f97751b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f87981b.add(yy2Var);
                bf1Var.f87982c += yy2Var.f97753d;
                bf1Var.a(this, 0L);
            }
        }
        bf1 bf1Var2 = (bf1) this.f96229b;
        bf1Var2.f87981b.add(yy2Var);
        bf1Var2.f87982c += yy2Var.f97753d;
        bf1Var2.a(this, 0L);
    }

    public final synchronized void a(zr zrVar) {
        ls lsVar = this.f96230c;
        hs hsVar = (hs) lsVar.f92075a.get(zrVar.f97751b);
        hsVar.getClass();
        long j10 = zrVar.f97752c;
        for (int i10 = 0; i10 < hsVar.f90523d.size(); i10++) {
            if (((gs) hsVar.f90523d.get(i10)).f90095a == j10) {
                hsVar.f90523d.remove(i10);
                this.f96230c.b(hsVar.f90521b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final synchronized long b(String str, long j10, long j11) {
        hs hsVar;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        hsVar = (hs) this.f96230c.f92075a.get(str);
        return hsVar != null ? hsVar.a(j10, j11) : -j11;
    }

    public final synchronized jc0 b(String str) {
        hs hsVar;
        hsVar = (hs) this.f96230c.f92075a.get(str);
        return hsVar != null ? hsVar.f90524e : jc0.f91151c;
    }

    public final void b() {
        long j10;
        if (!this.f96228a.exists()) {
            try {
                a(this.f96228a);
            } catch (kr e10) {
                this.f96236i = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f96228a.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f96228a;
            ih1.b("SimpleCache", str);
            this.f96236i = new kr(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                j10 = -1;
                break;
            }
            File file = fileArrListFiles[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    ih1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i10++;
        }
        this.f96235h = j10;
        if (j10 == -1) {
            try {
                this.f96235h = b(this.f96228a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f96228a;
                ih1.b("SimpleCache", ih1.a(str2, e11));
                this.f96236i = new kr(str2, e11);
                return;
            }
        }
        try {
            this.f96230c.a(this.f96235h);
            wr wrVar = this.f96231d;
            if (wrVar != null) {
                wrVar.a(this.f96235h);
                HashMap mapA = this.f96231d.a();
                a(this.f96228a, true, fileArrListFiles, mapA);
                this.f96231d.a(mapA.keySet());
            } else {
                a(this.f96228a, true, fileArrListFiles, null);
            }
            ls lsVar = this.f96230c;
            ja3 it = u51.a(lsVar.f92075a.keySet()).iterator();
            while (it.hasNext()) {
                lsVar.b((String) it.next());
            }
            try {
                this.f96230c.a();
            } catch (Throwable th2) {
                ih1.b("SimpleCache", ih1.a("Storing index file failed", th2));
            }
        } catch (Throwable th3) {
            String str3 = "Failed to initialize cache indices: " + this.f96228a;
            ih1.b("SimpleCache", ih1.a(str3, th3));
            this.f96236i = new kr(str3, th3);
        }
    }

    public final void b(zr zrVar) {
        hs hsVar = (hs) this.f96230c.f92075a.get(zrVar.f97751b);
        if (hsVar == null || !hsVar.f90522c.remove(zrVar)) {
            return;
        }
        File file = zrVar.f97755f;
        if (file != null) {
            file.delete();
        }
        if (this.f96231d != null) {
            String name = zrVar.f97755f.getName();
            try {
                wr wrVar = this.f96231d;
                wrVar.f96483b.getClass();
                try {
                    wrVar.f96482a.getWritableDatabase().delete(wrVar.f96483b, "name = ?", new String[]{name});
                } catch (Throwable th2) {
                    throw new v30(th2);
                }
            } catch (IOException unused) {
                pk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f96230c.b(hsVar.f90521b);
        ArrayList arrayList = (ArrayList) this.f96232e.get(zrVar.f97751b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                bf1 bf1Var = (bf1) ((ur) arrayList.get(size));
                bf1Var.f87981b.remove(zrVar);
                bf1Var.f87982c -= zrVar.f97753d;
            }
        }
        bf1 bf1Var2 = (bf1) this.f96229b;
        bf1Var2.f87981b.remove(zrVar);
        bf1Var2.f87982c -= zrVar.f97753d;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[Catch: all -> 0x01af, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x0016, B:13:0x0043, B:15:0x0048, B:18:0x004e, B:22:0x0063, B:26:0x0070, B:28:0x0082, B:30:0x0089, B:35:0x00e2, B:37:0x00e6, B:39:0x010b, B:41:0x0112, B:42:0x0138, B:46:0x015a, B:47:0x015f, B:33:0x00c5, B:48:0x0160, B:49:0x0165, B:24:0x0067, B:50:0x0166, B:51:0x016e, B:53:0x0176, B:55:0x0186, B:70:0x01a3, B:8:0x002b, B:10:0x0033, B:12:0x003f), top: B:78:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x0016, B:13:0x0043, B:15:0x0048, B:18:0x004e, B:22:0x0063, B:26:0x0070, B:28:0x0082, B:30:0x0089, B:35:0x00e2, B:37:0x00e6, B:39:0x010b, B:41:0x0112, B:42:0x0138, B:46:0x015a, B:47:0x015f, B:33:0x00c5, B:48:0x0160, B:49:0x0165, B:24:0x0067, B:50:0x0166, B:51:0x016e, B:53:0x0176, B:55:0x0186, B:70:0x01a3, B:8:0x002b, B:10:0x0033, B:12:0x003f), top: B:78:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized yads.yy2 c(java.lang.String r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vy2.c(java.lang.String, long, long):yads.yy2");
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f96230c.f92075a.values()).iterator();
        while (it.hasNext()) {
            for (zr zrVar : ((hs) it.next()).f90522c) {
                if (zrVar.f97755f.length() != zrVar.f97753d) {
                    arrayList.add(zrVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            b((zr) arrayList.get(i10));
        }
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            b((zr) it.next());
        }
    }
}
