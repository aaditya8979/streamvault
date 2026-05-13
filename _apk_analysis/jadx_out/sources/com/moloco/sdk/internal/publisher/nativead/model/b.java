package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.publisher.nativead.model.a;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a.AbstractC0574a f46856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46858c;

    @StabilityInferred(parameters = 1)
    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f46859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull a.AbstractC0574a.C0575a c0575a) {
            super(c0575a, null);
            p.k(c0575a, "originAsset");
            this.f46859d = c0575a.c();
        }

        @NotNull
        public final String b() {
            return this.f46859d;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0576b extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Uri f46860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0576b(@NotNull a.AbstractC0574a.b bVar, @NotNull Uri uri) {
            super(bVar, null);
            p.k(bVar, "originAsset");
            p.k(uri, "precachedAssetUri");
            this.f46860d = uri;
        }

        @NotNull
        public final Uri b() {
            return this.f46860d;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f46861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull a.AbstractC0574a.c cVar) {
            super(cVar, null);
            p.k(cVar, "originAsset");
            this.f46861d = cVar.c();
        }

        @NotNull
        public final String b() {
            return this.f46861d;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a f46862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull a.AbstractC0574a.d dVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
            super(dVar, null);
            p.k(dVar, "originAsset");
            p.k(aVar, "vastAd");
            this.f46862d = aVar;
        }

        @NotNull
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a b() {
            return this.f46862d;
        }
    }

    public b(a.AbstractC0574a abstractC0574a) {
        this.f46856a = abstractC0574a;
        this.f46857b = abstractC0574a.a();
        this.f46858c = abstractC0574a.b();
    }

    public /* synthetic */ b(a.AbstractC0574a abstractC0574a, i iVar) {
        this(abstractC0574a);
    }

    @NotNull
    public final a.AbstractC0574a a() {
        return this.f46856a;
    }
}
