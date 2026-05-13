package mq;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: compiled from: HttpWriter.java */
/* JADX INFO: loaded from: classes12.dex */
public class m extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f74936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gq.a f74937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74939e = 0;

    public m(l lVar) {
        this.f74936b = lVar;
        this.f74937c = lVar.f74929d;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74936b.close();
    }

    public final Writer d() throws IOException {
        l lVar = this.f74936b;
        if (lVar.f74933h == null) {
            l lVar2 = this.f74936b;
            lVar.f74933h = new OutputStreamWriter(lVar2.f74935j, lVar2.f74932g);
        }
        return this.f74936b.f74933h;
    }

    public void e(String str) {
        if (str == null || "ISO-8859-1".equalsIgnoreCase(str)) {
            this.f74938d = 1;
        } else if ("UTF-8".equalsIgnoreCase(str)) {
            this.f74938d = 2;
        } else {
            this.f74938d = 0;
            String str2 = this.f74936b.f74932g;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f74936b.f74933h = null;
            }
        }
        l lVar = this.f74936b;
        lVar.f74932g = str;
        if (lVar.f74935j == null) {
            lVar.f74935j = new sq.g(512);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f74936b.flush();
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        while (i11 > 512) {
            write(str, i10, 512);
            i10 += 512;
            i11 -= 512;
        }
        l lVar = this.f74936b;
        if (lVar.f74934i == null) {
            lVar.f74934i = new char[512];
        }
        char[] cArr = lVar.f74934i;
        str.getChars(i10, i10 + i11, cArr, 0);
        write(cArr, 0, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0175 A[SYNTHETIC] */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(char[] r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.m.write(char[], int, int):void");
    }
}
