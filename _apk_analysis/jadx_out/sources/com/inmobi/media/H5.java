package com.inmobi.media;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class H5 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f25566p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A5 f25567q = new A5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f25569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f25570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f25571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f25572e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f25574g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f25577j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BufferedWriter f25579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25580m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f25568a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f25576i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25578k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25581n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B5 f25582o = new B5(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25573f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25575h = 2;

    public H5(File file, long j10, F5 f52) {
        this.f25569b = file;
        this.f25570c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f25571d = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f25572e = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f25577j = j10;
        this.f25574g = f52;
    }

    public final D5 a(String str) {
        synchronized (this) {
            if (this.f25579l == null) {
                throw new IllegalStateException("cache is closed");
            }
            if (!f25566p.matcher(str).matches()) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            E5 e52 = (E5) this.f25576i.get(str);
            if (e52 == null) {
                e52 = new E5(this, str);
                this.f25576i.put(str, e52);
            } else if (e52.f25364d != null) {
                return null;
            }
            D5 d52 = new D5(this, e52);
            e52.f25364d = d52;
            this.f25579l.write("DIRTY " + str + '\n');
            this.f25579l.flush();
            return d52;
        }
    }

    public final void a() throws IOException {
        File file = this.f25571d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f25576i.values().iterator();
        while (it.hasNext()) {
            E5 e52 = (E5) it.next();
            int i10 = 0;
            if (e52.f25364d == null) {
                while (i10 < this.f25575h) {
                    this.f25578k += e52.f25362b[i10];
                    i10++;
                }
            } else {
                e52.f25364d = null;
                while (i10 < this.f25575h) {
                    File fileA = e52.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = e52.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void a(D5 d52, boolean z10) {
        int i10;
        E5 e52 = d52.f25298a;
        if (e52.f25364d != d52) {
            throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
        }
        if (z10 && !e52.f25363c) {
            for (int i11 = 0; i11 < this.f25575h; i11++) {
                if (!d52.f25299b[i11]) {
                    d52.f25301d.a(d52, false);
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!e52.b(i11).exists()) {
                    d52.f25301d.a(d52, false);
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f25575h; i12++) {
            File fileB = e52.b(i12);
            if (z10) {
                if (fileB.exists()) {
                    File fileA = e52.a(i12);
                    fileB.renameTo(fileA);
                    long j10 = e52.f25362b[i12];
                    long length = fileA.length();
                    e52.f25362b[i12] = length;
                    this.f25578k = (this.f25578k - j10) + length;
                }
            } else if (fileB.exists() && !fileB.delete()) {
                throw new IOException();
            }
        }
        this.f25580m++;
        e52.f25364d = null;
        if (e52.f25363c || z10) {
            e52.f25363c = true;
            BufferedWriter bufferedWriter = this.f25579l;
            StringBuilder sb2 = new StringBuilder("CLEAN ");
            sb2.append(e52.f25361a);
            StringBuilder sb3 = new StringBuilder();
            for (long j11 : e52.f25362b) {
                sb3.append(' ');
                sb3.append(j11);
            }
            sb2.append(sb3.toString());
            sb2.append('\n');
            bufferedWriter.write(sb2.toString());
            if (z10) {
                this.f25581n++;
            }
        } else {
            this.f25576i.remove(e52.f25361a);
            this.f25579l.write("REMOVE " + e52.f25361a + '\n');
        }
        this.f25579l.flush();
        if (this.f25578k > this.f25577j || ((i10 = this.f25580m) >= 2000 && i10 >= this.f25576i.size())) {
            this.f25568a.submit(this.f25582o);
        }
    }

    public final synchronized G5 b(String str) {
        InputStream inputStream;
        if (this.f25579l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f25566p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        E5 e52 = (E5) this.f25576i.get(str);
        if (e52 == null) {
            return null;
        }
        if (!e52.f25363c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f25575h];
        for (int i10 = 0; i10 < this.f25575h; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(e52.a(i10));
            } catch (FileNotFoundException unused) {
                if (this.f25574g != null) {
                    tn.p.k(str, "key");
                    Map mapO = kotlin.collections.a.o(bn.h.a("urlKey", str));
                    Wj wj2 = Wj.f26549a;
                    Wj.b("ResourceDiskCacheFileMissing", mapO, EnumC3287ak.f26805a);
                }
                for (int i11 = 0; i11 < this.f25575h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    AbstractC3314bl.a(inputStream);
                }
                return null;
            }
        }
        this.f25580m++;
        this.f25579l.append((CharSequence) ("READ " + str + '\n'));
        int i12 = this.f25580m;
        if (i12 >= 2000 && i12 >= this.f25576i.size()) {
            this.f25568a.submit(this.f25582o);
        }
        return new G5(inputStreamArr);
    }

    public final void b() {
        Gj gj2 = new Gj(new FileInputStream(this.f25570c), AbstractC3314bl.f26878a);
        try {
            String strA = gj2.a();
            String strA2 = gj2.a();
            String strA3 = gj2.a();
            String strA4 = gj2.a();
            String strA5 = gj2.a();
            if (!DiskLruCache.MAGIC.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f25573f).equals(strA3) || !Integer.toString(this.f25575h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3978d4.j.f31385e);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(gj2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f25580m = i10 - this.f25576i.size();
                    AbstractC3314bl.a(gj2);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC3314bl.a(gj2);
            throw th2;
        }
    }

    public final synchronized void c() {
        BufferedWriter bufferedWriter = this.f25579l;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(InMobiFilesBridge.fileOutputStreamCtor(this.f25571d), AbstractC3314bl.f26878a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f25573f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f25575h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (E5 e52 : this.f25576i.values()) {
                if (e52.f25364d != null) {
                    bufferedWriter2.write("DIRTY " + e52.f25361a + '\n');
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(e52.f25361a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j10 : e52.f25362b) {
                        sb3.append(' ');
                        sb3.append(j10);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter2.write(sb2.toString());
                }
            }
            bufferedWriter2.close();
            if (this.f25570c.exists()) {
                File file = this.f25570c;
                File file2 = this.f25572e;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.f25571d.renameTo(this.f25570c)) {
                throw new IOException();
            }
            this.f25572e.delete();
            this.f25579l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25570c, true), AbstractC3314bl.f26878a));
        } catch (Throwable th2) {
            bufferedWriter2.close();
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
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
                this.f25576i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        E5 e52 = (E5) this.f25576i.get(strSubstring);
        if (e52 == null) {
            e52 = new E5(this, strSubstring);
            this.f25576i.put(strSubstring, e52);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                e52.f25364d = new D5(this, e52);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(com.ironsource.Z7.f30794r);
        e52.f25363c = true;
        e52.f25364d = null;
        if (strArrSplit.length != e52.f25365e.f25575h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                e52.f25362b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f25579l == null) {
            return;
        }
        Iterator it = new ArrayList(this.f25576i.values()).iterator();
        while (it.hasNext()) {
            D5 d52 = ((E5) it.next()).f25364d;
            if (d52 != null) {
                d52.f25301d.a(d52, false);
            }
        }
        while (this.f25578k > this.f25577j) {
            d((String) ((Map.Entry) this.f25576i.entrySet().iterator().next()).getKey());
        }
        this.f25579l.close();
        this.f25579l = null;
    }

    public final synchronized void d(String str) {
        if (this.f25579l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f25566p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        E5 e52 = (E5) this.f25576i.get(str);
        if (e52 != null && e52.f25364d == null) {
            for (int i10 = 0; i10 < this.f25575h; i10++) {
                File fileA = e52.a(i10);
                if (this.f25574g != null) {
                    tn.p.k(fileA, C3978d4.i.f31327b);
                    if (str != null && i10 == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC3314bl.a(new InputStreamReader(new FileInputStream(fileA), AbstractC3314bl.f26879b));
                            tn.p.j(strA, "readFully(...)");
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        Map mapO = kotlin.collections.a.o(bn.h.a("urlKey", str), bn.h.a("url", str2));
                        Wj wj2 = Wj.f26549a;
                        Wj.b("ResourceDiskCacheFileEvicted", mapO, EnumC3287ak.f26805a);
                    }
                }
                if (fileA.exists() && !fileA.delete()) {
                    throw new IOException("failed to delete " + fileA);
                }
                long j10 = this.f25578k;
                long[] jArr = e52.f25362b;
                this.f25578k = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f25580m++;
            this.f25579l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f25576i.remove(str);
            int i11 = this.f25580m;
            if (i11 >= 2000 && i11 >= this.f25576i.size()) {
                this.f25568a.submit(this.f25582o);
            }
        }
    }
}
