package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.G5;
import java.util.Map;
import sg.bigo.ads.controller.g.a;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends sg.bigo.ads.controller.g.a<sg.bigo.ads.controller.a.f> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f83412j;

    public interface a {
        void a(String str, int i10, int i11, int i12, @NonNull String str2, @Nullable Map<String, Object> map);

        void a(String str, int i10, String str2, @Nullable Map<String, Object> map);
    }

    public l(@NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, a aVar) {
        super(gVar, bVar);
        this.f83412j = aVar;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i10, int i11, String str) {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, int i10, int i11, String str2, @Nullable Map<String, Object> map) {
        super.a(str, i10, i11, str2, map);
        a aVar = this.f83412j;
        if (aVar != null) {
            aVar.a(str, a(), i10, i11, str2, map);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        super.a(str, str2, map);
        a aVar = this.f83412j;
        if (aVar != null) {
            aVar.a(str, a(), str2, map);
        }
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull a.b bVar) {
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.b();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final sg.bigo.ads.common.u.f d() {
        return sg.bigo.ads.common.u.f.a(G5.L);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f83381c;
        return bVar != null ? bVar.f82891a.f82823l.f82886a : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f83387i;
        return str != null ? this.f83381c.b("/Ad/GetSDKConfig", str) : this.f83381c.b("/Ad/GetSDKConfig", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean h() {
        return false;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return false;
    }
}
