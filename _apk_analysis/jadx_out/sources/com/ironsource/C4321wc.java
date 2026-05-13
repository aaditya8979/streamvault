package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4321wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final C4083j2 f34335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34336b;

    /* JADX INFO: renamed from: com.ironsource.wc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f34337a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f34338b = "adm";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f34339c = "isOneFlow";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f34340d = "isMultipleAdObjects";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f34341e = "adsInternalInfo";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f34342f = "success";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f34343g = "error";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f34344h = "data";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4321wc() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public C4321wc(@Nullable C4083j2 c4083j2, boolean z10) {
        this.f34335a = c4083j2;
        this.f34336b = z10;
    }

    public /* synthetic */ C4321wc(C4083j2 c4083j2, boolean z10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : c4083j2, (i10 & 2) != 0 ? false : z10);
    }

    @NotNull
    public final HashMap<String, String> a() {
        C4175o2 c4175o2G;
        HashMap<String, String> map = new HashMap<>();
        map.put("isOneFlow", String.valueOf(this.f34336b));
        map.put("isMultipleAdObjects", "true");
        List<O> listA = Lb.f29764s.d().G().a();
        String string = listA != null ? IronSourceVideoBridge.jsonObjectInit().put("success", true).put("data", listA).toString() : IronSourceVideoBridge.jsonObjectInit().put("success", false).put("error", "Failed to get ad internal info").toString();
        tn.p.j(string, "if (jsonAdInternalInfo !…    .toString()\n        }");
        map.put(a.f34341e, string);
        C4083j2 c4083j2 = this.f34335a;
        if (c4083j2 != null && (c4175o2G = c4083j2.g()) != null) {
            map.put("adm", c4175o2G.a());
            map.putAll(c4175o2G.b());
        }
        return map;
    }
}
