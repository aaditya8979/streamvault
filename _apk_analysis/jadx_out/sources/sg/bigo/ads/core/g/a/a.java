package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.g.a.b;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f83972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public b f83973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1047a f83974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f83975d = new b.a() { // from class: sg.bigo.ads.core.g.a.a.1
        @Override // sg.bigo.ads.core.g.a.b.a
        public final void a() {
            InterfaceC1047a interfaceC1047a = a.this.f83974c;
            if (interfaceC1047a != null) {
                interfaceC1047a.a();
            }
            b bVarB = a.this.b();
            u.a(bVarB, a.this.f83972a, null, -1);
            bVarB.setVPAIDEvenListener(a.this.f83973b.getVPAIDEvenListener());
            bVarB.setLayoutParams(a.this.f83973b.getLayoutParams());
            u.b(a.this.f83973b);
            a.this.f83973b = bVarB;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f83976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f83978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f83979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f83980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f83981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f83982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t f83983l;

    /* JADX INFO: renamed from: sg.bigo.ads.core.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC1047a {
        void a();
    }

    public a(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        this.f83976e = context;
        this.f83972a = viewGroup;
        this.f83977f = str;
        this.f83978g = i10;
        this.f83979h = i11;
        this.f83980i = fVar;
        this.f83981j = str2;
        this.f83982k = i12;
        this.f83983l = tVar;
        b bVarB = b();
        this.f83973b = bVarB;
        u.a(bVarB, viewGroup, null, 0);
    }

    @Override // sg.bigo.ads.api.c.a
    public final void a() {
        this.f83973b.a("window.vpaidwrapper.pauseAd()");
    }

    public final b b() {
        b bVar = new b(this.f83976e, this.f83977f, this.f83978g, this.f83979h, this.f83980i, this.f83981j, this.f83982k, this.f83983l);
        bVar.setOnRenderProcessGoneListener(this.f83975d);
        return bVar;
    }
}
