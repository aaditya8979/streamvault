package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC4080j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface h extends q {

    public static abstract class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final String f32508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final String f32509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f32510c;

        public a(@Nullable String str, @Nullable String str2, boolean z10) {
            this.f32508a = str;
            this.f32509b = str2;
            this.f32510c = z10;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String b() {
            return this.f32509b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.f32510c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String e() {
            return this.f32508a;
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f32511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f32512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final ISDemandOnlyBannerLayout f32513f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String str, @Nullable Activity activity, @Nullable String str2, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str3, boolean z10) {
            super(str2, str3, z10);
            tn.p.k(str, "adFormat");
            this.f32511d = str;
            this.f32512e = activity;
            this.f32513f = iSDemandOnlyBannerLayout;
        }

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z10, int i10, tn.i iVar) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.f32511d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Nullable
        public final Activity f() {
            return this.f32512e;
        }

        @Nullable
        public final ISDemandOnlyBannerLayout g() {
            return this.f32513f;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private String f32514a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private Activity f32515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private String f32516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private String f32518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private ISDemandOnlyBannerLayout f32519f;

        @NotNull
        public final b a() {
            return new b(this.f32514a, this.f32515b, this.f32516c, this.f32519f, this.f32518e, this.f32517d);
        }

        @NotNull
        public final c a(@Nullable Activity activity) {
            this.f32515b = activity;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f32515b = activity;
            return this;
        }

        @NotNull
        public final c a(@NotNull IronSource.a aVar) {
            tn.p.k(aVar, "adFormat");
            String string = aVar.toString();
            tn.p.j(string, "adFormat.toString()");
            this.f32514a = string;
            return this;
        }

        @NotNull
        public final c a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f32519f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        public final c a(@Nullable String str) {
            this.f32518e = str;
            return this;
        }

        @NotNull
        public final c a(boolean z10) {
            this.f32517d = z10;
            return this;
        }

        @NotNull
        public final c b(@Nullable String str) {
            this.f32516c = str;
            return this;
        }

        @NotNull
        public final d b() {
            return new d(this.f32514a, this.f32515b, this.f32516c, this.f32518e, this.f32517d);
        }
    }

    public static final class d extends a implements InterfaceC4080j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f32520d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Activity f32521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String str, @Nullable Activity activity, @Nullable String str2, @Nullable String str3, boolean z10) {
            super(str2, str3, z10);
            tn.p.k(str, "adFormat");
            this.f32520d = str;
            this.f32521e = activity;
        }

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z10, int i10, tn.i iVar) {
            this(str, activity, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? false : z10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.f32520d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC4080j
        @Nullable
        public Activity d() {
            return this.f32521e;
        }
    }

    @Nullable
    String b();

    boolean c();

    @Nullable
    String e();
}
