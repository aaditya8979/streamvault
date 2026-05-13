package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Qd implements InterfaceC4115kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Db f30309a;

    public static final class a extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30310a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.d("Load task config is null");
        }
    }

    public Qd(@Nullable Db db2) {
        this.f30309a = db2;
    }

    @Override // com.ironsource.InterfaceC4115kg
    public void a() {
        a(this.f30309a != null, a.f30310a);
    }
}
