package g2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FilePrinter.java */
/* JADX INFO: loaded from: classes.dex */
public class a implements f2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.b f61885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2.a f61886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.a f61887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1.b f61888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f61889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile d f61890g;

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f61891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j2.b f61892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h2.a f61893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i2.a f61894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t1.b f61895e;

        public b(String str) {
            this.f61891a = str;
        }

        public a a() {
            c();
            return new a(this);
        }

        public b b(j2.b bVar) {
            this.f61892b = bVar;
            return this;
        }

        public final void c() {
            if (this.f61892b == null) {
                this.f61892b = d2.a.e();
            }
            if (this.f61893c == null) {
                this.f61893c = d2.a.b();
            }
            if (this.f61894d == null) {
                this.f61894d = d2.a.d();
            }
            if (this.f61895e == null) {
                this.f61895e = d2.a.f();
            }
        }

        public b d(t1.b bVar) {
            this.f61895e = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f61896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f61897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f61898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f61899d;

        public c(long j10, int i10, String str, String str2) {
            this.f61896a = j10;
            this.f61897b = i10;
            this.f61898c = str;
            this.f61899d = str2;
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BlockingQueue<c> f61900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f61901c;

        public d() {
            this.f61900b = new LinkedBlockingQueue();
        }

        public void a(c cVar) {
            try {
                this.f61900b.put(cVar);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }

        public boolean b() {
            boolean z10;
            synchronized (this) {
                z10 = this.f61901c;
            }
            return z10;
        }

        public void c() {
            synchronized (this) {
                new Thread(this).start();
                this.f61901c = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    c cVarTake = this.f61900b.take();
                    if (cVarTake == null) {
                        return;
                    } else {
                        a.this.f(cVarTake.f61896a, cVarTake.f61897b, cVarTake.f61898c, cVarTake.f61899d);
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    synchronized (this) {
                        this.f61901c = false;
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f61903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f61904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BufferedWriter f61905c;

        public e() {
        }

        public void a(String str) {
            try {
                this.f61905c.write(str);
                this.f61905c.newLine();
                this.f61905c.flush();
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean b() {
            BufferedWriter bufferedWriter = this.f61905c;
            if (bufferedWriter == null) {
                return true;
            }
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                Object[] objArr = objArr == true ? 1 : 0;
                Object[] objArr2 = objArr == true ? 1 : 0;
                return false;
            } finally {
                this.f61905c = null;
                this.f61903a = null;
                this.f61904b = null;
            }
        }

        public File c() {
            return this.f61904b;
        }

        public String d() {
            return this.f61903a;
        }

        public boolean e() {
            return this.f61905c != null;
        }

        public boolean f(String str) {
            this.f61903a = str;
            File file = new File(a.this.f61884a, str);
            this.f61904b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f61904b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f61904b.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    this.f61903a = null;
                    this.f61904b = null;
                    return false;
                }
            }
            try {
                this.f61905c = new BufferedWriter(new FileWriter(this.f61904b, true));
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f61903a = null;
                this.f61904b = null;
                return false;
            }
        }
    }

    public a(b bVar) {
        this.f61884a = bVar.f61891a;
        this.f61885b = bVar.f61892b;
        this.f61886c = bVar.f61893c;
        this.f61887d = bVar.f61894d;
        this.f61888e = bVar.f61895e;
        this.f61889f = new e();
        this.f61890g = new d();
        d();
    }

    @Override // f2.b
    public void a(int i10, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f61890g.b()) {
            this.f61890g.c();
        }
        this.f61890g.a(new c(jCurrentTimeMillis, i10, str, str2));
    }

    public final void d() {
        File file = new File(this.f61884a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final void e() {
        File[] fileArrListFiles = new File(this.f61884a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f61887d.a(file)) {
                file.delete();
            }
        }
    }

    public final void f(long j10, int i10, String str, String str2) {
        String strD = this.f61889f.d();
        if (strD == null || this.f61885b.isFileNameChangeable()) {
            String strGenerateFileName = this.f61885b.generateFileName(i10, System.currentTimeMillis());
            if (strGenerateFileName == null || strGenerateFileName.trim().length() == 0) {
                throw new IllegalArgumentException("File name should not be empty.");
            }
            if (!strGenerateFileName.equals(strD)) {
                if (this.f61889f.e()) {
                    this.f61889f.b();
                }
                e();
                if (!this.f61889f.f(strGenerateFileName)) {
                    return;
                } else {
                    strD = strGenerateFileName;
                }
            }
        }
        File fileC = this.f61889f.c();
        if (this.f61886c.a(fileC)) {
            this.f61889f.b();
            File file = new File(this.f61884a, strD + ".bak");
            if (file.exists()) {
                file.delete();
            }
            fileC.renameTo(file);
            if (!this.f61889f.f(strD)) {
                return;
            }
        }
        this.f61889f.a(this.f61888e.flatten(j10, i10, str, str2).toString());
    }
}
