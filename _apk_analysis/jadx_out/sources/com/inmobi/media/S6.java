package com.inmobi.media;

import com.ironsource.Y5;
import java.io.FileInputStream;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes9.dex */
public final class S6 extends AbstractC3788ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26284a;

    public S6(String str) {
        tn.p.k(str, Y5.c.f30724b);
        tn.p.k(com.ironsource.G5.L, "contentType");
        this.f26284a = str;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final String a() {
        return com.ironsource.G5.L;
    }

    @Override // com.inmobi.media.AbstractC3788ui
    public final void a(BufferedSink bufferedSink) throws IOException {
        tn.p.k(bufferedSink, "bufferedSink");
        String str = this.f26284a;
        tn.p.k(str, Y5.c.f30725c);
        Buffer buffer = new Buffer();
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            buffer.readFrom(fileInputStream);
            on.b.a(fileInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                on.b.a(fileInputStream, th2);
                throw th3;
            }
        }
        try {
            try {
                try {
                    bufferedSink.writeAll(buffer);
                    tn.p.k(buffer, "<this>");
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        on.b.a(buffer, th4);
                        throw th5;
                    }
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Exception unused) {
                bn.r rVar = bn.r.f5635a;
            }
            try {
                buffer.close();
            } catch (IOException unused2) {
            }
            on.b.a(buffer, null);
        } finally {
            tn.p.k(buffer, "<this>");
            try {
                buffer.close();
            } catch (IOException unused3) {
            }
        }
    }
}
