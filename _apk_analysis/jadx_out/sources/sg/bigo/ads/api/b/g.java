package sg.bigo.ads.api.b;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g<T extends Ad, U extends sg.bigo.ads.api.core.b> extends i<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81828c;

    public g(sg.bigo.ads.api.b bVar) {
        super(bVar);
        this.f81828c = false;
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();
}
