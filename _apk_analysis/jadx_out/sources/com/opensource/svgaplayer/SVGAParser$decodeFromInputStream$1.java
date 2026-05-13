package com.opensource.svgaplayer;

import be.f;
import bn.r;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.proto.MovieEntity;
import ge.c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import on.b;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class SVGAParser$decodeFromInputStream$1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SVGAParser f51161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputStream f51162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f51163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SVGAParser.c f51164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f51165f;

    public SVGAParser$decodeFromInputStream$1(SVGAParser sVGAParser, InputStream inputStream, String str, SVGAParser.c cVar, boolean z10) {
        this.f51161b = sVGAParser;
        this.f51162c = inputStream;
        this.f51163d = str;
        this.f51164e = cVar;
        this.f51165f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            try {
                byte[] bArrW = this.f51161b.w(this.f51162c);
                if (bArrW == null) {
                    this.f51161b.v(new Exception("readAsBytes(inputStream) cause exception"), this.f51164e);
                } else if (bArrW.length > 4 && bArrW[0] == 80 && bArrW[1] == 75 && bArrW[2] == 3 && bArrW[3] == 4) {
                    c cVar = c.f62370a;
                    cVar.d("SVGAParser", "decode from zip file");
                    SVGACache sVGACache = SVGACache.f51114c;
                    if (!sVGACache.b(this.f51163d).exists() || f.f5584b) {
                        synchronized (Integer.valueOf(f.f5583a)) {
                            if (!sVGACache.b(this.f51163d).exists()) {
                                f.f5584b = true;
                                cVar.d("SVGAParser", "no cached, prepare to unzip");
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrW);
                                try {
                                    this.f51161b.x(byteArrayInputStream, this.f51163d);
                                    f.f5584b = false;
                                    cVar.d("SVGAParser", "unzip success");
                                    r rVar = r.f5635a;
                                    b.a(byteArrayInputStream, null);
                                } finally {
                                }
                            }
                            r rVar2 = r.f5635a;
                        }
                    }
                    this.f51161b.o(this.f51163d, this.f51164e);
                } else {
                    c.f62370a.d("SVGAParser", "decode from input stream, inflate start");
                    byte[] bArrT = this.f51161b.t(bArrW);
                    if (bArrT != null) {
                        MovieEntity movieEntityF = MovieEntity.ADAPTER.f(bArrT);
                        p.g(movieEntityF, "MovieEntity.ADAPTER.decode(it)");
                        final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityF, new File(this.f51163d), this.f51161b.mFrameWidth, this.f51161b.mFrameHeight);
                        sVGAVideoEntity.t(new a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$decodeFromInputStream$1$$special$$inlined$let$lambda$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // sn.a
                            public /* bridge */ /* synthetic */ r invoke() {
                                invoke2();
                                return r.f5635a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                c.f62370a.d("SVGAParser", "decode from input stream, inflate end");
                                SVGAParser$decodeFromInputStream$1 sVGAParser$decodeFromInputStream$1 = this;
                                sVGAParser$decodeFromInputStream$1.f51161b.u(sVGAVideoEntity, sVGAParser$decodeFromInputStream$1.f51164e);
                            }
                        });
                    } else {
                        this.f51161b.v(new Exception("inflate(bytes) cause exception"), this.f51164e);
                    }
                }
                if (!this.f51165f) {
                    return;
                }
            } catch (Exception e10) {
                this.f51161b.v(e10, this.f51164e);
                if (!this.f51165f) {
                    return;
                }
            }
            this.f51162c.close();
        } catch (Throwable th2) {
            if (this.f51165f) {
                this.f51162c.close();
            }
            throw th2;
        }
    }
}
