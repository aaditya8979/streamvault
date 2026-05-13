package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class po extends po2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f93659v = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f93660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oo f93661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final uo2 f93662u;

    public po(Context context, int i10, String str, oo ooVar, uo2 uo2Var) {
        super(i10, no.a(str), ooVar);
        this.f93660s = context;
        this.f93661t = ooVar;
        this.f93662u = uo2Var;
        k();
        a(new qe0(1.0f, f93659v, 0));
    }

    public /* synthetic */ po(Context context, String str, oo ooVar) {
        this(context, 0, str, ooVar, null);
    }

    @Override // yads.po2
    public im3 a(im3 im3Var) {
        return im3Var;
    }

    @Override // yads.po2
    public final void a(Object obj) {
        this.f93661t.a(obj);
    }
}
