package yads;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f95093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f95094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f95095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v9 f95096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdQualityVerificationResult f95097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn.g f95098f;

    public t8(d4 d4Var, Context context, j8 j8Var) {
        this.f95093a = d4Var;
        this.f95094b = context;
        this.f95095c = j8Var;
        this.f95097e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f95098f = kotlin.b.b(new r8(this));
    }

    public /* synthetic */ t8(d4 d4Var, lu2 lu2Var, Context context) {
        this(d4Var, context, new j8(d4Var, lu2Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.t8.a():void");
    }

    public final boolean b() {
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(this.f95094b);
        f8 f8Var = nt2VarA != null ? nt2VarA.f92979v0 : null;
        return f8Var != null && f8Var.f89506a;
    }
}
