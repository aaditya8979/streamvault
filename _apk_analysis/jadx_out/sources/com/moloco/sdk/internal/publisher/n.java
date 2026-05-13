package com.moloco.sdk.internal.publisher;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
@VisibleForTesting(otherwise = 2)
public final class n implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f46712a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.publisher.Base64GzippedBidProcessor$process$2", f = "BidProcessor.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements sn.p<p000do.l0, hn.c<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46713a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f46715c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f46715c = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(p000do.l0 l0Var, hn.c<? super String> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return n.this.new b(this.f46715c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f46713a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
            String strC = n.this.c(this.f46715c);
            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Processed bidresponse: " + strC, false, 4, null);
            return strC;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.n0
    @Nullable
    public Object a(@NotNull String str, @NotNull hn.c<? super String> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getDefault(), new b(str, null), cVar);
    }

    public final String c(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            tn.p.j(bArrDecode, "decode(...)");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Base64 decoded bidresponse: " + bArrDecode, false, 4, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 2048);
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int i10 = gZIPInputStream.read(bArr);
                        if (i10 == -1) {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            return sb2.toString();
                        }
                        sb2.append(new String(bArr, 0, i10, bo.c.f5639b));
                    } catch (Exception unused) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
            return null;
        }
    }
}
