package yads;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class gw0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw0 f90136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sw0 f90137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f90138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw0(hw0 hw0Var, sw0 sw0Var, byte[] bArr, hn.c cVar) {
        super(2, cVar);
        this.f90136b = hw0Var;
        this.f90137c = sw0Var;
        this.f90138d = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new gw0(this.f90136b, this.f90137c, this.f90138d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((gw0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            File fileB = this.f90136b.b(this.f90137c);
            File parentFile = fileB.getParentFile();
            if (parentFile != null) {
                jn.a.a(parentFile.mkdirs());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileB);
            try {
                fileOutputStream.write(this.f90138d);
                fileOutputStream.flush();
                bn.r rVar = bn.r.f5635a;
                on.b.a(fileOutputStream, null);
                return fileB;
            } finally {
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f87661a;
            return null;
        }
    }
}
