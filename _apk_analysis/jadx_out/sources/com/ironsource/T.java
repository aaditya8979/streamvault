package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC4115kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final InterfaceC4164n9 f30426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30427c;

    public static final class a extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30428a = new a();

        public a() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.r();
        }
    }

    public static final class b extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30429a = new b();

        public b() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.o();
        }
    }

    public static final class c extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30430a = new c();

        public c() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.n();
        }
    }

    public static final class d extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30431a = new d();

        public d() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.q();
        }
    }

    public static final class e extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30432a = new e();

        public e() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.o();
        }
    }

    public static final class f extends Lambda implements sn.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f30433a = new f();

        public f() {
            super(0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4365z5.f34494a.g();
        }
    }

    public T(@NotNull String str, @Nullable InterfaceC4164n9 interfaceC4164n9, boolean z10) {
        tn.p.k(str, "adm");
        this.f30425a = str;
        this.f30426b = interfaceC4164n9;
        this.f30427c = z10;
    }

    @Override // com.ironsource.InterfaceC4115kg
    public void a() throws C4205pe {
        a(this.f30427c, a.f30428a);
        a(this.f30426b != null, b.f30429a);
        InterfaceC4164n9 interfaceC4164n9 = this.f30426b;
        if (interfaceC4164n9 != null) {
            if (interfaceC4164n9.f() == EnumC4200p9.NonBidder) {
                a(this.f30425a.length() == 0, c.f30430a);
            }
            if (interfaceC4164n9.f() == EnumC4200p9.Bidder) {
                a(this.f30425a.length() > 0, d.f30431a);
            }
            a(interfaceC4164n9.f() != EnumC4200p9.NotSupported, e.f30432a);
            a(interfaceC4164n9.e().length() > 0, f.f30433a);
        }
    }
}
