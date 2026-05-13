package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes10.dex */
public final class jv2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn1 f91392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f91393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on1 f91394d;

    public jv2(sn1 sn1Var, CustomizableMediaView customizableMediaView, on1 on1Var) {
        this.f91392b = sn1Var;
        this.f91393c = customizableMediaView;
        this.f91394d = on1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f91392b.b(this.f91393c, this.f91394d);
    }
}
