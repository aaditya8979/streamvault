package sg.bigo.ads.controller.g;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.controller.g.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e<T extends sg.bigo.ads.common.u.a> extends a<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.controller.b f83409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    private final Map<String, Object> f83410k;

    public e(@NonNull Map<String, Object> map, @NonNull sg.bigo.ads.common.g gVar, @Nullable sg.bigo.ads.controller.a.b bVar, @NonNull sg.bigo.ads.controller.b bVar2) {
        super(gVar, bVar);
        this.f83409j = bVar2;
        this.f83410k = map;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i10, int i11, String str) {
        this.f83409j.a(a(), i10, i11, str, null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        this.f83409j.a(a(), str);
    }

    @Override // sg.bigo.ads.controller.g.a
    @CallSuper
    public void a(@NonNull a.b bVar) {
        for (String str : this.f83410k.keySet()) {
            bVar.a(str, this.f83410k.get(str));
        }
    }
}
