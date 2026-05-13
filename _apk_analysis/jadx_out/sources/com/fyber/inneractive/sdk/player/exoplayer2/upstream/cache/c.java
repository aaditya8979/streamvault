package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f18606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18607b = 10485760;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18608c = 20480;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f18609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f18610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OutputStream f18611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FileOutputStream f18612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f18615j;

    public c(l lVar) {
        this.f18606a = lVar;
    }

    public final void a() {
        OutputStream outputStream = this.f18611f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f18612g.getFD().sync();
            z.a(this.f18611f);
            this.f18611f = null;
            File file = this.f18610e;
            this.f18610e = null;
            l lVar = this.f18606a;
            synchronized (lVar) {
                m mVarA = m.a(file, lVar.f18662d);
                if (mVarA == null) {
                    throw new IllegalStateException();
                }
                if (!lVar.f18661c.containsKey(mVarA.f18638a)) {
                    throw new IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long jA = lVar.a(mVarA.f18638a);
                    if (jA != -1 && mVarA.f18639b + mVarA.f18640c > jA) {
                        throw new IllegalStateException();
                    }
                    lVar.a(mVarA);
                    lVar.f18662d.b();
                    lVar.notifyAll();
                }
            }
        } catch (Throwable th2) {
            z.a(this.f18611f);
            this.f18611f = null;
            File file2 = this.f18610e;
            this.f18610e = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b() throws FileNotFoundException {
        File file;
        long j10 = this.f18609d.f18699d;
        long jMin = j10 == -1 ? this.f18607b : Math.min(j10 - this.f18614i, this.f18607b);
        l lVar = this.f18606a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.f18609d;
        String str = kVar.f18700e;
        long j11 = kVar.f18697b + this.f18614i;
        synchronized (lVar) {
            if (!lVar.f18661c.containsKey(str)) {
                throw new IllegalStateException();
            }
            if (!lVar.f18659a.exists()) {
                lVar.a();
                lVar.f18659a.mkdirs();
            }
            lVar.f18660b.a(lVar, jMin);
            File file2 = lVar.f18659a;
            i iVar = lVar.f18662d;
            h hVarA = (h) iVar.f18648a.get(str);
            if (hVarA == null) {
                hVarA = iVar.a(str, -1L);
            }
            int i10 = hVarA.f18644a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Pattern pattern = m.f18665g;
            file = new File(file2, i10 + "." + j11 + "." + jCurrentTimeMillis + ".v3.exo");
        }
        this.f18610e = file;
        FileOutputStream fileOutputStreamFileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(this.f18610e);
        this.f18612g = fileOutputStreamFileOutputStreamCtor;
        if (this.f18608c > 0) {
            p pVar = this.f18615j;
            if (pVar == null) {
                this.f18615j = new p(this.f18612g, this.f18608c);
            } else {
                pVar.a(fileOutputStreamFileOutputStreamCtor);
            }
            this.f18611f = this.f18615j;
        } else {
            this.f18611f = fileOutputStreamFileOutputStreamCtor;
        }
        this.f18613h = 0L;
    }
}
