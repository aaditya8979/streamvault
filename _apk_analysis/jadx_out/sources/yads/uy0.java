package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f95868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f95869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lu2 f95870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z00 f95871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ye1 f95872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a4 f95873f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy0(Context context, v9 v9Var, RelativeLayout relativeLayout, kz kzVar, b2 b2Var, int i10, q2 q2Var, d4 d4Var, lu2 lu2Var) {
        this(v9Var, relativeLayout, lu2Var, new i32(q2Var, new my0(cw2.a().a(context))), new ye1(context, v9Var, kzVar, b2Var, i10, q2Var, d4Var, lu2Var), new a4(q2Var));
        Object obj = dw2.f89000j;
    }

    public uy0(v9 v9Var, RelativeLayout relativeLayout, lu2 lu2Var, z00 z00Var, ye1 ye1Var, a4 a4Var) {
        this.f95868a = v9Var;
        this.f95869b = relativeLayout;
        this.f95870c = lu2Var;
        this.f95871d = z00Var;
        this.f95872e = ye1Var;
        this.f95873f = a4Var;
    }

    public final py0 a(Context context, w02 w02Var, kz kzVar) {
        ArrayList arrayList;
        gi0 gi0Var;
        Object objPrevious;
        ir2 ir2Var = new ir2(context, new ei0(w02Var, kzVar, ((iu3) this.f95870c).a(), new mi0(), new wi0()), kzVar);
        a4 a4Var = this.f95873f;
        v9 v9Var = this.f95868a;
        a4Var.getClass();
        t2 mq2Var = v9Var.f95990a == e00.f89042f ? new mq2(ir2Var, new nq2(a4Var.f87565a)) : new bd1();
        List listD = w02Var.d();
        if (listD != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listD) {
                String str = ((gi0) obj).f89988a;
                fg0[] fg0VarArr = fg0.f89568b;
                if (tn.p.f(str, "ad")) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List listD2 = w02Var.d();
        if (listD2 != null) {
            ListIterator listIterator = listD2.listIterator(listD2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                String str2 = ((gi0) objPrevious).f89988a;
                fg0[] fg0VarArr2 = fg0.f89568b;
                if (tn.p.f(str2, "pack_shot")) {
                    break;
                }
            }
            gi0Var = (gi0) objPrevious;
        } else {
            gi0Var = null;
        }
        d12 d12VarB = w02Var.b();
        c7 c7Var = d12VarB != null ? d12VarB.f88699j : null;
        String str3 = this.f95868a.f96005p;
        cg0[] cg0VarArr = cg0.f88457b;
        if (tn.p.f(str3, "ad_pod") && c7Var != null && ((w02Var instanceof v22) || gi0Var != null)) {
            z00 z00Var = this.f95871d;
            return new g7(context, w02Var, z00Var, ir2Var, arrayList, gi0Var, this.f95869b, mq2Var, kzVar, this.f95872e, c7Var, new ExtendedNativeAdView(context), new s2(w02Var, kzVar, z00Var), new sj2(), new lw(), new uq2(new x63()));
        }
        return new ty0(this.f95872e.a(context, this.f95869b, w02Var, this.f95871d, new xk2(mq2Var), ir2Var, new k63(new sj2(), new gz2(this.f95868a), new mz2(this.f95868a), new lz2()), new nz2(), arrayList != null ? (gi0) cn.f0.v0(arrayList) : null, null), kzVar);
    }
}
