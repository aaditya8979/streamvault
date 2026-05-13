package com.unity3d.services.core.domain.task;

import bn.r;
import hn.c;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
public final class InitializeSDK$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, c<? super InitializeSDK$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, cVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull l0 l0Var, @Nullable c<? super Result<r>> cVar) {
        return ((InitializeSDK$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(l0 l0Var, c<? super Result<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super Result<r>>) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0328 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0224 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0250 A[Catch: all -> 0x033f, CancellationException -> 0x0368, TryCatch #2 {CancellationException -> 0x0368, all -> 0x033f, blocks: (B:6:0x0013, B:125:0x0329, B:9:0x0024, B:122:0x030c, B:12:0x002f, B:117:0x02f3, B:119:0x02f9, B:15:0x0042, B:110:0x02bf, B:113:0x02cf, B:18:0x004d, B:105:0x02a4, B:107:0x02aa, B:22:0x005d, B:91:0x023e, B:93:0x0244, B:94:0x024f, B:25:0x0075, B:85:0x021e, B:87:0x0224, B:95:0x0250, B:97:0x025b, B:99:0x0265, B:101:0x026b, B:102:0x0282, B:111:0x02c9, B:126:0x0333, B:127:0x033e, B:28:0x008e, B:82:0x01fd, B:31:0x009f, B:77:0x01e1, B:79:0x01e7, B:34:0x00af, B:70:0x01b6, B:72:0x01bc, B:73:0x01c7, B:37:0x00c5, B:64:0x0199, B:66:0x019f, B:74:0x01c8, B:40:0x00d8, B:55:0x0153, B:57:0x0159, B:58:0x0171, B:61:0x017d, B:44:0x00ec, B:52:0x0137, B:47:0x00fa, B:49:0x0117), top: B:140:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
