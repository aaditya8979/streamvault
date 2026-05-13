package io.ktor.client.plugins;

import bn.r;
import io.ktor.client.call.HttpClientCall;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import java.io.IOException;
import java.io.InputStream;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;
import sn.q;
import tn.p;
import tn.t;

/* JADX INFO: compiled from: DefaultTransformersJvm.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {33}, m = "invokeSuspend")
public final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends SuspendLambda implements q<ql.c<dl.d, HttpClientCall>, dl.d, hn.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: compiled from: DefaultTransformersJvm.kt */
    public static final class a extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InputStream f71105b;

        public a(InputStream inputStream) {
            this.f71105b = inputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f71105b.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f71105b.close();
        }

        @Override // java.io.InputStream
        public int read() {
            return this.f71105b.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            p.k(bArr, "b");
            return this.f71105b.read(bArr, i10, i11);
        }
    }

    public DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(hn.c<? super DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> cVar) {
        super(3, cVar);
    }

    @Override // sn.q
    public final Object invoke(ql.c<dl.d, HttpClientCall> cVar, dl.d dVar, hn.c<? super r> cVar2) {
        DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(cVar2);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = cVar;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = dVar;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ql.c cVar = (ql.c) this.L$0;
            dl.d dVar = (dl.d) this.L$1;
            rl.a aVarA = dVar.a();
            Object objB = dVar.b();
            if (!(objB instanceof io.ktor.utils.io.a)) {
                return r.f5635a;
            }
            if (p.f(aVarA.getType(), t.b(InputStream.class))) {
                dl.d dVar2 = new dl.d(aVarA, new a(BlockingKt.a((io.ktor.utils.io.a) objB, (g) ((HttpClientCall) cVar.getContext()).getCoroutineContext().get(g.H8))));
                this.L$0 = null;
                this.label = 1;
                if (cVar.d(dVar2, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f5635a;
    }
}
