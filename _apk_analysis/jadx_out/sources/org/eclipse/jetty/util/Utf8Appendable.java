package org.eclipse.jetty.util;

import java.io.IOException;
import sq.p;
import vq.b;
import vq.c;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Utf8Appendable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f76814d = b.a(Utf8Appendable.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f76815e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f76816f = {0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f76817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f76818b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76819c;

    public static class NotUtf8Exception extends IllegalArgumentException {
        public NotUtf8Exception(String str) {
            super("Not valid UTF8! " + str);
        }
    }

    public Utf8Appendable(Appendable appendable) {
        this.f76817a = appendable;
    }

    public void a(byte b10) {
        try {
            c(b10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void b(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            try {
                c(bArr[i10]);
                i10++;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void c(byte b10) throws IOException {
        if (b10 > 0 && this.f76818b == 0) {
            this.f76817a.append((char) (b10 & 255));
            return;
        }
        int i10 = b10 & 255;
        byte b11 = f76815e[i10];
        int i11 = this.f76818b;
        int i12 = i11 == 0 ? (255 >> b11) & i10 : (i10 & 63) | (this.f76819c << 6);
        this.f76819c = i12;
        byte b12 = f76816f[i11 + b11];
        if (b12 == 0) {
            this.f76818b = b12;
            if (i12 < 55296) {
                this.f76817a.append((char) i12);
                return;
            }
            for (char c10 : Character.toChars(i12)) {
                this.f76817a.append(c10);
            }
            return;
        }
        if (b12 != 12) {
            this.f76818b = b12;
            return;
        }
        String str = "byte " + p.h(b10) + " in state " + (this.f76818b / 12);
        this.f76819c = 0;
        this.f76818b = 0;
        this.f76817a.append((char) 65533);
        throw new NotUtf8Exception(str);
    }

    public void d() {
        if (e()) {
            return;
        }
        this.f76819c = 0;
        this.f76818b = 0;
        try {
            this.f76817a.append((char) 65533);
            throw new NotUtf8Exception("incomplete UTF8 sequence");
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean e() {
        return this.f76818b == 0;
    }

    public void f() {
        this.f76818b = 0;
    }

    public String g() {
        if (!e()) {
            this.f76819c = 0;
            this.f76818b = 0;
            try {
                this.f76817a.append((char) 65533);
                NotUtf8Exception notUtf8Exception = new NotUtf8Exception("incomplete UTF8 sequence");
                c cVar = f76814d;
                cVar.f(notUtf8Exception.toString(), new Object[0]);
                cVar.b(notUtf8Exception);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.f76817a.toString();
    }
}
