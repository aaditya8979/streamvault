package yads;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes8.dex */
public final class b41 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p000do.k f87902a;

    public b41(kotlinx.coroutines.c cVar) {
        this.f87902a = cVar;
    }

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.d51
    public final void a(Map map) {
        p000do.k kVar = this.f87902a;
        Result.a aVar = Result.Companion;
        kVar.resumeWith(Result.m7534constructorimpl(new e51(map)));
    }
}
