package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3977d3 implements InterfaceC4115kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Db f31176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final AdSize f31177b;

    /* JADX INFO: renamed from: com.ironsource.d3$a */
    public static final class a extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31178a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.d3$b */
    public static final class b extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31179a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.l();
        }
    }

    public C3977d3(@Nullable Db db2, @Nullable AdSize adSize) {
        this.f31176a = db2;
        this.f31177b = adSize;
    }

    @Override // com.ironsource.InterfaceC4115kg
    public void a() {
        a(this.f31176a != null, a.f31178a);
        a(this.f31177b != null, b.f31179a);
    }
}
