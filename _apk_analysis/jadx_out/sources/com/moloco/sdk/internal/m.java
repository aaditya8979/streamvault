package com.moloco.sdk.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.vungle.ads.internal.protos.Sdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46244b;

    @StabilityInferred(parameters = 1)
    public static final class a extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f46245c = new a();

        public a() {
            super(300, 250, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f46246c = new b();

        public b() {
            super(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f46247c = new c();

        public c() {
            super(728, 90, null);
        }
    }

    public m(int i10, int i11) {
        this.f46243a = i10;
        this.f46244b = i11;
    }

    public /* synthetic */ m(int i10, int i11, tn.i iVar) {
        this(i10, i11);
    }

    public int a() {
        return this.f46244b;
    }

    public int b() {
        return this.f46243a;
    }
}
