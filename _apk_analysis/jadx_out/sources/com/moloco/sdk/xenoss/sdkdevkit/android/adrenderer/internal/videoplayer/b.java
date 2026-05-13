package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import r7.k;
import r7.y;
import sn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class b implements r7.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f50686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n f50687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f50688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f50689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f50690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f50691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50692g;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$open$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements p<l0, hn.c<? super Long>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50693a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f50695c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f50695c = kVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super Long> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new a(this.f50695c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            File fileA;
            in.a.g();
            if (this.f50693a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            try {
                b bVar = b.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarE = bVar.e(bVar.f50686a);
                if (hVarE instanceof h.a) {
                    fileA = ((h.a) hVarE).a();
                } else {
                    if (!(hVarE instanceof h.c)) {
                        b.this.f50692g = true;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.f50688c, "Failed to download file: " + b.this.f50686a, null, false, 12, null);
                        throw new IOException("Cannot read file: " + b.this.f50686a);
                    }
                    fileA = ((h.c) hVarE).a();
                }
                if (!fileA.exists()) {
                    throw new IOException("Cannot read file, does not exist yet: " + b.this.f50686a);
                }
                b bVar2 = b.this;
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileA, "r");
                randomAccessFile.seek(this.f50695c.f78761g);
                bVar2.h(randomAccessFile);
                b bVar3 = b.this;
                long length = this.f50695c.f78762h;
                if (length == -1) {
                    length = fileA.length() - this.f50695c.f78761g;
                }
                bVar3.f50690e = length;
                if (b.this.f50690e == 0 && b.this.j(hVarE)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.f50688c, "Streaming error likely detected", null, false, 12, null);
                    b.this.f50692g = true;
                }
                return jn.a.e(b.this.f50690e);
            } catch (IOException e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.f50688c, "Failed to open file: " + b.this.f50686a, e10, false, 8, null);
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b$b, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.ProgressiveMediaFileDataSource$streamingStatus$1", f = "ProgressiveMediaFileDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class C0687b extends SuspendLambda implements p<l0, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50696a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f50698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0687b(String str, hn.c<? super C0687b> cVar) {
            super(2, cVar);
            this.f50698c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h> cVar) {
            return ((C0687b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return b.this.new C0687b(this.f50698c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f50696a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return b.this.f50687b.a(this.f50698c);
        }
    }

    public b(@NotNull String str, @NotNull n nVar) {
        tn.p.k(str, "url");
        tn.p.k(nVar, "mediaCacheRepository");
        this.f50686a = str;
        this.f50687b = nVar;
        this.f50688c = "ProgressiveMediaFileDataSource";
    }

    @Override // r7.h
    public long a(@NotNull k kVar) {
        tn.p.k(kVar, "dataSpec");
        return ((Number) p000do.h.b(null, new a(kVar, null), 1, null)).longValue();
    }

    @Override // r7.h
    public void b(@NotNull y yVar) {
        tn.p.k(yVar, "transferListener");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50688c, "addTransferListener", null, false, 12, null);
    }

    @Override // r7.h
    public void close() {
        try {
            RandomAccessFile randomAccessFile = this.f50689d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.f50689d = null;
        }
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h e(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) p000do.h.b(null, new C0687b(str, null), 1, null);
    }

    @Override // r7.h
    @Nullable
    public Uri getUri() {
        return Uri.parse(this.f50686a);
    }

    public final void h(@Nullable RandomAccessFile randomAccessFile) {
        this.f50689d = randomAccessFile;
    }

    public final boolean i() {
        return this.f50692g;
    }

    public final boolean j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar) {
        return this.f50691f && (hVar instanceof h.c) && tn.p.f(((h.c) hVar).b(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a());
    }

    @Override // r7.f
    public int read(@NotNull byte[] bArr, int i10, int i11) {
        IOException iOException;
        int i12;
        tn.p.k(bArr, "buffer");
        try {
            if (i11 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50688c, "Read length is 0", null, false, 12, null);
                return 0;
            }
            if (this.f50690e == 0 && (e(this.f50686a) instanceof h.a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f50688c, "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarE = e(this.f50686a);
            if (hVarE instanceof h.b) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f50688c, "Streaming failed: " + this.f50686a, null, false, 12, null);
                this.f50692g = true;
                return 0;
            }
            if (hVarE instanceof h.a) {
                RandomAccessFile randomAccessFile = this.f50689d;
                i = randomAccessFile != null ? randomAccessFile.read(bArr, i10, i11) : 0;
                if (i <= 0) {
                    return i;
                }
                this.f50691f = true;
                this.f50690e -= (long) i;
                return i;
            }
            loop0: while (true) {
                i12 = 0;
                while (i12 <= 0) {
                    try {
                        if (!(e(this.f50686a) instanceof h.c)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.f50689d;
                        if (randomAccessFile2 != null) {
                            i12 = randomAccessFile2.read(bArr, i10, i11);
                        }
                    } catch (IOException e10) {
                        iOException = e10;
                        i = i12;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f50688c, "Waiting for more data", iOException, false, 8, null);
                        return i;
                    }
                }
            }
            if (i12 <= 0) {
                return i12;
            }
            this.f50691f = true;
            this.f50690e -= (long) i12;
            return i12;
        } catch (IOException e11) {
            iOException = e11;
        }
    }
}
