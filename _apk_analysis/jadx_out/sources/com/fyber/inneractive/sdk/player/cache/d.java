package com.fyber.inneractive.sdk.player.cache;

import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f17099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f17100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f17102d;

    public d(g gVar, e eVar) {
        this.f17102d = gVar;
        this.f17099a = eVar;
        this.f17100b = eVar.f17105c ? null : new boolean[gVar.f17116g];
    }

    public final void a() {
        if (!this.f17101c) {
            g.a(this.f17102d, this, true);
        } else {
            g.a(this.f17102d, this, false);
            this.f17102d.c(this.f17099a.f17103a);
        }
    }

    public final void a(byte[] bArr) {
        OutputStream cVar;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        g gVar = this.f17102d;
        if (gVar.f17116g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.f17102d.f17116g);
        }
        synchronized (gVar) {
            e eVar = this.f17099a;
            if (eVar.f17106d != this) {
                throw new IllegalStateException();
            }
            if (!eVar.f17105c) {
                this.f17100b[0] = true;
            }
            File fileB = eVar.b(0);
            try {
                fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
            } catch (FileNotFoundException unused) {
                this.f17102d.f17110a.mkdirs();
                try {
                    fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(fileB);
                } catch (FileNotFoundException unused2) {
                    cVar = g.f17109q;
                }
            }
            cVar = new c(this, fileOutputStreamFileOutputStreamCtor);
        }
        try {
            cVar.write(bArr);
            Charset charset = l.f17132a;
            try {
                cVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            Charset charset2 = l.f17132a;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RuntimeException e11) {
                    throw e11;
                } catch (Exception unused4) {
                }
            }
            throw th2;
        }
    }
}
