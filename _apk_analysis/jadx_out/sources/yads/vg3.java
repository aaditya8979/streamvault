package yads;

import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class vg3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p000do.k f96092a;

    public vg3(kotlinx.coroutines.c cVar) {
        this.f96092a = cVar;
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        be3Var.a();
        boolean z10 = ad1.f87661a;
        if (this.f96092a.isActive()) {
            p000do.k kVar = this.f96092a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(new sg3(be3Var)));
        }
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        if (this.f96092a.isActive()) {
            p000do.k kVar = this.f96092a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m7534constructorimpl(new tg3(list)));
        }
    }
}
