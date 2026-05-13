package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class fi0 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f89588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh0 f89589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(Context context, zh0 zh0Var) {
        super(0);
        this.f89588b = context;
        this.f89589c = zh0Var;
    }

    @Override // sn.a
    public final Object invoke() {
        nh0 nh0Var = new nh0(this.f89588b);
        zg0 zg0Var = new zg0(new bh0(), new fh0(), new eh0(), new ah0(), new gh0(), new ch0());
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(this.f89588b);
        DivConfiguration.Builder builderTypefaceProvider = new DivConfiguration.Builder(nh0Var).divCustomContainerViewAdapter(zg0Var).typefaceProvider(tn.p.f(nt2VarA != null ? Boolean.valueOf(qt2.a(nt2VarA)) : null, Boolean.TRUE) ? new ti0(this.f89588b) : new vi0(this.f89588b));
        zh0 zh0Var = this.f89589c;
        if (zh0Var != null) {
            builderTypefaceProvider = builderTypefaceProvider.extension(new bi0(zh0Var));
        }
        return builderTypefaceProvider.extension(new ni0()).build();
    }
}
