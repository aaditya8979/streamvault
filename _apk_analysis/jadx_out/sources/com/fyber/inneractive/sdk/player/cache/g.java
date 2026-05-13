package com.fyber.inneractive.sdk.player.cache;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f17108p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f17109q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f17111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f17112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f17113d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17115f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f17118i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f17121l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17117h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f17119j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17122m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f17123n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f17124o = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17114e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17116g = 1;

    public g(File file, long j10) {
        this.f17110a = file;
        this.f17111b = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f17112c = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f17113d = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f17115f = j10;
    }

    public static g a(File file, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        g gVar = new g(file, j10);
        if (gVar.f17111b.exists()) {
            try {
                gVar.b();
                gVar.a();
                return gVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                IAlog.e("DiskLruCache delete cache", new Object[0]);
                gVar.close();
                l.a(gVar.f17110a);
            }
        }
        file.mkdirs();
        g gVar2 = new g(file, j10);
        gVar2.c();
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:20:0x002e, B:21:0x0046, B:23:0x0048, B:25:0x004c, B:27:0x0052, B:29:0x0058, B:31:0x0075, B:30:0x0072, B:32:0x0078, B:34:0x0088, B:36:0x00a3, B:37:0x00b0, B:39:0x00c3, B:41:0x00ea, B:43:0x00f7, B:45:0x00fd, B:49:0x0108, B:40:0x00cb, B:52:0x0111, B:53:0x0116), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.fyber.inneractive.sdk.player.cache.g r11, com.fyber.inneractive.sdk.player.cache.d r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.g.a(com.fyber.inneractive.sdk.player.cache.g, com.fyber.inneractive.sdk.player.cache.d, boolean):void");
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            if (this.f17118i == null) {
                throw new IllegalStateException("cache is closed");
            }
            if (!f17108p.matcher(str).matches()) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            e eVar = (e) this.f17119j.get(str);
            if (eVar == null) {
                eVar = new e(this, str);
                this.f17119j.put(str, eVar);
            } else if (eVar.f17106d != null) {
                return null;
            }
            d dVar = new d(this, eVar);
            eVar.f17106d = dVar;
            this.f17118i.write("DIRTY " + str + '\n');
            this.f17118i.flush();
            return dVar;
        }
    }

    public final void a() throws IOException {
        a(this.f17112c);
        Iterator it = this.f17119j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = 0;
            if (eVar.f17106d == null) {
                while (i10 < this.f17116g) {
                    this.f17117h += eVar.f17104b[i10];
                    i10++;
                }
            } else {
                eVar.f17106d = null;
                while (i10 < this.f17116g) {
                    a(eVar.a(i10));
                    a(eVar.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f17111b);
        Charset charset = l.f17132a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!DiskLruCache.MAGIC.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f17114e).equals(strA3) || !Integer.toString(this.f17116g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3978d4.j.f31385e);
            }
            int i10 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f17120k = i10 - this.f17119j.size();
                    if (kVar.f17131e == -1) {
                        c();
                    } else {
                        this.f17118i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17111b, true), l.f17132a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                kVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f17119j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        e eVar = (e) this.f17119j.get(strSubstring);
        if (eVar == null) {
            eVar = new e(this, strSubstring);
            this.f17119j.put(strSubstring, eVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f17106d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(Z7.f30794r);
        eVar.f17105c = true;
        eVar.f17106d = null;
        if (strArrSplit.length != eVar.f17107e.f17116g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                eVar.f17104b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void c() {
        BufferedWriter bufferedWriter = this.f17118i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(DTExchangeFilesBridge.fileOutputStreamCtor(this.f17112c), l.f17132a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f17114e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f17116g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (e eVar : this.f17119j.values()) {
                if (eVar.f17106d != null) {
                    bufferedWriter2.write("DIRTY " + eVar.f17103a + '\n');
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(eVar.f17103a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j10 : eVar.f17104b) {
                        sb3.append(' ');
                        sb3.append(j10);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter2.write(sb2.toString());
                }
            }
            bufferedWriter2.close();
            if (this.f17111b.exists()) {
                File file = this.f17111b;
                File file2 = this.f17113d;
                a(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.f17112c.renameTo(this.f17111b)) {
                throw new IOException();
            }
            this.f17113d.delete();
            this.f17118i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17111b, true), l.f17132a));
        } catch (Throwable th2) {
            bufferedWriter2.close();
            throw th2;
        }
    }

    public final synchronized boolean c(String str) {
        IAlog.e("DiskLruCache remove %s", str);
        if (this.f17118i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f17108p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        e eVar = (e) this.f17119j.get(str);
        if (eVar != null && eVar.f17106d == null) {
            for (int i10 = 0; i10 < this.f17116g; i10++) {
                File fileA = eVar.a(i10);
                if (fileA.exists() && !fileA.delete()) {
                    throw new IOException("failed to delete " + fileA);
                }
                long j10 = this.f17117h;
                long[] jArr = eVar.f17104b;
                this.f17117h = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f17120k++;
            this.f17118i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f17119j.remove(str);
            int i11 = this.f17120k;
            if (i11 >= 2000 && i11 >= this.f17119j.size()) {
                this.f17123n.submit(this.f17124o);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f17118i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f17119j.values()).iterator();
        while (it.hasNext()) {
            d dVar = ((e) it.next()).f17106d;
            if (dVar != null) {
                a(dVar.f17102d, dVar, false);
            }
        }
        d();
        this.f17118i.close();
        this.f17118i = null;
    }

    public final void d() {
        while (this.f17117h > this.f17115f) {
            String str = (String) ((Map.Entry) this.f17119j.entrySet().iterator().next()).getKey();
            f fVar = this.f17121l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC = false;
                for (String str2 : this.f17119j.keySet()) {
                    if (this.f17121l.a(str2)) {
                        zC |= c(str2);
                    }
                }
                if (!zC) {
                    return;
                }
            }
        }
    }
}
