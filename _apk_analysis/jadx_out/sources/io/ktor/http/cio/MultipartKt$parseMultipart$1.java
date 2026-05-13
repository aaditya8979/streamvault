package io.ktor.http.cio;

import bn.r;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import fo.m;
import hn.c;
import jn.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import sn.p;

/* JADX INFO: compiled from: Multipart.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", l = {208, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 225, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend")
public final class MultipartKt$parseMultipart$1 extends SuspendLambda implements p<m<? super b>, c<? super r>, Object> {
    public final /* synthetic */ oo.a $boundaryPrefixed;
    public final /* synthetic */ io.ktor.utils.io.a $input;
    public final /* synthetic */ long $maxPartSize;
    public final /* synthetic */ Long $totalLength;
    public long J$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1(io.ktor.utils.io.a aVar, oo.a aVar2, long j10, Long l10, c<? super MultipartKt$parseMultipart$1> cVar) {
        super(2, cVar);
        this.$input = aVar;
        this.$boundaryPrefixed = aVar2;
        this.$maxPartSize = j10;
        this.$totalLength = l10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        MultipartKt$parseMultipart$1 multipartKt$parseMultipart$1 = new MultipartKt$parseMultipart$1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, cVar);
        multipartKt$parseMultipart$1.L$0 = obj;
        return multipartKt$parseMultipart$1;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(m<? super b> mVar, c<? super r> cVar) {
        return ((MultipartKt$parseMultipart$1) create(mVar, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x033a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0200 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x025c A[Catch: all -> 0x02a6, TRY_LEAVE, TryCatch #1 {all -> 0x02a6, blocks: (B:66:0x0256, B:68:0x025c, B:77:0x029b, B:78:0x02a5), top: B:126:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b A[Catch: all -> 0x02a6, TRY_ENTER, TryCatch #1 {all -> 0x02a6, blocks: (B:66:0x0256, B:68:0x025c, B:77:0x029b, B:78:0x02a5), top: B:126:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.g, tn.i] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x020b -> B:39:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0285 -> B:128:0x028d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt$parseMultipart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
