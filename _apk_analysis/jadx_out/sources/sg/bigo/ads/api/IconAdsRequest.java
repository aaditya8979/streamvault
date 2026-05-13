package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes11.dex */
public class IconAdsRequest extends sg.bigo.ads.api.b implements sg.bigo.ads.api.b.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l f81771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final sg.bigo.ads.api.core.b f81772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f81773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f81774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f81775m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f81776n;

    public static class a extends c<a, IconAdsRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f81777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public sg.bigo.ads.api.core.b f81778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f81779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f81780d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f81781e = 20;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f81782f;

        @Override // sg.bigo.ads.api.c
        public final /* synthetic */ sg.bigo.ads.api.b createAdRequest() {
            if (this.f81777a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    public interface b {
        int a();
    }

    private IconAdsRequest(@NonNull a aVar) {
        super(aVar.mSlotId, null);
        this.f81771i = aVar.f81777a;
        this.f81772j = aVar.f81778b;
        this.f81773k = aVar.f81779c;
        this.f81774l = aVar.f81780d;
        this.f81775m = aVar.f81781e;
        this.f81776n = aVar.f81782f;
    }

    public /* synthetic */ IconAdsRequest(a aVar, byte b10) {
        this(aVar);
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f81771i.b();
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.api.core.b bVar = this.f81772j;
        if (bVar != null) {
            linkedHashMap.put("host_slot", bVar.b());
            linkedHashMap.put("host_placement", this.f81772j.c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f81772j.x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f81772j.w()));
            linkedHashMap.put("dsp_source", this.f81772j.v());
            linkedHashMap.put("main_domain", this.f81772j.i());
            linkedHashMap.put("main_bundle", this.f81772j.n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f81772j.y()));
            linkedHashMap.put("main_ad_id", this.f81772j.r());
            linkedHashMap.put("dsp_extra", this.f81772j.an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.f81774l));
        linkedHashMap.put("scene_page", Integer.valueOf(this.f81773k));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f81775m));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean e() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean g() {
        return true;
    }

    @Override // sg.bigo.ads.api.b
    public final l h() {
        return this.f81771i;
    }

    @Override // sg.bigo.ads.api.b.b
    public final sg.bigo.ads.api.core.b i() {
        return this.f81772j;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int j() {
        return this.f81775m;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int k() {
        return this.f81773k;
    }

    @Override // sg.bigo.ads.api.b.c
    public final int l() {
        b bVar = this.f81776n;
        if (bVar != null) {
            return bVar.a();
        }
        return 1;
    }
}
