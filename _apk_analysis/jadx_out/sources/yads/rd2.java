package yads;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes8.dex */
public final class rd2 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p000do.k f94381a;

    public rd2(kotlinx.coroutines.c cVar) {
        this.f94381a = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f94381a.p(null, null);
    }
}
