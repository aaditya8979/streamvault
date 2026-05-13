package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastTagName;

/* JADX INFO: loaded from: classes3.dex */
public final class f20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f89450e = "yandex_tracking_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f89451f = "yandex_linear_creative_info";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp3 f89452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ef1 f89453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d20 f89454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pp3 f89455d;

    public /* synthetic */ f20(Context context, io2 io2Var) {
        this(new rp3(), new ef1(context, io2Var, new lj(context, io2Var, null, 12)));
    }

    public f20(rp3 rp3Var, ef1 ef1Var) {
        this.f89452a = rp3Var;
        this.f89453b = ef1Var;
        this.f89454c = a();
        this.f89455d = b();
    }

    public static d20 a() {
        return new d20(new jr0(new rp3()), new rp3());
    }

    public static pp3 b() {
        return new pp3(new y73(), "CreativeExtension", VastTagName.TRACKING);
    }
}
