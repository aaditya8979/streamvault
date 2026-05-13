package com.opensource.svgaplayer;

import bn.r;
import com.opensource.svgaplayer.SVGAParser;
import com.opensource.svgaplayer.proto.MovieEntity;
import ge.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import tn.p;

/* JADX INFO: compiled from: SVGAParser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbn/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
public final class SVGAParser$_decodeFromInputStream$1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SVGAParser f51151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InputStream f51152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f51153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SVGAParser.c f51154e;

    /* JADX INFO: compiled from: SVGAParser.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lbn/r;", "run", "()V", "com/opensource/svgaplayer/SVGAParser$_decodeFromInputStream$1$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f51155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SVGAParser$_decodeFromInputStream$1 f51156c;

        public a(byte[] bArr, SVGAParser$_decodeFromInputStream$1 sVGAParser$_decodeFromInputStream$1) {
            this.f51155b = bArr;
            this.f51156c = sVGAParser$_decodeFromInputStream$1;
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            File fileE = SVGACache.f51114c.e(this.f51156c.f51153d);
            File file = fileE.exists() ^ true ? fileE : null;
            if (file != null) {
                file.createNewFile();
            }
            new FileOutputStream(fileE).write(this.f51155b);
        }
    }

    public SVGAParser$_decodeFromInputStream$1(SVGAParser sVGAParser, InputStream inputStream, String str, SVGAParser.c cVar) {
        this.f51151b = sVGAParser;
        this.f51152c = inputStream;
        this.f51153d = str;
        this.f51154e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            try {
                c cVar = c.f62370a;
                cVar.d("SVGAParser", "Input.binary change to entity");
                byte[] bArrW = this.f51151b.w(this.f51152c);
                if (bArrW != null) {
                    SVGAParser.INSTANCE.a().execute(new a(bArrW, this));
                    cVar.d("SVGAParser", "Input.inflate start");
                    byte[] bArrT = this.f51151b.t(bArrW);
                    if (bArrT != null) {
                        cVar.d("SVGAParser", "Input.inflate success");
                        MovieEntity movieEntityF = MovieEntity.ADAPTER.f(bArrT);
                        p.g(movieEntityF, "MovieEntity.ADAPTER.decode(inflateBytes)");
                        final SVGAVideoEntity sVGAVideoEntity = new SVGAVideoEntity(movieEntityF, new File(this.f51153d), this.f51151b.mFrameWidth, this.f51151b.mFrameHeight);
                        sVGAVideoEntity.t(new sn.a<r>() { // from class: com.opensource.svgaplayer.SVGAParser$_decodeFromInputStream$1$$special$$inlined$let$lambda$3
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
                                c.f62370a.d("SVGAParser", "Input.prepare success");
                                SVGAParser$_decodeFromInputStream$1 sVGAParser$_decodeFromInputStream$1 = this;
                                sVGAParser$_decodeFromInputStream$1.f51151b.u(sVGAVideoEntity, sVGAParser$_decodeFromInputStream$1.f51154e);
                            }
                        });
                    } else {
                        this.f51151b.s("Input.inflate(bytes) cause exception", this.f51154e);
                    }
                } else {
                    this.f51151b.s("Input.readAsBytes(inputStream) cause exception", this.f51154e);
                }
            } catch (Exception e10) {
                this.f51151b.v(e10, this.f51154e);
            }
        } finally {
            this.f51152c.close();
        }
    }
}
