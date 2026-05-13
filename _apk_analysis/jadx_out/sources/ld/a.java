package ld;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f73779p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final OutputStream f73780q = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f73781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f73782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f73783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f73784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f73786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f73787h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Writer f73789j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f73791l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f73788i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f73790k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f73792m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f73793n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable<Void> f73794o = new CallableC0872a();

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public class CallableC0872a implements Callable<Void> {
        public CallableC0872a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.f73789j == null) {
                    return null;
                }
                a.this.L();
                if (a.this.B()) {
                    a.this.I();
                    a.this.f73791l = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f73797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f73799d;

        /* JADX INFO: renamed from: ld.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DiskLruCache.java */
        public class C0873a extends FilterOutputStream {
            public C0873a(OutputStream outputStream) {
                super(outputStream);
            }

            public /* synthetic */ C0873a(c cVar, OutputStream outputStream, CallableC0872a callableC0872a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f73798c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f73798c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    c.this.f73798c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    c.this.f73798c = true;
                }
            }
        }

        public c(d dVar) {
            this.f73796a = dVar;
            this.f73797b = dVar.f73804c ? null : new boolean[a.this.f73787h];
        }

        public /* synthetic */ c(a aVar, d dVar, CallableC0872a callableC0872a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.o(this, false);
        }

        public void e() throws IOException {
            if (this.f73798c) {
                a.this.o(this, false);
                a.this.J(this.f73796a.f73802a);
            } else {
                a.this.o(this, true);
            }
            this.f73799d = true;
        }

        public OutputStream f(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0873a c0873a;
            if (i10 < 0 || i10 >= a.this.f73787h) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + a.this.f73787h);
            }
            synchronized (a.this) {
                if (this.f73796a.f73805d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f73796a.f73804c) {
                    this.f73797b[i10] = true;
                }
                File fileK = this.f73796a.k(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileK);
                } catch (FileNotFoundException unused) {
                    a.this.f73781b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileK);
                    } catch (FileNotFoundException unused2) {
                        return a.f73780q;
                    }
                }
                c0873a = new C0873a(this, fileOutputStream, null);
            }
            return c0873a;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f73803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f73805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f73806e;

        public d(String str) {
            this.f73802a = str;
            this.f73803b = new long[a.this.f73787h];
        }

        public /* synthetic */ d(a aVar, String str, CallableC0872a callableC0872a) {
            this(str);
        }

        public File j(int i10) {
            return new File(a.this.f73781b, this.f73802a + "." + i10);
        }

        public File k(int i10) {
            return new File(a.this.f73781b, this.f73802a + "." + i10 + ".tmp");
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f73803b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f73787h) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f73803b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f73809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InputStream[] f73810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f73811e;

        public e(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f73808b = str;
            this.f73809c = j10;
            this.f73810d = inputStreamArr;
            this.f73811e = jArr;
        }

        public /* synthetic */ e(a aVar, String str, long j10, InputStream[] inputStreamArr, long[] jArr, CallableC0872a callableC0872a) {
            this(str, j10, inputStreamArr, jArr);
        }

        public InputStream a(int i10) {
            return this.f73810d[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f73810d) {
                ld.d.a(inputStream);
            }
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f73781b = file;
        this.f73785f = i10;
        this.f73782c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f73783d = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f73784e = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f73787h = i11;
        this.f73786g = j10;
    }

    public static a C(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        System.out.println("......appVersion: " + i10 + "......");
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                K(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f73782c.exists()) {
            try {
                aVar.G();
                aVar.F();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.delete();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.I();
        return aVar2;
    }

    public static void K(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void t(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e A(String str) throws IOException {
        InputStream inputStream;
        ld.d.e(str, "key can't be null");
        n();
        M(str);
        d dVar = this.f73790k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f73804c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f73787h];
        for (int i10 = 0; i10 < this.f73787h; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(dVar.j(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.f73787h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    ld.d.a(inputStream);
                }
                return null;
            }
        }
        this.f73791l++;
        this.f73789j.append((CharSequence) ("READ " + str + '\n'));
        if (B()) {
            this.f73793n.submit(this.f73794o);
        }
        return new e(this, str, dVar.f73806e, inputStreamArr, dVar.f73803b, null);
    }

    public final boolean B() {
        int i10 = this.f73791l;
        return i10 >= 2000 && i10 >= this.f73790k.size();
    }

    public final void F() throws IOException {
        t(this.f73783d);
        Iterator<d> it = this.f73790k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f73805d == null) {
                while (i10 < this.f73787h) {
                    this.f73788i += next.f73803b[i10];
                    i10++;
                }
            } else {
                next.f73805d = null;
                while (i10 < this.f73787h) {
                    t(next.j(i10));
                    t(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void G() throws IOException {
        ld.c cVar = new ld.c(new FileInputStream(this.f73782c), ld.d.f73819a);
        try {
            String strK = cVar.k();
            String strK2 = cVar.k();
            String strK3 = cVar.k();
            String strK4 = cVar.k();
            String strK5 = cVar.k();
            if (!DiskLruCache.MAGIC.equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f73785f).equals(strK3) || !Integer.toString(this.f73787h).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + C3978d4.j.f31385e);
            }
            int i10 = 0;
            while (true) {
                try {
                    H(cVar.k());
                    i10++;
                } catch (EOFException unused) {
                    this.f73791l = i10 - this.f73790k.size();
                    if (cVar.h()) {
                        I();
                    } else {
                        this.f73789j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f73782c, true), ld.d.f73819a));
                    }
                    ld.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            ld.d.a(cVar);
            throw th2;
        }
    }

    public final void H(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f73790k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f73790k.get(strSubstring);
        CallableC0872a callableC0872a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0872a);
            this.f73790k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(Z7.f30794r);
            dVar.f73804c = true;
            dVar.f73805d = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f73805d = new c(this, dVar, callableC0872a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void I() throws IOException {
        Writer writer = this.f73789j;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f73783d), ld.d.f73819a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f73785f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f73787h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f73790k.values()) {
                if (dVar.f73805d != null) {
                    bufferedWriter.write("DIRTY " + dVar.f73802a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f73802a + dVar.l() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f73782c.exists()) {
                K(this.f73782c, this.f73784e, true);
            }
            K(this.f73783d, this.f73782c, false);
            this.f73784e.delete();
            this.f73789j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f73782c, true), ld.d.f73819a));
        } catch (Throwable th2) {
            bufferedWriter.close();
            throw th2;
        }
    }

    public synchronized boolean J(String str) throws IOException {
        ld.d.e(str, "key can't be null");
        n();
        M(str);
        d dVar = this.f73790k.get(str);
        if (dVar != null && dVar.f73805d == null) {
            for (int i10 = 0; i10 < this.f73787h; i10++) {
                File fileJ = dVar.j(i10);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f73788i -= dVar.f73803b[i10];
                dVar.f73803b[i10] = 0;
            }
            this.f73791l++;
            this.f73789j.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f73790k.remove(str);
            if (B()) {
                this.f73793n.submit(this.f73794o);
            }
            return true;
        }
        return false;
    }

    public final void L() throws IOException {
        while (this.f73788i > this.f73786g) {
            J(this.f73790k.entrySet().iterator().next().getKey());
        }
    }

    public final void M(String str) {
        if (f73779p.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f73789j == null) {
            return;
        }
        for (d dVar : new ArrayList(this.f73790k.values())) {
            if (dVar.f73805d != null) {
                dVar.f73805d.a();
            }
        }
        L();
        this.f73789j.close();
        this.f73789j = null;
    }

    public void delete() throws IOException {
        close();
        ld.d.b(this.f73781b);
    }

    public synchronized void flush() throws IOException {
        n();
        L();
        this.f73789j.flush();
    }

    public final void n() {
        if (this.f73789j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void o(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f73796a;
        if (dVar.f73805d != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f73804c) {
            for (int i10 = 0; i10 < this.f73787h; i10++) {
                if (!cVar.f73797b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f73787h; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                t(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f73803b[i11];
                long length = fileJ.length();
                dVar.f73803b[i11] = length;
                this.f73788i = (this.f73788i - j10) + length;
            }
        }
        this.f73791l++;
        dVar.f73805d = null;
        if (dVar.f73804c || z10) {
            dVar.f73804c = true;
            this.f73789j.write("CLEAN " + dVar.f73802a + dVar.l() + '\n');
            if (z10) {
                long j11 = this.f73792m;
                this.f73792m = 1 + j11;
                dVar.f73806e = j11;
            }
        } else {
            this.f73790k.remove(dVar.f73802a);
            this.f73789j.write("REMOVE " + dVar.f73802a + '\n');
        }
        this.f73789j.flush();
        if (this.f73788i > this.f73786g || B()) {
            this.f73793n.submit(this.f73794o);
        }
    }

    public c w(String str) throws IOException {
        return x(str, -1L);
    }

    public final synchronized c x(String str, long j10) throws IOException {
        ld.d.e(str, "key can't be null");
        n();
        M(str);
        d dVar = this.f73790k.get(str);
        CallableC0872a callableC0872a = null;
        if (j10 != -1 && (dVar == null || dVar.f73806e != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0872a);
            this.f73790k.put(str, dVar);
        } else if (dVar.f73805d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0872a);
        dVar.f73805d = cVar;
        this.f73789j.write("DIRTY " + str + '\n');
        this.f73789j.flush();
        return cVar;
    }
}
