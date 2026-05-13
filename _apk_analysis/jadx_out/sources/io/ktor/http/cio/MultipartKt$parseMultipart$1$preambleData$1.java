package io.ktor.http.cio;

import bn.r;
import hn.c;
import io.ktor.utils.io.CountedByteReadChannel;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sl.f;
import sl.s;
import sn.p;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", l = {206, 207}, m = "invokeSuspend")
public final class MultipartKt$parseMultipart$1$preambleData$1 extends SuspendLambda implements p<s, c<? super r>, Object> {
    public final /* synthetic */ CountedByteReadChannel $countedInput;
    public final /* synthetic */ oo.a $firstBoundary;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1$preambleData$1(oo.a aVar, CountedByteReadChannel countedByteReadChannel, c<? super MultipartKt$parseMultipart$1$preambleData$1> cVar) {
        super(2, cVar);
        this.$firstBoundary = aVar;
        this.$countedInput = countedByteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new MultipartKt$parseMultipart$1$preambleData$1(this.$firstBoundary, this.$countedInput, cVar);
        multipartKt$parseMultipart$1$preambleData$1.L$0 = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(s sVar, c<? super r> cVar) {
        return ((MultipartKt$parseMultipart$1$preambleData$1) create(sVar, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s sVar;
        Object objG = in.a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            sVar = (s) this.L$0;
            oo.a aVar = this.$firstBoundary;
            CountedByteReadChannel countedByteReadChannel = this.$countedInput;
            f fVarA = sVar.a();
            this.L$0 = sVar;
            this.label = 1;
            if (MultipartKt.n(aVar, countedByteReadChannel, fVarA, 8193L, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                return r.f5635a;
            }
            sVar = (s) this.L$0;
            kotlin.c.b(obj);
        }
        f fVarA2 = sVar.a();
        this.L$0 = null;
        this.label = 2;
        if (fVarA2.c(this) == objG) {
            return objG;
        }
        return r.f5635a;
    }
}
