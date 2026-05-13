package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4369z9 implements InterfaceC4115kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Db f34503a;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    public static final class a extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34504a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.b("Load task config is null");
        }
    }

    public C4369z9(@Nullable Db db2) {
        this.f34503a = db2;
    }

    @Override // com.ironsource.InterfaceC4115kg
    public void a() {
        a(this.f34503a != null, a.f34504a);
    }
}
