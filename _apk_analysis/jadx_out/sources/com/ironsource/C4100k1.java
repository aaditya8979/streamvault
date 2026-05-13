package com.ironsource;

import com.ironsource.C4136m1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4100k1 implements InterfaceC4118l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.a f32106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f32108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32109f;

    /* JADX INFO: renamed from: com.ironsource.k1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f32110a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f32111b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f32112c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f32113d = 1;

        private a() {
        }
    }

    public C4100k1(@NotNull String str, @NotNull String str2, @NotNull IronSource.a aVar, boolean z10, boolean z11, boolean z12) {
        tn.p.k(str, "version");
        tn.p.k(str2, "instanceId");
        tn.p.k(aVar, "adFormat");
        this.f32104a = str;
        this.f32105b = str2;
        this.f32106c = aVar;
        this.f32107d = z10;
        this.f32108e = z11;
        this.f32109f = z12;
    }

    public /* synthetic */ C4100k1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, tn.i iVar) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }

    @Override // com.ironsource.InterfaceC4118l1
    @NotNull
    public ArrayList<InterfaceC4156n1> a() {
        ArrayList<InterfaceC4156n1> arrayList = new ArrayList<>();
        arrayList.add(new C4136m1.v(this.f32104a));
        arrayList.add(new C4136m1.x(this.f32105b));
        arrayList.add(new C4136m1.a(this.f32106c));
        if (this.f32107d) {
            arrayList.add(new C4136m1.p(1));
        }
        if (this.f32108e) {
            arrayList.add(new C4136m1.e(1));
        }
        if (this.f32109f) {
            arrayList.add(new C4136m1.o(1));
        }
        return arrayList;
    }
}
